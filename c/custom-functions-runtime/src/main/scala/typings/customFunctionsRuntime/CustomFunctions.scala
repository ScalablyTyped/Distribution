package typings.customFunctionsRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomFunctions {
  
  @js.native
  sealed trait ErrorCode extends StObject
  /**
    * Error codes for custom functions. The error codes will appear in the cell that invoked the function.
    *
    * Custom error messages appear in addition to these error codes. Custom messages display in the error
    * indicator menu, which is accessed by hovering over the error flag on each cell with an error.
    */
  @JSGlobal("CustomFunctions.ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    /**
      *
      * This error code indicates that the function used is dividing by zero or empty cells.
      * A custom error message can't be used.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait divisionByZero extends ErrorCode
    
    /**
      *
      * This error code indicates that there is a typo in the function name.
      * Note that this error code is supported as a custom function input error, but not as a custom function output error.
      * A custom error message can't be used.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidName extends ErrorCode
    
    /**
      *
      * This error code indicates that there is a problem with a number in the function.
      * A custom error message can't be used.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidNumber extends ErrorCode
    
    /**
      *
      * This error code indicates that the function refers to an invalid cell.
      * Note that this error code is supported as a custom function input error, but not as a custom function output error.
      * A custom error message can't be used.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidReference extends ErrorCode
    
    /**
      *
      * This error code indicates that a value in the function is of the wrong data type.
      * A custom error message can be used in addition to the error code, if desired.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidValue extends ErrorCode
    
    /**
      *
      * This error code indicates that the function or service isn't available.
      * A custom error message can be used in addition to the error code, if desired.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait notAvailable extends ErrorCode
    
    /**
      *
      * This error code indicates that the ranges in the function don't intersect.
      * A custom error message can't be used.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait nullReference extends ErrorCode
  }
  
  /**
    * Provides information about the invocation of a cancelable custom function.
    * A cancelable custom function can provide a handler for the onCanceled event.
    *
    * To indicate that a function is cancelable, in the metadata JSON file, the function options should specify:
    * `{ "cancelable": true }`
    *
    * If the metadata JSON file is being generated from JSDoc comments, include the tag `@cancelable`.
    */
  @js.native
  trait CancelableInvocation extends Invocation {
    
    /**
      * Event handler called when the custom function is canceled.
      * [Api set: CustomFunctionsRuntime 1.1]
      */
    def onCanceled(): Unit = js.native
  }
  object CancelableInvocation {
    
    @scala.inline
    def apply(onCanceled: () => Unit): CancelableInvocation = {
      val __obj = js.Dynamic.literal(onCanceled = js.Any.fromFunction0(onCanceled))
      __obj.asInstanceOf[CancelableInvocation]
    }
    
    @scala.inline
    implicit class CancelableInvocationMutableBuilder[Self <: CancelableInvocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCanceled(value: () => Unit): Self = StObject.set(x, "onCanceled", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Use this class to handle errors and write custom error messages.
    * [Api set: CustomFunctionsRuntime 1.2]
    */
  @js.native
  trait Error extends StObject {
    
    /**
      * The error code returned by your custom function.
      * [Api set: CustomFunctionsRuntime 1.2]
      */
    var code: ErrorCode = js.native
    
    /**
      * Your custom error message, such as "This stock price is unavailable". Custom messages are only available with certain error codes.
      * [Api set: CustomFunctionsRuntime 1.2]
      */
    var message: js.UndefOr[String] = js.native
  }
  object Error {
    
    @scala.inline
    def apply(code: ErrorCode): Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: ErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  /**
    * Provides information about the invocation of a custom function.
    */
  @js.native
  trait Invocation extends StObject {
    
    /**
      * The cell address where the function is being called, if requested, otherwise undefined.
      *
      * To request the address for the function, in the metadata JSON file, the function options should specify:
      * `{ "requiresAddress": true }`
      *
      * If the metadata JSON file is being generated from JSDoc comments, include the tag `@requiresAddress`.
      * [Api set: CustomFunctionsRuntime 1.1]
      */
    var address: js.UndefOr[String] = js.native
    
    /**
      * The range addresses where the function parameters are located, if requested, otherwise undefined.
      *
      * To request the parameter addresses for the function, in the metadata JSON file, the function options should specify:
      * `{ "requiresParameterAddresses": true }`
      *
      * If the metadata JSON file is being generated from JSDoc comments, include the tag `@requiresParameterAddresses`.
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    var parameterAddresses: js.UndefOr[js.Array[String]] = js.native
  }
  object Invocation {
    
    @scala.inline
    def apply(): Invocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Invocation]
    }
    
    @scala.inline
    implicit class InvocationMutableBuilder[Self <: Invocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setParameterAddresses(value: js.Array[String]): Self = StObject.set(x, "parameterAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterAddressesUndefined: Self = StObject.set(x, "parameterAddresses", js.undefined)
      
      @scala.inline
      def setParameterAddressesVarargs(value: String*): Self = StObject.set(x, "parameterAddresses", js.Array(value :_*))
    }
  }
  
  /**
    * Provides information about the invocation of a streaming custom function.
    * A streaming custom function can provide results which can change over time.
    *
    * Call `setResult()` one or more times to provide the result instead of returning
    * a result from the function.
    */
  @js.native
  trait StreamingInvocation[ResultType] extends CancelableInvocation {
    
    /**
      * Set the result for the custom function. May be called more than once.
      * [Api set: CustomFunctionsRuntime 1.1]
      */
    def setResult(value: ResultType): Unit = js.native
    def setResult(value: Error): Unit = js.native
  }
}

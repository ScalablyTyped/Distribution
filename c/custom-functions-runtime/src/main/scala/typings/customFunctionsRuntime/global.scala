package typings.customFunctionsRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.customFunctionsRuntime.CustomFunctions.ErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CustomFunctions {
    
    /**
      * Use this class to handle errors and write custom error messages.
      * [Api set: CustomFunctionsRuntime 1.2]
      */
    @JSGlobal("CustomFunctions.Error")
    @js.native
    class Error protected ()
      extends typings.customFunctionsRuntime.CustomFunctions.Error {
      def this(code: ErrorCode) = this()
      def this(code: ErrorCode, message: String) = this()
    }
    
    /**
      * Error codes for custom functions. The error codes will appear in the cell that invoked the function.
      *
      * Custom error messages appear in addition to these error codes. Custom messages display in the error
      * indicator menu, which is accessed by hovering over the error flag on each cell with an error.
      */
    @JSGlobal("CustomFunctions.ErrorCode")
    @js.native
    object ErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.customFunctionsRuntime.CustomFunctions.ErrorCode with String] = js.native
      
      /* "#DIV/0!" */ val divisionByZero: typings.customFunctionsRuntime.CustomFunctions.ErrorCode.divisionByZero with String = js.native
      
      /* "#NAME?" */ val invalidName: typings.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidName with String = js.native
      
      /* "#NUM!" */ val invalidNumber: typings.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidNumber with String = js.native
      
      /* "#REF!" */ val invalidReference: typings.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidReference with String = js.native
      
      /* "#VALUE!" */ val invalidValue: typings.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidValue with String = js.native
      
      /* "#N/A" */ val notAvailable: typings.customFunctionsRuntime.CustomFunctions.ErrorCode.notAvailable with String = js.native
      
      /* "#NULL!" */ val nullReference: typings.customFunctionsRuntime.CustomFunctions.ErrorCode.nullReference with String = js.native
    }
    
    /**
      * Associates the JavaScript function to the name given by the "id" property in the metadata JSON file.
      */
    @JSGlobal("CustomFunctions.associate")
    @js.native
    def associate(id: String, functionObject: js.Function): Unit = js.native
    /**
      * Associates the JavaScript functions to the names given by the "id" properties in the metadata JSON file.
      */
    @JSGlobal("CustomFunctions.associate")
    @js.native
    def associate(mappings: StringDictionary[js.Function]): Unit = js.native
  }
}

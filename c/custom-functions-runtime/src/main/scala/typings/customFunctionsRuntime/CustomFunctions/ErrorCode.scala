package typings.customFunctionsRuntime.CustomFunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends js.Object
/**
  * Error codes for custom functions. The error codes will appear in the cell that invoked the function.
  *
  * Custom error messages appear in addition to these error codes. Custom messages display in the error
  * indicator menu, which is accessed by hovering over the error flag on each cell with an error.
  */
@JSGlobal("CustomFunctions.ErrorCode")
@js.native
object ErrorCode extends js.Object {
  
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

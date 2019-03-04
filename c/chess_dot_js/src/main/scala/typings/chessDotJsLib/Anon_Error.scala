package typings
package chessDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  /**
    * The string "No errors." if valid. Otherwise a string explaining why
    * it is not valid.
    */
  var error: java.lang.String
  /**
    * If not valid, then this will a type of error used internally in
    * chess.js. Otherwise 0.
    */
  var error_number: scala.Double
  /** Indicates if the fen is valid or not. */
  var valid: scala.Boolean
}

object Anon_Error {
  @scala.inline
  def apply(error: java.lang.String, error_number: scala.Double, valid: scala.Boolean): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, error_number = error_number, valid = valid)
  
    __obj.asInstanceOf[Anon_Error]
  }
}


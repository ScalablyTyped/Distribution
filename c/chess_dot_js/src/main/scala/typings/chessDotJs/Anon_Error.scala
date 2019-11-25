package typings.chessDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  /**
    * The string "No errors." if valid. Otherwise a string explaining why
    * it is not valid.
    */
  var error: String
  /**
    * If not valid, then this will a type of error used internally in
    * chess.js. Otherwise 0.
    */
  var error_number: Double
  /** Indicates if the fen is valid or not. */
  var valid: Boolean
}

object Anon_Error {
  @scala.inline
  def apply(error: String, error_number: Double, valid: Boolean): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_number = error_number.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Error]
  }
}


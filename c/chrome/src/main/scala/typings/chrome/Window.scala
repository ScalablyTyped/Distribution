package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Global object
////////////////////
trait Window extends js.Object {
  var chrome: Typeofchrome
}

object Window {
  @scala.inline
  def apply(chrome: Typeofchrome): Window = {
    val __obj = js.Dynamic.literal(chrome = chrome)
  
    __obj.asInstanceOf[Window]
  }
}


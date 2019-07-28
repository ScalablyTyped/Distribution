package typings.chrome

import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ONE extends js.Object {
  var ONE: one
  var TWO: two
}

object Anon_ONE {
  @scala.inline
  def apply(ONE: one, TWO: two): Anon_ONE = {
    val __obj = js.Dynamic.literal(ONE = ONE, TWO = TWO)
  
    __obj.asInstanceOf[Anon_ONE]
  }
}


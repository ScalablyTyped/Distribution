package typings.chrome.anon

import typings.chrome.chrome.pageCapture.SaveDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpageCapture extends js.Object {
  def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.Any, Unit]): Unit
}

object TypeofpageCapture {
  @scala.inline
  def apply(saveAsMHTML: (SaveDetails, js.Function1[/* mhtmlData */ js.Any, Unit]) => Unit): TypeofpageCapture = {
    val __obj = js.Dynamic.literal(saveAsMHTML = js.Any.fromFunction2(saveAsMHTML))
    __obj.asInstanceOf[TypeofpageCapture]
  }
}


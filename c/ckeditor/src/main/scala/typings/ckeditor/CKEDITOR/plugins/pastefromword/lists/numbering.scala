package typings.ckeditor.CKEDITOR.plugins.pastefromword.lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbering extends js.Object {
  def getStyle(marker: String): String
  def toNumber(marker: String, markerType: String): Double
}

object numbering {
  @scala.inline
  def apply(getStyle: String => String, toNumber: (String, String) => Double): numbering = {
    val __obj = js.Dynamic.literal(getStyle = js.Any.fromFunction1(getStyle), toNumber = js.Any.fromFunction2(toNumber))
    __obj.asInstanceOf[numbering]
  }
}


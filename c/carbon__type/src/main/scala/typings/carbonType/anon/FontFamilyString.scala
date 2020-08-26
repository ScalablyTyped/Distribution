package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFamilyString extends js.Object {
  var fontFamily: String = js.native
}

object FontFamilyString {
  @scala.inline
  def apply(fontFamily: String): FontFamilyString = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyString]
  }
  @scala.inline
  implicit class FontFamilyStringOps[Self <: FontFamilyString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
  }
  
}


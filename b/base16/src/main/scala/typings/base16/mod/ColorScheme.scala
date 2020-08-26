package typings.base16.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorScheme extends js.Object {
  var author: String = js.native
  var base00: String = js.native
  var base01: String = js.native
  var base02: String = js.native
  var base03: String = js.native
  var base04: String = js.native
  var base05: String = js.native
  var base06: String = js.native
  var base07: String = js.native
  var base08: String = js.native
  var base09: String = js.native
  var base0A: String = js.native
  var base0B: String = js.native
  var base0C: String = js.native
  var base0D: String = js.native
  var base0E: String = js.native
  var base0F: String = js.native
  var scheme: String = js.native
}

object ColorScheme {
  @scala.inline
  def apply(
    author: String,
    base00: String,
    base01: String,
    base02: String,
    base03: String,
    base04: String,
    base05: String,
    base06: String,
    base07: String,
    base08: String,
    base09: String,
    base0A: String,
    base0B: String,
    base0C: String,
    base0D: String,
    base0E: String,
    base0F: String,
    scheme: String
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], base00 = base00.asInstanceOf[js.Any], base01 = base01.asInstanceOf[js.Any], base02 = base02.asInstanceOf[js.Any], base03 = base03.asInstanceOf[js.Any], base04 = base04.asInstanceOf[js.Any], base05 = base05.asInstanceOf[js.Any], base06 = base06.asInstanceOf[js.Any], base07 = base07.asInstanceOf[js.Any], base08 = base08.asInstanceOf[js.Any], base09 = base09.asInstanceOf[js.Any], base0A = base0A.asInstanceOf[js.Any], base0B = base0B.asInstanceOf[js.Any], base0C = base0C.asInstanceOf[js.Any], base0D = base0D.asInstanceOf[js.Any], base0E = base0E.asInstanceOf[js.Any], base0F = base0F.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorScheme]
  }
  @scala.inline
  implicit class ColorSchemeOps[Self <: ColorScheme] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase00(value: String): Self = this.set("base00", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase01(value: String): Self = this.set("base01", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase02(value: String): Self = this.set("base02", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase03(value: String): Self = this.set("base03", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase04(value: String): Self = this.set("base04", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase05(value: String): Self = this.set("base05", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase06(value: String): Self = this.set("base06", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase07(value: String): Self = this.set("base07", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase08(value: String): Self = this.set("base08", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase09(value: String): Self = this.set("base09", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase0A(value: String): Self = this.set("base0A", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase0B(value: String): Self = this.set("base0B", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase0C(value: String): Self = this.set("base0C", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase0D(value: String): Self = this.set("base0D", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase0E(value: String): Self = this.set("base0E", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase0F(value: String): Self = this.set("base0F", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
  
}


package typings.d3pie.anon

import typings.d3pie.d3pieStrings.caption
import typings.d3pie.d3pieStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceholderParser extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ Percentage, Unit]] = js.native
  var string: js.UndefOr[String] = js.native
  var styles: js.UndefOr[BackgroundColor] = js.native
  var `type`: js.UndefOr[placeholder | caption] = js.native
}

object PlaceholderParser {
  @scala.inline
  def apply(): PlaceholderParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceholderParser]
  }
  @scala.inline
  implicit class PlaceholderParserOps[Self <: PlaceholderParser] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPlaceholderParser(value: (/* index */ Double, /* data */ Percentage) => Unit): Self = this.set("placeholderParser", js.Any.fromFunction2(value))
    @scala.inline
    def deletePlaceholderParser: Self = this.set("placeholderParser", js.undefined)
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setStyles(value: BackgroundColor): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setType(value: placeholder | caption): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


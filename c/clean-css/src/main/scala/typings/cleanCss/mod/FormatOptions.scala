package typings.cleanCss.mod

import typings.cleanCss.anon.AfterAtRule
import typings.cleanCss.anon.AroundSelectorRelation
import typings.cleanCss.cleanCssBooleans.`false`
import typings.cleanCss.cleanCssStrings.space
import typings.cleanCss.cleanCssStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring the CSS formatting
  */
@js.native
trait FormatOptions extends js.Object {
  /**
    * Controls the new line character, can be `'\r\n'` or `'\n'`(aliased as `'windows'` and `'unix'`
    * or `'crlf'` and `'lf'`); defaults to system one, so former on Windows and latter on Unix
    */
  var breakWith: js.UndefOr[String] = js.native
  /**
    *  Controls where to insert breaks
    */
  var breaks: js.UndefOr[AfterAtRule] = js.native
  /**
    * Controls number of characters to indent with; defaults to `0`
    */
  var indentBy: js.UndefOr[Double] = js.native
  /**
    * Controls a character to indent with, can be `'space'` or `'tab'`; defaults to `'space'`
    */
  var indentWith: js.UndefOr[space | tab] = js.native
  /**
    * Controls removing trailing semicolons in rule; defaults to `false` - means remove
    */
  var semicolonAfterLastProperty: js.UndefOr[Boolean] = js.native
  /**
    * Controls where to insert spaces
    */
  var spaces: js.UndefOr[AroundSelectorRelation] = js.native
  /**
    * Controls maximum line length; defaults to `false`
    */
  var wrapAt: js.UndefOr[`false` | Double] = js.native
}

object FormatOptions {
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
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
    def setBreakWith(value: String): Self = this.set("breakWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakWith: Self = this.set("breakWith", js.undefined)
    @scala.inline
    def setBreaks(value: AfterAtRule): Self = this.set("breaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    @scala.inline
    def setIndentBy(value: Double): Self = this.set("indentBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentBy: Self = this.set("indentBy", js.undefined)
    @scala.inline
    def setIndentWith(value: space | tab): Self = this.set("indentWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentWith: Self = this.set("indentWith", js.undefined)
    @scala.inline
    def setSemicolonAfterLastProperty(value: Boolean): Self = this.set("semicolonAfterLastProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemicolonAfterLastProperty: Self = this.set("semicolonAfterLastProperty", js.undefined)
    @scala.inline
    def setSpaces(value: AroundSelectorRelation): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    @scala.inline
    def setWrapAt(value: `false` | Double): Self = this.set("wrapAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapAt: Self = this.set("wrapAt", js.undefined)
  }
  
}


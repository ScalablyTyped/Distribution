package typings.babelTemplate.mod

import typings.babelParser.mod.ParserOptions
import typings.babelTemplate.babelTemplateBooleans.`false`
import typings.std.RegExp
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateBuilderOptions extends ParserOptions {
  /**
    * A pattern to search for when looking for Identifier and StringLiteral nodes that should be considered placeholders. `false` will
    * disable placeholder searching entirely, leaving only the `placeholderWhitelist` value to find placeholders.
    */
  var placeholderPattern: js.UndefOr[RegExp | `false`] = js.native
  /**
    * A set of placeholder names to automatically accept. Items in this list do not need to match the given placeholder pattern.
    */
  var placeholderWhitelist: js.UndefOr[Set[String]] = js.native
  /**
    * Set this to `true` to preserve any comments from the `code` parameter.
    */
  var preserveComments: js.UndefOr[Boolean] = js.native
}

object TemplateBuilderOptions {
  @scala.inline
  def apply(): TemplateBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateBuilderOptions]
  }
  @scala.inline
  implicit class TemplateBuilderOptionsOps[Self <: TemplateBuilderOptions] (val x: Self) extends AnyVal {
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
    def setPlaceholderPattern(value: RegExp | `false`): Self = this.set("placeholderPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderPattern: Self = this.set("placeholderPattern", js.undefined)
    @scala.inline
    def setPlaceholderWhitelist(value: Set[String]): Self = this.set("placeholderWhitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderWhitelist: Self = this.set("placeholderWhitelist", js.undefined)
    @scala.inline
    def setPreserveComments(value: Boolean): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveComments: Self = this.set("preserveComments", js.undefined)
  }
  
}


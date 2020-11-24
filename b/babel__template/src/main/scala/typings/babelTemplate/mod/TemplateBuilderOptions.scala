package typings.babelTemplate.mod

import typings.babelParser.mod.ParserOptions
import typings.babelTemplate.babelTemplateBooleans.`false`
import typings.std.RegExp
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateBuilderOptions extends ParserOptions {
  
  /**
    * A pattern to search for when looking for `Identifier` and `StringLiteral`
    * nodes that should be considered as placeholders.
    *
    * `false` will disable placeholder searching placeholders, leaving only
    * the `placeholderWhitelist` value to find replacements.
    *
    * This option cannot be used when using `%%foo%%` style placeholders.
    *
    * @default /^[_$A-Z0-9]+$/
    */
  var placeholderPattern: js.UndefOr[RegExp | `false` | Null] = js.native
  
  /**
    * A set of placeholder names to automatically accept.
    * Items in this list do not need to match `placeholderPattern`.
    *
    * This option cannot be used when using `%%foo%%` style placeholders.
    */
  var placeholderWhitelist: js.UndefOr[Set[String] | Null] = js.native
  
  /**
    * Set this to `true` to preserve comments from the template string
    * into the resulting AST, or `false` to automatically discard comments.
    *
    * @default false
    */
  var preserveComments: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Set to `true` to use `%%foo%%` style placeholders, `false` to use legacy placeholders
    * described by `placeholderPattern` or `placeholderWhitelist`.
    *
    * When it is not set, it behaves as `true` if there are syntactic placeholders, otherwise as `false`.
    *
    * @since 7.4.0
    */
  var syntacticPlaceholders: js.UndefOr[Boolean | Null] = js.native
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
    def setPlaceholderPatternNull: Self = this.set("placeholderPattern", null)
    
    @scala.inline
    def setPlaceholderWhitelist(value: Set[String]): Self = this.set("placeholderWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderWhitelist: Self = this.set("placeholderWhitelist", js.undefined)
    
    @scala.inline
    def setPlaceholderWhitelistNull: Self = this.set("placeholderWhitelist", null)
    
    @scala.inline
    def setPreserveComments(value: Boolean): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveComments: Self = this.set("preserveComments", js.undefined)
    
    @scala.inline
    def setPreserveCommentsNull: Self = this.set("preserveComments", null)
    
    @scala.inline
    def setSyntacticPlaceholders(value: Boolean): Self = this.set("syntacticPlaceholders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntacticPlaceholders: Self = this.set("syntacticPlaceholders", js.undefined)
    
    @scala.inline
    def setSyntacticPlaceholdersNull: Self = this.set("syntacticPlaceholders", null)
  }
}

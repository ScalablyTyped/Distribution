package typings.cliHighlight.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokens[T] extends js.Object {
  
  /**
    * added or changed line in a diff
    */
  var addition: js.UndefOr[T] = js.native
  
  /**
    * name of an attribute with no language defined semantics (keys in JSON, setting names in .ini), also sub-attribute within another highlighted object, like XML tag
    */
  var attr: js.UndefOr[T] = js.native
  
  /**
    * name of an attribute followed by a structured value part, like CSS properties
    */
  var attribute: js.UndefOr[T] = js.native
  
  /**
    * built-in or library object (constant, class, function)
    */
  var built_in: js.UndefOr[T] = js.native
  
  /**
    * s-expression name from the language standard library
    */
  var `builtin-name`: js.UndefOr[T] = js.native
  
  /**
    * list item bullet in text markup
    */
  var bullet: js.UndefOr[T] = js.native
  
  /**
    * class or class-level declaration (interfaces, traits, modules, etc)
    */
  var `class`: js.UndefOr[T] = js.native
  
  /**
    * code block in text markup
    */
  var code: js.UndefOr[T] = js.native
  
  /**
    * comment
    */
  var comment: js.UndefOr[T] = js.native
  
  /**
    * deleted line in a diff
    */
  var deletion: js.UndefOr[T] = js.native
  
  /**
    * documentation markup within comments
    */
  var doctag: js.UndefOr[T] = js.native
  
  /**
    * emphasis in text markup
    */
  var emphasis: js.UndefOr[T] = js.native
  
  /**
    * mathematical formula in text markup
    */
  var formula: js.UndefOr[T] = js.native
  
  /**
    * function or method declaration
    */
  var function: js.UndefOr[T] = js.native
  
  /**
    * keyword in a regular Algol-style language
    */
  var keyword: js.UndefOr[T] = js.native
  
  /**
    * hyperlink in text markup
    */
  var link: js.UndefOr[T] = js.native
  
  /**
    * special identifier for a built-in value ("true", "false", "null")
    */
  var literal: js.UndefOr[T] = js.native
  
  /**
    * flags, modifiers, annotations, processing instructions, preprocessor directive, etc
    */
  var meta: js.UndefOr[T] = js.native
  
  /**
    * keyword or built-in within meta construct
    */
  var `meta-keyword`: js.UndefOr[T] = js.native
  
  /**
    * string within meta construct
    */
  var `meta-string`: js.UndefOr[T] = js.native
  
  /**
    * name of an XML tag, the first word in an s-expression
    */
  var name: js.UndefOr[T] = js.native
  
  /**
    * number, including units and modifiers, if any.
    */
  var number: js.UndefOr[T] = js.native
  
  /**
    * block of function arguments (parameters) at the place of declaration
    */
  var params: js.UndefOr[T] = js.native
  
  /**
    * quotation in text markup
    */
  var quote: js.UndefOr[T] = js.native
  
  /**
    * literal regular expression
    */
  var regexp: js.UndefOr[T] = js.native
  
  /**
    * heading of a section in a config file, heading in text markup
    */
  var section: js.UndefOr[T] = js.native
  
  /**
    * [attr] selector in CSS
    */
  var `selector-attr`: js.UndefOr[T] = js.native
  
  /**
    * .class selector in CSS
    */
  var `selector-class`: js.UndefOr[T] = js.native
  
  /**
    * #id selector in CSS
    */
  var `selector-id`: js.UndefOr[T] = js.native
  
  /**
    * :pseudo selector in CSS
    */
  var `selector-pseudo`: js.UndefOr[T] = js.native
  
  /**
    * tag selector in CSS
    */
  var `selector-tag`: js.UndefOr[T] = js.native
  
  /**
    * literal string, character
    */
  var string: js.UndefOr[T] = js.native
  
  /**
    * strong emphasis in text markup
    */
  var strong: js.UndefOr[T] = js.native
  
  /**
    * parsed section inside a literal string
    */
  var subst: js.UndefOr[T] = js.native
  
  /**
    * symbolic constant, interned string, goto label
    */
  var symbol: js.UndefOr[T] = js.native
  
  /**
    * XML/HTML tag
    */
  var tag: js.UndefOr[T] = js.native
  
  /**
    * tag of a template language
    */
  var `template-tag`: js.UndefOr[T] = js.native
  
  /**
    * variable in a template language
    */
  var `template-variable`: js.UndefOr[T] = js.native
  
  /**
    * name of a class or a function at the place of declaration
    */
  var title: js.UndefOr[T] = js.native
  
  /**
    * user-defined type in a language with first-class syntactically significant types, like Haskell
    */
  var `type`: js.UndefOr[T] = js.native
  
  /**
    * variable in a config or a template file, environment var expansion in a script
    */
  var variable: js.UndefOr[T] = js.native
}
object Tokens {
  
  @scala.inline
  def apply[T](): Tokens[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tokens[T]]
  }
  
  @scala.inline
  implicit class TokensOps[Self <: Tokens[_], T] (val x: Self with Tokens[T]) extends AnyVal {
    
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
    def setAddition(value: T): Self = this.set("addition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddition: Self = this.set("addition", js.undefined)
    
    @scala.inline
    def setAttr(value: T): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    
    @scala.inline
    def setAttribute(value: T): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setBuilt_in(value: T): Self = this.set("built_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilt_in: Self = this.set("built_in", js.undefined)
    
    @scala.inline
    def `setBuiltin-name`(value: T): Self = this.set("builtin-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBuiltin-name`: Self = this.set("builtin-name", js.undefined)
    
    @scala.inline
    def setBullet(value: T): Self = this.set("bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    
    @scala.inline
    def setClass(value: T): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setCode(value: T): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setComment(value: T): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDeletion(value: T): Self = this.set("deletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletion: Self = this.set("deletion", js.undefined)
    
    @scala.inline
    def setDoctag(value: T): Self = this.set("doctag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoctag: Self = this.set("doctag", js.undefined)
    
    @scala.inline
    def setEmphasis(value: T): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setFormula(value: T): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setFunction(value: T): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setKeyword(value: T): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    
    @scala.inline
    def setLink(value: T): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLiteral(value: T): Self = this.set("literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteral: Self = this.set("literal", js.undefined)
    
    @scala.inline
    def setMeta(value: T): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def `setMeta-keyword`(value: T): Self = this.set("meta-keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMeta-keyword`: Self = this.set("meta-keyword", js.undefined)
    
    @scala.inline
    def `setMeta-string`(value: T): Self = this.set("meta-string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMeta-string`: Self = this.set("meta-string", js.undefined)
    
    @scala.inline
    def setName(value: T): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumber(value: T): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setQuote(value: T): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setRegexp(value: T): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    
    @scala.inline
    def setSection(value: T): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    
    @scala.inline
    def `setSelector-attr`(value: T): Self = this.set("selector-attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSelector-attr`: Self = this.set("selector-attr", js.undefined)
    
    @scala.inline
    def `setSelector-class`(value: T): Self = this.set("selector-class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSelector-class`: Self = this.set("selector-class", js.undefined)
    
    @scala.inline
    def `setSelector-id`(value: T): Self = this.set("selector-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSelector-id`: Self = this.set("selector-id", js.undefined)
    
    @scala.inline
    def `setSelector-pseudo`(value: T): Self = this.set("selector-pseudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSelector-pseudo`: Self = this.set("selector-pseudo", js.undefined)
    
    @scala.inline
    def `setSelector-tag`(value: T): Self = this.set("selector-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSelector-tag`: Self = this.set("selector-tag", js.undefined)
    
    @scala.inline
    def setString(value: T): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    
    @scala.inline
    def setStrong(value: T): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    
    @scala.inline
    def setSubst(value: T): Self = this.set("subst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubst: Self = this.set("subst", js.undefined)
    
    @scala.inline
    def setSymbol(value: T): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setTag(value: T): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def `setTemplate-tag`(value: T): Self = this.set("template-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTemplate-tag`: Self = this.set("template-tag", js.undefined)
    
    @scala.inline
    def `setTemplate-variable`(value: T): Self = this.set("template-variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTemplate-variable`: Self = this.set("template-variable", js.undefined)
    
    @scala.inline
    def setTitle(value: T): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVariable(value: T): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
}

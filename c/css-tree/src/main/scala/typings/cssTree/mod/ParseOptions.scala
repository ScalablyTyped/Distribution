package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  var atrule: js.UndefOr[String] = js.native
  
  var column: js.UndefOr[Double] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onParseError: js.UndefOr[js.Function2[/* error */ SyntaxParseError, /* fallbackNode */ CssNode, Unit]] = js.native
  
  var parseAtrulePrelude: js.UndefOr[Boolean] = js.native
  
  var parseCustomProperty: js.UndefOr[Boolean] = js.native
  
  var parseRulePrelude: js.UndefOr[Boolean] = js.native
  
  var parseValue: js.UndefOr[Boolean] = js.native
  
  var positions: js.UndefOr[Boolean] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setAtrule(value: String): Self = this.set("atrule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtrule: Self = this.set("atrule", js.undefined)
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnParseError(value: (/* error */ SyntaxParseError, /* fallbackNode */ CssNode) => Unit): Self = this.set("onParseError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnParseError: Self = this.set("onParseError", js.undefined)
    
    @scala.inline
    def setParseAtrulePrelude(value: Boolean): Self = this.set("parseAtrulePrelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseAtrulePrelude: Self = this.set("parseAtrulePrelude", js.undefined)
    
    @scala.inline
    def setParseCustomProperty(value: Boolean): Self = this.set("parseCustomProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseCustomProperty: Self = this.set("parseCustomProperty", js.undefined)
    
    @scala.inline
    def setParseRulePrelude(value: Boolean): Self = this.set("parseRulePrelude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseRulePrelude: Self = this.set("parseRulePrelude", js.undefined)
    
    @scala.inline
    def setParseValue(value: Boolean): Self = this.set("parseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseValue: Self = this.set("parseValue", js.undefined)
    
    @scala.inline
    def setPositions(value: Boolean): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
  }
}

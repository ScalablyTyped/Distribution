package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait RegExpLiteral_
  extends Expression
     with BaseNode
     with Literal
     with Pureish {
  
  var flags: String = js.native
  
  var pattern: String = js.native
  
  @JSName("type")
  var type_RegExpLiteral_ : RegExpLiteral = js.native
}
object RegExpLiteral_ {
  
  @scala.inline
  def apply(flags: String, pattern: String, `type`: RegExpLiteral): RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral_]
  }
  
  @scala.inline
  implicit class RegExpLiteral_Ops[Self <: RegExpLiteral_] (val x: Self) extends AnyVal {
    
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
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RegExpLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

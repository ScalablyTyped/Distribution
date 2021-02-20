package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.RegExpLiteral
import org.scalablytyped.runtime.StObject
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
  implicit class RegExpLiteral_MutableBuilder[Self <: RegExpLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

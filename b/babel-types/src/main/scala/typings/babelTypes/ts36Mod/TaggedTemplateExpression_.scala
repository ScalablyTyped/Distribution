package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedTemplateExpression_
  extends StObject
     with Node
     with Expression {
  
  var quasi: TemplateLiteral_
  
  var tag: Expression
  
  @JSName("type")
  var type_TaggedTemplateExpression_ : TaggedTemplateExpression
}
object TaggedTemplateExpression_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, quasi: TemplateLiteral_, start: Double, tag: Expression): TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasi = quasi.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[TaggedTemplateExpression_]
  }
  
  @scala.inline
  implicit class TaggedTemplateExpression_MutableBuilder[Self <: TaggedTemplateExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuasi(value: TemplateLiteral_): Self = StObject.set(x, "quasi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Expression): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

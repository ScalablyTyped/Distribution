package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait BooleanLiteralTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  @JSName("type")
  var type_BooleanLiteralTypeAnnotation_ : BooleanLiteralTypeAnnotation = js.native
  
  var value: Boolean = js.native
}
object BooleanLiteralTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: BooleanLiteralTypeAnnotation, value: Boolean): BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteralTypeAnnotation_]
  }
  
  @scala.inline
  implicit class BooleanLiteralTypeAnnotation_MutableBuilder[Self <: BooleanLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BooleanLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

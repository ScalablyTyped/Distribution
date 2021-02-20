package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait NumericLiteral_
  extends Expression
     with BaseNode
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_NumericLiteral_ : NumericLiteral = js.native
  
  var value: Double = js.native
}
object NumericLiteral_ {
  
  @scala.inline
  def apply(`type`: NumericLiteral, value: Double): NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral_]
  }
  
  @scala.inline
  implicit class NumericLiteral_MutableBuilder[Self <: NumericLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

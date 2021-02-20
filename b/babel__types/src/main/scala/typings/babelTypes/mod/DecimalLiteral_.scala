package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DecimalLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait DecimalLiteral_
  extends Expression
     with BaseNode
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_DecimalLiteral_ : DecimalLiteral = js.native
  
  var value: String = js.native
}
object DecimalLiteral_ {
  
  @scala.inline
  def apply(`type`: DecimalLiteral, value: String): DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalLiteral_]
  }
  
  @scala.inline
  implicit class DecimalLiteral_MutableBuilder[Self <: DecimalLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DecimalLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

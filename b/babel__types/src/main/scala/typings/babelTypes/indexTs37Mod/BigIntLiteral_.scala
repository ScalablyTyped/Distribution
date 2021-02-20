package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.BigIntLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait BigIntLiteral_
  extends Expression
     with BaseNode
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_BigIntLiteral_ : BigIntLiteral = js.native
  
  var value: String = js.native
}
object BigIntLiteral_ {
  
  @scala.inline
  def apply(`type`: BigIntLiteral, value: String): BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntLiteral_]
  }
  
  @scala.inline
  implicit class BigIntLiteral_MutableBuilder[Self <: BigIntLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BigIntLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

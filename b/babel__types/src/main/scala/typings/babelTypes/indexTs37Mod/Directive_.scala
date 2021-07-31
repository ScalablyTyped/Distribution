package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.Directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive_
  extends StObject
     with BaseNode
     with _Node {
  
  @JSName("type")
  var type_Directive_ : Directive
  
  var value: DirectiveLiteral_
}
object Directive_ {
  
  @scala.inline
  def apply(value: DirectiveLiteral_): Directive_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Directive")
    __obj.asInstanceOf[Directive_]
  }
  
  @scala.inline
  implicit class Directive_MutableBuilder[Self <: Directive_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Directive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DirectiveLiteral_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

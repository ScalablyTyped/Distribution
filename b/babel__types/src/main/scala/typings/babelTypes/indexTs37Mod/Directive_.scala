package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.Directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directive_
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_Directive_ : Directive = js.native
  
  var value: DirectiveLiteral_ = js.native
}
object Directive_ {
  
  @scala.inline
  def apply(`type`: Directive, value: DirectiveLiteral_): Directive_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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

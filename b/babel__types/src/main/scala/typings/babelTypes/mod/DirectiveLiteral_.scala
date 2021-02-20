package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DirectiveLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveLiteral_
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_DirectiveLiteral_ : DirectiveLiteral = js.native
  
  var value: String = js.native
}
object DirectiveLiteral_ {
  
  @scala.inline
  def apply(`type`: DirectiveLiteral, value: String): DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveLiteral_]
  }
  
  @scala.inline
  implicit class DirectiveLiteral_MutableBuilder[Self <: DirectiveLiteral_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DirectiveLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

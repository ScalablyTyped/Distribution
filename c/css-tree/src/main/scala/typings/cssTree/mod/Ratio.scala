package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ratio
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var left: String = js.native
  
  var right: String = js.native
  
  @JSName("type")
  var type_Ratio: typings.cssTree.cssTreeStrings.Ratio = js.native
}
object Ratio {
  
  @scala.inline
  def apply(left: String, right: String, `type`: typings.cssTree.cssTreeStrings.Ratio): Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
  
  @scala.inline
  implicit class RatioMutableBuilder[Self <: Ratio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Ratio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Percentage
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_Percentage: typings.cssTree.cssTreeStrings.Percentage
  
  var value: String
}
object Percentage {
  
  @scala.inline
  def apply(value: String): Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Percentage")
    __obj.asInstanceOf[Percentage]
  }
  
  @scala.inline
  implicit class PercentageMutableBuilder[Self <: Percentage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Percentage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

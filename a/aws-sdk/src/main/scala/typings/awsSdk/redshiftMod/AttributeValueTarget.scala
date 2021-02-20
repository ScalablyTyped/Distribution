package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeValueTarget extends StObject {
  
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.native
}
object AttributeValueTarget {
  
  @scala.inline
  def apply(): AttributeValueTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValueTarget]
  }
  
  @scala.inline
  implicit class AttributeValueTargetMutableBuilder[Self <: AttributeValueTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeValue(value: String): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
  }
}

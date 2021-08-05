package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValueTarget extends StObject {
  
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.undefined
}
object AttributeValueTarget {
  
  inline def apply(): AttributeValueTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValueTarget]
  }
  
  extension [Self <: AttributeValueTarget](x: Self) {
    
    inline def setAttributeValue(value: String): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
  }
}

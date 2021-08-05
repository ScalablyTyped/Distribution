package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpEndpointCommonAttribute extends StObject {
  
  /**
    * The name of the HTTP endpoint common attribute.
    */
  var AttributeName: HttpEndpointAttributeName
  
  /**
    * The value of the HTTP endpoint common attribute.
    */
  var AttributeValue: HttpEndpointAttributeValue
}
object HttpEndpointCommonAttribute {
  
  inline def apply(AttributeName: HttpEndpointAttributeName, AttributeValue: HttpEndpointAttributeValue): HttpEndpointCommonAttribute = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpointCommonAttribute]
  }
  
  extension [Self <: HttpEndpointCommonAttribute](x: Self) {
    
    inline def setAttributeName(value: HttpEndpointAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: HttpEndpointAttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
  }
}

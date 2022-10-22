package typings.awsSdkUtilEndpoints

import typings.awsSdkTypes.distTypesEndpointMod.EndpointObjectProperty
import typings.awsSdkUtilEndpoints.awsSdkUtilEndpointsStrings.endpoint
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.ConditionObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.Expression
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesEndpointRuleObjectMod {
  
  trait EndpointObject extends StObject {
    
    var headers: js.UndefOr[EndpointObjectHeaders] = js.undefined
    
    var properties: js.UndefOr[EndpointObjectProperties] = js.undefined
    
    var url: Expression
  }
  object EndpointObject {
    
    inline def apply(url: Expression): EndpointObject = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointObject]
    }
    
    extension [Self <: EndpointObject](x: Self) {
      
      inline def setHeaders(value: EndpointObjectHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProperties(value: EndpointObjectProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setUrl(value: Expression): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type EndpointObjectHeaders = Record[String, js.Array[Expression]]
  
  type EndpointObjectProperties = Record[String, EndpointObjectProperty]
  
  trait EndpointRuleObject extends StObject {
    
    var conditions: js.UndefOr[js.Array[ConditionObject]] = js.undefined
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var endpoint: EndpointObject
    
    var `type`: endpoint
  }
  object EndpointRuleObject {
    
    inline def apply(endpoint: EndpointObject): EndpointRuleObject = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("endpoint")
      __obj.asInstanceOf[EndpointRuleObject]
    }
    
    extension [Self <: EndpointRuleObject](x: Self) {
      
      inline def setConditions(value: js.Array[ConditionObject]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: ConditionObject*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setEndpoint(value: EndpointObject): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setType(value: endpoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

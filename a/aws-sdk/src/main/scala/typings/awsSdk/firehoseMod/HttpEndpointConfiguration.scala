package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpEndpointConfiguration extends StObject {
  
  /**
    * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
    */
  var AccessKey: js.UndefOr[HttpEndpointAccessKey] = js.undefined
  
  /**
    * The name of the HTTP endpoint selected as the destination.
    */
  var Name: js.UndefOr[HttpEndpointName] = js.undefined
  
  /**
    * The URL of the HTTP endpoint selected as the destination.
    */
  var Url: HttpEndpointUrl
}
object HttpEndpointConfiguration {
  
  inline def apply(Url: HttpEndpointUrl): HttpEndpointConfiguration = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpointConfiguration]
  }
  
  extension [Self <: HttpEndpointConfiguration](x: Self) {
    
    inline def setAccessKey(value: HttpEndpointAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    inline def setName(value: HttpEndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUrl(value: HttpEndpointUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}

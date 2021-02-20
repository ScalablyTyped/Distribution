package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointConfiguration extends StObject {
  
  /**
    * The access key required for Kinesis Firehose to authenticate with the HTTP endpoint selected as the destination.
    */
  var AccessKey: js.UndefOr[HttpEndpointAccessKey] = js.native
  
  /**
    * The name of the HTTP endpoint selected as the destination.
    */
  var Name: js.UndefOr[HttpEndpointName] = js.native
  
  /**
    * The URL of the HTTP endpoint selected as the destination.
    */
  var Url: HttpEndpointUrl = js.native
}
object HttpEndpointConfiguration {
  
  @scala.inline
  def apply(Url: HttpEndpointUrl): HttpEndpointConfiguration = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpointConfiguration]
  }
  
  @scala.inline
  implicit class HttpEndpointConfigurationMutableBuilder[Self <: HttpEndpointConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKey(value: HttpEndpointAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    @scala.inline
    def setName(value: HttpEndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setUrl(value: HttpEndpointUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}

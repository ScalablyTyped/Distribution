package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputOrigin extends StObject {
  
  /**
    * The name of the origin resource.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull content.
    */
  var protocolPolicy: js.UndefOr[OriginProtocolPolicyEnum] = js.undefined
  
  /**
    * The AWS Region name of the origin resource.
    */
  var regionName: js.UndefOr[RegionName] = js.undefined
}
object InputOrigin {
  
  @scala.inline
  def apply(): InputOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOrigin]
  }
  
  @scala.inline
  implicit class InputOriginMutableBuilder[Self <: InputOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProtocolPolicy(value: OriginProtocolPolicyEnum): Self = StObject.set(x, "protocolPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolPolicyUndefined: Self = StObject.set(x, "protocolPolicy", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "regionName", js.undefined)
  }
}

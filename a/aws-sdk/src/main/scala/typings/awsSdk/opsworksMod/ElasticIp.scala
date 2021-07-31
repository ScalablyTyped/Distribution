package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticIp extends StObject {
  
  /**
    * The domain.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance that the address is attached to.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address.
    */
  var Ip: js.UndefOr[String] = js.undefined
  
  /**
    * The name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS region. For more information, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.undefined
}
object ElasticIp {
  
  @scala.inline
  def apply(): ElasticIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticIp]
  }
  
  @scala.inline
  implicit class ElasticIpMutableBuilder[Self <: ElasticIp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}

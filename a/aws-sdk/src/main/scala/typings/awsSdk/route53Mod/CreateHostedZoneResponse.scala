package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHostedZoneResponse extends StObject {
  
  /**
    * A complex type that contains information about the CreateHostedZone request.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo
  
  /**
    * A complex type that describes the name servers for this hosted zone.
    */
  var DelegationSet: typings.awsSdk.route53Mod.DelegationSet
  
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZone: typings.awsSdk.route53Mod.HostedZone
  
  /**
    * The unique URL representing the new hosted zone.
    */
  var Location: ResourceURI
  
  /**
    * A complex type that contains information about an Amazon VPC that you associated with this hosted zone.
    */
  var VPC: js.UndefOr[typings.awsSdk.route53Mod.VPC] = js.undefined
}
object CreateHostedZoneResponse {
  
  @scala.inline
  def apply(
    ChangeInfo: ChangeInfo,
    DelegationSet: DelegationSet,
    HostedZone: HostedZone,
    Location: ResourceURI
  ): CreateHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any], DelegationSet = DelegationSet.asInstanceOf[js.Any], HostedZone = HostedZone.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostedZoneResponse]
  }
  
  @scala.inline
  implicit class CreateHostedZoneResponseMutableBuilder[Self <: CreateHostedZoneResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegationSet(value: DelegationSet): Self = StObject.set(x, "DelegationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZone(value: HostedZone): Self = StObject.set(x, "HostedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPC(value: VPC): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCUndefined: Self = StObject.set(x, "VPC", js.undefined)
  }
}

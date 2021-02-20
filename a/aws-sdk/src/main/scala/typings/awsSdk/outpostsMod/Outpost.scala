package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outpost extends StObject {
  
  var AvailabilityZone: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZone] = js.native
  
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZoneId] = js.native
  
  var Description: js.UndefOr[OutpostDescription] = js.native
  
  var LifeCycleStatus: js.UndefOr[typings.awsSdk.outpostsMod.LifeCycleStatus] = js.native
  
  var Name: js.UndefOr[OutpostName] = js.native
  
  var OutpostArn: js.UndefOr[typings.awsSdk.outpostsMod.OutpostArn] = js.native
  
  var OutpostId: js.UndefOr[typings.awsSdk.outpostsMod.OutpostId] = js.native
  
  var OwnerId: js.UndefOr[typings.awsSdk.outpostsMod.OwnerId] = js.native
  
  var SiteId: js.UndefOr[typings.awsSdk.outpostsMod.SiteId] = js.native
}
object Outpost {
  
  @scala.inline
  def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  
  @scala.inline
  implicit class OutpostMutableBuilder[Self <: Outpost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneId(value: AvailabilityZoneId): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDescription(value: OutpostDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLifeCycleStatus(value: LifeCycleStatus): Self = StObject.set(x, "LifeCycleStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifeCycleStatusUndefined: Self = StObject.set(x, "LifeCycleStatus", js.undefined)
    
    @scala.inline
    def setName(value: OutpostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: OutpostArn): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
  }
}

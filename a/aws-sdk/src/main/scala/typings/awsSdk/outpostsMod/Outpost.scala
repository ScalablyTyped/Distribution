package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outpost extends StObject {
  
  var AvailabilityZone: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZone] = js.undefined
  
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZoneId] = js.undefined
  
  var Description: js.UndefOr[OutpostDescription] = js.undefined
  
  var LifeCycleStatus: js.UndefOr[typings.awsSdk.outpostsMod.LifeCycleStatus] = js.undefined
  
  var Name: js.UndefOr[OutpostName] = js.undefined
  
  var OutpostArn: js.UndefOr[typings.awsSdk.outpostsMod.OutpostArn] = js.undefined
  
  /**
    *  The ID of the Outpost. 
    */
  var OutpostId: js.UndefOr[typings.awsSdk.outpostsMod.OutpostId] = js.undefined
  
  var OwnerId: js.UndefOr[typings.awsSdk.outpostsMod.OwnerId] = js.undefined
  
  var SiteArn: js.UndefOr[typings.awsSdk.outpostsMod.SiteArn] = js.undefined
  
  var SiteId: js.UndefOr[typings.awsSdk.outpostsMod.SiteId] = js.undefined
  
  /**
    *  The hardware type. 
    */
  var SupportedHardwareType: js.UndefOr[typings.awsSdk.outpostsMod.SupportedHardwareType] = js.undefined
  
  /**
    * The Outpost tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Outpost {
  
  inline def apply(): Outpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outpost]
  }
  
  extension [Self <: Outpost](x: Self) {
    
    inline def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: AvailabilityZoneId): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDescription(value: OutpostDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLifeCycleStatus(value: LifeCycleStatus): Self = StObject.set(x, "LifeCycleStatus", value.asInstanceOf[js.Any])
    
    inline def setLifeCycleStatusUndefined: Self = StObject.set(x, "LifeCycleStatus", js.undefined)
    
    inline def setName(value: OutpostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutpostArn(value: OutpostArn): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    inline def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setSiteArn(value: SiteArn): Self = StObject.set(x, "SiteArn", value.asInstanceOf[js.Any])
    
    inline def setSiteArnUndefined: Self = StObject.set(x, "SiteArn", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setSupportedHardwareType(value: SupportedHardwareType): Self = StObject.set(x, "SupportedHardwareType", value.asInstanceOf[js.Any])
    
    inline def setSupportedHardwareTypeUndefined: Self = StObject.set(x, "SupportedHardwareType", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

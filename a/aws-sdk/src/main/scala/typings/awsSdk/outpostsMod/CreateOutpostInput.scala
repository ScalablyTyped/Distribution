package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOutpostInput extends StObject {
  
  var AvailabilityZone: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZone] = js.undefined
  
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZoneId] = js.undefined
  
  var Description: js.UndefOr[OutpostDescription] = js.undefined
  
  var Name: OutpostName
  
  var SiteId: typings.awsSdk.outpostsMod.SiteId
}
object CreateOutpostInput {
  
  inline def apply(Name: OutpostName, SiteId: SiteId): CreateOutpostInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOutpostInput]
  }
  
  extension [Self <: CreateOutpostInput](x: Self) {
    
    inline def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: AvailabilityZoneId): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDescription(value: OutpostDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: OutpostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOutpostInput extends StObject {
  
  var AvailabilityZone: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZone] = js.native
  
  var AvailabilityZoneId: js.UndefOr[typings.awsSdk.outpostsMod.AvailabilityZoneId] = js.native
  
  var Description: js.UndefOr[OutpostDescription] = js.native
  
  var Name: OutpostName = js.native
  
  var SiteId: typings.awsSdk.outpostsMod.SiteId = js.native
}
object CreateOutpostInput {
  
  @scala.inline
  def apply(Name: OutpostName, SiteId: SiteId): CreateOutpostInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOutpostInput]
  }
  
  @scala.inline
  implicit class CreateOutpostInputMutableBuilder[Self <: CreateOutpostInput] (val x: Self) extends AnyVal {
    
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
    def setName(value: OutpostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}

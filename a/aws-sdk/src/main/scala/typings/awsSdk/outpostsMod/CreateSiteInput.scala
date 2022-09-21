package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSiteInput extends StObject {
  
  var Description: js.UndefOr[SiteDescription] = js.undefined
  
  var Name: SiteName
  
  /**
    * Additional information that you provide about site access requirements, electrician scheduling, personal protective equipment, or regulation of equipment materials that could affect your installation process. 
    */
  var Notes: js.UndefOr[SiteNotes] = js.undefined
  
  /**
    *  The location to install and power on the hardware. This address might be different from the shipping address. 
    */
  var OperatingAddress: js.UndefOr[Address] = js.undefined
  
  /**
    *  Information about the physical and logistical details for the rack at this site. For more information about hardware requirements for racks, see Network readiness checklist in the Amazon Web Services Outposts User Guide. 
    */
  var RackPhysicalProperties: js.UndefOr[typings.awsSdk.outpostsMod.RackPhysicalProperties] = js.undefined
  
  /**
    *  The location to ship the hardware. This address might be different from the operating address. 
    */
  var ShippingAddress: js.UndefOr[Address] = js.undefined
  
  /**
    *  The tags to apply to a site. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSiteInput {
  
  inline def apply(Name: SiteName): CreateSiteInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSiteInput]
  }
  
  extension [Self <: CreateSiteInput](x: Self) {
    
    inline def setDescription(value: SiteDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: SiteName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: SiteNotes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setOperatingAddress(value: Address): Self = StObject.set(x, "OperatingAddress", value.asInstanceOf[js.Any])
    
    inline def setOperatingAddressUndefined: Self = StObject.set(x, "OperatingAddress", js.undefined)
    
    inline def setRackPhysicalProperties(value: RackPhysicalProperties): Self = StObject.set(x, "RackPhysicalProperties", value.asInstanceOf[js.Any])
    
    inline def setRackPhysicalPropertiesUndefined: Self = StObject.set(x, "RackPhysicalProperties", js.undefined)
    
    inline def setShippingAddress(value: Address): Self = StObject.set(x, "ShippingAddress", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressUndefined: Self = StObject.set(x, "ShippingAddress", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

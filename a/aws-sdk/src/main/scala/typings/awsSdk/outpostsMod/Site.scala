package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site extends StObject {
  
  var AccountId: js.UndefOr[typings.awsSdk.outpostsMod.AccountId] = js.undefined
  
  var Description: js.UndefOr[SiteDescription] = js.undefined
  
  var Name: js.UndefOr[SiteName] = js.undefined
  
  /**
    *  Notes about a site. 
    */
  var Notes: js.UndefOr[SiteNotes] = js.undefined
  
  /**
    *  City where the hardware is installed and powered on. 
    */
  var OperatingAddressCity: js.UndefOr[City] = js.undefined
  
  /**
    *  The ISO-3166 two-letter country code where the hardware is installed and powered on. 
    */
  var OperatingAddressCountryCode: js.UndefOr[CountryCode] = js.undefined
  
  /**
    *  State or region where the hardware is installed and powered on. 
    */
  var OperatingAddressStateOrRegion: js.UndefOr[StateOrRegion] = js.undefined
  
  /**
    *  Information about the physical and logistical details for a rack at the site. 
    */
  var RackPhysicalProperties: js.UndefOr[typings.awsSdk.outpostsMod.RackPhysicalProperties] = js.undefined
  
  var SiteArn: js.UndefOr[typings.awsSdk.outpostsMod.SiteArn] = js.undefined
  
  var SiteId: js.UndefOr[typings.awsSdk.outpostsMod.SiteId] = js.undefined
  
  /**
    * The site tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Site {
  
  inline def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  extension [Self <: Site](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setDescription(value: SiteDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: SiteName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotes(value: SiteNotes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setOperatingAddressCity(value: City): Self = StObject.set(x, "OperatingAddressCity", value.asInstanceOf[js.Any])
    
    inline def setOperatingAddressCityUndefined: Self = StObject.set(x, "OperatingAddressCity", js.undefined)
    
    inline def setOperatingAddressCountryCode(value: CountryCode): Self = StObject.set(x, "OperatingAddressCountryCode", value.asInstanceOf[js.Any])
    
    inline def setOperatingAddressCountryCodeUndefined: Self = StObject.set(x, "OperatingAddressCountryCode", js.undefined)
    
    inline def setOperatingAddressStateOrRegion(value: StateOrRegion): Self = StObject.set(x, "OperatingAddressStateOrRegion", value.asInstanceOf[js.Any])
    
    inline def setOperatingAddressStateOrRegionUndefined: Self = StObject.set(x, "OperatingAddressStateOrRegion", js.undefined)
    
    inline def setRackPhysicalProperties(value: RackPhysicalProperties): Self = StObject.set(x, "RackPhysicalProperties", value.asInstanceOf[js.Any])
    
    inline def setRackPhysicalPropertiesUndefined: Self = StObject.set(x, "RackPhysicalProperties", js.undefined)
    
    inline def setSiteArn(value: SiteArn): Self = StObject.set(x, "SiteArn", value.asInstanceOf[js.Any])
    
    inline def setSiteArnUndefined: Self = StObject.set(x, "SiteArn", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

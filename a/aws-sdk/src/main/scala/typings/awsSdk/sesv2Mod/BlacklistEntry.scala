package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlacklistEntry extends StObject {
  
  /**
    * Additional information about the blacklisting event, as provided by the blacklist maintainer.
    */
  var Description: js.UndefOr[BlacklistingDescription] = js.undefined
  
  /**
    * The time when the blacklisting event occurred, shown in Unix time format.
    */
  var ListingTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the blacklist that the IP address appears on.
    */
  var RblName: js.UndefOr[typings.awsSdk.sesv2Mod.RblName] = js.undefined
}
object BlacklistEntry {
  
  inline def apply(): BlacklistEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlacklistEntry]
  }
  
  extension [Self <: BlacklistEntry](x: Self) {
    
    inline def setDescription(value: BlacklistingDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setListingTime(value: Timestamp): Self = StObject.set(x, "ListingTime", value.asInstanceOf[js.Any])
    
    inline def setListingTimeUndefined: Self = StObject.set(x, "ListingTime", js.undefined)
    
    inline def setRblName(value: RblName): Self = StObject.set(x, "RblName", value.asInstanceOf[js.Any])
    
    inline def setRblNameUndefined: Self = StObject.set(x, "RblName", js.undefined)
  }
}

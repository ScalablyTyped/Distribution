package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainItem extends StObject {
  
  /**
    * The timestamp of when the domain was created.
    */
  var CreatedAt: js.Date
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The timestamp of when the domain was most recently edited.
    */
  var LastUpdatedAt: js.Date
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ListDomainItem {
  
  inline def apply(CreatedAt: js.Date, DomainName: name, LastUpdatedAt: js.Date): ListDomainItem = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], LastUpdatedAt = LastUpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainItem]
  }
  
  extension [Self <: ListDomainItem](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSummary extends StObject {
  
  /**
    * The time that the domain was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DisplayName] = js.undefined
  
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.clientsWorklinkMod.DomainName
  
  /**
    * The status of the domain.
    */
  var DomainStatus: typings.awsSdk.clientsWorklinkMod.DomainStatus
}
object DomainSummary {
  
  inline def apply(CreatedTime: js.Date, DomainName: DomainName, DomainStatus: DomainStatus): DomainSummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DomainStatus = DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
  
  extension [Self <: DomainSummary](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainInformation extends StObject {
  
  var DomainName: typings.awsSdk.esMod.DomainName
  
  var OwnerId: js.UndefOr[typings.awsSdk.esMod.OwnerId] = js.undefined
  
  var Region: js.UndefOr[typings.awsSdk.esMod.Region] = js.undefined
}
object DomainInformation {
  
  @scala.inline
  def apply(DomainName: DomainName): DomainInformation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInformation]
  }
  
  @scala.inline
  implicit class DomainInformationMutableBuilder[Self <: DomainInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}

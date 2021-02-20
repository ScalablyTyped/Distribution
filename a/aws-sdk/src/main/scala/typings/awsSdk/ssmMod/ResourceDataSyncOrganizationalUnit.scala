package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceDataSyncOrganizationalUnit extends StObject {
  
  /**
    * The AWS Organization unit ID data source for the sync.
    */
  var OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId] = js.native
}
object ResourceDataSyncOrganizationalUnit {
  
  @scala.inline
  def apply(): ResourceDataSyncOrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncOrganizationalUnit]
  }
  
  @scala.inline
  implicit class ResourceDataSyncOrganizationalUnitMutableBuilder[Self <: ResourceDataSyncOrganizationalUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationalUnitId(value: ResourceDataSyncOrganizationalUnitId): Self = StObject.set(x, "OrganizationalUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitIdUndefined: Self = StObject.set(x, "OrganizationalUnitId", js.undefined)
  }
}

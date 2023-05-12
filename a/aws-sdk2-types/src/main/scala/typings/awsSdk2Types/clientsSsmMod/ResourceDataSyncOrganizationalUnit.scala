package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncOrganizationalUnit extends StObject {
  
  /**
    * The Organizations unit ID data source for the sync.
    */
  var OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId] = js.undefined
}
object ResourceDataSyncOrganizationalUnit {
  
  inline def apply(): ResourceDataSyncOrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncOrganizationalUnit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDataSyncOrganizationalUnit] (val x: Self) extends AnyVal {
    
    inline def setOrganizationalUnitId(value: ResourceDataSyncOrganizationalUnitId): Self = StObject.set(x, "OrganizationalUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdUndefined: Self = StObject.set(x, "OrganizationalUnitId", js.undefined)
  }
}

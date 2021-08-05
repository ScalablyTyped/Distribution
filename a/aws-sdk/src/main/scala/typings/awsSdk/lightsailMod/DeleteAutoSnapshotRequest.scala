package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAutoSnapshotRequest extends StObject {
  
  /**
    * The date of the automatic snapshot to delete in YYYY-MM-DD format. Use the get auto snapshots operation to get the available automatic snapshots for a resource.
    */
  var date: AutoSnapshotDate
  
  /**
    * The name of the source instance or disk from which to delete the automatic snapshot.
    */
  var resourceName: ResourceName
}
object DeleteAutoSnapshotRequest {
  
  inline def apply(date: AutoSnapshotDate, resourceName: ResourceName): DeleteAutoSnapshotRequest = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutoSnapshotRequest]
  }
  
  extension [Self <: DeleteAutoSnapshotRequest](x: Self) {
    
    inline def setDate(value: AutoSnapshotDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}

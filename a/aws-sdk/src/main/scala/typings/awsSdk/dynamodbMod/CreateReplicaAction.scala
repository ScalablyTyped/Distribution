package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicaAction extends StObject {
  
  /**
    * The Region of the replica to be added.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName
}
object CreateReplicaAction {
  
  inline def apply(RegionName: RegionName): CreateReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicaAction]
  }
  
  extension [Self <: CreateReplicaAction](x: Self) {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
  }
}

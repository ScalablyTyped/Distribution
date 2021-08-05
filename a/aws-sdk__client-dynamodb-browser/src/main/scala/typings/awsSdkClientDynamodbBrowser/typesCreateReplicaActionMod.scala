package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateReplicaActionMod {
  
  trait CreateReplicaAction extends StObject {
    
    /**
      * <p>The region of the replica to be added.</p>
      */
    var RegionName: String
  }
  object CreateReplicaAction {
    
    inline def apply(RegionName: String): CreateReplicaAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateReplicaAction]
    }
    
    extension [Self <: CreateReplicaAction](x: Self) {
      
      inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledCreateReplicaAction = CreateReplicaAction
}

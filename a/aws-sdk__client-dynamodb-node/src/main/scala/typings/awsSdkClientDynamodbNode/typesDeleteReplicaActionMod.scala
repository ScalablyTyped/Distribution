package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteReplicaActionMod {
  
  trait DeleteReplicaAction extends StObject {
    
    /**
      * <p>The region of the replica to be removed.</p>
      */
    var RegionName: String
  }
  object DeleteReplicaAction {
    
    inline def apply(RegionName: String): DeleteReplicaAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteReplicaAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteReplicaAction] (val x: Self) extends AnyVal {
      
      inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledDeleteReplicaAction = DeleteReplicaAction
}

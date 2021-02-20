package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteReplicaActionMod {
  
  @js.native
  trait DeleteReplicaAction extends StObject {
    
    /**
      * <p>The region of the replica to be removed.</p>
      */
    var RegionName: String = js.native
  }
  object DeleteReplicaAction {
    
    @scala.inline
    def apply(RegionName: String): DeleteReplicaAction = {
      val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteReplicaAction]
    }
    
    @scala.inline
    implicit class DeleteReplicaActionMutableBuilder[Self <: DeleteReplicaAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledDeleteReplicaAction = DeleteReplicaAction
}

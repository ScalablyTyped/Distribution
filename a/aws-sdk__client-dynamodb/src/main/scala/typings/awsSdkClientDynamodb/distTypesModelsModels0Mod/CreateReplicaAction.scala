package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicaAction extends StObject {
  
  /**
    * <p>The Region of the replica to be added.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
}
object CreateReplicaAction {
  
  inline def apply(): CreateReplicaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicaAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReplicaAction] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}

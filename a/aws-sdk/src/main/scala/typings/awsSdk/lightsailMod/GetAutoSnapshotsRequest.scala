package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAutoSnapshotsRequest extends StObject {
  
  /**
    * The name of the source instance or disk from which to get automatic snapshot information.
    */
  var resourceName: ResourceName = js.native
}
object GetAutoSnapshotsRequest {
  
  @scala.inline
  def apply(resourceName: ResourceName): GetAutoSnapshotsRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoSnapshotsRequest]
  }
  
  @scala.inline
  implicit class GetAutoSnapshotsRequestMutableBuilder[Self <: GetAutoSnapshotsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
  }
}

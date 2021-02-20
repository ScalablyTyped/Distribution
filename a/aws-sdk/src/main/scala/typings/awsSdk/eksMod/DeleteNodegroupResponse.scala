package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNodegroupResponse extends StObject {
  
  /**
    * The full description of your deleted node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.native
}
object DeleteNodegroupResponse {
  
  @scala.inline
  def apply(): DeleteNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNodegroupResponse]
  }
  
  @scala.inline
  implicit class DeleteNodegroupResponseMutableBuilder[Self <: DeleteNodegroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodegroup(value: Nodegroup): Self = StObject.set(x, "nodegroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupUndefined: Self = StObject.set(x, "nodegroup", js.undefined)
  }
}

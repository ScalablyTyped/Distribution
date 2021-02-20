package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNodegroupResponse extends StObject {
  
  /**
    * The full description of your new node group.
    */
  var nodegroup: js.UndefOr[Nodegroup] = js.native
}
object CreateNodegroupResponse {
  
  @scala.inline
  def apply(): CreateNodegroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodegroupResponse]
  }
  
  @scala.inline
  implicit class CreateNodegroupResponseMutableBuilder[Self <: CreateNodegroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodegroup(value: Nodegroup): Self = StObject.set(x, "nodegroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupUndefined: Self = StObject.set(x, "nodegroup", js.undefined)
  }
}

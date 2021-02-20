package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUpdateRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster associated with the update.
    */
  var name: String = js.native
  
  /**
    * The name of the Amazon EKS node group associated with the update.
    */
  var nodegroupName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the update to describe.
    */
  var updateId: String = js.native
}
object DescribeUpdateRequest {
  
  @scala.inline
  def apply(name: String, updateId: String): DescribeUpdateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], updateId = updateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUpdateRequest]
  }
  
  @scala.inline
  implicit class DescribeUpdateRequestMutableBuilder[Self <: DescribeUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupName(value: String): Self = StObject.set(x, "nodegroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodegroupNameUndefined: Self = StObject.set(x, "nodegroupName", js.undefined)
    
    @scala.inline
    def setUpdateId(value: String): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
  }
}

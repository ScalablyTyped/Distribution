package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePackagingGroupRequest extends StObject {
  
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: string = js.native
}
object DescribePackagingGroupRequest {
  
  @scala.inline
  def apply(Id: string): DescribePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingGroupRequest]
  }
  
  @scala.inline
  implicit class DescribePackagingGroupRequestMutableBuilder[Self <: DescribePackagingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}

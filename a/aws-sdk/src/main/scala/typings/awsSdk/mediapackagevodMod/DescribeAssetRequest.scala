package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssetRequest extends StObject {
  
  /**
    * The ID of an MediaPackage VOD Asset resource.
    */
  var Id: string = js.native
}
object DescribeAssetRequest {
  
  @scala.inline
  def apply(Id: string): DescribeAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetRequest]
  }
  
  @scala.inline
  implicit class DescribeAssetRequestMutableBuilder[Self <: DescribeAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}

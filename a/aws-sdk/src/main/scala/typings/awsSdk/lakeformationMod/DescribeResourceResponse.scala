package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourceResponse extends StObject {
  
  /**
    * A structure containing information about an AWS Lake Formation resource.
    */
  var ResourceInfo: js.UndefOr[typings.awsSdk.lakeformationMod.ResourceInfo] = js.native
}
object DescribeResourceResponse {
  
  @scala.inline
  def apply(): DescribeResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourceResponse]
  }
  
  @scala.inline
  implicit class DescribeResourceResponseMutableBuilder[Self <: DescribeResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceInfo(value: ResourceInfo): Self = StObject.set(x, "ResourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceInfoUndefined: Self = StObject.set(x, "ResourceInfo", js.undefined)
  }
}

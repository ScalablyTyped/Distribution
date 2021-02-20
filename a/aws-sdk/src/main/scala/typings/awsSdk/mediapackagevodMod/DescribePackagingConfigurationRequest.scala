package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePackagingConfigurationRequest extends StObject {
  
  /**
    * The ID of a MediaPackage VOD PackagingConfiguration resource.
    */
  var Id: string = js.native
}
object DescribePackagingConfigurationRequest {
  
  @scala.inline
  def apply(Id: string): DescribePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingConfigurationRequest]
  }
  
  @scala.inline
  implicit class DescribePackagingConfigurationRequestMutableBuilder[Self <: DescribePackagingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}

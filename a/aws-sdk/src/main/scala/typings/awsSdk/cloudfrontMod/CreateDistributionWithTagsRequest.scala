package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDistributionWithTagsRequest extends StObject {
  
  /**
    * The distribution's configuration information. 
    */
  var DistributionConfigWithTags: typings.awsSdk.cloudfrontMod.DistributionConfigWithTags
}
object CreateDistributionWithTagsRequest {
  
  @scala.inline
  def apply(DistributionConfigWithTags: DistributionConfigWithTags): CreateDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(DistributionConfigWithTags = DistributionConfigWithTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionWithTagsRequest]
  }
  
  @scala.inline
  implicit class CreateDistributionWithTagsRequestMutableBuilder[Self <: CreateDistributionWithTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionConfigWithTags(value: DistributionConfigWithTags): Self = StObject.set(x, "DistributionConfigWithTags", value.asInstanceOf[js.Any])
  }
}

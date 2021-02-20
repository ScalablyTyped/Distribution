package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDistributionRequest extends StObject {
  
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsSdk.cloudfrontMod.DistributionConfig = js.native
  
  /**
    * The distribution's id.
    */
  var Id: String = js.native
  
  /**
    * The value of the ETag header that you received when retrieving the distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}
object UpdateDistributionRequest {
  
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Id: String): UpdateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionRequest]
  }
  
  @scala.inline
  implicit class UpdateDistributionRequestMutableBuilder[Self <: UpdateDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionConfig(value: DistributionConfig): Self = StObject.set(x, "DistributionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}

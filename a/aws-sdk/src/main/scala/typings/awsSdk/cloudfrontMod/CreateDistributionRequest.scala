package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDistributionRequest extends StObject {
  
  /**
    * The distribution's configuration information.
    */
  var DistributionConfig: typings.awsSdk.cloudfrontMod.DistributionConfig = js.native
}
object CreateDistributionRequest {
  
  @scala.inline
  def apply(DistributionConfig: DistributionConfig): CreateDistributionRequest = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionRequest]
  }
  
  @scala.inline
  implicit class CreateDistributionRequestMutableBuilder[Self <: CreateDistributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionConfig(value: DistributionConfig): Self = StObject.set(x, "DistributionConfig", value.asInstanceOf[js.Any])
  }
}

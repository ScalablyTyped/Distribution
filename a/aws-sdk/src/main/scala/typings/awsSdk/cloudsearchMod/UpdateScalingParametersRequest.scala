package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateScalingParametersRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  
  var ScalingParameters: typings.awsSdk.cloudsearchMod.ScalingParameters = js.native
}
object UpdateScalingParametersRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, ScalingParameters: ScalingParameters): UpdateScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingParametersRequest]
  }
  
  @scala.inline
  implicit class UpdateScalingParametersRequestMutableBuilder[Self <: UpdateScalingParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingParameters(value: ScalingParameters): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}

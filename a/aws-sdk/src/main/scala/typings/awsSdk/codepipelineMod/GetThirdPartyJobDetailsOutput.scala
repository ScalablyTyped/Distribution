package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThirdPartyJobDetailsOutput extends StObject {
  
  /**
    * The details of the job, including any protected values defined for the job.
    */
  var jobDetails: js.UndefOr[ThirdPartyJobDetails] = js.native
}
object GetThirdPartyJobDetailsOutput {
  
  @scala.inline
  def apply(): GetThirdPartyJobDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThirdPartyJobDetailsOutput]
  }
  
  @scala.inline
  implicit class GetThirdPartyJobDetailsOutputMutableBuilder[Self <: GetThirdPartyJobDetailsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobDetails(value: ThirdPartyJobDetails): Self = StObject.set(x, "jobDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDetailsUndefined: Self = StObject.set(x, "jobDetails", js.undefined)
  }
}

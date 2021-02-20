package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcknowledgeThirdPartyJobInput extends StObject {
  
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The unique system-generated ID of the job.
    */
  var jobId: ThirdPartyJobId = js.native
  
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Get this number from the response to a GetThirdPartyJobDetails request.
    */
  var nonce: Nonce = js.native
}
object AcknowledgeThirdPartyJobInput {
  
  @scala.inline
  def apply(clientToken: ClientToken, jobId: ThirdPartyJobId, nonce: Nonce): AcknowledgeThirdPartyJobInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeThirdPartyJobInput]
  }
  
  @scala.inline
  implicit class AcknowledgeThirdPartyJobInputMutableBuilder[Self <: AcknowledgeThirdPartyJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: ThirdPartyJobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: Nonce): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
  }
}

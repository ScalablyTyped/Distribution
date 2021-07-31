package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyJobDetails extends StObject {
  
  /**
    * The data to be returned by the third party job worker.
    */
  var data: js.UndefOr[ThirdPartyJobData] = js.undefined
  
  /**
    * The identifier used to identify the job details in AWS CodePipeline.
    */
  var id: js.UndefOr[ThirdPartyJobId] = js.undefined
  
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeThirdPartyJob request.
    */
  var nonce: js.UndefOr[Nonce] = js.undefined
}
object ThirdPartyJobDetails {
  
  @scala.inline
  def apply(): ThirdPartyJobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyJobDetails]
  }
  
  @scala.inline
  implicit class ThirdPartyJobDetailsMutableBuilder[Self <: ThirdPartyJobDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ThirdPartyJobData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setId(value: ThirdPartyJobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNonce(value: Nonce): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
  }
}

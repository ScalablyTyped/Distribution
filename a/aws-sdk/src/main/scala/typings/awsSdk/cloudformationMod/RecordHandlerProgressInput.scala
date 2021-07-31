package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordHandlerProgressInput extends StObject {
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var BearerToken: ClientToken
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.cloudformationMod.ClientRequestToken] = js.undefined
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var CurrentOperationStatus: js.UndefOr[OperationStatus] = js.undefined
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ErrorCode: js.UndefOr[HandlerErrorCode] = js.undefined
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var OperationStatus: typings.awsSdk.cloudformationMod.OperationStatus
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ResourceModel: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceModel] = js.undefined
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.cloudformationMod.StatusMessage] = js.undefined
}
object RecordHandlerProgressInput {
  
  @scala.inline
  def apply(BearerToken: ClientToken, OperationStatus: OperationStatus): RecordHandlerProgressInput = {
    val __obj = js.Dynamic.literal(BearerToken = BearerToken.asInstanceOf[js.Any], OperationStatus = OperationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordHandlerProgressInput]
  }
  
  @scala.inline
  implicit class RecordHandlerProgressInputMutableBuilder[Self <: RecordHandlerProgressInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearerToken(value: ClientToken): Self = StObject.set(x, "BearerToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setCurrentOperationStatus(value: OperationStatus): Self = StObject.set(x, "CurrentOperationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentOperationStatusUndefined: Self = StObject.set(x, "CurrentOperationStatus", js.undefined)
    
    @scala.inline
    def setErrorCode(value: HandlerErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setOperationStatus(value: OperationStatus): Self = StObject.set(x, "OperationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceModel(value: ResourceModel): Self = StObject.set(x, "ResourceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceModelUndefined: Self = StObject.set(x, "ResourceModel", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}

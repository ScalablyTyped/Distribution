package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectorRequest extends StObject {
  
  /**
    * With AS2, you can send files by calling StartFileTransfer and specifying the file paths in the request parameter, SendFilePaths. We use the file’s parent directory (for example, for --send-file-paths /bucket/dir/file.txt, parent directory is /bucket/dir/) to temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a final JSON file containing relevant metadata of the transmission. So, the AccessRole needs to provide read and write access to the parent directory of the file location used in the StartFileTransfer request. Additionally, you need to provide read and write access to the parent directory of the files that you intend to send with StartFileTransfer.
    */
  var AccessRole: js.UndefOr[Role] = js.undefined
  
  /**
    * A structure that contains the parameters for a connector object.
    */
  var As2Config: js.UndefOr[As2ConnectorConfig] = js.undefined
  
  /**
    * The unique identifier for the connector.
    */
  var ConnectorId: typings.awsSdk.clientsTransferMod.ConnectorId
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  
  /**
    * The URL of the partner's AS2 endpoint.
    */
  var Url: js.UndefOr[typings.awsSdk.clientsTransferMod.Url] = js.undefined
}
object UpdateConnectorRequest {
  
  inline def apply(ConnectorId: ConnectorId): UpdateConnectorRequest = {
    val __obj = js.Dynamic.literal(ConnectorId = ConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectorRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessRole(value: Role): Self = StObject.set(x, "AccessRole", value.asInstanceOf[js.Any])
    
    inline def setAccessRoleUndefined: Self = StObject.set(x, "AccessRole", js.undefined)
    
    inline def setAs2Config(value: As2ConnectorConfig): Self = StObject.set(x, "As2Config", value.asInstanceOf[js.Any])
    
    inline def setAs2ConfigUndefined: Self = StObject.set(x, "As2Config", js.undefined)
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
    
    inline def setLoggingRole(value: Role): Self = StObject.set(x, "LoggingRole", value.asInstanceOf[js.Any])
    
    inline def setLoggingRoleUndefined: Self = StObject.set(x, "LoggingRole", js.undefined)
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}

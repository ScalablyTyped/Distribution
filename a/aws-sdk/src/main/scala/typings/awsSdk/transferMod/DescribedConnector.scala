package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedConnector extends StObject {
  
  /**
    * With AS2, you can send files by calling StartFileTransfer and specifying the file paths in the request parameter, SendFilePaths. We use the file’s parent directory (for example, for --send-file-paths /bucket/dir/file.txt, parent directory is /bucket/dir/) to temporarily store a processed AS2 message file, store the MDN when we receive them from the partner, and write a final JSON file containing relevant metadata of the transmission. So, the AccessRole needs to provide read and write access to the parent directory of the file location used in the StartFileTransfer request. Additionally, you need to provide read and write access to the parent directory of the files that you intend to send with StartFileTransfer.
    */
  var AccessRole: js.UndefOr[Role] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) for the connector.
    */
  var Arn: typings.awsSdk.transferMod.Arn
  
  /**
    * A structure that contains the parameters for a connector object.
    */
  var As2Config: js.UndefOr[As2ConnectorConfig] = js.undefined
  
  /**
    * The unique identifier for the connector.
    */
  var ConnectorId: js.UndefOr[typings.awsSdk.transferMod.ConnectorId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a connector to turn on CloudWatch logging for Amazon S3 events. When set, you can view connector activity in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for connectors.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.undefined
  
  /**
    * The URL of the partner's AS2 endpoint.
    */
  var Url: js.UndefOr[typings.awsSdk.transferMod.Url] = js.undefined
}
object DescribedConnector {
  
  inline def apply(Arn: Arn): DescribedConnector = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedConnector]
  }
  
  extension [Self <: DescribedConnector](x: Self) {
    
    inline def setAccessRole(value: Role): Self = StObject.set(x, "AccessRole", value.asInstanceOf[js.Any])
    
    inline def setAccessRoleUndefined: Self = StObject.set(x, "AccessRole", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setAs2Config(value: As2ConnectorConfig): Self = StObject.set(x, "As2Config", value.asInstanceOf[js.Any])
    
    inline def setAs2ConfigUndefined: Self = StObject.set(x, "As2Config", js.undefined)
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
    
    inline def setConnectorIdUndefined: Self = StObject.set(x, "ConnectorId", js.undefined)
    
    inline def setLoggingRole(value: Role): Self = StObject.set(x, "LoggingRole", value.asInstanceOf[js.Any])
    
    inline def setLoggingRoleUndefined: Self = StObject.set(x, "LoggingRole", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}

package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFileTransferRequest extends StObject {
  
  /**
    * The unique identifier for the connector. 
    */
  var ConnectorId: typings.awsSdk.clientsTransferMod.ConnectorId
  
  /**
    * An array of strings. Each string represents the absolute path for one outbound file transfer. For example,  DOC-EXAMPLE-BUCKET/myfile.txt . 
    */
  var SendFilePaths: FilePaths
}
object StartFileTransferRequest {
  
  inline def apply(ConnectorId: ConnectorId, SendFilePaths: FilePaths): StartFileTransferRequest = {
    val __obj = js.Dynamic.literal(ConnectorId = ConnectorId.asInstanceOf[js.Any], SendFilePaths = SendFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFileTransferRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFileTransferRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
    
    inline def setSendFilePaths(value: FilePaths): Self = StObject.set(x, "SendFilePaths", value.asInstanceOf[js.Any])
    
    inline def setSendFilePathsVarargs(value: FilePath*): Self = StObject.set(x, "SendFilePaths", js.Array(value*))
  }
}

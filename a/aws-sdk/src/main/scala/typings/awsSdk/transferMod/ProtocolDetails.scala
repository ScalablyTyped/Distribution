package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolDetails extends StObject {
  
  /**
    * Indicates the transport method for the AS2 messages. Currently, only HTTP is supported.
    */
  var As2Transports: js.UndefOr[typings.awsSdk.transferMod.As2Transports] = js.undefined
  
  /**
    *  Indicates passive mode, for FTP and FTPS protocols. Enter a single IPv4 address, such as the public IP address of a firewall, router, or load balancer. For example:    aws transfer update-server --protocol-details PassiveIp=0.0.0.0   Replace  0.0.0.0  in the example above with the actual IP address you want to use.   If you change the PassiveIp value, you must stop and then restart your Transfer Family server for the change to take effect. For details on using passive mode (PASV) in a NAT environment, see Configuring your FTPS server behind a firewall or NAT with Transfer Family.  
    */
  var PassiveIp: js.UndefOr[typings.awsSdk.transferMod.PassiveIp] = js.undefined
  
  /**
    * Use the SetStatOption to ignore the error that is generated when the client attempts to use SETSTAT on a file you are uploading to an S3 bucket. Some SFTP file transfer clients can attempt to change the attributes of remote files, including timestamp and permissions, using commands, such as SETSTAT when uploading the file. However, these commands are not compatible with object storage systems, such as Amazon S3. Due to this incompatibility, file uploads from these clients can result in errors even when the file is otherwise successfully uploaded. Set the value to ENABLE_NO_OP to have the Transfer Family server ignore the SETSTAT command, and upload files without needing to make any changes to your SFTP client. While the SetStatOption ENABLE_NO_OP setting ignores the error, it does generate a log entry in Amazon CloudWatch Logs, so you can determine when the client is making a SETSTAT call.  If you want to preserve the original timestamp for your file, and modify other file attributes using SETSTAT, you can use Amazon EFS as backend storage with Transfer Family. 
    */
  var SetStatOption: js.UndefOr[typings.awsSdk.transferMod.SetStatOption] = js.undefined
  
  /**
    * A property used with Transfer Family servers that use the FTPS protocol. TLS Session Resumption provides a mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session. TlsSessionResumptionMode determines whether or not the server resumes recent, negotiated sessions through a unique session ID. This property is available during CreateServer and UpdateServer calls. If a TlsSessionResumptionMode value is not specified during CreateServer, it is set to ENFORCED by default.    DISABLED: the server does not process TLS session resumption client requests and creates a new TLS session for each request.     ENABLED: the server processes and accepts clients that are performing TLS session resumption. The server doesn't reject client data connections that do not perform the TLS session resumption client processing.    ENFORCED: the server processes and accepts clients that are performing TLS session resumption. The server rejects client data connections that do not perform the TLS session resumption client processing. Before you set the value to ENFORCED, test your clients.  Not all FTPS clients perform TLS session resumption. So, if you choose to enforce TLS session resumption, you prevent any connections from FTPS clients that don't perform the protocol negotiation. To determine whether or not you can use the ENFORCED value, you need to test your clients.   
    */
  var TlsSessionResumptionMode: js.UndefOr[typings.awsSdk.transferMod.TlsSessionResumptionMode] = js.undefined
}
object ProtocolDetails {
  
  inline def apply(): ProtocolDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolDetails]
  }
  
  extension [Self <: ProtocolDetails](x: Self) {
    
    inline def setAs2Transports(value: As2Transports): Self = StObject.set(x, "As2Transports", value.asInstanceOf[js.Any])
    
    inline def setAs2TransportsUndefined: Self = StObject.set(x, "As2Transports", js.undefined)
    
    inline def setAs2TransportsVarargs(value: As2Transport*): Self = StObject.set(x, "As2Transports", js.Array(value*))
    
    inline def setPassiveIp(value: PassiveIp): Self = StObject.set(x, "PassiveIp", value.asInstanceOf[js.Any])
    
    inline def setPassiveIpUndefined: Self = StObject.set(x, "PassiveIp", js.undefined)
    
    inline def setSetStatOption(value: SetStatOption): Self = StObject.set(x, "SetStatOption", value.asInstanceOf[js.Any])
    
    inline def setSetStatOptionUndefined: Self = StObject.set(x, "SetStatOption", js.undefined)
    
    inline def setTlsSessionResumptionMode(value: TlsSessionResumptionMode): Self = StObject.set(x, "TlsSessionResumptionMode", value.asInstanceOf[js.Any])
    
    inline def setTlsSessionResumptionModeUndefined: Self = StObject.set(x, "TlsSessionResumptionMode", js.undefined)
  }
}

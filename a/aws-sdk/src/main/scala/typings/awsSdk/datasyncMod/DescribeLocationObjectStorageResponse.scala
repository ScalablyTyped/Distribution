package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationObjectStorageResponse extends StObject {
  
  /**
    * Optional. The access key is used if credentials are required to access the self-managed object storage server. If your object storage requires a user name and password to authenticate, use AccessKey and SecretKey to provide the user name and password, respectively.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * The time that the self-managed object storage server agent was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the self-managed object storage server location to describe.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
  
  /**
    * The URL of the source self-managed object storage server location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.undefined
  
  /**
    * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS).
    */
  var ServerPort: js.UndefOr[ObjectStorageServerPort] = js.undefined
  
  /**
    * The protocol that the object storage server uses to communicate. Valid values are HTTP or HTTPS.
    */
  var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.undefined
}
object DescribeLocationObjectStorageResponse {
  
  @scala.inline
  def apply(): DescribeLocationObjectStorageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationObjectStorageResponse]
  }
  
  @scala.inline
  implicit class DescribeLocationObjectStorageResponseMutableBuilder[Self <: DescribeLocationObjectStorageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKey(value: ObjectStorageAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: Time): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    @scala.inline
    def setServerPort(value: ObjectStorageServerPort): Self = StObject.set(x, "ServerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPortUndefined: Self = StObject.set(x, "ServerPort", js.undefined)
    
    @scala.inline
    def setServerProtocol(value: ObjectStorageServerProtocol): Self = StObject.set(x, "ServerProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerProtocolUndefined: Self = StObject.set(x, "ServerProtocol", js.undefined)
  }
}

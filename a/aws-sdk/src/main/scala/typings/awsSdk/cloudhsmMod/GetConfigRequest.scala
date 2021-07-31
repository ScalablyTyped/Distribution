package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfigRequest extends StObject {
  
  /**
    * The ARN of the client.
    */
  var ClientArn: typings.awsSdk.cloudhsmMod.ClientArn
  
  /**
    * The client version.
    */
  var ClientVersion: typings.awsSdk.cloudhsmMod.ClientVersion
  
  /**
    * A list of ARNs that identify the high-availability partition groups that are associated with the client.
    */
  var HapgList: typings.awsSdk.cloudhsmMod.HapgList
}
object GetConfigRequest {
  
  @scala.inline
  def apply(ClientArn: ClientArn, ClientVersion: ClientVersion, HapgList: HapgList): GetConfigRequest = {
    val __obj = js.Dynamic.literal(ClientArn = ClientArn.asInstanceOf[js.Any], ClientVersion = ClientVersion.asInstanceOf[js.Any], HapgList = HapgList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigRequest]
  }
  
  @scala.inline
  implicit class GetConfigRequestMutableBuilder[Self <: GetConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersion(value: ClientVersion): Self = StObject.set(x, "ClientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapgList(value: HapgList): Self = StObject.set(x, "HapgList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapgListVarargs(value: HapgArn*): Self = StObject.set(x, "HapgList", js.Array(value :_*))
  }
}

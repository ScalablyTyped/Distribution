package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfacePermissionState extends StObject {
  
  /**
    * The state of the permission.
    */
  var State: js.UndefOr[NetworkInterfacePermissionStateCode] = js.native
  
  /**
    * A status message, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}
object NetworkInterfacePermissionState {
  
  @scala.inline
  def apply(): NetworkInterfacePermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePermissionState]
  }
  
  @scala.inline
  implicit class NetworkInterfacePermissionStateMutableBuilder[Self <: NetworkInterfacePermissionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: NetworkInterfacePermissionStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}

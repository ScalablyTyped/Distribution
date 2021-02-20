package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSMBFileShareVisibilityInput extends StObject {
  
  /**
    * The shares on this gateway appear when listing shares.
    */
  var FileSharesVisible: Boolean = js.native
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object UpdateSMBFileShareVisibilityInput {
  
  @scala.inline
  def apply(FileSharesVisible: Boolean, GatewayARN: GatewayARN): UpdateSMBFileShareVisibilityInput = {
    val __obj = js.Dynamic.literal(FileSharesVisible = FileSharesVisible.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBFileShareVisibilityInput]
  }
  
  @scala.inline
  implicit class UpdateSMBFileShareVisibilityInputMutableBuilder[Self <: UpdateSMBFileShareVisibilityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSharesVisible(value: Boolean): Self = StObject.set(x, "FileSharesVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}

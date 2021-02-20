package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddWorkingStorageOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object AddWorkingStorageOutput {
  
  @scala.inline
  def apply(): AddWorkingStorageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddWorkingStorageOutput]
  }
  
  @scala.inline
  implicit class AddWorkingStorageOutputMutableBuilder[Self <: AddWorkingStorageOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}

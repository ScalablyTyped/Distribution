package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyLunaClientResponse extends StObject {
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.native
}
object ModifyLunaClientResponse {
  
  @scala.inline
  def apply(): ModifyLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLunaClientResponse]
  }
  
  @scala.inline
  implicit class ModifyLunaClientResponseMutableBuilder[Self <: ModifyLunaClientResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
  }
}

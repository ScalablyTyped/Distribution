package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLunaClientResponse extends StObject {
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.native
}
object CreateLunaClientResponse {
  
  @scala.inline
  def apply(): CreateLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLunaClientResponse]
  }
  
  @scala.inline
  implicit class CreateLunaClientResponseMutableBuilder[Self <: CreateLunaClientResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
  }
}

package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLunaClientResponse extends StObject {
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.undefined
}
object CreateLunaClientResponse {
  
  inline def apply(): CreateLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLunaClientResponse]
  }
  
  extension [Self <: CreateLunaClientResponse](x: Self) {
    
    inline def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    inline def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
  }
}

package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFuotaTaskResponse extends StObject {
  
  var Arn: js.UndefOr[FuotaTaskArn] = js.undefined
  
  var Id: js.UndefOr[FuotaTaskId] = js.undefined
}
object CreateFuotaTaskResponse {
  
  inline def apply(): CreateFuotaTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFuotaTaskResponse]
  }
  
  extension [Self <: CreateFuotaTaskResponse](x: Self) {
    
    inline def setArn(value: FuotaTaskArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

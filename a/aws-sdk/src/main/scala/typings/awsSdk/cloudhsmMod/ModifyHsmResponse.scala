package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHsmResponse extends StObject {
  
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmArn] = js.undefined
}
object ModifyHsmResponse {
  
  inline def apply(): ModifyHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyHsmResponse]
  }
  
  extension [Self <: ModifyHsmResponse](x: Self) {
    
    inline def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
    
    inline def setHsmArnUndefined: Self = StObject.set(x, "HsmArn", js.undefined)
  }
}

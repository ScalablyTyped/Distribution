package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobOutput extends StObject {
  
  var Success: js.UndefOr[typings.awsSdk.importexportMod.Success] = js.undefined
}
object CancelJobOutput {
  
  inline def apply(): CancelJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJobOutput]
  }
  
  extension [Self <: CancelJobOutput](x: Self) {
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}

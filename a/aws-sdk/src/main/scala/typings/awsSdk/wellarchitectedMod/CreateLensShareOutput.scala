package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLensShareOutput extends StObject {
  
  var ShareId: js.UndefOr[typings.awsSdk.wellarchitectedMod.ShareId] = js.undefined
}
object CreateLensShareOutput {
  
  inline def apply(): CreateLensShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLensShareOutput]
  }
  
  extension [Self <: CreateLensShareOutput](x: Self) {
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdUndefined: Self = StObject.set(x, "ShareId", js.undefined)
  }
}

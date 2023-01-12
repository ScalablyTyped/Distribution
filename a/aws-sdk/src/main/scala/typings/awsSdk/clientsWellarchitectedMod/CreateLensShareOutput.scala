package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLensShareOutput extends StObject {
  
  var ShareId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareId] = js.undefined
}
object CreateLensShareOutput {
  
  inline def apply(): CreateLensShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLensShareOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLensShareOutput] (val x: Self) extends AnyVal {
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdUndefined: Self = StObject.set(x, "ShareId", js.undefined)
  }
}

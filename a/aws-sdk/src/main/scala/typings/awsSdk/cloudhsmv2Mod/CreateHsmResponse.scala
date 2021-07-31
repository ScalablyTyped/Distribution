package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmResponse extends StObject {
  
  /**
    * Information about the HSM that was created.
    */
  var Hsm: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.Hsm] = js.undefined
}
object CreateHsmResponse {
  
  @scala.inline
  def apply(): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmResponse]
  }
  
  @scala.inline
  implicit class CreateHsmResponseMutableBuilder[Self <: CreateHsmResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsm(value: Hsm): Self = StObject.set(x, "Hsm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmUndefined: Self = StObject.set(x, "Hsm", js.undefined)
  }
}

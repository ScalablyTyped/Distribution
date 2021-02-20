package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHITResponse extends StObject {
  
  /**
    *  Contains the requested HIT data.
    */
  var HIT: js.UndefOr[typings.awsSdk.mturkMod.HIT] = js.native
}
object GetHITResponse {
  
  @scala.inline
  def apply(): GetHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHITResponse]
  }
  
  @scala.inline
  implicit class GetHITResponseMutableBuilder[Self <: GetHITResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHIT(value: HIT): Self = StObject.set(x, "HIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITUndefined: Self = StObject.set(x, "HIT", js.undefined)
  }
}

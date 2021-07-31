package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHITWithHITTypeResponse extends StObject {
  
  /**
    *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
    */
  var HIT: js.UndefOr[typings.awsSdk.mturkMod.HIT] = js.undefined
}
object CreateHITWithHITTypeResponse {
  
  @scala.inline
  def apply(): CreateHITWithHITTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHITWithHITTypeResponse]
  }
  
  @scala.inline
  implicit class CreateHITWithHITTypeResponseMutableBuilder[Self <: CreateHITWithHITTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHIT(value: HIT): Self = StObject.set(x, "HIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITUndefined: Self = StObject.set(x, "HIT", js.undefined)
  }
}

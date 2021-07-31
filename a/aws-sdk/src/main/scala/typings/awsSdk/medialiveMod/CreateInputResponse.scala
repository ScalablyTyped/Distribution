package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInputResponse extends StObject {
  
  var Input: js.UndefOr[typings.awsSdk.medialiveMod.Input] = js.undefined
}
object CreateInputResponse {
  
  @scala.inline
  def apply(): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputResponse]
  }
  
  @scala.inline
  implicit class CreateInputResponseMutableBuilder[Self <: CreateInputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}

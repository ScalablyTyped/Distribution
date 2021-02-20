package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputResponse extends StObject {
  
  var Input: js.UndefOr[typings.awsSdk.medialiveMod.Input] = js.native
}
object UpdateInputResponse {
  
  @scala.inline
  def apply(): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputResponse]
  }
  
  @scala.inline
  implicit class UpdateInputResponseMutableBuilder[Self <: UpdateInputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}

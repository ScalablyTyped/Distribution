package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateInfo extends StObject {
  
  var Code: js.UndefOr[string] = js.native
  
  var Message: js.UndefOr[string] = js.native
}
object StateInfo {
  
  @scala.inline
  def apply(): StateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateInfo]
  }
  
  @scala.inline
  implicit class StateInfoMutableBuilder[Self <: StateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: string): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}

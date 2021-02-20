package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineEvent
@js.native
trait DefineEventOptions extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var payload: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object DefineEventOptions {
  
  @scala.inline
  def apply(): DefineEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineEventOptions]
  }
  
  @scala.inline
  implicit class DefineEventOptionsMutableBuilder[Self <: DefineEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

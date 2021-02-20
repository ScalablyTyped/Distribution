package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineCommand
@js.native
trait DefineCommandOptions extends StObject {
  
  var existing: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var payload: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object DefineCommandOptions {
  
  @scala.inline
  def apply(): DefineCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineCommandOptions]
  }
  
  @scala.inline
  implicit class DefineCommandOptionsMutableBuilder[Self <: DefineCommandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
    
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

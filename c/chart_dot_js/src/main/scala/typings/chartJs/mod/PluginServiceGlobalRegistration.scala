package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginServiceGlobalRegistration extends StObject {
  
  var id: js.UndefOr[String] = js.native
}
object PluginServiceGlobalRegistration {
  
  @scala.inline
  def apply(): PluginServiceGlobalRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginServiceGlobalRegistration]
  }
  
  @scala.inline
  implicit class PluginServiceGlobalRegistrationMutableBuilder[Self <: PluginServiceGlobalRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}

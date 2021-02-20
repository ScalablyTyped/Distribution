package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalSearchSearchOptions extends StObject {
  
  var customData: js.Any = js.native
  
  var forceLocal: Boolean = js.native
}
object LocalSearchSearchOptions {
  
  @scala.inline
  def apply(customData: js.Any, forceLocal: Boolean): LocalSearchSearchOptions = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], forceLocal = forceLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSearchSearchOptions]
  }
  
  @scala.inline
  implicit class LocalSearchSearchOptionsMutableBuilder[Self <: LocalSearchSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceLocal(value: Boolean): Self = StObject.set(x, "forceLocal", value.asInstanceOf[js.Any])
  }
}

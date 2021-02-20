package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushpinToolOptions extends StObject {
  
  var cursor: js.UndefOr[String] = js.native
  
  var followText: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[Icon] = js.native
}
object PushpinToolOptions {
  
  @scala.inline
  def apply(): PushpinToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushpinToolOptions]
  }
  
  @scala.inline
  implicit class PushpinToolOptionsMutableBuilder[Self <: PushpinToolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFollowText(value: String): Self = StObject.set(x, "followText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowTextUndefined: Self = StObject.set(x, "followText", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}

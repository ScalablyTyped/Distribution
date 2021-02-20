package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostOptions extends StObject {
  
  var clicks: js.UndefOr[Boolean] = js.native
  
  var forms: js.UndefOr[FormsOptions | Boolean] = js.native
  
  var scroll: js.UndefOr[Boolean] = js.native
}
object GhostOptions {
  
  @scala.inline
  def apply(): GhostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GhostOptions]
  }
  
  @scala.inline
  implicit class GhostOptionsMutableBuilder[Self <: GhostOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClicks(value: Boolean): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
    
    @scala.inline
    def setForms(value: FormsOptions | Boolean): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormsUndefined: Self = StObject.set(x, "forms", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}

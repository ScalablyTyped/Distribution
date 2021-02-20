package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookOptions extends StObject {
  
  var tags: js.UndefOr[js.Any] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object HookOptions {
  
  @scala.inline
  def apply(): HookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookOptions]
  }
  
  @scala.inline
  implicit class HookOptionsMutableBuilder[Self <: HookOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}

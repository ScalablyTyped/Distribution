package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/tabs.SharedProps & {  $active :boolean | undefined} */
@js.native
trait SharedPropsactivebooleanu extends StObject {
  
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.native
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.native
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.native
}
object SharedPropsactivebooleanu {
  
  @scala.inline
  def apply(): SharedPropsactivebooleanu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPropsactivebooleanu]
  }
  
  @scala.inline
  implicit class SharedPropsactivebooleanuMutableBuilder[Self <: SharedPropsactivebooleanu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$activeUndefined: Self = StObject.set(x, "$active", js.undefined)
    
    @scala.inline
    def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    @scala.inline
    def set$orientation(value: horizontal | vertical): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}

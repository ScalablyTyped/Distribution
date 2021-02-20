package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandEnabled extends StObject {
  
  var expand: Enabled = js.native
}
object ExpandEnabled {
  
  @scala.inline
  def apply(expand: Enabled): ExpandEnabled = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandEnabled]
  }
  
  @scala.inline
  implicit class ExpandEnabledMutableBuilder[Self <: ExpandEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: Enabled): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
  }
}

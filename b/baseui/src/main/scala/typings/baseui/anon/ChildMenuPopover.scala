package typings.baseui.anon

import typings.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildMenuPopover extends StObject {
  
  var ChildMenuPopover: js.UndefOr[Override[Any]] = js.undefined
}
object ChildMenuPopover {
  
  inline def apply(): ChildMenuPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildMenuPopover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildMenuPopover] (val x: Self) extends AnyVal {
    
    inline def setChildMenuPopover(value: Override[Any]): Self = StObject.set(x, "ChildMenuPopover", value.asInstanceOf[js.Any])
    
    inline def setChildMenuPopoverUndefined: Self = StObject.set(x, "ChildMenuPopover", js.undefined)
  }
}

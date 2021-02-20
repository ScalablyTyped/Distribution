package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildMenuPopover extends StObject {
  
  var ChildMenuPopover: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var ListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object ChildMenuPopover {
  
  @scala.inline
  def apply(): ChildMenuPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildMenuPopover]
  }
  
  @scala.inline
  implicit class ChildMenuPopoverMutableBuilder[Self <: ChildMenuPopover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildMenuPopover(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = StObject.set(x, "ChildMenuPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildMenuPopoverUndefined: Self = StObject.set(x, "ChildMenuPopover", js.undefined)
    
    @scala.inline
    def setListItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
  }
}

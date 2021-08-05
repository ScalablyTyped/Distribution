package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildMenuPopover extends StObject {
  
  var ChildMenuPopover: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  
  var ListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}
object ChildMenuPopover {
  
  inline def apply(): ChildMenuPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildMenuPopover]
  }
  
  extension [Self <: ChildMenuPopover](x: Self) {
    
    inline def setChildMenuPopover(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = StObject.set(x, "ChildMenuPopover", value.asInstanceOf[js.Any])
    
    inline def setChildMenuPopoverUndefined: Self = StObject.set(x, "ChildMenuPopover", js.undefined)
    
    inline def setListItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
  }
}

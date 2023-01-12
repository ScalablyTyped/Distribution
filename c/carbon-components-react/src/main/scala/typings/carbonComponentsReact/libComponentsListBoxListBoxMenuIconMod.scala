package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.carbonComponentsReact.typingsTranslationMod._CarbonTranslationKey
import typings.react.mod.FC
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsListBoxListBoxMenuIconMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ListBox/ListBoxMenuIcon", JSImport.Default)
  @js.native
  val default: ListBoxMenuIconComponent = js.native
  
  type ListBoxMenuIconComponent = FC[ListBoxMenuIconProps]
  
  trait ListBoxMenuIconProps
    extends StObject
       with InternationalProps[ListBoxMenuIconTranslationKey, Record[String, Any]] {
    
    var isOpen: Boolean
  }
  object ListBoxMenuIconProps {
    
    inline def apply(isOpen: Boolean): ListBoxMenuIconProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBoxMenuIconProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListBoxMenuIconProps] (val x: Self) extends AnyVal {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.closeDotmenu
    - typings.carbonComponentsReact.carbonComponentsReactStrings.openDotmenu
  */
  trait ListBoxMenuIconTranslationKey
    extends StObject
       with _CarbonTranslationKey
  object ListBoxMenuIconTranslationKey {
    
    inline def closeDotmenu: typings.carbonComponentsReact.carbonComponentsReactStrings.closeDotmenu = "close.menu".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.closeDotmenu]
    
    inline def openDotmenu: typings.carbonComponentsReact.carbonComponentsReactStrings.openDotmenu = "open.menu".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.openDotmenu]
  }
  
  type _To = ListBoxMenuIconComponent
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsListBoxListBoxMenuIconMod.foo` */
  override def _to: ListBoxMenuIconComponent = default
}

package typings.blueprintjsCore

import typings.blueprintjsCore.anon.TypeofMenuDivider
import typings.blueprintjsCore.anon.TypeofMenuItem
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/menu/menu", "Menu")
  @js.native
  class Menu protected ()
    extends AbstractPureComponent2[IMenuProps, js.Object, js.Object] {
    def this(props: IMenuProps) = this()
    def this(props: IMenuProps, context: js.Any) = this()
  }
  /* static members */
  object Menu {
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menu", "Menu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menu", "Menu.Divider")
    @js.native
    def Divider: TypeofMenuDivider = js.native
    @scala.inline
    def Divider_=(x: TypeofMenuDivider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menu", "Menu.Item")
    @js.native
    def Item: TypeofMenuItem = js.native
    @scala.inline
    def Item_=(x: TypeofMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menu", "Menu.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait IMenuProps extends HTMLAttributes[HTMLUListElement] {
    
    /** Whether the menu items in this menu should use a large appearance. */
    var large: js.UndefOr[Boolean] = js.native
    
    /** Ref handler that receives the HTML `<ul>` element backing this component. */
    var ulRef: js.UndefOr[js.Function1[/* ref */ HTMLUListElement | Null, _]] = js.native
  }
  object IMenuProps {
    
    @scala.inline
    def apply(): IMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuProps]
    }
    
    @scala.inline
    implicit class IMenuPropsMutableBuilder[Self <: IMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setUlRef(value: /* ref */ HTMLUListElement | Null => _): Self = StObject.set(x, "ulRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUlRefUndefined: Self = StObject.set(x, "ulRef", js.undefined)
    }
  }
}

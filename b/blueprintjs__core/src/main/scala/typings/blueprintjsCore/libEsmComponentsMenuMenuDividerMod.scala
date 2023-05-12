package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsMenuMenuDividerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/menu/menuDivider", "MenuDivider")
  @js.native
  open class MenuDivider protected ()
    extends Component[MenuDividerProps, js.Object, Any] {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuDividerProps, context: Any) = this()
  }
  /* static members */
  object MenuDivider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuDivider", "MenuDivider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuDivider", "MenuDivider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IMenuDividerProps
    extends StObject
       with IProps {
    
    /** This component does not support children. */
    var children: js.UndefOr[scala.Nothing] = js.undefined
    
    /** Optional header title. */
    var title: js.UndefOr[ReactNode] = js.undefined
    
    /** Optional `id` prop for the header title. */
    var titleId: js.UndefOr[String] = js.undefined
  }
  object IMenuDividerProps {
    
    inline def apply(): IMenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuDividerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMenuDividerProps] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
      
      inline def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type MenuDividerProps = IMenuDividerProps
}

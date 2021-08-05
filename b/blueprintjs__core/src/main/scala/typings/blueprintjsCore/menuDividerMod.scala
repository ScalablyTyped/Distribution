package typings.blueprintjsCore

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuDividerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/menu/menuDivider", "MenuDivider")
  @js.native
  class MenuDivider protected ()
    extends Component[IMenuDividerProps, js.Object, js.Any] {
    def this(props: IMenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IMenuDividerProps, context: js.Any) = this()
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
  }
  object IMenuDividerProps {
    
    inline def apply(): IMenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuDividerProps]
    }
    
    extension [Self <: IMenuDividerProps](x: Self) {
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarDividerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarDivider", "NavbarDivider")
  @js.native
  class NavbarDivider protected ()
    extends AbstractPureComponent2[INavbarDividerProps, js.Object, js.Object] {
    def this(props: INavbarDividerProps) = this()
    def this(props: INavbarDividerProps, context: js.Any) = this()
  }
  /* static members */
  object NavbarDivider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarDivider", "NavbarDivider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarDivider", "NavbarDivider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait INavbarDividerProps extends HTMLAttributes[HTMLDivElement]
  object INavbarDividerProps {
    
    @scala.inline
    def apply(): INavbarDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavbarDividerProps]
    }
  }
}

package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarHeadingMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarHeading", "NavbarHeading")
  @js.native
  class NavbarHeading protected ()
    extends AbstractPureComponent2[INavbarHeadingProps, js.Object, js.Object] {
    def this(props: INavbarHeadingProps) = this()
    def this(props: INavbarHeadingProps, context: js.Any) = this()
  }
  /* static members */
  object NavbarHeading {
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarHeading", "NavbarHeading")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarHeading", "NavbarHeading.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait INavbarHeadingProps extends HTMLAttributes[HTMLDivElement]
  object INavbarHeadingProps {
    
    @scala.inline
    def apply(): INavbarHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavbarHeadingProps]
    }
  }
}

package typings.blueprintjsCore

import typings.blueprintjsCore.anon.TypeofNavbarDivider
import typings.blueprintjsCore.anon.TypeofNavbarGroup
import typings.blueprintjsCore.anon.TypeofNavbarHeading
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbar", "Navbar")
  @js.native
  class Navbar protected ()
    extends AbstractPureComponent2[INavbarProps, js.Object, js.Object] {
    def this(props: INavbarProps) = this()
    def this(props: INavbarProps, context: js.Any) = this()
  }
  /* static members */
  object Navbar {
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbar", "Navbar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbar", "Navbar.Divider")
    @js.native
    def Divider: TypeofNavbarDivider = js.native
    @scala.inline
    def Divider_=(x: TypeofNavbarDivider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbar", "Navbar.Group")
    @js.native
    def Group: TypeofNavbarGroup = js.native
    @scala.inline
    def Group_=(x: TypeofNavbarGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbar", "Navbar.Heading")
    @js.native
    def Heading: TypeofNavbarHeading = js.native
    @scala.inline
    def Heading_=(x: TypeofNavbarHeading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbar", "Navbar.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait INavbarProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Whether this navbar should be fixed to the top of the viewport (using CSS `position: fixed`).
      */
    var fixedToTop: js.UndefOr[Boolean] = js.native
  }
  object INavbarProps {
    
    @scala.inline
    def apply(): INavbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavbarProps]
    }
    
    @scala.inline
    implicit class INavbarPropsMutableBuilder[Self <: INavbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedToTop(value: Boolean): Self = StObject.set(x, "fixedToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedToTopUndefined: Self = StObject.set(x, "fixedToTop", js.undefined)
    }
  }
}

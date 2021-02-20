package typings.blueprintjsCore

import typings.blueprintjsCore.alignmentMod.Alignment
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarGroupMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarGroup", "NavbarGroup")
  @js.native
  class NavbarGroup protected ()
    extends AbstractPureComponent2[INavbarGroupProps, js.Object, js.Object] {
    def this(props: INavbarGroupProps) = this()
    def this(props: INavbarGroupProps, context: js.Any) = this()
  }
  /* static members */
  object NavbarGroup {
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarGroup", "NavbarGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarGroup", "NavbarGroup.defaultProps")
    @js.native
    def defaultProps: INavbarGroupProps = js.native
    @scala.inline
    def defaultProps_=(x: INavbarGroupProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/navbar/navbarGroup", "NavbarGroup.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait INavbarGroupProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * The side of the navbar on which the group should appear.
      * The `Alignment` enum provides constants for these values.
      * @default Alignment.LEFT
      */
    var align: js.UndefOr[Alignment] = js.native
  }
  object INavbarGroupProps {
    
    @scala.inline
    def apply(): INavbarGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavbarGroupProps]
    }
    
    @scala.inline
    implicit class INavbarGroupPropsMutableBuilder[Self <: INavbarGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}

package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/divider/divider", "Divider")
  @js.native
  class Divider protected ()
    extends AbstractPureComponent2[IDividerProps, js.Object, js.Object] {
    def this(props: IDividerProps) = this()
    def this(props: IDividerProps, context: js.Any) = this()
  }
  /* static members */
  object Divider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/divider/divider", "Divider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/divider/divider", "Divider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
  trait IDividerProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * HTML tag to use for element.
      * @default "div"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
  }
  object IDividerProps {
    
    @scala.inline
    def apply(): IDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDividerProps]
    }
    
    @scala.inline
    implicit class IDividerPropsMutableBuilder[Self <: IDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}

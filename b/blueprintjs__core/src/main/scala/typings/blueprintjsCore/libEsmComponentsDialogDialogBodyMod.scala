package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsDialogDialogBodyMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialogBody", "DialogBody")
  @js.native
  open class DialogBody protected ()
    extends AbstractPureComponent2[DialogBodyProps, js.Object, js.Object] {
    def this(props: DialogBodyProps) = this()
    def this(props: DialogBodyProps, context: Any) = this()
  }
  /* static members */
  object DialogBody {
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialogBody", "DialogBody")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialogBody", "DialogBody.defaultProps")
    @js.native
    def defaultProps: DialogBodyProps = js.native
    inline def defaultProps_=(x: DialogBodyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait DialogBodyProps
    extends StObject
       with IProps {
    
    /** Dialog body contents. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Enable scrolling for the container
      *
      * @default true
      */
    var useOverflowScrollContainer: js.UndefOr[Boolean] = js.undefined
  }
  object DialogBodyProps {
    
    inline def apply(): DialogBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogBodyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogBodyProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setUseOverflowScrollContainer(value: Boolean): Self = StObject.set(x, "useOverflowScrollContainer", value.asInstanceOf[js.Any])
      
      inline def setUseOverflowScrollContainerUndefined: Self = StObject.set(x, "useOverflowScrollContainer", js.undefined)
    }
  }
}

package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSpinnerSpinnerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
  @js.native
  open class Spinner protected ()
    extends AbstractPureComponent2[SpinnerProps, js.Object, js.Object] {
    def this(props: SpinnerProps) = this()
    def this(props: SpinnerProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSpinner(prevProps: SpinnerProps): Unit = js.native
    
    /**
      * Resolve size to a pixel value.
      * Size can be set by className, props, default, or minimum constant.
      */
    /* private */ var getSize: Any = js.native
    
    /** Compute viewbox such that stroked track sits exactly at edge of image frame. */
    /* private */ var getViewBox: Any = js.native
  }
  /* static members */
  object Spinner {
    
    @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait SpinnerSize extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "SpinnerSize")
  @js.native
  object SpinnerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpinnerSize & Double] = js.native
    
    @js.native
    sealed trait LARGE
      extends StObject
         with SpinnerSize
    /* 100 */ val LARGE: typings.blueprintjsCore.libEsmComponentsSpinnerSpinnerMod.SpinnerSize.LARGE & Double = js.native
    
    @js.native
    sealed trait SMALL
      extends StObject
         with SpinnerSize
    /* 20 */ val SMALL: typings.blueprintjsCore.libEsmComponentsSpinnerSpinnerMod.SpinnerSize.SMALL & Double = js.native
    
    @js.native
    sealed trait STANDARD
      extends StObject
         with SpinnerSize
    /* 50 */ val STANDARD: typings.blueprintjsCore.libEsmComponentsSpinnerSpinnerMod.SpinnerSize.STANDARD & Double = js.native
  }
  
  trait ISpinnerProps
    extends StObject
       with IProps
       with IIntentProps {
    
    /**
      * Width and height of the spinner in pixels. The size cannot be less than
      * 10px.
      *
      * Constants are available for common sizes:
      * - `SpinnerSize.SMALL = 20px`
      * - `SpinnerSize.STANDARD = 50px`
      * - `SpinnerSize.LARGE = 100px`
      *
      * @default SpinnerSize.STANDARD = 50
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * HTML tag for the two wrapper elements. If rendering a `<Spinner>` inside
      * an `<svg>`, change this to an SVG element like `"g"`.
      *
      * @default "div"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ] = js.undefined
    
    /**
      * A value between 0 and 1 (inclusive) representing how far along the operation is.
      * Values below 0 or above 1 will be interpreted as 0 or 1 respectively.
      * Omitting this prop will result in an "indeterminate" spinner where the head spins indefinitely.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ISpinnerProps {
    
    inline def apply(): ISpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpinnerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISpinnerProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type SpinnerProps = (ISpinnerProps & HTMLAttributes[Any]) | (ISpinnerProps & SVGAttributes[Any])
}

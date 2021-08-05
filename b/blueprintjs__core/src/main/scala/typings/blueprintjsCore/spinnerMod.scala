package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
  @js.native
  class Spinner protected ()
    extends AbstractPureComponent2[ISpinnerProps, js.Object, js.Object] {
    def this(props: ISpinnerProps) = this()
    def this(props: ISpinnerProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSpinner(prevProps: ISpinnerProps): Unit = js.native
    
    /**
      * Resolve size to a pixel value.
      * Size can be set by className, props, default, or minimum constant.
      */
    /* private */ var getSize: js.Any = js.native
    
    /** Compute viewbox such that stroked track sits exactly at edge of image frame. */
    /* private */ var getViewBox: js.Any = js.native
  }
  /* static members */
  object Spinner {
    
    @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner.SIZE_LARGE")
    @js.native
    val SIZE_LARGE: /* 100 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner.SIZE_SMALL")
    @js.native
    val SIZE_SMALL: /* 20 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner.SIZE_STANDARD")
    @js.native
    val SIZE_STANDARD: /* 50 */ Double = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/spinner/spinner", "Spinner.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
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
      * - `Spinner.SIZE_SMALL = 20px`
      * - `Spinner.SIZE_STANDARD = 50px`
      * - `Spinner.SIZE_LARGE = 100px`
      *
      * @default Spinner.SIZE_STANDARD = 50
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * HTML tag for the two wrapper elements. If rendering a `<Spinner>` inside
      * an `<svg>`, change this to an SVG element like `"g"`.
      * @default "div"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
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
    
    extension [Self <: ISpinnerProps](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

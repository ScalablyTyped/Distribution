package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/progress-bar/progressBar", "ProgressBar")
  @js.native
  class ProgressBar protected ()
    extends AbstractPureComponent2[IProgressBarProps, js.Object, js.Object] {
    def this(props: IProgressBarProps) = this()
    def this(props: IProgressBarProps, context: js.Any) = this()
  }
  /* static members */
  object ProgressBar {
    
    @JSImport("@blueprintjs/core/lib/esm/components/progress-bar/progressBar", "ProgressBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/progress-bar/progressBar", "ProgressBar.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IProgressBarProps
    extends IProps
       with IIntentProps {
    
    /**
      * Whether the background should animate.
      * @default true
      */
    var animate: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the background should be striped.
      * @default true
      */
    var stripes: js.UndefOr[Boolean] = js.native
    
    /**
      * A value between 0 and 1 (inclusive) representing how far along the operation is.
      * Values below 0 or above 1 will be interpreted as 0 or 1, respectively.
      * Omitting this prop will result in an "indeterminate" progress meter that fills the entire bar.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object IProgressBarProps {
    
    @scala.inline
    def apply(): IProgressBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgressBarProps]
    }
    
    @scala.inline
    implicit class IProgressBarPropsMutableBuilder[Self <: IProgressBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setStripes(value: Boolean): Self = StObject.set(x, "stripes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripesUndefined: Self = StObject.set(x, "stripes", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

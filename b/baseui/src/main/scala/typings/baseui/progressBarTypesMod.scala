package typings.baseui

import typings.baseui.overridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarTypesMod {
  
  trait ProgressBarOverrides extends StObject {
    
    var Bar: js.UndefOr[Override[Any]] = js.undefined
    
    var BarContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var BarProgress: js.UndefOr[Override[Any]] = js.undefined
    
    var InfiniteBar: js.UndefOr[Override[Any]] = js.undefined
    
    var Label: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object ProgressBarOverrides {
    
    inline def apply(): ProgressBarOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarOverrides]
    }
    
    extension [Self <: ProgressBarOverrides](x: Self) {
      
      inline def setBar(value: Override[Any]): Self = StObject.set(x, "Bar", value.asInstanceOf[js.Any])
      
      inline def setBarContainer(value: Override[Any]): Self = StObject.set(x, "BarContainer", value.asInstanceOf[js.Any])
      
      inline def setBarContainerUndefined: Self = StObject.set(x, "BarContainer", js.undefined)
      
      inline def setBarProgress(value: Override[Any]): Self = StObject.set(x, "BarProgress", value.asInstanceOf[js.Any])
      
      inline def setBarProgressUndefined: Self = StObject.set(x, "BarProgress", js.undefined)
      
      inline def setBarUndefined: Self = StObject.set(x, "Bar", js.undefined)
      
      inline def setInfiniteBar(value: Override[Any]): Self = StObject.set(x, "InfiniteBar", value.asInstanceOf[js.Any])
      
      inline def setInfiniteBarUndefined: Self = StObject.set(x, "InfiniteBar", js.undefined)
      
      inline def setLabel(value: Override[Any]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ProgressBarProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** The accessible label for the progress bar (getProgressLabel will be used if not provided) */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Error message for screen-reader users**/
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /** The function that returns a progress bar label to display. */
    def getProgressLabel(value: Double, maxValue: Double, minValue: Double): ReactNode
    
    /** If set to true, there’s and infinite loading animation. */
    var infinite: Boolean
    
    /** Maximum possible value. */
    var maxValue: Double
    
    /** Minimum possible value. */
    var minValue: Double
    
    var overrides: js.UndefOr[ProgressBarOverrides] = js.undefined
    
    /** If set to false, label is hidden and `getProgressLabel` is ignored. */
    var showLabel: Boolean
    
    /** Defines the size (thickness) of the progress bar. */
    var size: Size
    
    /** Renders a sectional progress bar. Value should be set to a positive number larger than one. */
    var steps: Double
    
    /** A custom completion value. Should be replaced by maxValue prop. */
    var successValue: Double
    
    /** The value between `0` and `100 | successValue` of the progress indicator. */
    var value: Double
  }
  object ProgressBarProps {
    
    inline def apply(
      getProgressLabel: (Double, Double, Double) => ReactNode,
      infinite: Boolean,
      maxValue: Double,
      minValue: Double,
      showLabel: Boolean,
      size: Size,
      steps: Double,
      successValue: Double,
      value: Double
    ): ProgressBarProps = {
      val __obj = js.Dynamic.literal(getProgressLabel = js.Any.fromFunction3(getProgressLabel), infinite = infinite.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], showLabel = showLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], successValue = successValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressBarProps]
    }
    
    extension [Self <: ProgressBarProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setGetProgressLabel(value: (Double, Double, Double) => ReactNode): Self = StObject.set(x, "getProgressLabel", js.Any.fromFunction3(value))
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: ProgressBarOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setSuccessValue(value: Double): Self = StObject.set(x, "successValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressBarRoundedOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Svg: js.UndefOr[Override[Any]] = js.undefined
    
    var Text: js.UndefOr[Override[Any]] = js.undefined
    
    var TrackBackground: js.UndefOr[Override[Any]] = js.undefined
    
    var TrackForeground: js.UndefOr[Override[Any]] = js.undefined
  }
  object ProgressBarRoundedOverrides {
    
    inline def apply(): ProgressBarRoundedOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarRoundedOverrides]
    }
    
    extension [Self <: ProgressBarRoundedOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSvg(value: Override[Any]): Self = StObject.set(x, "Svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "Svg", js.undefined)
      
      inline def setText(value: Override[Any]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      inline def setTrackBackground(value: Override[Any]): Self = StObject.set(x, "TrackBackground", value.asInstanceOf[js.Any])
      
      inline def setTrackBackgroundUndefined: Self = StObject.set(x, "TrackBackground", js.undefined)
      
      inline def setTrackForeground(value: Override[Any]): Self = StObject.set(x, "TrackForeground", value.asInstanceOf[js.Any])
      
      inline def setTrackForegroundUndefined: Self = StObject.set(x, "TrackForeground", js.undefined)
    }
  }
  
  trait ProgressBarRoundedProps extends StObject {
    
    /** Toggle animating progress. */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /** Toggle container rendering as a block or inline. */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /** Overrides for sub-nodes in the rendering tree. */
    var overrides: js.UndefOr[ProgressBarRoundedOverrides] = js.undefined
    
    /** A number between 0 and 1 inclusive. Example: 0.75. */
    var progress: js.UndefOr[Double] = js.undefined
    
    /** The size of the progress bar. */
    var size: js.UndefOr[Size] = js.undefined
  }
  object ProgressBarRoundedProps {
    
    inline def apply(): ProgressBarRoundedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarRoundedProps]
    }
    
    extension [Self <: ProgressBarRoundedProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setOverrides(value: ProgressBarRoundedOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* keyof baseui.anon.Large */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.small_
    - typings.baseui.baseuiStrings.medium_
    - typings.baseui.baseuiStrings.large_
  */
  trait Size extends StObject
  
  trait StyleProps extends StObject {
    
    @JSName("$index")
    var $index: Double
    
    @JSName("$infinite")
    var $infinite: Boolean
    
    @JSName("$maxValue")
    var $maxValue: Double
    
    @JSName("$minValue")
    var $minValue: Double
    
    @JSName("$size")
    var $size: Size
    
    @JSName("$steps")
    var $steps: Double
    
    @JSName("$successValue")
    var $successValue: Double
    
    @JSName("$value")
    var $value: Double
  }
  object StyleProps {
    
    inline def apply(
      $index: Double,
      $infinite: Boolean,
      $maxValue: Double,
      $minValue: Double,
      $size: Size,
      $steps: Double,
      $successValue: Double,
      $value: Double
    ): StyleProps = {
      val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $infinite = $infinite.asInstanceOf[js.Any], $maxValue = $maxValue.asInstanceOf[js.Any], $minValue = $minValue.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $steps = $steps.asInstanceOf[js.Any], $successValue = $successValue.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def set$index(value: Double): Self = StObject.set(x, "$index", value.asInstanceOf[js.Any])
      
      inline def set$infinite(value: Boolean): Self = StObject.set(x, "$infinite", value.asInstanceOf[js.Any])
      
      inline def set$maxValue(value: Double): Self = StObject.set(x, "$maxValue", value.asInstanceOf[js.Any])
      
      inline def set$minValue(value: Double): Self = StObject.set(x, "$minValue", value.asInstanceOf[js.Any])
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$steps(value: Double): Self = StObject.set(x, "$steps", value.asInstanceOf[js.Any])
      
      inline def set$successValue(value: Double): Self = StObject.set(x, "$successValue", value.asInstanceOf[js.Any])
      
      inline def set$value(value: Double): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
    }
  }
}

package typings.delowarReactCircleProgressbar

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@delowar/react-circle-progressbar", JSImport.Default)
  @js.native
  val default: FunctionComponent[ProgressProps] = js.native
  
  trait Gradient extends StObject {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var startColor: js.UndefOr[String] = js.undefined
    
    var stopColor: js.UndefOr[String] = js.undefined
  }
  object Gradient {
    
    inline def apply(): Gradient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gradient]
    }
    
    extension [Self <: Gradient](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
      
      inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
      
      inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    }
  }
  
  trait ProgressProps extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var bgShadow: js.UndefOr[Shadow] = js.undefined
    
    var borderBgWidth: js.UndefOr[Double | String] = js.undefined
    
    var borderWidth: js.UndefOr[Double | String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var emptyColor: js.UndefOr[String] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var gradient: js.UndefOr[Gradient] = js.undefined
    
    var isBgShadow: js.UndefOr[Boolean] = js.undefined
    
    var isGradient: js.UndefOr[Boolean] = js.undefined
    
    var isShadow: js.UndefOr[Boolean] = js.undefined
    
    var linecap: js.UndefOr[String] = js.undefined
    
    var onViewport: js.UndefOr[js.Function1[/* element */ ReactElement, Unit | Null]] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var shadow: js.UndefOr[Shadow] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var viewport: js.UndefOr[Boolean] = js.undefined
  }
  object ProgressProps {
    
    inline def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    extension [Self <: ProgressProps](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBgShadow(value: Shadow): Self = StObject.set(x, "bgShadow", value.asInstanceOf[js.Any])
      
      inline def setBgShadowUndefined: Self = StObject.set(x, "bgShadow", js.undefined)
      
      inline def setBorderBgWidth(value: Double | String): Self = StObject.set(x, "borderBgWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBgWidthUndefined: Self = StObject.set(x, "borderBgWidth", js.undefined)
      
      inline def setBorderWidth(value: Double | String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEmptyColor(value: String): Self = StObject.set(x, "emptyColor", value.asInstanceOf[js.Any])
      
      inline def setEmptyColorUndefined: Self = StObject.set(x, "emptyColor", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setGradient(value: Gradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setIsBgShadow(value: Boolean): Self = StObject.set(x, "isBgShadow", value.asInstanceOf[js.Any])
      
      inline def setIsBgShadowUndefined: Self = StObject.set(x, "isBgShadow", js.undefined)
      
      inline def setIsGradient(value: Boolean): Self = StObject.set(x, "isGradient", value.asInstanceOf[js.Any])
      
      inline def setIsGradientUndefined: Self = StObject.set(x, "isGradient", js.undefined)
      
      inline def setIsShadow(value: Boolean): Self = StObject.set(x, "isShadow", value.asInstanceOf[js.Any])
      
      inline def setIsShadowUndefined: Self = StObject.set(x, "isShadow", js.undefined)
      
      inline def setLinecap(value: String): Self = StObject.set(x, "linecap", value.asInstanceOf[js.Any])
      
      inline def setLinecapUndefined: Self = StObject.set(x, "linecap", js.undefined)
      
      inline def setOnViewport(value: /* element */ ReactElement => Unit | Null): Self = StObject.set(x, "onViewport", js.Any.fromFunction1(value))
      
      inline def setOnViewportUndefined: Self = StObject.set(x, "onViewport", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setShadow(value: Shadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setViewport(value: Boolean): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  trait Shadow extends StObject {
    
    var blur: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var horizontal: js.UndefOr[Double] = js.undefined
    
    var inset: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Double] = js.undefined
  }
  object Shadow {
    
    inline def apply(): Shadow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shadow]
    }
    
    extension [Self <: Shadow](x: Self) {
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FunctionComponent[ProgressProps] = default
}

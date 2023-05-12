package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.Bottom
import typings.ckeditorCkeditor5Utils.srcDomRectMod.RectSource
import typings.ckeditorCkeditor5Utils.srcDomRectMod.default
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomPositionMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/dom/position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptimalPosition(param0: Options): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptimalPosition")(param0.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  trait Options extends StObject {
    
    /**
      * Element that is to be positioned.
      */
    val element: HTMLElement
    
    /**
      * When set, the algorithm will chose such a position which fits `element`
      * the most inside visible viewport.
      */
    val fitInViewport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set, the algorithm will chose position which fits the most in the
      * limiter's bounding rect.
      */
    val limiter: js.UndefOr[RectSource | (js.Function0[RectSource | Null]) | Null] = js.undefined
    
    /**
      * An array of positioning functions.
      *
      * **Note**: Positioning functions are processed in the order of preference. The first function that works
      * in the current environment (e.g. offers the complete fit in the viewport geometry) will be picked by
      * `getOptimalPosition()`.
      *
      * **Note**: Any positioning function returning `null` is ignored.
      */
    val positions: js.Array[PositioningFunction]
    
    /**
      * Target with respect to which the `element` is to be positioned.
      */
    val target: RectSource | js.Function0[RectSource]
    
    /**
      * Viewport offset config object. It restricts the visible viewport available to the `getOptimalPosition()` from each side.
      *
      * ```ts
      * {
      * 	top: 50,
      * 	right: 50,
      * 	bottom: 50,
      * 	left: 50
      * }
      * ```
      */
    val viewportOffsetConfig: js.UndefOr[Bottom] = js.undefined
  }
  object Options {
    
    inline def apply(
      element: HTMLElement,
      positions: js.Array[PositioningFunction],
      target: RectSource | js.Function0[RectSource]
    ): Options = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFitInViewport(value: Boolean): Self = StObject.set(x, "fitInViewport", value.asInstanceOf[js.Any])
      
      inline def setFitInViewportUndefined: Self = StObject.set(x, "fitInViewport", js.undefined)
      
      inline def setLimiter(value: RectSource | (js.Function0[RectSource | Null])): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
      
      inline def setLimiterFunction0(value: () => RectSource | Null): Self = StObject.set(x, "limiter", js.Any.fromFunction0(value))
      
      inline def setLimiterNull: Self = StObject.set(x, "limiter", null)
      
      inline def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
      
      inline def setPositions(value: js.Array[PositioningFunction]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: PositioningFunction*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setTarget(value: RectSource | js.Function0[RectSource]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction0(value: () => RectSource): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
      
      inline def setViewportOffsetConfig(value: Bottom): Self = StObject.set(x, "viewportOffsetConfig", value.asInstanceOf[js.Any])
      
      inline def setViewportOffsetConfigUndefined: Self = StObject.set(x, "viewportOffsetConfig", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    /**
      * Additional position configuration, as passed from the {@link module:utils/dom/position~PositioningFunction positioning function}.
      *
      * This object can be use, for instance, to pass through presentation options used by the consumer of the
      * {@link module:utils/dom/position~getOptimalPosition} helper.
      */
    val config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The left value in pixels in the CSS `position: absolute` coordinate system.
      * Set it on the positioned element in DOM to move it to the position.
      */
    val left: Double
    
    /**
      * Position name.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * The top value in pixels in the CSS `position: absolute` coordinate system.
      * Set it on the positioned element in DOM to move it to the position.
      */
    val top: Double
  }
  object Position {
    
    inline def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type PositioningFunction = js.Function3[
    /* elementRect */ default, 
    /* targetRect */ default, 
    /* viewportRect */ default | Null, 
    PositioningFunctionResult | Null
  ]
  
  trait PositioningFunctionResult extends StObject {
    
    /**
      * An optional configuration that will pass-through the {@link module:utils/dom/position~getOptimalPosition} helper
      * to the {@link module:utils/dom/position~Position} returned by this helper.
      * This configuration may, for instance, let the user of {@link module:utils/dom/position~getOptimalPosition} know that this particular
      * position comes with a certain presentation.
      */
    var config: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The `left` value of the element rect that would represent the position.
      */
    var left: Double
    
    /**
      * The name of the position. It helps the user of the {@link module:utils/dom/position~getOptimalPosition}
      * helper to recognize different positioning function results. It will pass through to the {@link module:utils/dom/position~Position}
      * returned by the helper.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The `top` value of the element rect that would represent the position.
      */
    var top: Double
  }
  object PositioningFunctionResult {
    
    inline def apply(left: Double, top: Double): PositioningFunctionResult = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositioningFunctionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositioningFunctionResult] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}

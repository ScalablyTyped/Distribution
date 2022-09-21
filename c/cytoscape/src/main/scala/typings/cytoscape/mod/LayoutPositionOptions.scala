package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait LayoutPositionOptions extends StObject {
  
  // whether to animate changes to the layout
  var animate: js.UndefOr[Boolean] = js.undefined
  
  // duration of animation in ms, if enabled
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  // easing of animation, if enabled
  var animationEasing: js.UndefOr[TransitionTimingFunction] = js.undefined
  
  // collection of elements involved in the layout; set by cy.layout() or eles.layout(s)
  var eles: CollectionArgument
  
  // whether to fit the viewport to the graph
  var fit: js.UndefOr[Boolean] = js.undefined
  
  // padding to leave between graph and viewport
  var padding: js.UndefOr[Double] = js.undefined
  
  // pan the graph to the provided position, given as { x, y }
  var pan: js.UndefOr[Position] = js.undefined
  
  // callback for the layoutready event
  var ready: Unit
  
  // a positive value which adjusts spacing between nodes (>1 means greater than usual spacing)
  var spacingFactor: js.UndefOr[Double] = js.undefined
  
  // callback for the layoutstop event
  var stop: Unit
  
  // zoom level as a positive number to set after animation
  var zoom: js.UndefOr[Double] = js.undefined
}
object LayoutPositionOptions {
  
  inline def apply(eles: CollectionArgument, ready: Unit, stop: Unit): LayoutPositionOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutPositionOptions]
  }
  
  extension [Self <: LayoutPositionOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEasing(value: TransitionTimingFunction): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    inline def setEles(value: CollectionArgument): Self = StObject.set(x, "eles", value.asInstanceOf[js.Any])
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setReady(value: Unit): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setSpacingFactor(value: Double): Self = StObject.set(x, "spacingFactor", value.asInstanceOf[js.Any])
    
    inline def setSpacingFactorUndefined: Self = StObject.set(x, "spacingFactor", js.undefined)
    
    inline def setStop(value: Unit): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}

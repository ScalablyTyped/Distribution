package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/layout
  */
@js.native
trait LayoutPositionOptions extends StObject {
  
  // whether to animate changes to the layout
  var animate: js.UndefOr[Boolean] = js.native
  
  // duration of animation in ms, if enabled
  var animationDuration: js.UndefOr[Double] = js.native
  
  // easing of animation, if enabled
  var animationEasing: js.UndefOr[Double] = js.native
  
  // collection of elements involved in the layout; set by cy.layout() or eles.layout(s)
  var eles: CollectionArgument = js.native
  
  // whether to fit the viewport to the graph
  var fit: js.UndefOr[Boolean] = js.native
  
  // padding to leave between graph and viewport
  var padding: js.UndefOr[Double] = js.native
  
  // pan the graph to the provided position, given as { x, y }
  var pan: js.UndefOr[Position] = js.native
  
  // callback for the layoutready event
  var ready: js.UndefOr[scala.Nothing] = js.native
  
  // a positive value which adjusts spacing between nodes (>1 means greater than usual spacing)
  var spacingFactor: js.UndefOr[Double] = js.native
  
  // callback for the layoutstop event
  var stop: js.UndefOr[scala.Nothing] = js.native
  
  // zoom level as a positive number to set after animation
  var zoom: js.UndefOr[Double] = js.native
}
object LayoutPositionOptions {
  
  @scala.inline
  def apply(eles: CollectionArgument): LayoutPositionOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutPositionOptions]
  }
  
  @scala.inline
  implicit class LayoutPositionOptionsMutableBuilder[Self <: LayoutPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: Double): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    @scala.inline
    def setEles(value: CollectionArgument): Self = StObject.set(x, "eles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    @scala.inline
    def setSpacingFactor(value: Double): Self = StObject.set(x, "spacingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingFactorUndefined: Self = StObject.set(x, "spacingFactor", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}

package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingularAnimationOptionsBase extends StObject {
  
  /** The duration of the animation in milliseconds. */
  var duration: Double
  
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: TransitionTimingFunction
  
  /** A position to which the elements will be animated. */
  var position: Position
  
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: Position
  
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.Any
}
object SingularAnimationOptionsBase {
  
  @scala.inline
  def apply(
    duration: Double,
    easing: TransitionTimingFunction,
    position: Position,
    renderedPosition: Position,
    style: js.Any
  ): SingularAnimationOptionsBase = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderedPosition = renderedPosition.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularAnimationOptionsBase]
  }
  
  @scala.inline
  implicit class SingularAnimationOptionsBaseMutableBuilder[Self <: SingularAnimationOptionsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: TransitionTimingFunction): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedPosition(value: Position): Self = StObject.set(x, "renderedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}

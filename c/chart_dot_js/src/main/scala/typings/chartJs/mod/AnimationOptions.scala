package typings.chartJs.mod

import typings.chartJs.anon.OnComplete
import typings.chartJs.chartJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions[TType /* <: ChartType */] extends StObject {
  
  var animation: `false` | (AnimationSpec[TType] & OnComplete)
  
  var animations: AnimationsSpec[TType]
  
  var transitions: TransitionsSpec[TType]
}
object AnimationOptions {
  
  inline def apply[TType /* <: ChartType */](
    animation: `false` | (AnimationSpec[TType] & OnComplete),
    animations: AnimationsSpec[TType],
    transitions: TransitionsSpec[TType]
  ): AnimationOptions[TType] = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions[TType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationOptions[?], TType /* <: ChartType */] (val x: Self & AnimationOptions[TType]) extends AnyVal {
    
    inline def setAnimation(value: `false` | (AnimationSpec[TType] & OnComplete)): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[TType]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setTransitions(value: TransitionsSpec[TType]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
  }
}

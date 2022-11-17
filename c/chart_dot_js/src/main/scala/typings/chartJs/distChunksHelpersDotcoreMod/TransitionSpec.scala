package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionSpec[TType /* <: ChartType */] extends StObject {
  
  var animation: AnimationSpec[TType]
  
  var animations: AnimationsSpec[TType]
}
object TransitionSpec {
  
  inline def apply[TType /* <: ChartType */](animation: AnimationSpec[TType], animations: AnimationsSpec[TType]): TransitionSpec[TType] = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionSpec[TType]]
  }
  
  extension [Self <: TransitionSpec[?], TType /* <: ChartType */](x: Self & TransitionSpec[TType]) {
    
    inline def setAnimation(value: AnimationSpec[TType]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimations(value: AnimationsSpec[TType]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
  }
}

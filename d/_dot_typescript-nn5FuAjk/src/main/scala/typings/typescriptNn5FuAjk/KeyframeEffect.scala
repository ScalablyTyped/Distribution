package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyframeEffect
  extends StObject
     with AnimationEffect {
  
  var composite: CompositeOperation = js.native
  
  def getKeyframes(): Array[ComputedKeyframe] = js.native
  
  var iterationComposite: IterationCompositeOperation = js.native
  
  var pseudoElement: java.lang.String | Null = js.native
  
  def setKeyframes(): Unit = js.native
  def setKeyframes(keyframes: Array[Keyframe]): Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): Unit = js.native
  
  var target: Element | Null = js.native
}

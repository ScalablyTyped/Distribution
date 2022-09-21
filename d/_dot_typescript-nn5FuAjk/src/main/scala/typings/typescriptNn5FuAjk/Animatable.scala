package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animatable extends StObject {
  
  def animate(): Animation = js.native
  def animate(keyframes: Null, options: Double): Animation = js.native
  def animate(keyframes: Null, options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: Array[Keyframe]): Animation = js.native
  def animate(keyframes: Array[Keyframe], options: Double): Animation = js.native
  def animate(keyframes: Array[Keyframe], options: KeyframeAnimationOptions): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: Double): Animation = js.native
  def animate(keyframes: PropertyIndexedKeyframes, options: KeyframeAnimationOptions): Animation = js.native
  
  def getAnimations(): Array[Animation] = js.native
  def getAnimations(options: GetAnimationsOptions): Array[Animation] = js.native
}

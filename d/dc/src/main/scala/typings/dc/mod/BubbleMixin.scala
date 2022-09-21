package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleMixin[T]
  extends StObject
     with ColorMixin[T] {
  
  def maxBubbleRelativeSize(): Double = js.native
  def maxBubbleRelativeSize(t: Double): T = js.native
  @JSName("maxBubbleRelativeSize")
  var maxBubbleRelativeSize_Original: IGetSet[Double, T] = js.native
  
  def minRadiusWithLabel(): Double = js.native
  def minRadiusWithLabel(t: Double): T = js.native
  @JSName("minRadiusWithLabel")
  var minRadiusWithLabel_Original: IGetSet[Double, T] = js.native
  
  def r(): Scale[Double] = js.native
  def r(t: Scale[Double]): T = js.native
  @JSName("r")
  var r_Original: IGetSet[Scale[Double], T] = js.native
  
  def radiusValueAccessor(): Accessor[Any, Double] = js.native
  def radiusValueAccessor(t: Accessor[Any, Double]): T = js.native
  @JSName("radiusValueAccessor")
  var radiusValueAccessor_Original: IGetSet[Accessor[Any, Double], T] = js.native
}

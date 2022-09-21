package typings.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Poly Bezier
  * @param {[type]} curves [description]
  */
@JSImport("bezier-js", "PolyBezier")
@js.native
open class PolyBezier protected () extends StObject {
  def this(curves: js.Array[Bezier]) = this()
  
  /* private */ var _3d: Any = js.native
  
  def addCurve(curve: Bezier): Unit = js.native
  
  def bbox(): BBox = js.native
  
  def curve(idx: Double): Bezier = js.native
  
  var curves: js.Array[Bezier] = js.native
  
  def length(): Double = js.native
  
  def offset(d: Double): PolyBezier = js.native
  
  var points: js.Array[Point] = js.native
}

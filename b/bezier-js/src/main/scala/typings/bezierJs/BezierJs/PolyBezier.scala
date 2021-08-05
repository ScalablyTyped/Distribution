package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Poly Bezier
  * @param {[type]} curves [description]
  */
trait PolyBezier extends StObject {
  
  /* private */ var _3d: js.Any
  
  def addCurve(curve: Bezier): Unit
  
  def bbox(): BBox
  
  def curve(idx: Double): Bezier
  
  var curves: js.Array[Bezier]
  
  def length(): Double
  
  def offset(d: Double): PolyBezier
  
  var points: js.Array[Point]
}
object PolyBezier {
  
  inline def apply(
    _3d: js.Any,
    addCurve: Bezier => Unit,
    bbox: () => BBox,
    curve: Double => Bezier,
    curves: js.Array[Bezier],
    length: () => Double,
    offset: Double => PolyBezier,
    points: js.Array[Point]
  ): PolyBezier = {
    val __obj = js.Dynamic.literal(_3d = _3d.asInstanceOf[js.Any], addCurve = js.Any.fromFunction1(addCurve), bbox = js.Any.fromFunction0(bbox), curve = js.Any.fromFunction1(curve), curves = curves.asInstanceOf[js.Any], length = js.Any.fromFunction0(length), offset = js.Any.fromFunction1(offset), points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyBezier]
  }
  
  extension [Self <: PolyBezier](x: Self) {
    
    inline def setAddCurve(value: Bezier => Unit): Self = StObject.set(x, "addCurve", js.Any.fromFunction1(value))
    
    inline def setBbox(value: () => BBox): Self = StObject.set(x, "bbox", js.Any.fromFunction0(value))
    
    inline def setCurve(value: Double => Bezier): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    inline def setCurves(value: js.Array[Bezier]): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    inline def setCurvesVarargs(value: Bezier*): Self = StObject.set(x, "curves", js.Array(value :_*))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setOffset(value: Double => PolyBezier): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    
    inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    inline def set_3d(value: js.Any): Self = StObject.set(x, "_3d", value.asInstanceOf[js.Any])
  }
}

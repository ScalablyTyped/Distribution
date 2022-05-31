package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Curve3 extends StObject {
  
  /* private */ var _computeLength: js.Any
  
  /* private */ var _length: js.Any
  
  /* private */ var _points: js.Any
  
  /**
    * Returns a new instance of Curve3 object : var curve = curveA.continue(curveB);
    * This new Curve3 is built by translating and sticking the curveB at the end of the curveA.
    * curveA and curveB keep unchanged.
    * @param curve the curve to continue from this curve
    * @returns the newly constructed curve
    */
  def continue(curve: DeepImmutable[Curve3]): Curve3
  
  /**
    * @returns the Curve3 stored array of successive Vector3
    */
  def getPoints(): js.Array[Vector3]
  
  /**
    * @returns the computed length (float) of the curve.
    */
  def length(): Double
}
object Curve3 {
  
  inline def apply(
    _computeLength: js.Any,
    _length: js.Any,
    _points: js.Any,
    continue: DeepImmutable[Curve3] => Curve3,
    getPoints: () => js.Array[Vector3],
    length: () => Double
  ): Curve3 = {
    val __obj = js.Dynamic.literal(_computeLength = _computeLength.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _points = _points.asInstanceOf[js.Any], continue = js.Any.fromFunction1(continue), getPoints = js.Any.fromFunction0(getPoints), length = js.Any.fromFunction0(length))
    __obj.asInstanceOf[Curve3]
  }
  
  extension [Self <: Curve3](x: Self) {
    
    inline def setContinue(value: DeepImmutable[Curve3] => Curve3): Self = StObject.set(x, "continue", js.Any.fromFunction1(value))
    
    inline def setGetPoints(value: () => js.Array[Vector3]): Self = StObject.set(x, "getPoints", js.Any.fromFunction0(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def set_computeLength(value: js.Any): Self = StObject.set(x, "_computeLength", value.asInstanceOf[js.Any])
    
    inline def set_length(value: js.Any): Self = StObject.set(x, "_length", value.asInstanceOf[js.Any])
    
    inline def set_points(value: js.Any): Self = StObject.set(x, "_points", value.asInstanceOf[js.Any])
  }
}

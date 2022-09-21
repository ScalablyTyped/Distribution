package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Units extends StObject {
  
  var fp: FloatPointUnits
  
  def integers(start: js.Date, end: js.Date): Double | (js.Array[Double | js.Date | String])
  def integers(start: js.Date, end: js.Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def integers(start: js.Date, end: js.Date, domain: Double): Double | (js.Array[Double | js.Date | String])
  def integers(start: js.Date, end: Double): Double | (js.Array[Double | js.Date | String])
  def integers(start: js.Date, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def integers(start: js.Date, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String])
  def integers(start: Double, end: js.Date): Double | (js.Array[Double | js.Date | String])
  def integers(start: Double, end: js.Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def integers(start: Double, end: js.Date, domain: Double): Double | (js.Array[Double | js.Date | String])
  def integers(start: Double, end: Double): Double | (js.Array[Double | js.Date | String])
  def integers(start: Double, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def integers(start: Double, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String])
  @JSName("integers")
  var integers_Original: UnitFunction
  
  def ordinal(start: js.Date, end: js.Date): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: js.Date, end: js.Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: js.Date, end: js.Date, domain: Double): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: js.Date, end: Double): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: js.Date, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: js.Date, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: Double, end: js.Date): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: Double, end: js.Date, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: Double, end: js.Date, domain: Double): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: Double, end: Double): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: Double, end: Double, domain: js.Array[String]): Double | (js.Array[Double | js.Date | String])
  def ordinal(start: Double, end: Double, domain: Double): Double | (js.Array[Double | js.Date | String])
  @JSName("ordinal")
  var ordinal_Original: UnitFunction
}
object Units {
  
  inline def apply(
    fp: FloatPointUnits,
    integers: (/* start */ Double | js.Date, /* end */ Double | js.Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | js.Date | String]),
    ordinal: (/* start */ Double | js.Date, /* end */ Double | js.Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | js.Date | String])
  ): Units = {
    val __obj = js.Dynamic.literal(fp = fp.asInstanceOf[js.Any], integers = js.Any.fromFunction3(integers), ordinal = js.Any.fromFunction3(ordinal))
    __obj.asInstanceOf[Units]
  }
  
  extension [Self <: Units](x: Self) {
    
    inline def setFp(value: FloatPointUnits): Self = StObject.set(x, "fp", value.asInstanceOf[js.Any])
    
    inline def setIntegers(
      value: (/* start */ Double | js.Date, /* end */ Double | js.Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | js.Date | String])
    ): Self = StObject.set(x, "integers", js.Any.fromFunction3(value))
    
    inline def setOrdinal(
      value: (/* start */ Double | js.Date, /* end */ Double | js.Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | js.Date | String])
    ): Self = StObject.set(x, "ordinal", js.Any.fromFunction3(value))
  }
}

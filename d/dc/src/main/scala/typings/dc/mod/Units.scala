package typings.dc.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Units extends StObject {
  
  var fp: FloatPointUnits
  
  def integers(start: Double, end: Double): Double | (js.Array[Double | Date | String])
  def integers(start: Double, end: Double, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def integers(start: Double, end: Double, domain: Double): Double | (js.Array[Double | Date | String])
  def integers(start: Double, end: Date): Double | (js.Array[Double | Date | String])
  def integers(start: Double, end: Date, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def integers(start: Double, end: Date, domain: Double): Double | (js.Array[Double | Date | String])
  def integers(start: Date, end: Double): Double | (js.Array[Double | Date | String])
  def integers(start: Date, end: Double, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def integers(start: Date, end: Double, domain: Double): Double | (js.Array[Double | Date | String])
  def integers(start: Date, end: Date): Double | (js.Array[Double | Date | String])
  def integers(start: Date, end: Date, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def integers(start: Date, end: Date, domain: Double): Double | (js.Array[Double | Date | String])
  @JSName("integers")
  var integers_Original: UnitFunction
  
  def ordinal(start: Double, end: Double): Double | (js.Array[Double | Date | String])
  def ordinal(start: Double, end: Double, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def ordinal(start: Double, end: Double, domain: Double): Double | (js.Array[Double | Date | String])
  def ordinal(start: Double, end: Date): Double | (js.Array[Double | Date | String])
  def ordinal(start: Double, end: Date, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def ordinal(start: Double, end: Date, domain: Double): Double | (js.Array[Double | Date | String])
  def ordinal(start: Date, end: Double): Double | (js.Array[Double | Date | String])
  def ordinal(start: Date, end: Double, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def ordinal(start: Date, end: Double, domain: Double): Double | (js.Array[Double | Date | String])
  def ordinal(start: Date, end: Date): Double | (js.Array[Double | Date | String])
  def ordinal(start: Date, end: Date, domain: js.Array[String]): Double | (js.Array[Double | Date | String])
  def ordinal(start: Date, end: Date, domain: Double): Double | (js.Array[Double | Date | String])
  @JSName("ordinal")
  var ordinal_Original: UnitFunction
}
object Units {
  
  @scala.inline
  def apply(
    fp: FloatPointUnits,
    integers: (/* start */ Double | Date, /* end */ Double | Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | Date | String]),
    ordinal: (/* start */ Double | Date, /* end */ Double | Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | Date | String])
  ): Units = {
    val __obj = js.Dynamic.literal(fp = fp.asInstanceOf[js.Any], integers = js.Any.fromFunction3(integers), ordinal = js.Any.fromFunction3(ordinal))
    __obj.asInstanceOf[Units]
  }
  
  @scala.inline
  implicit class UnitsMutableBuilder[Self <: Units] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFp(value: FloatPointUnits): Self = StObject.set(x, "fp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegers(
      value: (/* start */ Double | Date, /* end */ Double | Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | Date | String])
    ): Self = StObject.set(x, "integers", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOrdinal(
      value: (/* start */ Double | Date, /* end */ Double | Date, /* domain */ js.UndefOr[Double | js.Array[String]]) => Double | (js.Array[Double | Date | String])
    ): Self = StObject.set(x, "ordinal", js.Any.fromFunction3(value))
  }
}

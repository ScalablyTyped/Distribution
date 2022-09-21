package typings.convertUnits.mod

import typings.convertUnits.anon.Abbr
import typings.convertUnits.anon.CutOffNumber
import typings.convertUnits.anon.Plural
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("convert-units", "Convert")
@js.native
open class Convert protected () extends StObject {
  def this(numerator: Double, denominator: Double) = this()
  
  def describe[T /* <: Unit */](abbr: T): typings.convertUnits.anon.Measure[T] = js.native
  
  def from(from: Unit): this.type = js.native
  
  def getUnit[T /* <: Unit */](abbr: T): Abbr[T] = js.native
  
  def list(): js.Array[typings.convertUnits.anon.System] = js.native
  def list(measure: Measure): js.Array[typings.convertUnits.anon.System] = js.native
  
  def measures(): js.Array[Measure] = js.native
  
  def possibilities(): js.Array[Unit] = js.native
  def possibilities(measure: Measure): js.Array[Unit] = js.native
  
  /* private */ def throwUnsupportedUnitError(what: String): scala.Unit = js.native
  
  def to(to: Unit): Double = js.native
  
  def toBest(): Plural = js.native
  def toBest(options: CutOffNumber): Plural = js.native
}

package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-shape", "line")
@js.native
object line extends js.Object {
  
  def apply[Datum](): Line_[Datum] = js.native
  def apply[Datum](
    x: js.UndefOr[scala.Nothing],
    y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Line_[Datum] = js.native
  def apply[Datum](x: js.UndefOr[scala.Nothing], y: Double): Line_[Datum] = js.native
  def apply[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = js.native
  def apply[Datum](
    x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double],
    y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]
  ): Line_[Datum] = js.native
  def apply[Datum](x: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double], y: Double): Line_[Datum] = js.native
  def apply[Datum](x: Double): Line_[Datum] = js.native
  def apply[Datum](x: Double, y: js.Function3[/* d */ Datum, /* index */ Double, /* data */ js.Array[Datum], Double]): Line_[Datum] = js.native
  def apply[Datum](x: Double, y: Double): Line_[Datum] = js.native
}

package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-shape", "symbol")
@js.native
object symbol extends js.Object {
  
  def apply[Datum](): Symbol_[_, Datum] = js.native
  def apply[Datum](
    `type`: js.UndefOr[scala.Nothing],
    size: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[_, Datum] = js.native
  def apply[Datum](`type`: js.UndefOr[scala.Nothing], size: Double): Symbol_[_, Datum] = js.native
  def apply[Datum](`type`: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, SymbolType]): Symbol_[_, Datum] = js.native
  def apply[Datum](
    `type`: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, SymbolType],
    size: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[_, Datum] = js.native
  def apply[Datum](
    `type`: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, SymbolType],
    size: Double
  ): Symbol_[_, Datum] = js.native
  def apply[Datum](`type`: SymbolType): Symbol_[_, Datum] = js.native
  def apply[Datum](
    `type`: SymbolType,
    size: js.ThisFunction2[/* this */ js.Any, /* d */ Datum, /* repeated */ js.Any, Double]
  ): Symbol_[_, Datum] = js.native
  def apply[Datum](`type`: SymbolType, size: Double): Symbol_[_, Datum] = js.native
}

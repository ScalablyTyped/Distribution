package typings.cypress.MochaNs.reportersNs.BaseNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default symbol map
  *
  * @see https://mochajs.org/api/module-base#.symbols
  */
trait SymbolMap extends /* key */ StringDictionary[String] {
  var bang: String
  var comma: String
  var dot: String
  var err: String
  var ok: String
}

object SymbolMap {
  @scala.inline
  def apply(
    bang: String,
    comma: String,
    dot: String,
    err: String,
    ok: String,
    StringDictionary: /* key */ StringDictionary[String] = null
  ): SymbolMap = {
    val __obj = js.Dynamic.literal(bang = bang, comma = comma, dot = dot, err = err, ok = ok)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SymbolMap]
  }
}


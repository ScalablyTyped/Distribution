package typings.bemDashCn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bemDashCnMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Record

  type BemCn = js.Function1[/* blockName */ String, Block]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.bemDashCn.bemDashCnMod.BemBlock
    - typings.bemDashCn.Anon_ToString
    - `js.undefined`
  */
  type BemMix = js.UndefOr[_BemMix | js.Array[String] | String]
  type BemMods = StringDictionary[String | Boolean | js.Any]
  type BemState = Record[String, Boolean]
  type BemStates = Record[BemStatePrefix, BemState]
  type Block = IBlock with String
}

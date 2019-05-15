package typings
package coinbaseDashCommerceDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var Accept: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`application/json`
  var `Content-Type`: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`application/json`
  var `User-Agent`: java.lang.String
  var `X-CC-Api-Key`: java.lang.String
  var `X-CC-Version`: java.lang.String
}

object Anon_Accept {
  @scala.inline
  def apply(
    Accept: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`application/json`,
    `Content-Type`: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`application/json`,
    `User-Agent`: java.lang.String,
    `X-CC-Api-Key`: java.lang.String,
    `X-CC-Version`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal(Accept = Accept)
    __obj.updateDynamic("Content-Type")(`Content-Type`)
    __obj.updateDynamic("User-Agent")(`User-Agent`)
    __obj.updateDynamic("X-CC-Api-Key")(`X-CC-Api-Key`)
    __obj.updateDynamic("X-CC-Version")(`X-CC-Version`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Accept]
  }
}


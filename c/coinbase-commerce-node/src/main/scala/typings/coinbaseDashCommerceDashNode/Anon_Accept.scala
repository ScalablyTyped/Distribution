package typings.coinbaseDashCommerceDashNode

import org.scalablytyped.runtime.StringDictionary
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`application/json`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept
  extends /* key */ StringDictionary[js.Any] {
  var Accept: `application/json`
  var `Content-Type`: `application/json`
  var `User-Agent`: String
  var `X-CC-Api-Key`: String
  var `X-CC-Version`: String
}

object Anon_Accept {
  @scala.inline
  def apply(
    Accept: `application/json`,
    `Content-Type`: `application/json`,
    `User-Agent`: String,
    `X-CC-Api-Key`: String,
    `X-CC-Version`: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
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


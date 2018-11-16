package typings
package cachefactoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cachefactoryMod {
  type DeleteOnExpire = cachefactoryLib.cachefactoryLibStrings.none | cachefactoryLib.cachefactoryLibStrings.passive | cachefactoryLib.cachefactoryLibStrings.aggressive
  type OnExpireCallback = js.Function3[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* done */ js.UndefOr[js.Function], 
    scala.Unit
  ]
  type StorageMode = cachefactoryLib.cachefactoryLibStrings.memory | cachefactoryLib.cachefactoryLibStrings.localStorage | cachefactoryLib.cachefactoryLibStrings.sessionStorage
}

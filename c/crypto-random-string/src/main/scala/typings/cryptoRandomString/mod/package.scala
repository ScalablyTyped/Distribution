package typings.cryptoRandomString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = typings.cryptoRandomString.mod.BaseOptions with (typings.typeFest.mergeExclusiveMod.MergeExclusive[
    typings.cryptoRandomString.mod.TypeOption, 
    typings.cryptoRandomString.mod.CharactersOption
  ])
}

package typings
package cpxLib.cpxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends SyncOptions {
  /** Function that creates a `stream.Transform` object to transform each copying file. */
  var transform: js.UndefOr[
    js.Function1[/* filepath */ java.lang.String, js.Array[nodeLib.streamMod.Transform]]
  ] = js.undefined
}


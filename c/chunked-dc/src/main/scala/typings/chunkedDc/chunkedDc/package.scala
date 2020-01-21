package typings.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chunkedDc {
  /** unchunker.ts **/
  type MessageListener = js.Function2[/* message */ typings.std.Uint8Array, /* context */ js.UndefOr[js.Any], scala.Unit]
}

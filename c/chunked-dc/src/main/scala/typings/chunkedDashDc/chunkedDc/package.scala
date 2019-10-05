package typings.chunkedDashDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chunkedDc {
  import typings.std.Uint8Array

  /** unchunker.ts **/
  type MessageListener = js.Function2[/* message */ Uint8Array, /* context */ js.UndefOr[js.Any], Unit]
}

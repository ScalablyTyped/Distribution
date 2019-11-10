package typings.cassandraDashDriver.libTypesMod.types

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStream extends Readable {
  var buffer: Buffer = js.native
  var paused: Boolean = js.native
  def add(chunk: Buffer): Unit = js.native
}


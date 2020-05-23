package typings.bunyanPrettystream.mod

import typings.bunyanPrettystream.anon.End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyStream extends Writable {
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}


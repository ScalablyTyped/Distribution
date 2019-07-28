package typings.bunyanDashPrettystream.bunyanDashPrettystreamMod

import typings.bunyanDashPrettystream.Anon_End
import typings.node.NodeJSNs.WritableStream
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyStream extends Writable {
  def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
}


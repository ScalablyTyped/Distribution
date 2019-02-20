package typings
package bunyanDashPrettystreamLib.bunyanDashPrettystreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrettyStream
  extends nodeLib.streamMod.Writable {
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: bunyanDashPrettystreamLib.Anon_End): T = js.native
}


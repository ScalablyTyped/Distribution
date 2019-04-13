package typings
package bylineLib.bylineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("byline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LineStream: LineStreamCreatable = js.native
  def apply(): LineStream = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream): LineStream = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream, options: LineStreamOptions): LineStream = js.native
  def createStream(): LineStream = js.native
  def createStream(stream: nodeLib.NodeJSNs.ReadableStream): LineStream = js.native
  def createStream(stream: nodeLib.NodeJSNs.ReadableStream, options: LineStreamOptions): LineStream = js.native
}


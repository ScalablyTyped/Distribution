package typings
package bylineLib.bylineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("byline", JSImport.Namespace)
@js.native
object bylineModMembers extends js.Object {
  var LineStream: bylineLib.bylineMod.blNs.LineStreamCreatable = js.native
  def apply(): bylineLib.bylineMod.blNs.LineStream = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream): bylineLib.bylineMod.blNs.LineStream = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream, options: bylineLib.bylineMod.blNs.LineStreamOptions): bylineLib.bylineMod.blNs.LineStream = js.native
  def createStream(): bylineLib.bylineMod.blNs.LineStream = js.native
  def createStream(stream: nodeLib.NodeJSNs.ReadableStream): bylineLib.bylineMod.blNs.LineStream = js.native
  def createStream(stream: nodeLib.NodeJSNs.ReadableStream, options: bylineLib.bylineMod.blNs.LineStreamOptions): bylineLib.bylineMod.blNs.LineStream = js.native
}


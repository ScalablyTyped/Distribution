package typings
package combinedDashStreamLib.combinedDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedStream
  extends nodeLib.streamMod.Stream
     with combinedDashStreamLib.combinedDashStreamMod.CombinedStreamNs.Options {
  var _currentStream: nodeLib.streamMod.Stream | nodeLib.Buffer | java.lang.String | scala.Null = js.native
  // private properties
  var _released: scala.Boolean = js.native
  // @TODO it should be a type of Array<'delayed-stream' instance | Buffer | string>
  var _streams: js.Array[nodeLib.streamMod.Stream | nodeLib.Buffer | java.lang.String] = js.native
  val dataSize: scala.Double = js.native
  @JSName("maxDataSize")
  var maxDataSize_CombinedStream: scala.Double = js.native
  @JSName("pauseStreams")
  var pauseStreams_CombinedStream: scala.Boolean = js.native
  val readable: scala.Boolean = js.native
  val writable: scala.Boolean = js.native
  def _checkDataSize(): scala.Unit = js.native
  def _emitError(error: nodeLib.Error): scala.Unit = js.native
  def _getNext(): scala.Unit = js.native
  def _handleErrors(stream: nodeLib.NodeJSNs.EventEmitter): scala.Unit = js.native
  def _pipeNext(): scala.Unit = js.native
  def _reset(): scala.Unit = js.native
  def _updateDataSize(): scala.Unit = js.native
  def append(stream: java.lang.String): this.type = js.native
  def append(stream: nodeLib.Buffer): this.type = js.native
  def append(stream: nodeLib.NodeJSNs.ReadableStream): this.type = js.native
  def append(stream: nodeLib.NodeJSNs.WritableStream): this.type = js.native
  def destroy(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  // events
  @JSName("on")
  def on_close(event: combinedDashStreamLib.combinedDashStreamLibStrings.close, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: combinedDashStreamLib.combinedDashStreamLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  // events
  @JSName("on")
  def on_end(event: combinedDashStreamLib.combinedDashStreamLibStrings.end, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: combinedDashStreamLib.combinedDashStreamLibStrings.error,
    cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  // events
  @JSName("on")
  def on_pause(event: combinedDashStreamLib.combinedDashStreamLibStrings.pause, cb: js.Function0[scala.Unit]): this.type = js.native
  // events
  @JSName("on")
  def on_resume(event: combinedDashStreamLib.combinedDashStreamLibStrings.resume, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: combinedDashStreamLib.combinedDashStreamLibStrings.close, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_data(
    event: combinedDashStreamLib.combinedDashStreamLibStrings.data,
    cb: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(event: combinedDashStreamLib.combinedDashStreamLibStrings.end, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: combinedDashStreamLib.combinedDashStreamLibStrings.error,
    cb: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pause(event: combinedDashStreamLib.combinedDashStreamLibStrings.pause, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: combinedDashStreamLib.combinedDashStreamLibStrings.resume, cb: js.Function0[scala.Unit]): this.type = js.native
  def pause(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  def resume(): scala.Unit = js.native
  def write(data: js.Any): scala.Unit = js.native
}


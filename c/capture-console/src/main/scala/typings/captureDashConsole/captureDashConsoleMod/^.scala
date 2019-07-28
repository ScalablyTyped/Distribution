package typings.captureDashConsole.captureDashConsoleMod

import typings.captureDashConsole.Anon_Stderr
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capture-console", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def capture(streams: js.Array[WritableStream], exec: js.Function0[Unit]): js.Array[String] = js.native
  def capture(streams: js.Array[WritableStream], opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
  def capture(streams: WritableStream, exec: js.Function0[Unit]): js.Array[String] = js.native
  def capture(streams: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
  def captureStderr(exec: js.Function0[Unit]): String = js.native
  def captureStderr(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  def captureStdio(exec: js.Function0[Unit]): Anon_Stderr = js.native
  def captureStdio(opts: CaptureOptions, exec: js.Function0[Unit]): Anon_Stderr = js.native
  def captureStdout(exec: js.Function0[Unit]): String = js.native
  def captureStdout(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  def hook(
    stream: WritableStream,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): js.Function0[Boolean] = js.native
  def hook(
    stream: WritableStream,
    opts: CaptureOptions,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): js.Function0[Boolean] = js.native
  def intercept(stream: WritableStream, exec: js.Function0[Unit]): js.Array[String] = js.native
  def intercept(stream: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
  def interceptStderr(exec: js.Function0[Unit]): String = js.native
  def interceptStderr(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  def interceptStdio(exec: js.Function0[Unit]): Anon_Stderr = js.native
  def interceptStdio(opts: CaptureOptions, exec: js.Function0[Unit]): Anon_Stderr = js.native
  def interceptStdout(exec: js.Function0[Unit]): String = js.native
  def interceptStdout(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  def startCapture(
    stream: WritableStream,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): Boolean = js.native
  def startCapture(
    stream: WritableStream,
    opts: CaptureOptions,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): Boolean = js.native
  def startIntercept(stream: WritableStream, exec: js.Function0[Unit]): Boolean = js.native
  def startIntercept(stream: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): Boolean = js.native
  def stopCapture(stream: WritableStream): Boolean = js.native
  def stopIntercept(stream: WritableStream): Boolean = js.native
}


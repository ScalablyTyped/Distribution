package typings
package captureDashConsoleLib.captureDashConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("capture-console", JSImport.Namespace)
@js.native
object captureDashConsoleModMembers extends js.Object {
  def capture(streams: js.Array[nodeLib.NodeJSNs.WritableStream], exec: js.Function0[scala.Unit]): js.Array[java.lang.String] = js.native
  def capture(
    streams: js.Array[nodeLib.NodeJSNs.WritableStream],
    opts: CaptureOptions,
    exec: js.Function0[scala.Unit]
  ): js.Array[java.lang.String] = js.native
  def capture(streams: nodeLib.NodeJSNs.WritableStream, exec: js.Function0[scala.Unit]): js.Array[java.lang.String] = js.native
  def capture(streams: nodeLib.NodeJSNs.WritableStream, opts: CaptureOptions, exec: js.Function0[scala.Unit]): js.Array[java.lang.String] = js.native
  def captureStderr(exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def captureStderr(opts: CaptureOptions, exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def captureStdio(exec: js.Function0[scala.Unit]): captureDashConsoleLib.Anon_Stderr = js.native
  def captureStdio(opts: CaptureOptions, exec: js.Function0[scala.Unit]): captureDashConsoleLib.Anon_Stderr = js.native
  def captureStdout(exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def captureStdout(opts: CaptureOptions, exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def hook(
    stream: nodeLib.NodeJSNs.WritableStream,
    exec: js.Function3[
      /* string */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]], 
      scala.Unit
    ]
  ): js.Function0[scala.Boolean] = js.native
  def hook(
    stream: nodeLib.NodeJSNs.WritableStream,
    opts: CaptureOptions,
    exec: js.Function3[
      /* string */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]], 
      scala.Unit
    ]
  ): js.Function0[scala.Boolean] = js.native
  def intercept(stream: nodeLib.NodeJSNs.WritableStream, exec: js.Function0[scala.Unit]): js.Array[java.lang.String] = js.native
  def intercept(stream: nodeLib.NodeJSNs.WritableStream, opts: CaptureOptions, exec: js.Function0[scala.Unit]): js.Array[java.lang.String] = js.native
  def interceptStderr(exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def interceptStderr(opts: CaptureOptions, exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def interceptStdio(exec: js.Function0[scala.Unit]): captureDashConsoleLib.Anon_Stderr = js.native
  def interceptStdio(opts: CaptureOptions, exec: js.Function0[scala.Unit]): captureDashConsoleLib.Anon_Stderr = js.native
  def interceptStdout(exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def interceptStdout(opts: CaptureOptions, exec: js.Function0[scala.Unit]): java.lang.String = js.native
  def startCapture(
    stream: nodeLib.NodeJSNs.WritableStream,
    exec: js.Function3[
      /* string */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def startCapture(
    stream: nodeLib.NodeJSNs.WritableStream,
    opts: CaptureOptions,
    exec: js.Function3[
      /* string */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def startIntercept(stream: nodeLib.NodeJSNs.WritableStream, exec: js.Function0[scala.Unit]): scala.Boolean = js.native
  def startIntercept(stream: nodeLib.NodeJSNs.WritableStream, opts: CaptureOptions, exec: js.Function0[scala.Unit]): scala.Boolean = js.native
  def stopCapture(stream: nodeLib.NodeJSNs.WritableStream): scala.Boolean = js.native
  def stopIntercept(stream: nodeLib.NodeJSNs.WritableStream): scala.Boolean = js.native
}


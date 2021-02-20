package typings.captureConsole

import typings.captureConsole.anon.Stderr
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("capture-console", "capture")
  @js.native
  def capture(streams: js.Array[WritableStream], exec: js.Function0[Unit]): js.Array[String] = js.native
  @JSImport("capture-console", "capture")
  @js.native
  def capture(streams: js.Array[WritableStream], opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
  @JSImport("capture-console", "capture")
  @js.native
  def capture(streams: WritableStream, exec: js.Function0[Unit]): js.Array[String] = js.native
  @JSImport("capture-console", "capture")
  @js.native
  def capture(streams: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
  
  @JSImport("capture-console", "captureStderr")
  @js.native
  def captureStderr(exec: js.Function0[Unit]): String = js.native
  @JSImport("capture-console", "captureStderr")
  @js.native
  def captureStderr(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  
  @JSImport("capture-console", "captureStdio")
  @js.native
  def captureStdio(exec: js.Function0[Unit]): Stderr = js.native
  @JSImport("capture-console", "captureStdio")
  @js.native
  def captureStdio(opts: CaptureOptions, exec: js.Function0[Unit]): Stderr = js.native
  
  @JSImport("capture-console", "captureStdout")
  @js.native
  def captureStdout(exec: js.Function0[Unit]): String = js.native
  @JSImport("capture-console", "captureStdout")
  @js.native
  def captureStdout(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  
  @JSImport("capture-console", "hook")
  @js.native
  def hook(
    stream: WritableStream,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): js.Function0[Boolean] = js.native
  @JSImport("capture-console", "hook")
  @js.native
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
  
  @JSImport("capture-console", "intercept")
  @js.native
  def intercept(stream: WritableStream, exec: js.Function0[Unit]): js.Array[String] = js.native
  @JSImport("capture-console", "intercept")
  @js.native
  def intercept(stream: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
  
  @JSImport("capture-console", "interceptStderr")
  @js.native
  def interceptStderr(exec: js.Function0[Unit]): String = js.native
  @JSImport("capture-console", "interceptStderr")
  @js.native
  def interceptStderr(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  
  @JSImport("capture-console", "interceptStdio")
  @js.native
  def interceptStdio(exec: js.Function0[Unit]): Stderr = js.native
  @JSImport("capture-console", "interceptStdio")
  @js.native
  def interceptStdio(opts: CaptureOptions, exec: js.Function0[Unit]): Stderr = js.native
  
  @JSImport("capture-console", "interceptStdout")
  @js.native
  def interceptStdout(exec: js.Function0[Unit]): String = js.native
  @JSImport("capture-console", "interceptStdout")
  @js.native
  def interceptStdout(opts: CaptureOptions, exec: js.Function0[Unit]): String = js.native
  
  @JSImport("capture-console", "startCapture")
  @js.native
  def startCapture(
    stream: WritableStream,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): Boolean = js.native
  @JSImport("capture-console", "startCapture")
  @js.native
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
  
  @JSImport("capture-console", "startIntercept")
  @js.native
  def startIntercept(stream: WritableStream, exec: js.Function0[Unit]): Boolean = js.native
  @JSImport("capture-console", "startIntercept")
  @js.native
  def startIntercept(stream: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): Boolean = js.native
  
  @JSImport("capture-console", "stopCapture")
  @js.native
  def stopCapture(stream: WritableStream): Boolean = js.native
  
  @JSImport("capture-console", "stopIntercept")
  @js.native
  def stopIntercept(stream: WritableStream): Boolean = js.native
  
  @js.native
  trait CaptureOptions extends StObject {
    
    /**
      * Option to silence the output going to the console
      */
    var quiet: js.UndefOr[Boolean] = js.native
  }
  object CaptureOptions {
    
    @scala.inline
    def apply(): CaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureOptions]
    }
    
    @scala.inline
    implicit class CaptureOptionsMutableBuilder[Self <: CaptureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}

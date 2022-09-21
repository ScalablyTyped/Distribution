package typings.captureConsole

import typings.captureConsole.anon.Stderr
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("capture-console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capture(streams: js.Array[WritableStream[Any]], exec: js.Function0[Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(streams.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def capture(streams: js.Array[WritableStream[Any]], opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(streams.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def capture(streams: WritableStream[Any], exec: js.Function0[Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(streams.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def capture(streams: WritableStream[Any], opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("capture")(streams.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def captureStderr(exec: js.Function0[Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureStderr")(exec.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def captureStderr(opts: CaptureOptions, exec: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStderr")(opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def captureStdio(exec: js.Function0[Unit]): Stderr = ^.asInstanceOf[js.Dynamic].applyDynamic("captureStdio")(exec.asInstanceOf[js.Any]).asInstanceOf[Stderr]
  inline def captureStdio(opts: CaptureOptions, exec: js.Function0[Unit]): Stderr = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStdio")(opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[Stderr]
  
  inline def captureStdout(exec: js.Function0[Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("captureStdout")(exec.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def captureStdout(opts: CaptureOptions, exec: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStdout")(opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hook(
    stream: WritableStream[Any],
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[Any], Unit]], 
      Unit
    ]
  ): js.Function0[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(stream.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Boolean]]
  inline def hook(
    stream: WritableStream[Any],
    opts: CaptureOptions,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[Any], Unit]], 
      Unit
    ]
  ): js.Function0[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Boolean]]
  
  inline def intercept(stream: WritableStream[Any], exec: js.Function0[Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(stream.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def intercept(stream: WritableStream[Any], opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def interceptStderr(exec: js.Function0[Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptStderr")(exec.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def interceptStderr(opts: CaptureOptions, exec: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptStderr")(opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def interceptStdio(exec: js.Function0[Unit]): Stderr = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptStdio")(exec.asInstanceOf[js.Any]).asInstanceOf[Stderr]
  inline def interceptStdio(opts: CaptureOptions, exec: js.Function0[Unit]): Stderr = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptStdio")(opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[Stderr]
  
  inline def interceptStdout(exec: js.Function0[Unit]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("interceptStdout")(exec.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def interceptStdout(opts: CaptureOptions, exec: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptStdout")(opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def startCapture(
    stream: WritableStream[Any],
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[Any], Unit]], 
      Unit
    ]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startCapture")(stream.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startCapture(
    stream: WritableStream[Any],
    opts: CaptureOptions,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[Any], Unit]], 
      Unit
    ]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startCapture")(stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def startIntercept(stream: WritableStream[Any], exec: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startIntercept")(stream.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def startIntercept(stream: WritableStream[Any], opts: CaptureOptions, exec: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startIntercept")(stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], exec.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stopCapture(stream: WritableStream[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCapture")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def stopIntercept(stream: WritableStream[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stopIntercept")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CaptureOptions extends StObject {
    
    /**
      * Option to silence the output going to the console
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
  }
  object CaptureOptions {
    
    inline def apply(): CaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureOptions]
    }
    
    extension [Self <: CaptureOptions](x: Self) {
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    }
  }
}

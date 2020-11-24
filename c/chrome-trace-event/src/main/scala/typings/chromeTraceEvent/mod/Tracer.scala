package typings.chromeTraceEvent.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chrome-trace-event", "Tracer")
@js.native
class Tracer () extends Readable {
  def this(opts: TracerOptions) = this()
  
  /* private */ def _flush(): js.Any = js.native
  
  var _objectMode: js.Any = js.native
  
  /** Node Stream internal APIs */
  var _push: js.Any = js.native
  
  /* private */ def _pushString(ev: js.Any): js.Any = js.native
  
  def begin(fields: Fields): Unit = js.native
  
  def child(fields: Fields): Tracer = js.native
  
  def completeEvent(fields: Fields): Unit = js.native
  
  def end(fields: Fields): Unit = js.native
  
  var events: js.Any = js.native
  
  var fields: js.Any = js.native
  
  var firstPush: js.Any = js.native
  
  /**
    * If in no streamMode in order to flush out the trace
    * you need to call flush.
    */
  def flush(): Unit = js.native
  
  def instantEvent(fields: Fields): Unit = js.native
  
  def mkEventFunc(ph: String): js.Function1[/* fields */ Fields, Unit] = js.native
  
  var noStream: js.Any = js.native
  
  var parent: js.Any = js.native
}

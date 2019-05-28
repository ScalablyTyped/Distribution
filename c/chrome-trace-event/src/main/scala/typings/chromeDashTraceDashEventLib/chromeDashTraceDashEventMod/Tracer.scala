package typings
package chromeDashTraceDashEventLib.chromeDashTraceDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-trace-event", "Tracer")
@js.native
class Tracer ()
  extends nodeLib.streamMod.Readable {
  def this(opts: TracerOptions) = this()
  var _objectMode: js.Any = js.native
  /** Node Stream internal APIs */
  var _push: js.Any = js.native
  var events: js.Any = js.native
  var fields: js.Any = js.native
  var firstPush: js.UndefOr[js.Any] = js.native
  var noStream: js.Any = js.native
  var parent: js.Any = js.native
  /* private */ def _flush(): js.Any = js.native
  /* private */ def _pushString(ev: js.Any): js.Any = js.native
  def begin(fields: Fields): scala.Unit = js.native
  def child(fields: Fields): Tracer = js.native
  def completeEvent(fields: Fields): scala.Unit = js.native
  def end(fields: Fields): scala.Unit = js.native
  /**
    * If in no streamMode in order to flush out the trace
    * you need to call flush.
    */
  def flush(): scala.Unit = js.native
  def instantEvent(fields: Fields): scala.Unit = js.native
  def mkEventFunc(ph: java.lang.String): js.Function1[/* fields */ Fields, scala.Unit] = js.native
}


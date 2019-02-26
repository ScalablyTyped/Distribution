package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait EventEmitter extends js.Object {
  var addListener: js.UndefOr[
    js.Function2[
      /* eventName */ java.lang.String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  var off: js.UndefOr[
    js.Function2[
      /* eventName */ java.lang.String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  var on: js.UndefOr[
    js.Function2[
      /* eventName */ java.lang.String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  var removeListener: js.UndefOr[
    js.Function2[
      /* eventName */ java.lang.String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  def emit(eventName: java.lang.String, args: js.Any*): js.Any = js.native
  def emit(eventName: js.Symbol, args: js.Any*): js.Any = js.native
}


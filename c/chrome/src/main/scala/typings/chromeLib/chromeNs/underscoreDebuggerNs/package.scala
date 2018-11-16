package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreDebuggerNs {
  type DebuggerDetachedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function2[/* source */ Debuggee, /* reason */ java.lang.String, scala.Unit]]
  type DebuggerEventEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* source */ Debuggee, 
      /* method */ java.lang.String, 
      /* params */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ]
}

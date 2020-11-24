package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object debugger {
  
  type DebuggerDetachedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* source */ typings.chrome.chrome.debugger.Debuggee, 
      /* reason */ java.lang.String, 
      scala.Unit
    ]
  ]
  
  type DebuggerEventEvent = typings.chrome.chrome.events.Event[
    js.Function3[
      /* source */ typings.chrome.chrome.debugger.Debuggee, 
      /* method */ java.lang.String, 
      /* params */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ]
}

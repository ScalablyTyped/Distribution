package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object updatebarrierMod {
  
  type Call = js.Function0[js.Any]
  
  type EventSink[V] = typings.baconjs.updatebarrierMod.Sink[typings.baconjs.eventMod.Event[V]]
  
  type Sink[V] = js.Function1[/* value */ V, js.Any]
}

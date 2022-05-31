package typings.babylonjs

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRInputSourceChangeEvent
  extends StObject
     with Event {
  
  var added: js.Array[XRInputSource] = js.native
  
  var removed: js.Array[XRInputSource] = js.native
  
  var session: XRSession = js.native
}

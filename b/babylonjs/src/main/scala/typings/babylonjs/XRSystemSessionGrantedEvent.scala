package typings.babylonjs

import typings.babylonjs.babylonjsStrings.sessiongranted
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRSystemSessionGrantedEvent
  extends StObject
     with Event {
  
  var session: XRSessionGrant = js.native
  
  @JSName("type")
  var type_XRSystemSessionGrantedEvent: sessiongranted = js.native
}

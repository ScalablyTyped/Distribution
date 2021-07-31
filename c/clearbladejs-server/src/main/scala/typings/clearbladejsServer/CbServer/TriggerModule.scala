package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TriggerModule extends StObject
@JSGlobal("CbServer.TriggerModule")
@js.native
object TriggerModule extends StObject {
  
  @js.native
  sealed trait DEVICE
    extends StObject
       with TriggerModule
  
  @js.native
  sealed trait Data
    extends StObject
       with TriggerModule
  
  @js.native
  sealed trait MESSAGING
    extends StObject
       with TriggerModule
  
  @js.native
  sealed trait USER
    extends StObject
       with TriggerModule
}

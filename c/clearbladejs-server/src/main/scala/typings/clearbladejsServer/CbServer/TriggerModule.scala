package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TriggerModule extends StObject
@JSGlobal("CbServer.TriggerModule")
@js.native
object TriggerModule extends StObject {
  
  @js.native
  sealed trait DEVICE extends TriggerModule
  
  @js.native
  sealed trait Data extends TriggerModule
  
  @js.native
  sealed trait MESSAGING extends TriggerModule
  
  @js.native
  sealed trait USER extends TriggerModule
}

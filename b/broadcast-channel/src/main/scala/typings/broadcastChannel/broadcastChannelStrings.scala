package typings.broadcastChannel

import typings.broadcastChannel.broadcastChannelMod.EventContext
import typings.broadcastChannel.broadcastChannelMod.MethodType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastChannelStrings {
  
  @js.native
  sealed trait idb
    extends StObject
       with MethodType
  inline def idb: idb = "idb".asInstanceOf[idb]
  
  @js.native
  sealed trait internal
    extends StObject
       with EventContext
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait leader
    extends StObject
       with EventContext
  inline def leader: leader = "leader".asInstanceOf[leader]
  
  @js.native
  sealed trait localstorage
    extends StObject
       with MethodType
  inline def localstorage: localstorage = "localstorage".asInstanceOf[localstorage]
  
  @js.native
  sealed trait message
    extends StObject
       with EventContext
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait native
    extends StObject
       with MethodType
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait node
    extends StObject
       with MethodType
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait simulate
    extends StObject
       with MethodType
  inline def simulate: simulate = "simulate".asInstanceOf[simulate]
}

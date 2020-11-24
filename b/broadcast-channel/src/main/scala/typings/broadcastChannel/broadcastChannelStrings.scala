package typings.broadcastChannel

import typings.broadcastChannel.broadcastChannelMod.EventType
import typings.broadcastChannel.broadcastChannelMod.MethodType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastChannelStrings {
  
  @scala.inline
  def idb: idb = "idb".asInstanceOf[idb]
  
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @scala.inline
  def localstorage: localstorage = "localstorage".asInstanceOf[localstorage]
  
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @scala.inline
  def native: native = "native".asInstanceOf[native]
  
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @scala.inline
  def simulate: simulate = "simulate".asInstanceOf[simulate]
  
  @js.native
  sealed trait idb extends MethodType
  
  @js.native
  sealed trait internal extends EventType
  
  @js.native
  sealed trait localstorage extends MethodType
  
  @js.native
  sealed trait message extends EventType
  
  @js.native
  sealed trait native extends MethodType
  
  @js.native
  sealed trait node extends MethodType
  
  @js.native
  sealed trait simulate extends MethodType
}

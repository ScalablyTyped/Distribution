package typings.cordovaPluginBleCentral

import typings.cordovaPluginBleCentral.BLECentralPlugin.PeripheralState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaPluginBleCentralStrings {
  
  @js.native
  sealed trait balanced extends StObject
  inline def balanced: balanced = "balanced".asInstanceOf[balanced]
  
  @js.native
  sealed trait connected
    extends StObject
       with PeripheralState
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with PeripheralState
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with PeripheralState
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting
    extends StObject
       with PeripheralState
  inline def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait high extends StObject
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait low extends StObject
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait registered extends StObject
  inline def registered: registered = "registered".asInstanceOf[registered]
}

package typings.cordovaPluginBleCentral

import typings.cordovaPluginBleCentral.BLECentralPlugin.BondState
import typings.cordovaPluginBleCentral.BLECentralPlugin.PeripheralState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaPluginBleCentralStrings {
  
  @js.native
  sealed trait `1m` extends StObject
  inline def `1m`: `1m` = "1m".asInstanceOf[`1m`]
  
  @js.native
  sealed trait aggressive extends StObject
  inline def aggressive: aggressive = "aggressive".asInstanceOf[aggressive]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait balanced extends StObject
  inline def balanced: balanced = "balanced".asInstanceOf[balanced]
  
  @js.native
  sealed trait bonded
    extends StObject
       with BondState
  inline def bonded: bonded = "bonded".asInstanceOf[bonded]
  
  @js.native
  sealed trait bonding
    extends StObject
       with BondState
  inline def bonding: bonding = "bonding".asInstanceOf[bonding]
  
  @js.native
  sealed trait coded extends StObject
  inline def coded: coded = "coded".asInstanceOf[coded]
  
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
  sealed trait few extends StObject
  inline def few: few = "few".asInstanceOf[few]
  
  @js.native
  sealed trait first extends StObject
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait high extends StObject
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait lost extends StObject
  inline def lost: lost = "lost".asInstanceOf[lost]
  
  @js.native
  sealed trait low extends StObject
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait lowLatency extends StObject
  inline def lowLatency: lowLatency = "lowLatency".asInstanceOf[lowLatency]
  
  @js.native
  sealed trait lowPower extends StObject
  inline def lowPower: lowPower = "lowPower".asInstanceOf[lowPower]
  
  @js.native
  sealed trait max extends StObject
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait none
    extends StObject
       with BondState
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait one extends StObject
  inline def one: one = "one".asInstanceOf[one]
  
  @js.native
  sealed trait opportunistic extends StObject
  inline def opportunistic: opportunistic = "opportunistic".asInstanceOf[opportunistic]
  
  @js.native
  sealed trait registered extends StObject
  inline def registered: registered = "registered".asInstanceOf[registered]
  
  @js.native
  sealed trait sticky extends StObject
  inline def sticky: sticky = "sticky".asInstanceOf[sticky]
}

package typings.bleno

import typings.bleno.mod.Property
import typings.bleno.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blenoStrings {
  
  @js.native
  sealed trait accept extends StObject
  @scala.inline
  def accept: accept = "accept".asInstanceOf[accept]
  
  @js.native
  sealed trait advertisingStart extends StObject
  @scala.inline
  def advertisingStart: advertisingStart = "advertisingStart".asInstanceOf[advertisingStart]
  
  @js.native
  sealed trait advertisingStartError extends StObject
  @scala.inline
  def advertisingStartError: advertisingStartError = "advertisingStartError".asInstanceOf[advertisingStartError]
  
  @js.native
  sealed trait advertisingStop extends StObject
  @scala.inline
  def advertisingStop: advertisingStop = "advertisingStop".asInstanceOf[advertisingStop]
  
  @js.native
  sealed trait disconnect extends StObject
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait indicate
    extends StObject
       with Property
  @scala.inline
  def indicate: indicate = "indicate".asInstanceOf[indicate]
  
  @js.native
  sealed trait mtuChange extends StObject
  @scala.inline
  def mtuChange: mtuChange = "mtuChange".asInstanceOf[mtuChange]
  
  @js.native
  sealed trait notify
    extends StObject
       with Property
  
  @js.native
  sealed trait poweredOff
    extends StObject
       with State
  @scala.inline
  def poweredOff: poweredOff = "poweredOff".asInstanceOf[poweredOff]
  
  @js.native
  sealed trait poweredOn
    extends StObject
       with State
  @scala.inline
  def poweredOn: poweredOn = "poweredOn".asInstanceOf[poweredOn]
  
  @js.native
  sealed trait read
    extends StObject
       with Property
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait resetting
    extends StObject
       with State
  @scala.inline
  def resetting: resetting = "resetting".asInstanceOf[resetting]
  
  @js.native
  sealed trait rssiUpdate extends StObject
  @scala.inline
  def rssiUpdate: rssiUpdate = "rssiUpdate".asInstanceOf[rssiUpdate]
  
  @js.native
  sealed trait servicesSet extends StObject
  @scala.inline
  def servicesSet: servicesSet = "servicesSet".asInstanceOf[servicesSet]
  
  @js.native
  sealed trait servicesSetError extends StObject
  @scala.inline
  def servicesSetError: servicesSetError = "servicesSetError".asInstanceOf[servicesSetError]
  
  @js.native
  sealed trait stateChange extends StObject
  @scala.inline
  def stateChange: stateChange = "stateChange".asInstanceOf[stateChange]
  
  @js.native
  sealed trait unauthorized
    extends StObject
       with State
  @scala.inline
  def unauthorized: unauthorized = "unauthorized".asInstanceOf[unauthorized]
  
  @js.native
  sealed trait unknown
    extends StObject
       with State
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unsupported
    extends StObject
       with State
  @scala.inline
  def unsupported: unsupported = "unsupported".asInstanceOf[unsupported]
  
  @js.native
  sealed trait write
    extends StObject
       with Property
  @scala.inline
  def write: write = "write".asInstanceOf[write]
  
  @js.native
  sealed trait writeWithoutResponse
    extends StObject
       with Property
  @scala.inline
  def writeWithoutResponse: writeWithoutResponse = "writeWithoutResponse".asInstanceOf[writeWithoutResponse]
}

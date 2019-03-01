package typings
package blenoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object blenoLibStrings {
  @js.native
  sealed trait accept extends js.Object
  
  @js.native
  sealed trait advertisingStart extends js.Object
  
  @js.native
  sealed trait advertisingStartError extends js.Object
  
  @js.native
  sealed trait advertisingStop extends js.Object
  
  @js.native
  sealed trait disconnect extends js.Object
  
  @js.native
  sealed trait indicate extends Property
  
  @js.native
  sealed trait mtuChange extends js.Object
  
  @js.native
  sealed trait notify extends Property
  
  @js.native
  sealed trait poweredOff extends State
  
  @js.native
  sealed trait poweredOn extends State
  
  @js.native
  sealed trait read extends Property
  
  @js.native
  sealed trait resetting extends State
  
  @js.native
  sealed trait rssiUpdate extends js.Object
  
  @js.native
  sealed trait servicesSet extends js.Object
  
  @js.native
  sealed trait servicesSetError extends js.Object
  
  @js.native
  sealed trait stateChange extends js.Object
  
  @js.native
  sealed trait unauthorized extends State
  
  @js.native
  sealed trait unknown extends State
  
  @js.native
  sealed trait unsupported extends State
  
  @js.native
  sealed trait write extends Property
  
  @js.native
  sealed trait writeWithoutResponse extends Property
  
  @scala.inline
  def accept: accept = "accept".asInstanceOf[accept]
  @scala.inline
  def advertisingStart: advertisingStart = "advertisingStart".asInstanceOf[advertisingStart]
  @scala.inline
  def advertisingStartError: advertisingStartError = "advertisingStartError".asInstanceOf[advertisingStartError]
  @scala.inline
  def advertisingStop: advertisingStop = "advertisingStop".asInstanceOf[advertisingStop]
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  @scala.inline
  def indicate: indicate = "indicate".asInstanceOf[indicate]
  @scala.inline
  def mtuChange: mtuChange = "mtuChange".asInstanceOf[mtuChange]
  @scala.inline
  def poweredOff: poweredOff = "poweredOff".asInstanceOf[poweredOff]
  @scala.inline
  def poweredOn: poweredOn = "poweredOn".asInstanceOf[poweredOn]
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  @scala.inline
  def resetting: resetting = "resetting".asInstanceOf[resetting]
  @scala.inline
  def rssiUpdate: rssiUpdate = "rssiUpdate".asInstanceOf[rssiUpdate]
  @scala.inline
  def servicesSet: servicesSet = "servicesSet".asInstanceOf[servicesSet]
  @scala.inline
  def servicesSetError: servicesSetError = "servicesSetError".asInstanceOf[servicesSetError]
  @scala.inline
  def stateChange: stateChange = "stateChange".asInstanceOf[stateChange]
  @scala.inline
  def unauthorized: unauthorized = "unauthorized".asInstanceOf[unauthorized]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def unsupported: unsupported = "unsupported".asInstanceOf[unsupported]
  @scala.inline
  def write: write = "write".asInstanceOf[write]
  @scala.inline
  def writeWithoutResponse: writeWithoutResponse = "writeWithoutResponse".asInstanceOf[writeWithoutResponse]
}


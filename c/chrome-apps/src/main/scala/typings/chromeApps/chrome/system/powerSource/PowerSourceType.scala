package typings.chromeApps.chrome.system.powerSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PowerSourceType extends js.Object
@JSGlobal("chrome.system.powerSource.PowerSourceType")
@js.native
object PowerSourceType extends js.Object {
  
  /**
    * Dedicated charger. Typically single-purpose and non-USB
    * (e.g. barrel jack plugs)
    */
  @js.native
  sealed trait mains extends PowerSourceType
  
  /** Unspecified type. */
  @js.native
  sealed trait unknown extends PowerSourceType
  
  /**
    * USB charger, including both low-power Type-A chargers and high-power
    * Type-C chargers using USB Power Delivery.
    */
  @js.native
  sealed trait usb extends PowerSourceType
}

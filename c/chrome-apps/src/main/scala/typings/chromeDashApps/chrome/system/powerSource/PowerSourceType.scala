package typings.chromeDashApps.chrome.system.powerSource

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.system.powerSource.PowerSourceType.mains
import typings.chromeDashApps.chrome.system.powerSource.PowerSourceType.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PowerSourceType with String] = js.native
  /* "mains" */ @js.native
  object mains extends TopLevel[mains with String]
  
  /* "unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
  /* "usb" */ @js.native
  object usb
    extends TopLevel[typings.chromeDashApps.chrome.system.powerSource.PowerSourceType.usb with String]
  
}


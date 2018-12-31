package typings
package chromeDashAppsLib.chromeNs.systemNs.powerSourceNs

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
  sealed trait mains
    extends chromeDashAppsLib.chromeNs.systemNs.powerSourceNs.PowerSourceType
  
  /** Unspecified type. */
  @js.native
  sealed trait unknown
    extends chromeDashAppsLib.chromeNs.systemNs.powerSourceNs.PowerSourceType
  
  /**
    * USB charger, including both low-power Type-A chargers and high-power
    * Type-C chargers using USB Power Delivery.
    */
  @js.native
  sealed trait usb
    extends chromeDashAppsLib.chromeNs.systemNs.powerSourceNs.PowerSourceType
  
  /* "mains" */ val mains: mains with java.lang.String = js.native
  /* "unknown" */ val unknown: unknown with java.lang.String = js.native
  /* "usb" */ val usb: usb with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromeDashAppsLib.chromeNs.systemNs.powerSourceNs.PowerSourceType with java.lang.String
  ] = js.native
}


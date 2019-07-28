package typings.chromeDashApps.chromeNs.usbNs

import typings.chromeDashApps.Anon_ADAPTIVE
import typings.chromeDashApps.Anon_BULK
import typings.chromeDashApps.Anon_DATA
import typings.chromeDashApps.Anon_IN
import typings.chromeDashApps.chromeDashAppsStrings.adaptive
import typings.chromeDashApps.chromeDashAppsStrings.asynchronous
import typings.chromeDashApps.chromeDashAppsStrings.bulk
import typings.chromeDashApps.chromeDashAppsStrings.control
import typings.chromeDashApps.chromeDashAppsStrings.data
import typings.chromeDashApps.chromeDashAppsStrings.explicitFeedback
import typings.chromeDashApps.chromeDashAppsStrings.feedback
import typings.chromeDashApps.chromeDashAppsStrings.in
import typings.chromeDashApps.chromeDashAppsStrings.interrupt
import typings.chromeDashApps.chromeDashAppsStrings.isochronous
import typings.chromeDashApps.chromeDashAppsStrings.notification
import typings.chromeDashApps.chromeDashAppsStrings.out
import typings.chromeDashApps.chromeDashAppsStrings.periodic
import typings.chromeDashApps.chromeDashAppsStrings.synchronous
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.chromeDashApps.chromeNs.integer
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 29. */
trait EndpointDescriptor extends js.Object {
  /** Transfer type. */
  var address: integer
  /**
    * Transfer direction.
    * @see Direction
    */
  var direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]]
  /**
    * Extra descriptor data associated with this endpoint.
    * @since Chrome 39.
    */
  var extra_data: ArrayBuffer
  /** Maximum packet size. */
  var maximumPacketSize: integer
  /** Polling interval (interrupt and isochronous only). */
  var pollingInterval: js.UndefOr[integer] = js.undefined
  /**
    * Transfer synchronization mode (isochronous only).
    * @see SynchronizationType
    */
  var synchronization: js.UndefOr[
    ToStringLiteral[Anon_ADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]]
  ] = js.undefined
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: ToStringLiteral[Anon_BULK, String, Exclude[String, control | interrupt | isochronous | bulk]]
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    ToStringLiteral[
      Anon_DATA, 
      String, 
      Exclude[String, periodic | notification | explicitFeedback | data | feedback]
    ]
  ] = js.undefined
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: integer,
    direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]],
    extra_data: ArrayBuffer,
    maximumPacketSize: integer,
    `type`: ToStringLiteral[Anon_BULK, String, Exclude[String, control | interrupt | isochronous | bulk]],
    pollingInterval: js.UndefOr[integer] = js.undefined,
    synchronization: ToStringLiteral[Anon_ADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]] = null,
    usage: ToStringLiteral[
      Anon_DATA, 
      String, 
      Exclude[String, periodic | notification | explicitFeedback | data | feedback]
    ] = null
  ): EndpointDescriptor = {
    val __obj = js.Dynamic.literal(address = address, direction = direction.asInstanceOf[js.Any], extra_data = extra_data, maximumPacketSize = maximumPacketSize)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pollingInterval)) __obj.updateDynamic("pollingInterval")(pollingInterval)
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDescriptor]
  }
}


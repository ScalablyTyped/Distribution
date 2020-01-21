package typings.chromeApps.chrome.usb

import typings.chromeApps.AnonADAPTIVE
import typings.chromeApps.AnonBULK
import typings.chromeApps.AnonIN
import typings.chromeApps.Anon_DATA
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.adaptive
import typings.chromeApps.chromeAppsStrings.asynchronous
import typings.chromeApps.chromeAppsStrings.bulk
import typings.chromeApps.chromeAppsStrings.control
import typings.chromeApps.chromeAppsStrings.data
import typings.chromeApps.chromeAppsStrings.explicitFeedback
import typings.chromeApps.chromeAppsStrings.feedback
import typings.chromeApps.chromeAppsStrings.in
import typings.chromeApps.chromeAppsStrings.interrupt
import typings.chromeApps.chromeAppsStrings.isochronous
import typings.chromeApps.chromeAppsStrings.notification
import typings.chromeApps.chromeAppsStrings.out
import typings.chromeApps.chromeAppsStrings.periodic
import typings.chromeApps.chromeAppsStrings.synchronous
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
  var direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]]
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
    ToStringLiteral[AnonADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]]
  ] = js.undefined
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: ToStringLiteral[AnonBULK, String, Exclude[String, control | interrupt | isochronous | bulk]]
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    ToStringLiteral[
      Anon_DATA, 
      String, 
      Exclude[String, notification | data | periodic | feedback | explicitFeedback]
    ]
  ] = js.undefined
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: integer,
    direction: ToStringLiteral[AnonIN, String, Exclude[String, in | out]],
    extra_data: ArrayBuffer,
    maximumPacketSize: integer,
    `type`: ToStringLiteral[AnonBULK, String, Exclude[String, control | interrupt | isochronous | bulk]],
    pollingInterval: Int | Double = null,
    synchronization: ToStringLiteral[AnonADAPTIVE, String, Exclude[String, asynchronous | adaptive | synchronous]] = null,
    usage: ToStringLiteral[
      Anon_DATA, 
      String, 
      Exclude[String, notification | data | periodic | feedback | explicitFeedback]
    ] = null
  ): EndpointDescriptor = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], maximumPacketSize = maximumPacketSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDescriptor]
  }
}


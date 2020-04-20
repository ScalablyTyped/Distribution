package typings.chromeApps.chrome.usb

import typings.chromeApps.AnonADAPTIVE
import typings.chromeApps.AnonBULK
import typings.chromeApps.AnonDATA_
import typings.chromeApps.AnonIN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.ADAPTIVE
import typings.chromeApps.chromeAppsStrings.ASYNCHRONOUS
import typings.chromeApps.chromeAppsStrings.BULK
import typings.chromeApps.chromeAppsStrings.CONTROL
import typings.chromeApps.chromeAppsStrings.DATA
import typings.chromeApps.chromeAppsStrings.EXPLICIT_FEEDBACK
import typings.chromeApps.chromeAppsStrings.FEEDBACK
import typings.chromeApps.chromeAppsStrings.IN
import typings.chromeApps.chromeAppsStrings.INTERRUPT
import typings.chromeApps.chromeAppsStrings.ISOCHRONOUS
import typings.chromeApps.chromeAppsStrings.NOTIFICATION
import typings.chromeApps.chromeAppsStrings.OUT
import typings.chromeApps.chromeAppsStrings.PERIODIC
import typings.chromeApps.chromeAppsStrings.SYNCHRONOUS
import typings.chromeApps.chromeAppsStrings.adaptive_
import typings.chromeApps.chromeAppsStrings.asynchronous_
import typings.chromeApps.chromeAppsStrings.bulk_
import typings.chromeApps.chromeAppsStrings.control_
import typings.chromeApps.chromeAppsStrings.data_
import typings.chromeApps.chromeAppsStrings.explicitFeedback
import typings.chromeApps.chromeAppsStrings.feedback_
import typings.chromeApps.chromeAppsStrings.in_
import typings.chromeApps.chromeAppsStrings.interrupt_
import typings.chromeApps.chromeAppsStrings.isochronous_
import typings.chromeApps.chromeAppsStrings.notification_
import typings.chromeApps.chromeAppsStrings.out_
import typings.chromeApps.chromeAppsStrings.periodic_
import typings.chromeApps.chromeAppsStrings.synchronous_
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
  var direction: ToStringLiteral[AnonIN, IN | OUT, Exclude[IN | OUT, in_ | out_]]
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
    ToStringLiteral[
      AnonADAPTIVE, 
      ASYNCHRONOUS | ADAPTIVE | SYNCHRONOUS, 
      Exclude[ASYNCHRONOUS | ADAPTIVE | SYNCHRONOUS, asynchronous_ | adaptive_ | synchronous_]
    ]
  ] = js.undefined
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: ToStringLiteral[
    AnonBULK, 
    CONTROL | INTERRUPT | ISOCHRONOUS | BULK, 
    Exclude[
      CONTROL | INTERRUPT | ISOCHRONOUS | BULK, 
      control_ | interrupt_ | isochronous_ | bulk_
    ]
  ]
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    ToStringLiteral[
      AnonDATA_, 
      DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
      Exclude[
        DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
        notification_ | data_ | periodic_ | feedback_ | explicitFeedback
      ]
    ]
  ] = js.undefined
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: integer,
    direction: ToStringLiteral[AnonIN, IN | OUT, Exclude[IN | OUT, in_ | out_]],
    extra_data: ArrayBuffer,
    maximumPacketSize: integer,
    `type`: ToStringLiteral[
      AnonBULK, 
      CONTROL | INTERRUPT | ISOCHRONOUS | BULK, 
      Exclude[
        CONTROL | INTERRUPT | ISOCHRONOUS | BULK, 
        control_ | interrupt_ | isochronous_ | bulk_
      ]
    ],
    pollingInterval: Int | Double = null,
    synchronization: ToStringLiteral[
      AnonADAPTIVE, 
      ASYNCHRONOUS | ADAPTIVE | SYNCHRONOUS, 
      Exclude[ASYNCHRONOUS | ADAPTIVE | SYNCHRONOUS, asynchronous_ | adaptive_ | synchronous_]
    ] = null,
    usage: ToStringLiteral[
      AnonDATA_, 
      DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
      Exclude[
        DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
        notification_ | data_ | periodic_ | feedback_ | explicitFeedback
      ]
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


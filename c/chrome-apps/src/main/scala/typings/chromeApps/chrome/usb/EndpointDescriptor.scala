package typings.chromeApps.chrome.usb

import typings.chromeApps.anon.ADAPTIVE
import typings.chromeApps.anon.BULK
import typings.chromeApps.anon.DATA_
import typings.chromeApps.anon.IN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.ASYNCHRONOUS
import typings.chromeApps.chromeAppsStrings.CONTROL
import typings.chromeApps.chromeAppsStrings.DATA
import typings.chromeApps.chromeAppsStrings.EXPLICIT_FEEDBACK
import typings.chromeApps.chromeAppsStrings.FEEDBACK
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
@js.native
trait EndpointDescriptor extends js.Object {
  /** Transfer type. */
  var address: integer = js.native
  /**
    * Transfer direction.
    * @see Direction
    */
  var direction: ToStringLiteral[
    IN, 
    /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
    Exclude[
      /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
      in_ | out_
    ]
  ] = js.native
  /**
    * Extra descriptor data associated with this endpoint.
    * @since Chrome 39.
    */
  var extra_data: ArrayBuffer = js.native
  /** Maximum packet size. */
  var maximumPacketSize: integer = js.native
  /** Polling interval (interrupt and isochronous only). */
  var pollingInterval: js.UndefOr[integer] = js.native
  /**
    * Transfer synchronization mode (isochronous only).
    * @see SynchronizationType
    */
  var synchronization: js.UndefOr[
    ToStringLiteral[
      ADAPTIVE, 
      /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typings.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
      Exclude[
        /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typings.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
        asynchronous_ | adaptive_ | synchronous_
      ]
    ]
  ] = js.native
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: ToStringLiteral[
    BULK, 
    /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typings.chromeApps.chromeAppsStrings.BULK, 
    Exclude[
      /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typings.chromeApps.chromeAppsStrings.BULK, 
      control_ | interrupt_ | isochronous_ | bulk_
    ]
  ] = js.native
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    ToStringLiteral[
      DATA_, 
      /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
      Exclude[
        /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
        notification_ | data_ | periodic_ | feedback_ | explicitFeedback
      ]
    ]
  ] = js.native
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: integer,
    direction: ToStringLiteral[
      IN, 
      /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
      Exclude[
        /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
        in_ | out_
      ]
    ],
    extra_data: ArrayBuffer,
    maximumPacketSize: integer,
    `type`: ToStringLiteral[
      BULK, 
      /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typings.chromeApps.chromeAppsStrings.BULK, 
      Exclude[
        /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typings.chromeApps.chromeAppsStrings.BULK, 
        control_ | interrupt_ | isochronous_ | bulk_
      ]
    ]
  ): EndpointDescriptor = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], extra_data = extra_data.asInstanceOf[js.Any], maximumPacketSize = maximumPacketSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDescriptor]
  }
  @scala.inline
  implicit class EndpointDescriptorOps[Self <: EndpointDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: integer): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(
      value: ToStringLiteral[
          IN, 
          /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
          Exclude[
            /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
            in_ | out_
          ]
        ]
    ): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra_data(value: ArrayBuffer): Self = this.set("extra_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumPacketSize(value: integer): Self = this.set("maximumPacketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(
      value: ToStringLiteral[
          BULK, 
          /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typings.chromeApps.chromeAppsStrings.BULK, 
          Exclude[
            /* keyof chrome-apps.anon.BULK */ CONTROL | INTERRUPT | ISOCHRONOUS | typings.chromeApps.chromeAppsStrings.BULK, 
            control_ | interrupt_ | isochronous_ | bulk_
          ]
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPollingInterval(value: integer): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingInterval: Self = this.set("pollingInterval", js.undefined)
    @scala.inline
    def setSynchronization(
      value: ToStringLiteral[
          ADAPTIVE, 
          /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typings.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
          Exclude[
            /* keyof chrome-apps.anon.ADAPTIVE */ ASYNCHRONOUS | typings.chromeApps.chromeAppsStrings.ADAPTIVE | SYNCHRONOUS, 
            asynchronous_ | adaptive_ | synchronous_
          ]
        ]
    ): Self = this.set("synchronization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronization: Self = this.set("synchronization", js.undefined)
    @scala.inline
    def setUsage(
      value: ToStringLiteral[
          DATA_, 
          /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
          Exclude[
            /* keyof chrome-apps.anon.DATA */ DATA | FEEDBACK | EXPLICIT_FEEDBACK | PERIODIC | NOTIFICATION, 
            notification_ | data_ | periodic_ | feedback_ | explicitFeedback
          ]
        ]
    ): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}


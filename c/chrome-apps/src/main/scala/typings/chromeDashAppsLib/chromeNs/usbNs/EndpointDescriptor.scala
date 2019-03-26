package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 29. */
trait EndpointDescriptor extends js.Object {
  /** Transfer type. */
  var address: chromeDashAppsLib.chromeNs.integer
  /**
    * Transfer direction.
    * @see Direction
    */
  var direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_IN, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.in | chromeDashAppsLib.chromeDashAppsLibStrings.out
    ]
  ]
  /**
    * Extra descriptor data associated with this endpoint.
    * @since Chrome 39.
    */
  var extra_data: stdLib.ArrayBuffer
  /** Maximum packet size. */
  var maximumPacketSize: chromeDashAppsLib.chromeNs.integer
  /** Polling interval (interrupt and isochronous only). */
  var pollingInterval: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * Transfer synchronization mode (isochronous only).
    * @see SynchronizationType
    */
  var synchronization: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADAPTIVE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.asynchronous | chromeDashAppsLib.chromeDashAppsLibStrings.adaptive | chromeDashAppsLib.chromeDashAppsLibStrings.synchronous
      ]
    ]
  ] = js.undefined
  /**
    * Transfer type.
    * @see TransferType
    *
    */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_BULK, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.control | chromeDashAppsLib.chromeDashAppsLibStrings.interrupt | chromeDashAppsLib.chromeDashAppsLibStrings.isochronous | chromeDashAppsLib.chromeDashAppsLibStrings.bulk
    ]
  ]
  /**
    * Endpoint usage hint
    * @see UsageType
    */
  var usage: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_DATA, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.periodic | chromeDashAppsLib.chromeDashAppsLibStrings.notification | chromeDashAppsLib.chromeDashAppsLibStrings.explicitFeedback | chromeDashAppsLib.chromeDashAppsLibStrings.data | chromeDashAppsLib.chromeDashAppsLibStrings.feedback
      ]
    ]
  ] = js.undefined
}

object EndpointDescriptor {
  @scala.inline
  def apply(
    address: chromeDashAppsLib.chromeNs.integer,
    direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_IN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.in | chromeDashAppsLib.chromeDashAppsLibStrings.out
      ]
    ],
    extra_data: stdLib.ArrayBuffer,
    maximumPacketSize: chromeDashAppsLib.chromeNs.integer,
    `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_BULK, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.control | chromeDashAppsLib.chromeDashAppsLibStrings.interrupt | chromeDashAppsLib.chromeDashAppsLibStrings.isochronous | chromeDashAppsLib.chromeDashAppsLibStrings.bulk
      ]
    ],
    pollingInterval: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    synchronization: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADAPTIVE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.asynchronous | chromeDashAppsLib.chromeDashAppsLibStrings.adaptive | chromeDashAppsLib.chromeDashAppsLibStrings.synchronous
      ]
    ] = null,
    usage: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_DATA, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.periodic | chromeDashAppsLib.chromeDashAppsLibStrings.notification | chromeDashAppsLib.chromeDashAppsLibStrings.explicitFeedback | chromeDashAppsLib.chromeDashAppsLibStrings.data | chromeDashAppsLib.chromeDashAppsLibStrings.feedback
      ]
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


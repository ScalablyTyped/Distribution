package typings.chromeApps.chrome.usb

import typings.chromeApps.anon.CLASS
import typings.chromeApps.anon.DEVICE
import typings.chromeApps.anon.IN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.ENDPOINT
import typings.chromeApps.chromeAppsStrings.INTERFACE
import typings.chromeApps.chromeAppsStrings.OTHER
import typings.chromeApps.chromeAppsStrings.OUT
import typings.chromeApps.chromeAppsStrings.RESERVED
import typings.chromeApps.chromeAppsStrings.STANDARD
import typings.chromeApps.chromeAppsStrings.VENDOR
import typings.chromeApps.chromeAppsStrings.class_
import typings.chromeApps.chromeAppsStrings.device__
import typings.chromeApps.chromeAppsStrings.endpoint_
import typings.chromeApps.chromeAppsStrings.in_
import typings.chromeApps.chromeAppsStrings.interface_
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.out_
import typings.chromeApps.chromeAppsStrings.reserved_
import typings.chromeApps.chromeAppsStrings.standard_
import typings.chromeApps.chromeAppsStrings.vendor_
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferInfo extends js.Object {
  
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[ArrayBuffer] = js.native
  
  /**
    * The transfer direction ('in' or 'out').
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
  
  /** The wIndex field, see *Ibid*. */
  var index: integer = js.native
  
  /** The maximum number of bytes to receive(required only by input transfers). */
  var length: js.UndefOr[integer] = js.native
  
  /**
    * The transfer target.
    * The target given by index must be claimed if 'interface' or 'endpoint'.
    * @see Recipient
    */
  var recipient: ToStringLiteral[
    DEVICE, 
    /* keyof chrome-apps.anon.DEVICE */ typings.chromeApps.chromeAppsStrings.DEVICE | INTERFACE | ENDPOINT | OTHER, 
    Exclude[
      /* keyof chrome-apps.anon.DEVICE */ typings.chromeApps.chromeAppsStrings.DEVICE | INTERFACE | ENDPOINT | OTHER, 
      device__ | interface_ | endpoint_ | other_
    ]
  ] = js.native
  
  /** The bRequest field, see *Universal Serial Bus Specification Revision 1.1 § 9.3.* */
  var request: integer = js.native
  
  /**
    * The request type.
    * @see RequestType
    */
  var requestType: ToStringLiteral[
    CLASS, 
    /* keyof chrome-apps.anon.CLASS */ STANDARD | typings.chromeApps.chromeAppsStrings.CLASS | VENDOR | RESERVED, 
    Exclude[
      /* keyof chrome-apps.anon.CLASS */ STANDARD | typings.chromeApps.chromeAppsStrings.CLASS | VENDOR | RESERVED, 
      standard_ | class_ | vendor_ | reserved_
    ]
  ] = js.native
  
  /**
    * @since Chrome 43.
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.native
  
  /** The wValue field, see *Ibid*. */
  var value: integer = js.native
}
object TransferInfo {
  
  @scala.inline
  def apply(
    direction: ToStringLiteral[
      IN, 
      /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
      Exclude[
        /* keyof chrome-apps.anon.IN */ typings.chromeApps.chromeAppsStrings.IN | OUT, 
        in_ | out_
      ]
    ],
    index: integer,
    recipient: ToStringLiteral[
      DEVICE, 
      /* keyof chrome-apps.anon.DEVICE */ typings.chromeApps.chromeAppsStrings.DEVICE | INTERFACE | ENDPOINT | OTHER, 
      Exclude[
        /* keyof chrome-apps.anon.DEVICE */ typings.chromeApps.chromeAppsStrings.DEVICE | INTERFACE | ENDPOINT | OTHER, 
        device__ | interface_ | endpoint_ | other_
      ]
    ],
    request: integer,
    requestType: ToStringLiteral[
      CLASS, 
      /* keyof chrome-apps.anon.CLASS */ STANDARD | typings.chromeApps.chromeAppsStrings.CLASS | VENDOR | RESERVED, 
      Exclude[
        /* keyof chrome-apps.anon.CLASS */ STANDARD | typings.chromeApps.chromeAppsStrings.CLASS | VENDOR | RESERVED, 
        standard_ | class_ | vendor_ | reserved_
      ]
    ],
    value: integer
  ): TransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo]
  }
  
  @scala.inline
  implicit class TransferInfoOps[Self <: TransferInfo] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: integer): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(
      value: ToStringLiteral[
          DEVICE, 
          /* keyof chrome-apps.anon.DEVICE */ typings.chromeApps.chromeAppsStrings.DEVICE | INTERFACE | ENDPOINT | OTHER, 
          Exclude[
            /* keyof chrome-apps.anon.DEVICE */ typings.chromeApps.chromeAppsStrings.DEVICE | INTERFACE | ENDPOINT | OTHER, 
            device__ | interface_ | endpoint_ | other_
          ]
        ]
    ): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: integer): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestType(
      value: ToStringLiteral[
          CLASS, 
          /* keyof chrome-apps.anon.CLASS */ STANDARD | typings.chromeApps.chromeAppsStrings.CLASS | VENDOR | RESERVED, 
          Exclude[
            /* keyof chrome-apps.anon.CLASS */ STANDARD | typings.chromeApps.chromeAppsStrings.CLASS | VENDOR | RESERVED, 
            standard_ | class_ | vendor_ | reserved_
          ]
        ]
    ): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: integer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLength(value: integer): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setTimeout(value: integer): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}

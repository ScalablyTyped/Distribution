package typings.chromeApps.chrome.usb

import typings.chromeApps.anon.IN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.OUT
import typings.chromeApps.chromeAppsStrings.in_
import typings.chromeApps.chromeAppsStrings.out_
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTransferInfo extends js.Object {
  
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
  
  /** The target endpoint address. The interface containing this endpoint must be claimed. */
  var endpoint: integer = js.native
  
  /** The maximum number of bytes to receive (required only by input transfers). */
  var length: js.UndefOr[integer] = js.native
  
  /**
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.native
}
object GenericTransferInfo {
  
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
    endpoint: integer
  ): GenericTransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransferInfo]
  }
  
  @scala.inline
  implicit class GenericTransferInfoOps[Self <: GenericTransferInfo] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: integer): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
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

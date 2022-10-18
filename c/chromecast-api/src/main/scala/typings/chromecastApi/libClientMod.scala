package typings.chromecastApi

import typings.chromecastApi.chromecastApiStrings.device
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientMod {
  
  /**
    * Initialize the client to start searching for chromecast devices.
    */
  @JSImport("chromecast-api/lib/client", JSImport.Namespace)
  @js.native
  open class ^ () extends Client
  
  /**
    * Initialize the client to start searching for chromecast devices.
    */
  @js.native
  trait Client extends EventEmitter {
    
    def destroy(): Unit = js.native
    
    /**
      * An array of all devices found by the client.
      */
    var devices: js.Array[typings.chromecastApi.libDeviceMod.^] = js.native
    
    /**
      * The device event is emitted each time a new device has been found.
      */
    @JSName("on")
    def on_device(event: device, listener: js.Function1[/* d */ typings.chromecastApi.libDeviceMod.^, Unit]): this.type = js.native
    
    /**
      * Trigger the mDNS search again. Warning: the device event will trigger again (it might return the same device).
      */
    def queryMDNS(): Unit = js.native
    
    /**
      * Trigger the mDNS search again. Warning: the device event will trigger again (it might return the same device).
      */
    def querySSDP(): Unit = js.native
    
    /**
      * Trigger the mDNS and SSDP search again. Warning: the device event will trigger again (it might return the same device).
      */
    def update(): Unit = js.native
  }
}

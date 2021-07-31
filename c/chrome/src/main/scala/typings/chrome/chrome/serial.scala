package typings.chrome.chrome

import typings.chrome.chromeStrings.eight
import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.seven
import typings.chrome.chromeStrings.two
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Serial
////////////////////
/**
  * Use the <code>chrome.serial</code> API to read from and write to a device connected to a serial port.
  * Permissions:  "enterprise.serial"
  * Since: Chrome 29
  * Important: This API works only on Chrome OS.
  */
object serial {
  
  trait ConnectionInfo extends StObject {
    
    /** Optional. See ConnectionOptions.bitrate.
      * This field may be omitted or inaccurate if a non-standard bitrate is in use, or if an error occurred while querying the underlying device. */
    var bitrate: js.UndefOr[Double] = js.undefined
    
    /** See ConnectionOptions.bufferSize */
    var bufferSize: Double
    
    /** The id of the serial port connection. */
    var connectionId: js.UndefOr[Double] = js.undefined
    
    /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
    var ctsFlowControl: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. See ConnectionOptions.dataBits. This field may be omitted if an error occurred while querying the underlying device. */
    var dataBits: js.UndefOr[seven | eight] = js.undefined
    
    /** See ConnectionOptions.name */
    var name: String
    
    /** Optional. See ConnectionOptions.parityBit. This field may be omitted if an error occurred while querying the underlying device. */
    var parityBit: js.UndefOr[no | odd | even] = js.undefined
    
    /** Flag indicating whether the connection is blocked from firing onReceive events. */
    var paused: Boolean
    
    /** See ConnectionOptions.persistent */
    var peristent: Boolean
    
    /** See ConnectionOptions.receiveTimeout */
    var receiveTimeout: js.UndefOr[Double] = js.undefined
    
    /** See ConnectionOptions.sendTimeout */
    var sendTimeout: js.UndefOr[Double] = js.undefined
    
    /** Optional. See ConnectionOptions.stopBits. This field may be omitted if an error occurred while querying the underlying device. */
    var stopBits: js.UndefOr[one | two] = js.undefined
  }
  object ConnectionInfo {
    
    @scala.inline
    def apply(bufferSize: Double, name: String, paused: Boolean, peristent: Boolean): ConnectionInfo = {
      val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], peristent = peristent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionInfo]
    }
    
    @scala.inline
    implicit class ConnectionInfoMutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionId(value: Double): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      @scala.inline
      def setCtsFlowControl(value: Boolean): Self = StObject.set(x, "ctsFlowControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtsFlowControlUndefined: Self = StObject.set(x, "ctsFlowControl", js.undefined)
      
      @scala.inline
      def setDataBits(value: seven | eight): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParityBit(value: no | odd | even): Self = StObject.set(x, "parityBit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParityBitUndefined: Self = StObject.set(x, "parityBit", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeristent(value: Boolean): Self = StObject.set(x, "peristent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveTimeout(value: Double): Self = StObject.set(x, "receiveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveTimeoutUndefined: Self = StObject.set(x, "receiveTimeout", js.undefined)
      
      @scala.inline
      def setSendTimeout(value: Double): Self = StObject.set(x, "sendTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendTimeoutUndefined: Self = StObject.set(x, "sendTimeout", js.undefined)
      
      @scala.inline
      def setStopBits(value: one | two): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
    }
  }
  
  trait ConnectionOptions extends StObject {
    
    /** Optional. The requested bitrate of the connection to be opened.
      * For compatibility with the widest range of hardware, this number should match one of commonly-available bitrates,
      * such as 110, 300, 1200, 2400, 4800, 9600, 14400, 19200, 38400, 57600, 115200.
      * There is no guarantee, of course, that the device connected to the serial port will support the requested bitrate, even if the port itself supports that bitrate.
      * 9600 will be passed by default. */
    var bitrate: js.UndefOr[Double] = js.undefined
    
    /** Optional. The size of the buffer used to receive data. The default value is 4096. */
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
    var ctsFlowControl: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. "eight" will be passed by default. */
    var dataBits: js.UndefOr[seven | eight] = js.undefined
    
    /** Optional. An application-defined string to associate with the connection. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Optional. "no" will be passed by default. */
    var parityBit: js.UndefOr[no | odd | even] = js.undefined
    
    /** Optional. Flag indicating whether or not the connection should be left open when the application is suspended (see Manage App Lifecycle: https://developer.chrome.com/apps/app_lifecycle).
      *  The default value is "false." When the application is loaded, any serial connections previously opened with persistent=true can be fetched with getConnections. */
    var peristent: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The maximum amount of time (in milliseconds) to wait for new data before raising an onReceiveError event with a "timeout" error.
      * If zero, receive timeout errors will not be raised for the connection.
      * Defaults to 0. */
    var receiveTimeout: js.UndefOr[Double] = js.undefined
    
    /** Optional. The maximum amount of time (in milliseconds) to wait for a send operation to complete before calling the callback with a "timeout" error.
      * If zero, send timeout errors will not be triggered.
      * Defaults to 0. */
    var sendTimeout: js.UndefOr[Double] = js.undefined
    
    /** Optional. "one" will be passed by default. */
    var stopBits: js.UndefOr[one | two] = js.undefined
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setCtsFlowControl(value: Boolean): Self = StObject.set(x, "ctsFlowControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtsFlowControlUndefined: Self = StObject.set(x, "ctsFlowControl", js.undefined)
      
      @scala.inline
      def setDataBits(value: seven | eight): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParityBit(value: no | odd | even): Self = StObject.set(x, "parityBit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParityBitUndefined: Self = StObject.set(x, "parityBit", js.undefined)
      
      @scala.inline
      def setPeristent(value: Boolean): Self = StObject.set(x, "peristent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeristentUndefined: Self = StObject.set(x, "peristent", js.undefined)
      
      @scala.inline
      def setReceiveTimeout(value: Double): Self = StObject.set(x, "receiveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveTimeoutUndefined: Self = StObject.set(x, "receiveTimeout", js.undefined)
      
      @scala.inline
      def setSendTimeout(value: Double): Self = StObject.set(x, "sendTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendTimeoutUndefined: Self = StObject.set(x, "sendTimeout", js.undefined)
      
      @scala.inline
      def setStopBits(value: one | two): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
    }
  }
  
  trait DeviceInfo extends StObject {
    
    /** Optional. A human-readable display name for the underlying device if one can be queried from the host driver. */
    var displayName: js.UndefOr[Double] = js.undefined
    
    /** The device's system path. This should be passed as the path argument to chrome.serial.connect in order to connect to this device. */
    var path: String
    
    /** Optional. A USB product ID if one can be determined for the underlying device. */
    var productId: js.UndefOr[Double] = js.undefined
    
    /** Optional. A PCI or USB vendor ID if one can be determined for the underlying device. */
    var vendorId: js.UndefOr[Double] = js.undefined
  }
  object DeviceInfo {
    
    @scala.inline
    def apply(path: String): DeviceInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceInfo]
    }
    
    @scala.inline
    implicit class DeviceInfoMutableBuilder[Self <: DeviceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: Double): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      @scala.inline
      def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
    }
  }
  
  object onReceive {
    
    trait OnReceiveInfo extends StObject {
      
      /** The connection identifier. */
      var connectionId: Double
      
      /** The data received. */
      var data: ArrayBuffer
    }
    object OnReceiveInfo {
      
      @scala.inline
      def apply(connectionId: Double, data: ArrayBuffer): OnReceiveInfo = {
        val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnReceiveInfo]
      }
      
      @scala.inline
      implicit class OnReceiveInfoMutableBuilder[Self <: OnReceiveInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnectionId(value: Double): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object onReceiveError {
    
    trait OnReceiveErrorInfo extends StObject {
      
      /** The connection identifier. */
      var connectionId: Double
      
      /** The data received. */
      var error: ArrayBuffer
    }
    object OnReceiveErrorInfo {
      
      @scala.inline
      def apply(connectionId: Double, error: ArrayBuffer): OnReceiveErrorInfo = {
        val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnReceiveErrorInfo]
      }
      
      @scala.inline
      implicit class OnReceiveErrorInfoMutableBuilder[Self <: OnReceiveErrorInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnectionId(value: Double): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ArrayBuffer): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      }
    }
  }
}

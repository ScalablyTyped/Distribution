package typings.chrome.global.chrome

import typings.chrome.chrome.serial.ConnectionInfo
import typings.chrome.chrome.serial.ConnectionOptions
import typings.chrome.chrome.serial.DeviceInfo
import typings.chrome.chrome.serial.onReceive.OnReceiveInfo
import typings.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import typings.chrome.chromeStrings.break
import typings.chrome.chromeStrings.buffer_overflow
import typings.chrome.chromeStrings.device_lost
import typings.chrome.chromeStrings.disconnected
import typings.chrome.chromeStrings.eight
import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.frame_error
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.overrun
import typings.chrome.chromeStrings.parity_error
import typings.chrome.chromeStrings.seven
import typings.chrome.chromeStrings.system_error
import typings.chrome.chromeStrings.timeout
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
  
  @JSGlobal("chrome.serial")
  @js.native
  val ^ : js.Any = js.native
  
  object DataBits {
    
    @JSGlobal("chrome.serial.DataBits")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.serial.DataBits.EIGHT")
    @js.native
    def EIGHT: eight = js.native
    inline def EIGHT_=(x: eight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EIGHT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.serial.DataBits.SEVEN")
    @js.native
    def SEVEN: seven = js.native
    inline def SEVEN_=(x: seven): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEVEN")(x.asInstanceOf[js.Any])
  }
  
  object ParityBit {
    
    @JSGlobal("chrome.serial.ParityBit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.serial.ParityBit.EVEN")
    @js.native
    def EVEN: even = js.native
    inline def EVEN_=(x: even): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVEN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.serial.ParityBit.NO")
    @js.native
    def NO: no = js.native
    inline def NO_=(x: no): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.serial.ParityBit.ODD")
    @js.native
    def ODD: odd = js.native
    inline def ODD_=(x: odd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ODD")(x.asInstanceOf[js.Any])
  }
  
  object StopBits {
    
    @JSGlobal("chrome.serial.StopBits")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.serial.StopBits.ONE")
    @js.native
    def ONE: one = js.native
    inline def ONE_=(x: one): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.serial.StopBits.TWO")
    @js.native
    def TWO: two = js.native
    inline def TWO_=(x: two): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO")(x.asInstanceOf[js.Any])
  }
  
  inline def clearBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearBreak")(connectionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def connect(
    path: String,
    options: ConnectionOptions,
    callback: js.Function1[/* connectionInfo */ ConnectionInfo, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disconnect(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(connectionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flush(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(connectionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getConnections(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnections")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getControlSignals(connectionId: Double, callback: js.Function1[/* signals */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlSignals")(connectionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDevices(callback: js.Function1[/* ports */ js.Array[DeviceInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getInfo(callback: js.Function1[/* connectionInfos */ js.Array[ConnectionInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object onReceive {
    
    @JSGlobal("chrome.serial.onReceive")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addListener(callback: js.Function1[/* info */ OnReceiveInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object onReceiveError {
    
    @JSGlobal("chrome.serial.onReceiveError")
    @js.native
    val ^ : js.Any = js.native
    
    object OnReceiveErrorEnum {
      
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* The device detected a break condition. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.break")
      @js.native
      def break: typings.chrome.chromeStrings.break = js.native
      inline def break_=(x: break): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("break")(x.asInstanceOf[js.Any])
      
      /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.buffer_overflow")
      @js.native
      def bufferOverflow: buffer_overflow = js.native
      
      inline def bufferOverflow_=(x: buffer_overflow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer_overflow")(x.asInstanceOf[js.Any])
      
      /* The device was most likely disconnected from the host. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.device_lost")
      @js.native
      def deviceLost: device_lost = js.native
      
      inline def deviceLost_=(x: device_lost): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("device_lost")(x.asInstanceOf[js.Any])
      
      /* The connection was disconnected. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.disconnected")
      @js.native
      def disconnected: typings.chrome.chromeStrings.disconnected = js.native
      inline def disconnected_=(x: disconnected): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disconnected")(x.asInstanceOf[js.Any])
      
      /* The device detected a framing error. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.frame_error")
      @js.native
      def frameError: frame_error = js.native
      
      inline def frameError_=(x: frame_error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frame_error")(x.asInstanceOf[js.Any])
      
      /* A character-buffer overrun has occurred. The next character is lost. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.overrun")
      @js.native
      def overrun: typings.chrome.chromeStrings.overrun = js.native
      inline def overrun_=(x: overrun): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrun")(x.asInstanceOf[js.Any])
      
      /* The device detected a parity error. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.parity_error")
      @js.native
      def parityError: parity_error = js.native
      
      inline def parityError_=(x: parity_error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parity_error")(x.asInstanceOf[js.Any])
      
      /* A system error occurred and the connection may be unrecoverable. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.system_error")
      @js.native
      def systemError: system_error = js.native
      
      inline def systemError_=(x: system_error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("system_error")(x.asInstanceOf[js.Any])
      
      /* No data has been received for receiveTimeout milliseconds. */
      @JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum.timeout")
      @js.native
      def timeout: typings.chrome.chromeStrings.timeout = js.native
      inline def timeout_=(x: timeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
    
    inline def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def send(connectionId: Double, data: ArrayBuffer, callback: js.Function1[/* sendInfo */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(connectionId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBreak(connectionId: Double, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBreak")(connectionId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setControlSignals(connectionId: Double, signals: js.Object, callback: js.Function1[/* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setControlSignals")(connectionId.asInstanceOf[js.Any], signals.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPaused(connectionId: Double, paused: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(connectionId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def update(
    connectionId: Double,
    options: ConnectionOptions,
    callback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(connectionId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

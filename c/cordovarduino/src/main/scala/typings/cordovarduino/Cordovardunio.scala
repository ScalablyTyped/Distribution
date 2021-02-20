package typings.cordovarduino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cordovardunio {
  
  @js.native
  trait Serial extends StObject {
    
    /**
      * Close connection.
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def close(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
    
    /**
      * Open a connection.
      *
      * @param opts            SerialOptions object
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def open(opts: SerialOptions, successCallback: js.Function, errorCallback: js.Function): Unit = js.native
    
    /**
      * Read from the serial port.
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def read(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
    
    /**
      * Register a callback for the driver reading incoming data from the serial device
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def registerReadCallback(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
    
    /**
      * Request permission to interact with the serial port.
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def requestPermission(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
    
    /**
      * Write to the serial port.
      *
      * @param data            String data to write to serial port
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def write(data: String, successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  }
  object Serial {
    
    @scala.inline
    def apply(
      close: (js.Function, js.Function) => Unit,
      open: (SerialOptions, js.Function, js.Function) => Unit,
      read: (js.Function, js.Function) => Unit,
      registerReadCallback: (js.Function, js.Function) => Unit,
      requestPermission: (js.Function, js.Function) => Unit,
      write: (String, js.Function, js.Function) => Unit
    ): Serial = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction2(close), open = js.Any.fromFunction3(open), read = js.Any.fromFunction2(read), registerReadCallback = js.Any.fromFunction2(registerReadCallback), requestPermission = js.Any.fromFunction2(requestPermission), write = js.Any.fromFunction3(write))
      __obj.asInstanceOf[Serial]
    }
    
    @scala.inline
    implicit class SerialMutableBuilder[Self <: Serial] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpen(value: (SerialOptions, js.Function, js.Function) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRead(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisterReadCallback(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "registerReadCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequestPermission(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "requestPermission", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWrite(value: (String, js.Function, js.Function) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait SerialOptions extends StObject {
    
    /**
      * @defaultValue 9600
      */
    var baudRate: js.UndefOr[Double] = js.native
    
    /**
      * @defaultValue 8
      */
    var dataBits: js.UndefOr[Double] = js.native
    
    /**
      * @defaultValue 0
      */
    var parity: js.UndefOr[Double] = js.native
    
    /**
      * @defaultValue 1
      */
    var stopBits: js.UndefOr[Double] = js.native
  }
  object SerialOptions {
    
    @scala.inline
    def apply(): SerialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerialOptions]
    }
    
    @scala.inline
    implicit class SerialOptionsMutableBuilder[Self <: SerialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
      
      @scala.inline
      def setDataBits(value: Double): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      @scala.inline
      def setParity(value: Double): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
      
      @scala.inline
      def setStopBits(value: Double): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
    }
  }
}

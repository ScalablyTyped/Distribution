package typings.cordovarduino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cordovardunio {
  
  trait Serial extends StObject {
    
    /**
      * Close connection.
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def close(successCallback: js.Function, errorCallback: js.Function): Unit
    
    /**
      * Open a connection.
      *
      * @param opts            SerialOptions object
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def open(opts: SerialOptions, successCallback: js.Function, errorCallback: js.Function): Unit
    
    /**
      * Read from the serial port.
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def read(successCallback: js.Function, errorCallback: js.Function): Unit
    
    /**
      * Register a callback for the driver reading incoming data from the serial device
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def registerReadCallback(successCallback: js.Function, errorCallback: js.Function): Unit
    
    /**
      * Request permission to interact with the serial port.
      *
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def requestPermission(successCallback: js.Function, errorCallback: js.Function): Unit
    
    /**
      * Write to the serial port.
      *
      * @param data            String data to write to serial port
      * @param successCallback Function to call on success
      * @param errorCallback   Function to call on error
      */
    def write(data: String, successCallback: js.Function, errorCallback: js.Function): Unit
  }
  object Serial {
    
    inline def apply(
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
    
    extension [Self <: Serial](x: Self) {
      
      inline def setClose(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
      
      inline def setOpen(value: (SerialOptions, js.Function, js.Function) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
      
      inline def setRead(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setRegisterReadCallback(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "registerReadCallback", js.Any.fromFunction2(value))
      
      inline def setRequestPermission(value: (js.Function, js.Function) => Unit): Self = StObject.set(x, "requestPermission", js.Any.fromFunction2(value))
      
      inline def setWrite(value: (String, js.Function, js.Function) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
    }
  }
  
  trait SerialOptions extends StObject {
    
    /**
      * @defaultValue 9600
      */
    var baudRate: js.UndefOr[Double] = js.undefined
    
    /**
      * @defaultValue 8
      */
    var dataBits: js.UndefOr[Double] = js.undefined
    
    /**
      * @defaultValue 0
      */
    var parity: js.UndefOr[Double] = js.undefined
    
    /**
      * @defaultValue 1
      */
    var stopBits: js.UndefOr[Double] = js.undefined
  }
  object SerialOptions {
    
    inline def apply(): SerialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerialOptions]
    }
    
    extension [Self <: SerialOptions](x: Self) {
      
      inline def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      inline def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
      
      inline def setDataBits(value: Double): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      inline def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      inline def setParity(value: Double): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      inline def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
      
      inline def setStopBits(value: Double): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      inline def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
    }
  }
}

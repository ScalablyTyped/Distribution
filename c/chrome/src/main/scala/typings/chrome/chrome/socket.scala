package typings.chrome.chrome

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Socket
////////////////////
object socket {
  
  trait AcceptInfo extends StObject {
    
    var resultCode: Double
    
    var socketId: js.UndefOr[Double] = js.undefined
  }
  object AcceptInfo {
    
    inline def apply(resultCode: Double): AcceptInfo = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptInfo]
    }
    
    extension [Self <: AcceptInfo](x: Self) {
      
      inline def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: Double): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
      
      inline def setSocketIdUndefined: Self = StObject.set(x, "socketId", js.undefined)
    }
  }
  
  trait CreateInfo extends StObject {
    
    var socketId: Double
  }
  object CreateInfo {
    
    inline def apply(socketId: Double): CreateInfo = {
      val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateInfo]
    }
    
    extension [Self <: CreateInfo](x: Self) {
      
      inline def setSocketId(value: Double): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInterface extends StObject {
    
    var address: String
    
    var name: String
  }
  object NetworkInterface {
    
    inline def apply(address: String, name: String): NetworkInterface = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterface]
    }
    
    extension [Self <: NetworkInterface](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadInfo extends StObject {
    
    var data: ArrayBuffer
    
    var resultCode: Double
  }
  object ReadInfo {
    
    inline def apply(data: ArrayBuffer, resultCode: Double): ReadInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadInfo]
    }
    
    extension [Self <: ReadInfo](x: Self) {
      
      inline def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecvFromInfo extends StObject {
    
    var address: String
    
    var data: ArrayBuffer
    
    var port: Double
    
    var resultCode: Double
  }
  object RecvFromInfo {
    
    inline def apply(address: String, data: ArrayBuffer, port: Double, resultCode: Double): RecvFromInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecvFromInfo]
    }
    
    extension [Self <: RecvFromInfo](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketInfo extends StObject {
    
    var connected: Boolean
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var localPort: js.UndefOr[Double] = js.undefined
    
    var peerAddress: js.UndefOr[String] = js.undefined
    
    var peerPort: js.UndefOr[Double] = js.undefined
    
    var socketType: String
  }
  object SocketInfo {
    
    inline def apply(connected: Boolean, socketType: String): SocketInfo = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], socketType = socketType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    extension [Self <: SocketInfo](x: Self) {
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
      
      inline def setPeerAddressUndefined: Self = StObject.set(x, "peerAddress", js.undefined)
      
      inline def setPeerPort(value: Double): Self = StObject.set(x, "peerPort", value.asInstanceOf[js.Any])
      
      inline def setPeerPortUndefined: Self = StObject.set(x, "peerPort", js.undefined)
      
      inline def setSocketType(value: String): Self = StObject.set(x, "socketType", value.asInstanceOf[js.Any])
    }
  }
  
  trait WriteInfo extends StObject {
    
    var bytesWritten: Double
  }
  object WriteInfo {
    
    inline def apply(bytesWritten: Double): WriteInfo = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteInfo]
    }
    
    extension [Self <: WriteInfo](x: Self) {
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
}

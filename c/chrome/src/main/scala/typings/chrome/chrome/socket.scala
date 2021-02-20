package typings.chrome.chrome

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Socket
////////////////////
object socket {
  
  @js.native
  trait AcceptInfo extends StObject {
    
    var resultCode: Double = js.native
    
    var socketId: js.UndefOr[Double] = js.native
  }
  object AcceptInfo {
    
    @scala.inline
    def apply(resultCode: Double): AcceptInfo = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceptInfo]
    }
    
    @scala.inline
    implicit class AcceptInfoMutableBuilder[Self <: AcceptInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketId(value: Double): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketIdUndefined: Self = StObject.set(x, "socketId", js.undefined)
    }
  }
  
  @js.native
  trait CreateInfo extends StObject {
    
    var socketId: Double = js.native
  }
  object CreateInfo {
    
    @scala.inline
    def apply(socketId: Double): CreateInfo = {
      val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateInfo]
    }
    
    @scala.inline
    implicit class CreateInfoMutableBuilder[Self <: CreateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSocketId(value: Double): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkInterface extends StObject {
    
    var address: String = js.native
    
    var name: String = js.native
  }
  object NetworkInterface {
    
    @scala.inline
    def apply(address: String, name: String): NetworkInterface = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInterface]
    }
    
    @scala.inline
    implicit class NetworkInterfaceMutableBuilder[Self <: NetworkInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadInfo extends StObject {
    
    var data: ArrayBuffer = js.native
    
    var resultCode: Double = js.native
  }
  object ReadInfo {
    
    @scala.inline
    def apply(data: ArrayBuffer, resultCode: Double): ReadInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadInfo]
    }
    
    @scala.inline
    implicit class ReadInfoMutableBuilder[Self <: ReadInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecvFromInfo extends StObject {
    
    var address: String = js.native
    
    var data: ArrayBuffer = js.native
    
    var port: Double = js.native
    
    var resultCode: Double = js.native
  }
  object RecvFromInfo {
    
    @scala.inline
    def apply(address: String, data: ArrayBuffer, port: Double, resultCode: Double): RecvFromInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecvFromInfo]
    }
    
    @scala.inline
    implicit class RecvFromInfoMutableBuilder[Self <: RecvFromInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketInfo extends StObject {
    
    var connected: Boolean = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var localPort: js.UndefOr[Double] = js.native
    
    var peerAddress: js.UndefOr[String] = js.native
    
    var peerPort: js.UndefOr[Double] = js.native
    
    var socketType: String = js.native
  }
  object SocketInfo {
    
    @scala.inline
    def apply(connected: Boolean, socketType: String): SocketInfo = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], socketType = socketType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    @scala.inline
    implicit class SocketInfoMutableBuilder[Self <: SocketInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      @scala.inline
      def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerAddressUndefined: Self = StObject.set(x, "peerAddress", js.undefined)
      
      @scala.inline
      def setPeerPort(value: Double): Self = StObject.set(x, "peerPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerPortUndefined: Self = StObject.set(x, "peerPort", js.undefined)
      
      @scala.inline
      def setSocketType(value: String): Self = StObject.set(x, "socketType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WriteInfo extends StObject {
    
    var bytesWritten: Double = js.native
  }
  object WriteInfo {
    
    @scala.inline
    def apply(bytesWritten: Double): WriteInfo = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteInfo]
    }
    
    @scala.inline
    implicit class WriteInfoMutableBuilder[Self <: WriteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
}

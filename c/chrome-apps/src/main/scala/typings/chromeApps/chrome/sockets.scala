package typings.chromeApps.chrome

import typings.chromeApps.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.socket
////////////
// Socket //
////////////
/*
  * @deprecated Since Chrome 33
  * @description
  * Use the chrome.socket API to send and receive data over the network using TCP and UDP connections.
  * Note: Starting with Chrome 33, this API is deprecated in favor of the sockets.udp, sockets.tcp
  * and sockets.tcpServer APIs.
  */
// const socket: chrome.deprecatedButUsable; // Removed to not be confused with chrome.sockets.*
// #endregion
// #region chrome.sockets.*
////////////////////
// Chrome Sockets //
////////////////////
/**
  * Use the chrome.sockets.* APIs to send and receive data over the network using TCP and UDP connections.
  * @since Chrome 33.
  */
object sockets {
  
  type AcceptErrorEventArgs = ReceiveErrorEventArgs
  
  type AcceptEventArgs = ReceiveEventArgs
  
  trait CreateInfo extends StObject {
    
    /**
      * The ID of the newly created socket.
      * Note that socket IDs created from this API are
      * **not compatible** with socket IDs created from
      * other APIs, such as the deprecated socket API.
      */
    var socketId: integer
  }
  object CreateInfo {
    
    inline def apply(socketId: integer): CreateInfo = {
      val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateInfo]
    }
    
    extension [Self <: CreateInfo](x: Self) {
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiveErrorEventArgs extends StObject {
    
    /** The result code returned from the underlying network call. */
    var resultCode: integer
    
    /** The socket identifier. */
    var socketId: integer
  }
  object ReceiveErrorEventArgs {
    
    inline def apply(resultCode: integer, socketId: integer): ReceiveErrorEventArgs = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveErrorEventArgs]
    }
    
    extension [Self <: ReceiveErrorEventArgs](x: Self) {
      
      inline def setResultCode(value: integer): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiveEventArgs extends StObject {
    
    /** The data received, with a maxium size of *bufferSize*. */
    var data: js.typedarray.ArrayBuffer
    
    /** The socket identifier. */
    var socketId: integer
  }
  object ReceiveEventArgs {
    
    inline def apply(data: js.typedarray.ArrayBuffer, socketId: integer): ReceiveEventArgs = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveEventArgs]
    }
    
    extension [Self <: ReceiveEventArgs](x: Self) {
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendInfo extends StObject {
    
    /** The number of bytes sent (if result == 0) */
    var bytesSent: js.UndefOr[integer] = js.undefined
    
    /** The result code returned from the underlying network call. A negative value indicates an error. */
    var resultCode: integer
  }
  object SendInfo {
    
    inline def apply(resultCode: integer): SendInfo = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendInfo]
    }
    
    extension [Self <: SendInfo](x: Self) {
      
      inline def setBytesSent(value: integer): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
      
      inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
      
      inline def setResultCode(value: integer): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketInfo extends StObject {
    
    /** The size of the buffer used to receive data. If no buffer size has been specified explictly, the value is not provided. */
    var bufferSize: js.UndefOr[integer] = js.undefined
    
    /** Flag indicating whether the socket is connected to a remote peer. */
    var connected: Boolean
    
    /** If the underlying socket is connected, contains its local IPv4/6 address. */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /** If the underlying socket is connected, contains its local port. */
    var localPort: js.UndefOr[integer] = js.undefined
    
    /** Application-defined string associated with the socket. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Flag indicating whether a connected socket blocks its peer from sending more data (see setPaused). */
    var paused: Boolean
    
    /** If the underlying socket is connected, contains the peer/ IPv4/6 address. */
    var peerAddress: js.UndefOr[String] = js.undefined
    
    /** If the underlying socket is connected, contains the peer port. */
    var peerPort: js.UndefOr[integer] = js.undefined
    
    /** Flag indicating whether the socket is left open when the application is suspended (see SocketProperties.persistent). */
    var persistent: Boolean
    
    /** The socket identifier. */
    var socketId: integer
  }
  object SocketInfo {
    
    inline def apply(connected: Boolean, paused: Boolean, persistent: Boolean, socketId: integer): SocketInfo = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    extension [Self <: SocketInfo](x: Self) {
      
      inline def setBufferSize(value: integer): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: integer): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
      
      inline def setPeerAddressUndefined: Self = StObject.set(x, "peerAddress", js.undefined)
      
      inline def setPeerPort(value: integer): Self = StObject.set(x, "peerPort", value.asInstanceOf[js.Any])
      
      inline def setPeerPortUndefined: Self = StObject.set(x, "peerPort", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketProperties extends StObject {
    
    /**
      * The size of the buffer used to receive data.
      * @default: 4096
      */
    var bufferSize: js.UndefOr[integer] = js.undefined
    
    /** An application-defined string associated with the socket. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Flag indicating if the socket is left open when the event page of the
      * application is unloaded. When the application is loaded, any sockets
      * previously opened with persistent=true can be fetched with *getSockets*.
      * @default false
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object SocketProperties {
    
    inline def apply(): SocketProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketProperties]
    }
    
    extension [Self <: SocketProperties](x: Self) {
      
      inline def setBufferSize(value: integer): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
  
  /**
    * Use the chrome.sockets.tcp API to send and receive data over the network using TCP connections.
    * This API supersedes the TCP functionality previously found in the chrome.socket API.
    * @since Chrome 33.
    * @requires Manifest: 'Sockets': {...}
    */
  object tcp {
    
    trait SecureOptions extends StObject {
      
      /**
        * The minimum and maximum acceptable versions of TLS.
        * These will be tls1, tls1.1, or tls1.2.
        * *Note*
        * tls1.3 should be supported from Chrome 67.
        * @see[TLS Info and support table]{@link https://en.wikipedia.org/wiki/Transport_Layer_Security#TLS_1.3}
        */
      var tlsVersion: js.UndefOr[Max] = js.undefined
    }
    object SecureOptions {
      
      inline def apply(): SecureOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SecureOptions]
      }
      
      extension [Self <: SecureOptions](x: Self) {
        
        inline def setTlsVersion(value: Max): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
        
        inline def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
      }
    }
  }
  
  /**
    * Use the chrome.sockets.tcpServer API to create server applications using TCP
    * connections. This API supersedes the TCP functionality previously found in
    * the chrome.socket API.
    *
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_tcpServer
    */
  object tcpServer {
    
    /**
      * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketInfo
      */
    trait SocketInfo extends StObject {
      
      /** If the socket is listening, contains its local IPv4/6 address. */
      var localAddress: js.UndefOr[String] = js.undefined
      
      /** If the socket is listening, contains its local port. */
      var localPort: js.UndefOr[integer] = js.undefined
      
      /** Application-defined string associated with the socket. */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Flag indicating whether connection requests on a listening socket are
        * dispatched through the onAccept event or queued up in the listen
        * queue backlog. See setPaused. The default value is 'false'
        */
      var paused: Boolean
      
      /**
        * Flag indicating if the socket remains open when the event page of the
        * application is unloaded (see SocketProperties.persistent). The
        * default value is 'false'.
        */
      var persistent: Boolean
      
      /** The socket identifier. */
      var socketId: integer
    }
    object SocketInfo {
      
      inline def apply(paused: Boolean, persistent: Boolean, socketId: integer): typings.chromeApps.chrome.sockets.tcpServer.SocketInfo = {
        val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.chromeApps.chrome.sockets.tcpServer.SocketInfo]
      }
      
      extension [Self <: typings.chromeApps.chrome.sockets.tcpServer.SocketInfo](x: Self) {
        
        inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
        
        inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
        
        inline def setLocalPort(value: integer): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
        
        inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
        
        inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
        
        inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketProperties
      */
    trait SocketProperties extends StObject {
      
      /** An application-defined string associated with the socket. */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * Flag indicating if the socket remains open when the event page of the
        * application is unloaded. The default value is 'false.' When the
        * application is loaded, any sockets previously opened with
        * persistent=true can be fetched with getSockets.
        *
        * @see http://developer.chrome.com/apps/app_lifecycle.html
        */
      var persistent: js.UndefOr[Boolean] = js.undefined
    }
    object SocketProperties {
      
      inline def apply(): typings.chromeApps.chrome.sockets.tcpServer.SocketProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.chromeApps.chrome.sockets.tcpServer.SocketProperties]
      }
      
      extension [Self <: typings.chromeApps.chrome.sockets.tcpServer.SocketProperties](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
        
        inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      }
    }
  }
}

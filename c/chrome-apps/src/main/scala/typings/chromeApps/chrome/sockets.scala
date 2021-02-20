package typings.chromeApps.chrome

import typings.chromeApps.anon.Max
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait CreateInfo extends StObject {
    
    /**
      * The ID of the newly created socket.
      * Note that socket IDs created from this API are
      * **not compatible** with socket IDs created from
      * other APIs, such as the deprecated socket API.
      */
    var socketId: integer = js.native
  }
  object CreateInfo {
    
    @scala.inline
    def apply(socketId: integer): CreateInfo = {
      val __obj = js.Dynamic.literal(socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateInfo]
    }
    
    @scala.inline
    implicit class CreateInfoMutableBuilder[Self <: CreateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiveErrorEventArgs extends StObject {
    
    /** The result code returned from the underlying network call. */
    var resultCode: integer = js.native
    
    /** The socket identifier. */
    var socketId: integer = js.native
  }
  object ReceiveErrorEventArgs {
    
    @scala.inline
    def apply(resultCode: integer, socketId: integer): ReceiveErrorEventArgs = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveErrorEventArgs]
    }
    
    @scala.inline
    implicit class ReceiveErrorEventArgsMutableBuilder[Self <: ReceiveErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResultCode(value: integer): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceiveEventArgs extends StObject {
    
    /** The data received, with a maxium size of *bufferSize*. */
    var data: ArrayBuffer = js.native
    
    /** The socket identifier. */
    var socketId: integer = js.native
  }
  object ReceiveEventArgs {
    
    @scala.inline
    def apply(data: ArrayBuffer, socketId: integer): ReceiveEventArgs = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveEventArgs]
    }
    
    @scala.inline
    implicit class ReceiveEventArgsMutableBuilder[Self <: ReceiveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendInfo extends StObject {
    
    /** The number of bytes sent (if result == 0) */
    var bytesSent: js.UndefOr[integer] = js.native
    
    /** The result code returned from the underlying network call. A negative value indicates an error. */
    var resultCode: integer = js.native
  }
  object SendInfo {
    
    @scala.inline
    def apply(resultCode: integer): SendInfo = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendInfo]
    }
    
    @scala.inline
    implicit class SendInfoMutableBuilder[Self <: SendInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesSent(value: integer): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
      
      @scala.inline
      def setResultCode(value: integer): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketInfo extends StObject {
    
    /** The size of the buffer used to receive data. If no buffer size has been specified explictly, the value is not provided. */
    var bufferSize: js.UndefOr[integer] = js.native
    
    /** Flag indicating whether the socket is connected to a remote peer. */
    var connected: Boolean = js.native
    
    /** If the underlying socket is connected, contains its local IPv4/6 address. */
    var localAddress: js.UndefOr[String] = js.native
    
    /** If the underlying socket is connected, contains its local port. */
    var localPort: js.UndefOr[integer] = js.native
    
    /** Application-defined string associated with the socket. */
    var name: js.UndefOr[String] = js.native
    
    /** Flag indicating whether a connected socket blocks its peer from sending more data (see setPaused). */
    var paused: Boolean = js.native
    
    /** If the underlying socket is connected, contains the peer/ IPv4/6 address. */
    var peerAddress: js.UndefOr[String] = js.native
    
    /** If the underlying socket is connected, contains the peer port. */
    var peerPort: js.UndefOr[integer] = js.native
    
    /** Flag indicating whether the socket is left open when the application is suspended (see SocketProperties.persistent). */
    var persistent: Boolean = js.native
    
    /** The socket identifier. */
    var socketId: integer = js.native
  }
  object SocketInfo {
    
    @scala.inline
    def apply(connected: Boolean, paused: Boolean, persistent: Boolean, socketId: integer): SocketInfo = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    @scala.inline
    implicit class SocketInfoMutableBuilder[Self <: SocketInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: integer): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLocalPort(value: integer): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerAddressUndefined: Self = StObject.set(x, "peerAddress", js.undefined)
      
      @scala.inline
      def setPeerPort(value: integer): Self = StObject.set(x, "peerPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerPortUndefined: Self = StObject.set(x, "peerPort", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketProperties extends StObject {
    
    /**
      * The size of the buffer used to receive data.
      * @default: 4096
      */
    var bufferSize: js.UndefOr[integer] = js.native
    
    /** An application-defined string associated with the socket. */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Flag indicating if the socket is left open when the event page of the
      * application is unloaded. When the application is loaded, any sockets
      * previously opened with persistent=true can be fetched with *getSockets*.
      * @default false
      */
    var persistent: js.UndefOr[Boolean] = js.native
  }
  object SocketProperties {
    
    @scala.inline
    def apply(): SocketProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketProperties]
    }
    
    @scala.inline
    implicit class SocketPropertiesMutableBuilder[Self <: SocketProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: integer): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
  
  /**
    * Use the chrome.sockets.tcp API to send and receive data over the network using TCP connections.
    * This API supersedes the TCP functionality previously found in the chrome.socket API.
    * @since Chrome 33.
    * @requires Manifest: 'Sockets': {...}
    */
  object tcp {
    
    @js.native
    trait SecureOptions extends StObject {
      
      /**
        * The minimum and maximum acceptable versions of TLS.
        * These will be tls1, tls1.1, or tls1.2.
        * *Note*
        * tls1.3 should be supported from Chrome 67.
        * @see[TLS Info and support table]{@link https://en.wikipedia.org/wiki/Transport_Layer_Security#TLS_1.3}
        */
      var tlsVersion: js.UndefOr[Max] = js.native
    }
    object SecureOptions {
      
      @scala.inline
      def apply(): SecureOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SecureOptions]
      }
      
      @scala.inline
      implicit class SecureOptionsMutableBuilder[Self <: SecureOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTlsVersion(value: Max): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
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
    @js.native
    trait SocketInfo extends StObject {
      
      /** If the socket is listening, contains its local IPv4/6 address. */
      var localAddress: js.UndefOr[String] = js.native
      
      /** If the socket is listening, contains its local port. */
      var localPort: js.UndefOr[integer] = js.native
      
      /** Application-defined string associated with the socket. */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Flag indicating whether connection requests on a listening socket are
        * dispatched through the onAccept event or queued up in the listen
        * queue backlog. See setPaused. The default value is 'false'
        */
      var paused: Boolean = js.native
      
      /**
        * Flag indicating if the socket remains open when the event page of the
        * application is unloaded (see SocketProperties.persistent). The
        * default value is 'false'.
        */
      var persistent: Boolean = js.native
      
      /** The socket identifier. */
      var socketId: integer = js.native
    }
    object SocketInfo {
      
      @scala.inline
      def apply(paused: Boolean, persistent: Boolean, socketId: integer): typings.chromeApps.chrome.sockets.tcpServer.SocketInfo = {
        val __obj = js.Dynamic.literal(paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.chromeApps.chrome.sockets.tcpServer.SocketInfo]
      }
      
      @scala.inline
      implicit class SocketInfoMutableBuilder[Self <: typings.chromeApps.chrome.sockets.tcpServer.SocketInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
        
        @scala.inline
        def setLocalPort(value: integer): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @see https://developer.chrome.com/apps/sockets_tcpServer#type-SocketProperties
      */
    @js.native
    trait SocketProperties extends StObject {
      
      /** An application-defined string associated with the socket. */
      var name: js.UndefOr[String] = js.native
      
      /**
        * Flag indicating if the socket remains open when the event page of the
        * application is unloaded. The default value is 'false.' When the
        * application is loaded, any sockets previously opened with
        * persistent=true can be fetched with getSockets.
        *
        * @see http://developer.chrome.com/apps/app_lifecycle.html
        */
      var persistent: js.UndefOr[Boolean] = js.native
    }
    object SocketProperties {
      
      @scala.inline
      def apply(): typings.chromeApps.chrome.sockets.tcpServer.SocketProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.chromeApps.chrome.sockets.tcpServer.SocketProperties]
      }
      
      @scala.inline
      implicit class SocketPropertiesMutableBuilder[Self <: typings.chromeApps.chrome.sockets.tcpServer.SocketProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
      }
    }
  }
  
  /**
    * Use the chrome.sockets.udp API to send and receive data over the network
    * using UDP connections. This API supersedes the UDP functionality previously
    * found in the 'socket' API.
    * @requires Manifest: 'sockets': {...}
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_udp
    */
  object udp
}

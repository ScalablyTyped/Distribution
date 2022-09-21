package typings.chromeApps.chrome

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.disconnected__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @requires Important: This API works only on OS X, Windows and Chrome OS.
  * Use the chrome.bluetoothSocket API to send and receive data to Bluetooth devices using RFCOMM and L2CAP connections.
  */
object bluetoothSocket {
  
  trait CreateInfo extends StObject {
    
    /**
      * The ID of the newly created socket.
      * Note that socket IDs created from this
      * API are not compatible with socket IDs
      * created from other APIs, such as the
      * sockets.tcp API.
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
  
  trait ListenOptions extends StObject {
    
    /**
      * Length of the socket's listen queue.
      * The default value depends on the operating system's host subsystem.
      * */
    var backlog: js.UndefOr[integer] = js.undefined
    
    /**
      * The RFCOMM Channel used by listenUsingRfcomm.
      * If specified, this channel must not be previously
      * in use or the method call will fail. When not specified,
      * an unused channel will be automatically allocated.
      */
    var channel: js.UndefOr[integer] = js.undefined
    
    /**
      * The L2CAP PSM used by listenUsingL2cap.
      * If specified, this PSM must not be previously
      * in use or the method call with fail. When not specified,
      * an unused PSM will be automatically allocated.
      * */
    var psm: js.UndefOr[integer] = js.undefined
  }
  object ListenOptions {
    
    inline def apply(): ListenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenOptions]
    }
    
    extension [Self <: ListenOptions](x: Self) {
      
      inline def setBacklog(value: integer): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      inline def setChannel(value: integer): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setPsm(value: integer): Self = StObject.set(x, "psm", value.asInstanceOf[js.Any])
      
      inline def setPsmUndefined: Self = StObject.set(x, "psm", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.system_error
    - typings.chromeApps.chromeAppsStrings.not_listening
  */
  trait OnAcceptErrorCode extends StObject
  object OnAcceptErrorCode {
    
    inline def not_listening: typings.chromeApps.chromeAppsStrings.not_listening = "not_listening".asInstanceOf[typings.chromeApps.chromeAppsStrings.not_listening]
    
    inline def system_error: typings.chromeApps.chromeAppsStrings.system_error = "system_error".asInstanceOf[typings.chromeApps.chromeAppsStrings.system_error]
  }
  
  type OnAcceptErrorEvent = Event[js.Function1[/* info */ OnAcceptErrorEventData, Unit]]
  
  trait OnAcceptErrorEventData extends StObject {
    
    /**
      * An error code indicating what went wrong.
      *
      * system_error
      *  > A system error occurred and the connection may be unrecoverable.
      * not_listening
      *  > The socket is not listening.
      */
    var error: OnAcceptErrorCode
    
    /** The error message */
    var errorMessage: String
    
    /** The server socket identifier. */
    var socketId: integer
  }
  object OnAcceptErrorEventData {
    
    inline def apply(error: OnAcceptErrorCode, errorMessage: String, socketId: integer): OnAcceptErrorEventData = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnAcceptErrorEventData]
    }
    
    extension [Self <: OnAcceptErrorEventData](x: Self) {
      
      inline def setError(value: OnAcceptErrorCode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  type OnAcceptEvent = Event[js.Function1[/* info */ OnAcceptInfoData, Unit]]
  
  trait OnAcceptInfoData extends StObject {
    
    /**
      * The client socket identifier, i.e. the socket
      * identifier of the newly established connection.
      * This socket identifier should be used only with
      * functions from the chrome.bluetoothSocket namespace.
      * Note the client socket is initially paused and must
      * be explictly un-paused by the application to start
      * receiving data.
      */
    var clientSocketId: integer
    
    /** The server socket identifier. */
    var socketId: integer
  }
  object OnAcceptInfoData {
    
    inline def apply(clientSocketId: integer, socketId: integer): OnAcceptInfoData = {
      val __obj = js.Dynamic.literal(clientSocketId = clientSocketId.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnAcceptInfoData]
    }
    
    extension [Self <: OnAcceptInfoData](x: Self) {
      
      inline def setClientSocketId(value: integer): Self = StObject.set(x, "clientSocketId", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.disconnected__
    - typings.chromeApps.chromeAppsStrings.system_error
    - typings.chromeApps.chromeAppsStrings.not_connected
  */
  trait OnReceiveErrorCode extends StObject
  object OnReceiveErrorCode {
    
    inline def disconnected: disconnected__ = "disconnected".asInstanceOf[disconnected__]
    
    inline def not_connected: typings.chromeApps.chromeAppsStrings.not_connected = "not_connected".asInstanceOf[typings.chromeApps.chromeAppsStrings.not_connected]
    
    inline def system_error: typings.chromeApps.chromeAppsStrings.system_error = "system_error".asInstanceOf[typings.chromeApps.chromeAppsStrings.system_error]
  }
  
  type OnReceiveErrorEvent = Event[js.Function1[/* info */ OnReceiveErrorEventData, Unit]]
  
  trait OnReceiveErrorEventData extends StObject {
    
    /**
      * An error code indicating what went wrong.
      *
      * disconnected
      *  > The connection was disconnected.
      * system_error
      *  > A system error occurred and the connection may be unrecoverable.
      * not_connected
      *  > The socket has not been connected.
      */
    var error: OnAcceptErrorCode
    
    /** The error message */
    var errorMessage: String
    
    /** The server socket identifier. */
    var socketId: integer
  }
  object OnReceiveErrorEventData {
    
    inline def apply(error: OnAcceptErrorCode, errorMessage: String, socketId: integer): OnReceiveErrorEventData = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnReceiveErrorEventData]
    }
    
    extension [Self <: OnReceiveErrorEventData](x: Self) {
      
      inline def setError(value: OnAcceptErrorCode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  type OnReceiveEvent = Event[js.Function1[/* info */ OnReceiveEventData, Unit]]
  
  trait OnReceiveEventData extends StObject {
    
    /** The data received, with a maxium size of bufferSize. */
    var data: js.typedarray.ArrayBuffer
    
    /** The socket identifier. */
    var socketId: integer
  }
  object OnReceiveEventData {
    
    inline def apply(data: js.typedarray.ArrayBuffer, socketId: integer): OnReceiveEventData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnReceiveEventData]
    }
    
    extension [Self <: OnReceiveEventData](x: Self) {
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocketInfo extends StObject {
    
    /**
      * If the underlying socket is connected,
      * contains the Bluetooth address of the device it is connected to.
      */
    var address: js.UndefOr[String] = js.undefined
    
    /**
      * The size of the buffer used to receive data.
      * If no buffer size has been specified explictly,
      * the value is not provided.
      */
    var bufferSize: js.UndefOr[integer] = js.undefined
    
    /**
      * Flag indicating whether the socket is connected to a remote peer.
      */
    var connected: Boolean
    
    /**
      * Application-defined string associated with the socket.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Flag indicating whether a connected socket
      * blocks its peer from sending more data, or
      * whether connection requests on a listening
      * socket are dispatched through the onAccept
      * event or queued up in the listen queue backlog.
      * See setPaused. The default value is 'false'.
      */
    var paused: Boolean
    
    /**
      * Flag indicating if the socket remains
      * open when the event page of the application
      * is unloaded (see SocketProperties.persistent).
      * The default value is 'false'.
      */
    var persistent: Boolean
    
    /**
      * The socket identifier.
      * */
    var socketId: integer
    
    /**
      * If the underlying socket is connected,
      * contains information about the service
      * UUID it is connected to, otherwise if
      * the underlying socket is listening,
      * contains information about the service
      * UUID it is listening on.
      */
    var uuid: js.UndefOr[String] = js.undefined
  }
  object SocketInfo {
    
    inline def apply(connected: Boolean, paused: Boolean, persistent: Boolean, socketId: integer): SocketInfo = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], socketId = socketId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketInfo]
    }
    
    extension [Self <: SocketInfo](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setBufferSize(value: integer): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setSocketId(value: integer): Self = StObject.set(x, "socketId", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait SocketProperties extends StObject {
    
    /**
      * @default 4096
      * @description
      * The size of the buffer used to receive data.
      * */
    var bufferSize: js.UndefOr[integer] = js.undefined
    
    /** An application-defined string associated with the socket. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Flag indicating whether the socket is left open when
      * the event page of the application is unloaded
      * (see Manage App Lifecycle). The default value is false.
      * When the application is loaded, any sockets previously
      * opened with persistent=true can be fetched with $ref:getSockets.
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
}

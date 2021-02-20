package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.bluetoothSocket.CreateInfo
import typings.chromeApps.chrome.bluetoothSocket.ListenOptions
import typings.chromeApps.chrome.bluetoothSocket.OnAcceptErrorEvent
import typings.chromeApps.chrome.bluetoothSocket.OnAcceptEvent
import typings.chromeApps.chrome.bluetoothSocket.OnReceiveErrorEvent
import typings.chromeApps.chrome.bluetoothSocket.OnReceiveEvent
import typings.chromeApps.chrome.bluetoothSocket.SocketInfo
import typings.chromeApps.chrome.bluetoothSocket.SocketProperties
import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since Chrome 37
  * @requires Manifest: 'bluetooth': {...}
  * @requires Important: This API works only on OS X, Windows and Chrome OS.
  * Use the chrome.bluetoothSocket API to send and receive data to Bluetooth devices using RFCOMM and L2CAP connections.
  */
object bluetoothSocket {
  
  /**
    * Disconnects and destroys the socket.
    * Each socket created should be closed after use.
    * The socket id is no longer valid as soon at the
    * function is called. However, the socket is guaranteed
    * to be closed only when the callback is invoked.
    *
    * @param socketId The socket identifier.
    * @param callback Called when the `close` operation completes
    */
  @JSGlobal("chrome.bluetoothSocket.close")
  @js.native
  def close(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Connects the socket to a remote Bluetooth device.
    * When the connect operation completes successfully,
    * onReceive events are raised when data is received
    * from the peer. If a network error occur while the
    * runtime is receiving packets, a onReceiveError
    * event is raised, at which point no more onReceive
    * event will be raised for this socket until the
    * setPaused(false) method is called.
    *
    * @param socketId The socket identifier.
    * @param address The address of the Bluetooth device.
    * @param uuid The UUID of the service to connect to.
    * @param callback Called when the connect attempt is complete.
    */
  @JSGlobal("chrome.bluetoothSocket.connect")
  @js.native
  def connect(socketId: integer, address: String, uuid: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Creates a Bluetooth socket.
    * @param callback Called when the socket has been created
    * */
  @JSGlobal("chrome.bluetoothSocket.create")
  @js.native
  def create(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  /**
    * Creates a Bluetooth socket.
    * @param properties The socket properties (optional)
    * @param callback Called when the socket has been created
    */
  @JSGlobal("chrome.bluetoothSocket.create")
  @js.native
  def create(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  
  /**
    * Disconnects the socket. The socket identifier remains valid.
    * @param socketId The socket identifier.
    * @param [callback] Called when the disconnect attempt is complete.
    */
  @JSGlobal("chrome.bluetoothSocket.disconnect")
  @js.native
  def disconnect(socketId: integer): Unit = js.native
  @JSGlobal("chrome.bluetoothSocket.disconnect")
  @js.native
  def disconnect(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Retrieves the state of the given socket.
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available.
    *                 Callback returning object containing the socket information.
    */
  @JSGlobal("chrome.bluetoothSocket.getInfo")
  @js.native
  def getInfo(socketId: integer, callback: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = js.native
  
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    * @param callback Called when the list of sockets is available.
    *                 Returns an array of socket info.
    */
  @JSGlobal("chrome.bluetoothSocket.getSockets")
  @js.native
  def getSockets(callback: js.Function1[/* sockets */ js.Array[SocketInfo], Unit]): Unit = js.native
  
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param callback Called when listen operation completes.
    */
  @JSGlobal("chrome.bluetoothSocket.listenUsingL2cap")
  @js.native
  def listenUsingL2cap(socketId: integer, uuid: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param options Optional additional options for the service.
    * @param callback Called when listen operation completes.
    */
  @JSGlobal("chrome.bluetoothSocket.listenUsingL2cap")
  @js.native
  def listenUsingL2cap(socketId: integer, uuid: String, options: ListenOptions, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Listen for connections using the RFCOMM protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param callback Called when listen operation completes.
    */
  @JSGlobal("chrome.bluetoothSocket.listenUsingRfcomm")
  @js.native
  def listenUsingRfcomm(socketId: integer, uuid: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Listen for connections using the RFCOMM protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param options Optional additional options for the service.
    * @param callback Called when listen operation completes.
    */
  @JSGlobal("chrome.bluetoothSocket.listenUsingRfcomm")
  @js.native
  def listenUsingRfcomm(socketId: integer, uuid: String, options: ListenOptions, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Event raised when a connection has been established
    * for a given socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onAccept")
  @js.native
  val onAccept: OnAcceptEvent = js.native
  
  /**
    * Event raised when a network error occurred while the
    * runtime was waiting for new connections on the given
    * socket. Once this event is raised, the socket is set
    * to paused and no more onAccept events are raised for
    * this socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onAcceptError")
  @js.native
  val onAcceptError: OnAcceptErrorEvent = js.native
  
  /**
    * Event raised when data has been received for a given socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onReceive")
  @js.native
  val onReceive: OnReceiveEvent = js.native
  
  /**
    * Event raised when a network error occured while the runtime
    * was waiting for data on the socket. Once this event is raised,
    * the socket is set to paused and no more onReceive events are
    * raised for this socket.
    */
  @JSGlobal("chrome.bluetoothSocket.onReceiveError")
  @js.native
  val onReceiveError: OnReceiveErrorEvent = js.native
  
  /**
    * Sends data on the given Bluetooth socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param [callback] Called with the number of bytes sent.
    */
  @JSGlobal("chrome.bluetoothSocket.send")
  @js.native
  def send(socketId: integer, data: ArrayBuffer): Unit = js.native
  @JSGlobal("chrome.bluetoothSocket.send")
  @js.native
  def send(socketId: integer, data: ArrayBuffer, callback: js.Function1[/* bytesSent */ integer, Unit]): Unit = js.native
  
  /**
    * Enables or disables a connected socket from
    * receiving messages from its peer, or a listening
    * socket from accepting new connections. The default
    * value is 'false'. Pausing a connected socket is
    * typically used by an application to throttle data
    * sent by its peer. When a connected socket is paused,
    * no onReceiveevent is raised. When a socket is connected
    * and un-paused, onReceive events are raised again when
    * messages are received. When a listening socket is paused,
    * new connections are accepted until its backlog is full
    * then additional connection requests are refused.
    * onAccept events are raised only when the socket is un-paused.
    *
    * @param socketId The socket identifier.
    * @param paused Flag indicating whether a connected socket
    * blocks its peer from sending more data, or
    * whether connection requests on a listening
    * socket are dispatched through the onAccept
    * event or queued up in the listen queue backlog.
    * See setPaused. The default value is 'false'.
    * @param [callback] Callback from the setPaused method.
    */
  @JSGlobal("chrome.bluetoothSocket.setPaused")
  @js.native
  def setPaused(socketId: integer, paused: Boolean): Unit = js.native
  @JSGlobal("chrome.bluetoothSocket.setPaused")
  @js.native
  def setPaused(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Updates the socket properties.
    * @param socketId The socket identifier.
    * @param properties  The properties to update.
    * @param [callback] Called when the properties are updated.
    */
  @JSGlobal("chrome.bluetoothSocket.update")
  @js.native
  def update(socketId: integer, properties: SocketProperties): Unit = js.native
  @JSGlobal("chrome.bluetoothSocket.update")
  @js.native
  def update(socketId: integer, properties: SocketProperties, callback: js.Function0[Unit]): Unit = js.native
}

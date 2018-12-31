package typings
package chromeDashAppsLib.chromeNs.bluetoothSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothSocket")
@js.native
object bluetoothSocketNsMembers extends js.Object {
  /**
    * Event raised when a connection has been established
    * for a given socket.
    */
  val onAccept: OnAcceptEvent = js.native
  /**
    * Event raised when a network error occurred while the
    * runtime was waiting for new connections on the given
    * socket. Once this event is raised, the socket is set
    * to paused and no more onAccept events are raised for
    * this socket.
    */
  val onAcceptError: OnAcceptErrorEvent = js.native
  /**
    * Event raised when data has been received for a given socket.
    */
  val onReceive: OnReceiveEvent = js.native
  /**
    * Event raised when a network error occured while the runtime
    * was waiting for data on the socket. Once this event is raised,
    * the socket is set to paused and no more onReceive events are
    * raised for this socket.
    */
  val onReceiveError: OnReceiveErrorEvent = js.native
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
  def close(socketId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
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
  def connect(
    socketId: chromeDashAppsLib.chromeNs.integer,
    address: java.lang.String,
    uuid: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Creates a Bluetooth socket.
    * @param callback Called when the socket has been created
    * */
  def create(callback: js.Function1[/* createInfo */ CreateInfo, scala.Unit]): scala.Unit = js.native
  /**
    * Creates a Bluetooth socket.
    * @param properties The socket properties (optional)
    * @param callback Called when the socket has been created
    */
  def create(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, scala.Unit]): scala.Unit = js.native
  /**
    * Disconnects the socket. The socket identifier remains valid.
    * @param socketId The socket identifier.
    * @param [callback] Called when the disconnect attempt is complete.
    */
  def disconnect(socketId: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  def disconnect(socketId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Retrieves the state of the given socket.
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available.
    *                 Callback returning object containing the socket information.
    */
  def getInfo(
    socketId: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* socketInfo */ SocketInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    * @param callback Called when the list of sockets is available.
    *                 Returns an array of socket info.
    */
  def getSockets(callback: js.Function1[/* sockets */ js.Array[SocketInfo], scala.Unit]): scala.Unit = js.native
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param callback Called when listen operation completes.
    */
  def listenUsingL2cap(
    socketId: chromeDashAppsLib.chromeNs.integer,
    uuid: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Listen for connections using the L2CAP protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param options Optional additional options for the service.
    * @param callback Called when listen operation completes.
    */
  def listenUsingL2cap(
    socketId: chromeDashAppsLib.chromeNs.integer,
    uuid: java.lang.String,
    options: ListenOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Listen for connections using the RFCOMM protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param callback Called when listen operation completes.
    */
  def listenUsingRfcomm(
    socketId: chromeDashAppsLib.chromeNs.integer,
    uuid: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Listen for connections using the RFCOMM protocol.
    *
    * @param socketId The socket identifier.
    * @param uuid Service UUID to listen on.
    * @param options Optional additional options for the service.
    * @param callback Called when listen operation completes.
    */
  def listenUsingRfcomm(
    socketId: chromeDashAppsLib.chromeNs.integer,
    uuid: java.lang.String,
    options: ListenOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sends data on the given Bluetooth socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param [callback] Called with the number of bytes sent.
    */
  def send(socketId: chromeDashAppsLib.chromeNs.integer, data: stdLib.ArrayBuffer): scala.Unit = js.native
  def send(
    socketId: chromeDashAppsLib.chromeNs.integer,
    data: stdLib.ArrayBuffer,
    callback: js.Function1[/* bytesSent */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
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
  def setPaused(socketId: chromeDashAppsLib.chromeNs.integer, paused: scala.Boolean): scala.Unit = js.native
  def setPaused(
    socketId: chromeDashAppsLib.chromeNs.integer,
    paused: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Updates the socket properties.
    * @param socketId The socket identifier.
    * @param properties  The properties to update.
    * @param [callback] Called when the properties are updated.
    */
  def update(socketId: chromeDashAppsLib.chromeNs.integer, properties: SocketProperties): scala.Unit = js.native
  def update(
    socketId: chromeDashAppsLib.chromeNs.integer,
    properties: SocketProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}


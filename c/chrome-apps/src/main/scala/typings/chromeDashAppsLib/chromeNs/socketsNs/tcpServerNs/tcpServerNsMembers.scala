package typings
package chromeDashAppsLib.chromeNs.socketsNs.tcpServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer")
@js.native
object tcpServerNsMembers extends js.Object {
  /**
    * Event raised when a connection has been made to the server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAccept
    */
  val onAccept: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* args */ chromeDashAppsLib.chromeNs.socketsNs.AcceptEventArgs, scala.Unit]
  ] = js.native
  /**
    * Event raised when a network error occured while the runtime was waiting
    * for new connections on the socket address and port. Once this event is
    * raised, the socket is set to paused and no more onAccept events are
    * raised for this socket until the socket is resumed.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAcceptError
    */
  val onAcceptError: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* args */ chromeDashAppsLib.chromeNs.socketsNs.AcceptErrorEventArgs, scala.Unit]
  ] = js.native
  /**
    * Disconnects and destroys the socket. Each socket created should be closed
    * after use. The socket id is no longer valid as soon at the function is
    * called. However, the socket is guaranteed to be closed only when the
    * callback is invoked.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-close
    * @param socketId The socket identifier.
    * @param callback Called when the close operation completes.
    */
  def close(socketId: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  def close(socketId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Creates a TCP server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
    * @param callback Called when the socket has been created.
    */
  def create(
    callback: js.Function1[/* createInfo */ chromeDashAppsLib.chromeNs.socketsNs.CreateInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Creates a TCP server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
    * @param properties The socket properties.
    * @param callback   Called when the socket has been created.
    */
  def create(
    properties: SocketProperties,
    callback: js.Function1[/* createInfo */ chromeDashAppsLib.chromeNs.socketsNs.CreateInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Disconnects the listening socket, i.e. stops accepting new connections
    * and releases the address/port the socket is bound to. The socket
    * identifier remains valid, e.g. it can be used with listen to accept
    * connections on a new port and address.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-disconnect
    * @param socketId The socket identifier.
    * @param callback Called when the disconnect attempt is complete.
    */
  def disconnect(socketId: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  def disconnect(socketId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Retrieves the state of the given socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getInfo
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available.
    */
  def getInfo(
    socketId: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* socketInfo */ SocketInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getSockets
    * @param callback Called when the list of sockets is available.
    */
  def getSockets(callback: js.Function1[/* socketInfos */ js.Array[SocketInfo], scala.Unit]): scala.Unit = js.native
  /**
    * Listens for connections on the specified port and address. If the
    * port/address is in use, the callback indicates a failure.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-listen
    * @param socketId The socket identifier.
    * @param address  The address of the local machine.
    * @param port     The port of the local machine. When set to 0, a free port
    *                 is chosen dynamically. The dynamically allocated port can
    *                 be found by calling getInfo.
    * @param backlog  Length of the socket's listen queue. The default value
    *                 depends on the Operating System (SOMAXCONN), which
    *                 ensures a reasonable queue length for most applications.
    * @param callback Called when listen operation completes.
    */
  def listen(
    socketId: chromeDashAppsLib.chromeNs.integer,
    address: java.lang.String,
    port: chromeDashAppsLib.chromeNs.integer,
    backlog: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Listens for connections on the specified port and address. If the
    * port/address is in use, the callback indicates a failure.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-listen
    * @param socketId The socket identifier.
    * @param address  The address of the local machine.
    * @param port     The port of the local machine. When set to 0, a free port
    *                 is chosen dynamically. The dynamically allocated port can
    *                 be found by calling getInfo.
    * @param callback Called when listen operation completes.
    */
  def listen(
    socketId: chromeDashAppsLib.chromeNs.integer,
    address: java.lang.String,
    port: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables or disables a listening socket from accepting new connections.
    * When paused, a listening socket accepts new connections until its backlog
    * (see listen function) is full then refuses additional connection
    * requests. onAccept events are raised only when the socket is un-paused.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-setPaused
    * @param callback Callback from the setPaused method.
    */
  def setPaused(socketId: chromeDashAppsLib.chromeNs.integer, paused: scala.Boolean): scala.Unit = js.native
  def setPaused(
    socketId: chromeDashAppsLib.chromeNs.integer,
    paused: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Updates the socket properties.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-update
    * @param socketId   The socket identifier.
    * @param properties The properties to update.
    * @param callback   Called when the properties are updated.
    */
  def update(socketId: chromeDashAppsLib.chromeNs.integer, properties: SocketProperties): scala.Unit = js.native
  def update(
    socketId: chromeDashAppsLib.chromeNs.integer,
    properties: SocketProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}


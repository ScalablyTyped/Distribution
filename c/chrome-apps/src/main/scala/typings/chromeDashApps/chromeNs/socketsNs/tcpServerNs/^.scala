package typings.chromeDashApps.chromeNs.socketsNs.tcpServerNs

import typings.chromeDashApps.chromeNs.integer
import typings.chromeDashApps.chromeNs.socketsNs.AcceptErrorEventArgs
import typings.chromeDashApps.chromeNs.socketsNs.AcceptEventArgs
import typings.chromeDashApps.chromeNs.socketsNs.CreateInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.sockets.tcpServer")
@js.native
object ^ extends js.Object {
  /**
    * Event raised when a connection has been made to the server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAccept
    */
  val onAccept: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* args */ AcceptEventArgs, Unit]] = js.native
  /**
    * Event raised when a network error occured while the runtime was waiting
    * for new connections on the socket address and port. Once this event is
    * raised, the socket is set to paused and no more onAccept events are
    * raised for this socket until the socket is resumed.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAcceptError
    */
  val onAcceptError: typings.chromeDashApps.chromeNs.eventsNs.Event[js.Function1[/* args */ AcceptErrorEventArgs, Unit]] = js.native
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
  def close(socketId: integer): Unit = js.native
  def close(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Creates a TCP server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
    * @param callback Called when the socket has been created.
    */
  def create(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  /**
    * Creates a TCP server socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
    * @param properties The socket properties.
    * @param callback   Called when the socket has been created.
    */
  def create(
    properties: typings.chromeDashApps.chromeNs.socketsNs.tcpServerNs.SocketProperties,
    callback: js.Function1[/* createInfo */ CreateInfo, Unit]
  ): Unit = js.native
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
  def disconnect(socketId: integer): Unit = js.native
  def disconnect(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Retrieves the state of the given socket.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getInfo
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available.
    */
  def getInfo(
    socketId: integer,
    callback: js.Function1[
      /* socketInfo */ typings.chromeDashApps.chromeNs.socketsNs.tcpServerNs.SocketInfo, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getSockets
    * @param callback Called when the list of sockets is available.
    */
  def getSockets(
    callback: js.Function1[
      /* socketInfos */ js.Array[typings.chromeDashApps.chromeNs.socketsNs.tcpServerNs.SocketInfo], 
      Unit
    ]
  ): Unit = js.native
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
    socketId: integer,
    address: String,
    port: integer,
    backlog: integer,
    callback: js.Function1[/* result */ integer, Unit]
  ): Unit = js.native
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
    socketId: integer,
    address: String,
    port: integer,
    callback: js.Function1[/* result */ integer, Unit]
  ): Unit = js.native
  /**
    * Enables or disables a listening socket from accepting new connections.
    * When paused, a listening socket accepts new connections until its backlog
    * (see listen function) is full then refuses additional connection
    * requests. onAccept events are raised only when the socket is un-paused.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-setPaused
    * @param callback Callback from the setPaused method.
    */
  def setPaused(socketId: integer, paused: Boolean): Unit = js.native
  def setPaused(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Updates the socket properties.
    *
    * @see https://developer.chrome.com/apps/sockets_tcpServer#method-update
    * @param socketId   The socket identifier.
    * @param properties The properties to update.
    * @param callback   Called when the properties are updated.
    */
  def update(
    socketId: integer,
    properties: typings.chromeDashApps.chromeNs.socketsNs.tcpServerNs.SocketProperties
  ): Unit = js.native
  def update(
    socketId: integer,
    properties: typings.chromeDashApps.chromeNs.socketsNs.tcpServerNs.SocketProperties,
    callback: js.Function0[Unit]
  ): Unit = js.native
}


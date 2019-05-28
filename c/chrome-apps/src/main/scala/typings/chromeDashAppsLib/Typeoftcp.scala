package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftcp extends js.Object {
  /** Event raised when data has been received for a given socket. */
  val onReceive: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* args */ chromeDashAppsLib.chromeNs.socketsNs.ReceiveEventArgs, scala.Unit]
  ] = js.native
  /**
    * Event raised when a network error occured while the runtime was
    * waiting for data on the socket address and port. Once this event
    * is raised, the socket is set to paused and no more onReceive
    * events are raised for this socket.
    */
  val onReceiveError: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* args */ chromeDashAppsLib.chromeNs.socketsNs.ReceiveErrorEventArgs, scala.Unit]
  ] = js.native
  /**
    * Closes the socket and releases the address/port the socket is bound to.
    * Each socket created should be closed after use. The socket id is no longer
    * valid as soon at the function is called. However, the socket is guaranteed
    * to be closed only when the callback is invoked.
    * @param socketId The socket identifier.
    * @param [callback] Called when the close operation completes.
    */
  def close(socketId: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  def close(socketId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Connects the socket to a remote machine.
    * When the connect operation completes successfully,
    * onReceive events are raised when data is received from the peer.
    * If a network error occurs while the runtime is receiving packets,
    * a onReceiveError event is raised, at which point no more onReceive
    * event will be raised for this socket until the resume method is called.
    * @param socketId The socket identifier.
    * @param peerAddress The address of the remote machine. DNS name, IPv4 and IPv6 formats are supported.
    * @param peerPort The port of the remote machine.
    * @param callback Called when the connect attempt is complete.
    *                 The result code returned from the underlying network call.
    *                 A negative value indicates an error.
    */
  def connect(
    socketId: chromeDashAppsLib.chromeNs.integer,
    peerAddress: java.lang.String,
    peerPort: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /** Creates a TCP socket. */
  def create(
    callback: js.Function1[/* createInfo */ chromeDashAppsLib.chromeNs.socketsNs.CreateInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Creates a TCP socket.
    * @param properties The socket properties (optional).
    */
  def create(
    properties: chromeDashAppsLib.chromeNs.socketsNs.SocketProperties,
    callback: js.Function1[/* createInfo */ chromeDashAppsLib.chromeNs.socketsNs.CreateInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Disconnects the socket.
    * @param socketId The socket identifier.
    * @param [callback] Called when the disconnect attempt is complete.
    */
  def disconnect(socketId: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  def disconnect(socketId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Retrieves the state of the given socket.
    * @param socketId The socket identifier.
    * @param callback Called when the socket state is available. Provides an object containing the socket information.
    */
  def getInfo(
    socketId: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* socketInfo */ chromeDashAppsLib.chromeNs.socketsNs.SocketInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Retrieves the list of currently opened sockets owned by the application.
    * @param callback Called when the list of sockets is available. Provides an array of socket info.
    */
  def getSockets(
    callback: js.Function1[
      /* socketInfos */ js.Array[chromeDashAppsLib.chromeNs.socketsNs.SocketInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Start a TLS client connection over the connected TCP client socket.
    * @since Chrome 38.
    * @param socketId The existing, connected socket to use.
    * @param callback Called when the connection attempt is complete.
    */
  def secure(
    socketId: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Start a TLS client connection over the connected TCP client socket.
    * @since Chrome 38.
    * @param socketId The existing, connected socket to use.
    * @param [options] Constraints and parameters for the TLS connection.
    * @param callback Called when the connection attempt is complete.
    */
  def secure(
    socketId: chromeDashAppsLib.chromeNs.integer,
    options: chromeDashAppsLib.chromeNs.socketsNs.tcpNs.SecureOptions,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Sends data on the given TCP socket.
    * @param socketId The socket identifier.
    * @param data The data to send.
    * @param callback Called when the send operation completes.
    */
  def send(
    socketId: chromeDashAppsLib.chromeNs.integer,
    data: stdLib.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ chromeDashAppsLib.chromeNs.socketsNs.SendInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Enables or disables the keep-alive functionality for a TCP connection.
    * @param socketId The socket identifier.
    * @param enable If true, enable keep-alive functionality.
    * @param callback Provides the result code returned from the underlying network call. A negative value indicates an error.
    */
  def setKeepAlive(
    socketId: chromeDashAppsLib.chromeNs.integer,
    enable: scala.Boolean,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @description Enables or disables the keep-alive functionality for a TCP connection.
    * @param socketId The socket identifier.
    * @param enable If true, enable keep-alive functionality.
    * @param [delay] Set the delay seconds between the last data packet received and the first keepalive probe. Default is 0.
    * @param callback Provides the result code returned from the underlying network call. A negative value indicates an error.
    */
  def setKeepAlive(
    socketId: chromeDashAppsLib.chromeNs.integer,
    enable: scala.Boolean,
    delay: chromeDashAppsLib.chromeNs.integer,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets or clears TCP_NODELAY for a TCP connection.
    * Nagle's algorithm will be disabled when TCP_NODELAY is set.
    * @param socketId The socket identifier.
    * @param noDelay If true, disables Nagle's algorithm.
    * @param callback Called when the setNoDelay attempt is complete. Provides the result code returned
    *                 from the underlying network call. A negative value indicates an error.
    */
  def setNoDelay(
    socketId: chromeDashAppsLib.chromeNs.integer,
    noDelay: scala.Boolean,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.integer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables or disables the application from receiving messages from its peer.
    * The default value is 'false'. Pausing a socket is typically used by an
    * application to throttle data sent by its peer. When a socket is paused,
    * no onReceive event is raised. When a socket is connected and un-paused,
    * onReceive events are raised again when messages are received.
    */
  def setPaused(socketId: chromeDashAppsLib.chromeNs.integer, paused: scala.Boolean): scala.Unit = js.native
  def setPaused(
    socketId: chromeDashAppsLib.chromeNs.integer,
    paused: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Updates the socket properties. */
  def update(
    socketId: chromeDashAppsLib.chromeNs.integer,
    properties: chromeDashAppsLib.chromeNs.socketsNs.SocketProperties
  ): scala.Unit = js.native
  def update(
    socketId: chromeDashAppsLib.chromeNs.integer,
    properties: chromeDashAppsLib.chromeNs.socketsNs.SocketProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}


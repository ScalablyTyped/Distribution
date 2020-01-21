package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the chrome.sockets.udp API to send and receive data over the network
  * using UDP connections. This API supersedes the UDP functionality previously
  * found in the 'socket' API.
  * @requires Manifest: 'sockets': {...}
  * @since Chrome 33
  * @see https://developer.chrome.com/apps/sockets_udp
  */
@JSGlobal("chrome.sockets.udp")
@js.native
object udp extends js.Object {
  /**
    * Event raised when a UDP packet has been received for the given socket.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#event-onReceive
    */
  val onReceive: Event[js.Function1[/* args */ ReceiveEventArgs, Unit]] = js.native
  /**
    * Event raised when a network error occured while the runtime was waiting
    * for data on the socket address and port. Once this event is raised, the
    * socket is paused and no more onReceive events will be raised for this
    * socket until the socket is resumed.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#event-onReceiveError
    */
  val onReceiveError: Event[js.Function1[/* args */ ReceiveErrorEventArgs, Unit]] = js.native
  /**
    * Binds the local address and port for the socket. For a client socket, it
    * is recommended to use port 0 to let the platform pick a free port.
    *
    * Once the bind operation completes successfully, onReceive events are
    * raised when UDP packets arrive on the address/port specified -- unless
    * the socket is paused.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-bind
    * @param socketId The socket ID.
    * @param address  The address of the local machine. DNS name, IPv4 and IPv6
    *                 formats are supported. Use '0.0.0.0' to accept packets
    *                 from all local available network interfaces.
    * @param port     The port of the local machine. Use '0' to bind to a free
    *                 port.
    * @param callback Called when the bind operation completes.
    */
  def bind(
    socketId: integer,
    address: String,
    port: integer,
    callback: js.Function1[/* result */ integer, Unit]
  ): Unit = js.native
  /**
    * Closes the socket and releases the address/port the socket is bound to.
    * Each socket created should be closed after use. The socket id is no
    * longer valid as soon at the function is called. However, the socket is
    * guaranteed to be closed only when the callback is invoked.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-close
    * @param socketId The socket ID.
    * @param callback Called when the close operation completes.
    */
  def close(socketId: integer): Unit = js.native
  def close(socketId: integer, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Creates a UDP socket with default properties.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-create
    * @param createInfo.socketId The ID of the newly created socket.
    */
  def create(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  /**
    * Creates a UDP socket with the given properties.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-create
    * @param properties          The socket properties.
    * @param createInfo.socketId The ID of the newly created socket.
    */
  def create(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = js.native
  /**
    * Retrieves the state of the given socket.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-getInfo
    * @param socketId The socket ID.
    * @param callback Called when the socket state is available.
    */
  def getInfo(socketId: integer, callback: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = js.native
  /**
    * Gets the multicast group addresses the socket is currently joined to.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-getJoinedGroups
    * @param socketId The socket ID.
    * @param callback Called with an array of strings of the result.
    */
  def getJoinedGroups(socketId: integer, callback: js.Function1[/* groups */ js.Array[String], Unit]): Unit = js.native
  /**
    * Retrieves the list of currently opened sockets owned by the application.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-getSockets
    * @param callback Called when the list of sockets is available.
    */
  def getSockets(callback: js.Function1[/* socketInfos */ js.Array[SocketInfo], Unit]): Unit = js.native
  /**
    * Joins the multicast group and starts to receive packets from that group.
    * The socket must be bound to a local port before calling this method.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-joinGroup
    * @param socketId The socket ID.
    * @param address  The group address to join. Domain names are not supported.
    * @param callback Called when the joinGroup operation completes.
    */
  def joinGroup(socketId: integer, address: String, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
  /**
    * Leaves the multicast group previously joined using joinGroup. This is
    * only necessary to call if you plan to keep using the socket afterwards,
    * since it will be done automatically by the OS when the socket is closed.
    *
    * Leaving the group will prevent the router from sending multicast
    * datagrams to the local host, presuming no other process on the host is
    * still joined to the group.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-leaveGroup
    * @param socketId The socket ID.
    * @param address  The group address to leave. Domain names are not
    *                 supported.
    * @param callback Called when the leaveGroup operation completes.
    */
  def leaveGroup(socketId: integer, address: String, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
  /**
    * Sends data on the given socket to the given address and port. The socket
    * must be bound to a local port before calling this method.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-send
    * @param socketId The socket ID.
    * @param data     The data to send.
    * @param address  The address of the remote machine.
    * @param port     The port of the remote machine.
    * @param callback Called when the send operation completes.
    */
  def send(
    socketId: integer,
    data: ArrayBuffer,
    address: String,
    port: integer,
    callback: js.Function1[/* sendInfo */ SendInfo, Unit]
  ): Unit = js.native
  /**
    * Enables or disables broadcast packets on this socket.
    *
    * @since Chrome 44
    * @see https://developer.chrome.com/apps/sockets_udp#method-setBroadcast
    * @param socketId The socket ID.
    * @param enabled  true to enable broadcast packets, false to disable them.
    * @param callback Callback from the setBroadcast method.
    */
  def setBroadcast(socketId: integer, enabled: Boolean): Unit = js.native
  def setBroadcast(socketId: integer, enabled: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
  /**
    * Sets whether multicast packets sent from the host to the multicast group
    * will be looped back to the host.
    *
    * Note: the behavior of setMulticastLoopbackMode is slightly different
    * between Windows and Unix-like systems. The inconsistency happens only
    * when there is more than one application on the same host joined to the
    * same multicast group while having different settings on multicast
    * loopback mode. On Windows, the applications with loopback off will not
    * receive the loopback packets; while on Unix-like systems, the
    * applications with loopback off will not SEND the loopback packets to
    * other applications on the same host.
    * @see[MSDN]{@link http://goo.gl/6vqbj}
    *
    * Calling this method does not require multicast permissions.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-setMulticastLoopbackMode
    * @param socketId The socket ID.
    * @param enabled  Indicate whether to enable loopback mode.
    * @param callback Called when the configuration operation completes.
    */
  def setMulticastLoopbackMode(socketId: integer, enabled: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
  /**
    * Sets the time-to-live of multicast packets sent to the multicast group.
    *
    * Calling this method does not require multicast permissions.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-setMulticastTimeToLive
    * @param socketId The socket ID.
    * @param ttl      The time-to-live value.
    * @param callback Called when the configuration operation completes.
    */
  def setMulticastTimeToLive(socketId: integer, ttl: integer, callback: js.Function1[/* result */ integer, Unit]): Unit = js.native
  /**
    * Pauses or unpauses a socket. A paused socket is blocked from firing
    * onReceive events.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-setPaused
    * @param socketId The socket ID.
    * @param paused   Flag to indicate whether to pause or unpause.
    * @param callback Called when the socket has been successfully paused or
    *                 unpaused.
    */
  def setPaused(socketId: integer, paused: Boolean): Unit = js.native
  def setPaused(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Updates the socket properties.
    *
    * @see https://developer.chrome.com/apps/sockets_udp#method-update
    * @param socketId   The socket ID.
    * @param properties The properties to update.
    * @param callback   Called when the properties are updated.
    */
  def update(socketId: integer, properties: SocketProperties): Unit = js.native
  def update(socketId: integer, properties: SocketProperties, callback: js.Function0[Unit]): Unit = js.native
}


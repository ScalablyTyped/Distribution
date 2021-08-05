package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.sockets.AcceptErrorEventArgs
import typings.chromeApps.chrome.sockets.AcceptEventArgs
import typings.chromeApps.chrome.sockets.CreateInfo
import typings.chromeApps.chrome.sockets.ReceiveErrorEventArgs
import typings.chromeApps.chrome.sockets.ReceiveEventArgs
import typings.chromeApps.chrome.sockets.SendInfo
import typings.chromeApps.chrome.sockets.SocketInfo
import typings.chromeApps.chrome.sockets.SocketProperties
import typings.chromeApps.chrome.sockets.tcp.SecureOptions
import typings.std.ArrayBuffer
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
  
  /**
    * Use the chrome.sockets.tcp API to send and receive data over the network using TCP connections.
    * This API supersedes the TCP functionality previously found in the chrome.socket API.
    * @since Chrome 33.
    * @requires Manifest: 'Sockets': {...}
    */
  object tcp {
    
    @JSGlobal("chrome.sockets.tcp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Closes the socket and releases the address/port the socket is bound to.
      * Each socket created should be closed after use. The socket id is no longer
      * valid as soon at the function is called. However, the socket is guaranteed
      * to be closed only when the callback is invoked.
      * @param socketId The socket identifier.
      * @param [callback] Called when the close operation completes.
      */
    inline def close(socketId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def close(socketId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def connect(
      socketId: integer,
      peerAddress: String,
      peerPort: integer,
      callback: js.Function1[/* result */ integer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(socketId.asInstanceOf[js.Any], peerAddress.asInstanceOf[js.Any], peerPort.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Creates a TCP socket. */
    inline def create(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      * Creates a TCP socket.
      * @param properties The socket properties (optional).
      */
    inline def create(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Disconnects the socket.
      * @param socketId The socket identifier.
      * @param [callback] Called when the disconnect attempt is complete.
      */
    inline def disconnect(socketId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def disconnect(socketId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Retrieves the state of the given socket.
      * @param socketId The socket identifier.
      * @param callback Called when the socket state is available. Provides an object containing the socket information.
      */
    inline def getInfo(socketId: integer, callback: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Retrieves the list of currently opened sockets owned by the application.
      * @param callback Called when the list of sockets is available. Provides an array of socket info.
      */
    inline def getSockets(callback: js.Function1[/* socketInfos */ js.Array[SocketInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSockets")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Event raised when data has been received for a given socket. */
    @JSGlobal("chrome.sockets.tcp.onReceive")
    @js.native
    val onReceive: typings.chromeApps.chrome.events.Event[js.Function1[/* args */ ReceiveEventArgs, Unit]] = js.native
    
    /**
      * Event raised when a network error occured while the runtime was
      * waiting for data on the socket address and port. Once this event
      * is raised, the socket is set to paused and no more onReceive
      * events are raised for this socket.
      */
    @JSGlobal("chrome.sockets.tcp.onReceiveError")
    @js.native
    val onReceiveError: typings.chromeApps.chrome.events.Event[js.Function1[/* args */ ReceiveErrorEventArgs, Unit]] = js.native
    
    /**
      * Start a TLS client connection over the connected TCP client socket.
      * @since Chrome 38.
      * @param socketId The existing, connected socket to use.
      * @param callback Called when the connection attempt is complete.
      */
    inline def secure(socketId: integer, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("secure")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Start a TLS client connection over the connected TCP client socket.
      * @since Chrome 38.
      * @param socketId The existing, connected socket to use.
      * @param [options] Constraints and parameters for the TLS connection.
      * @param callback Called when the connection attempt is complete.
      */
    inline def secure(socketId: integer, options: SecureOptions, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("secure")(socketId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Sends data on the given TCP socket.
      * @param socketId The socket identifier.
      * @param data The data to send.
      * @param callback Called when the send operation completes.
      */
    inline def send(socketId: integer, data: ArrayBuffer, callback: js.Function1[/* sendInfo */ SendInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @description Enables or disables the keep-alive functionality for a TCP connection.
      * @param socketId The socket identifier.
      * @param enable If true, enable keep-alive functionality.
      * @param callback Provides the result code returned from the underlying network call. A negative value indicates an error.
      */
    inline def setKeepAlive(socketId: integer, enable: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAlive")(socketId.asInstanceOf[js.Any], enable.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * @description Enables or disables the keep-alive functionality for a TCP connection.
      * @param socketId The socket identifier.
      * @param enable If true, enable keep-alive functionality.
      * @param [delay] Set the delay seconds between the last data packet received and the first keepalive probe. Default is 0.
      * @param callback Provides the result code returned from the underlying network call. A negative value indicates an error.
      */
    inline def setKeepAlive(
      socketId: integer,
      enable: Boolean,
      delay: integer,
      callback: js.Function1[/* result */ integer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setKeepAlive")(socketId.asInstanceOf[js.Any], enable.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets or clears TCP_NODELAY for a TCP connection.
      * Nagle's algorithm will be disabled when TCP_NODELAY is set.
      * @param socketId The socket identifier.
      * @param noDelay If true, disables Nagle's algorithm.
      * @param callback Called when the setNoDelay attempt is complete. Provides the result code returned
      *                 from the underlying network call. A negative value indicates an error.
      */
    inline def setNoDelay(socketId: integer, noDelay: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setNoDelay")(socketId.asInstanceOf[js.Any], noDelay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Enables or disables the application from receiving messages from its peer.
      * The default value is 'false'. Pausing a socket is typically used by an
      * application to throttle data sent by its peer. When a socket is paused,
      * no onReceive event is raised. When a socket is connected and un-paused,
      * onReceive events are raised again when messages are received.
      */
    inline def setPaused(socketId: integer, paused: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPaused(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Updates the socket properties. */
    inline def update(socketId: integer, properties: SocketProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def update(socketId: integer, properties: SocketProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    
    @JSGlobal("chrome.sockets.tcpServer")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def close(socketId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def close(socketId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a TCP server socket.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
      * @param callback Called when the socket has been created.
      */
    inline def create(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      * Creates a TCP server socket.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#method-create
      * @param properties The socket properties.
      * @param callback   Called when the socket has been created.
      */
    inline def create(
      properties: typings.chromeApps.chrome.sockets.tcpServer.SocketProperties,
      callback: js.Function1[/* createInfo */ CreateInfo, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def disconnect(socketId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def disconnect(socketId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Retrieves the state of the given socket.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getInfo
      * @param socketId The socket identifier.
      * @param callback Called when the socket state is available.
      */
    inline def getInfo(
      socketId: integer,
      callback: js.Function1[/* socketInfo */ typings.chromeApps.chrome.sockets.tcpServer.SocketInfo, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Retrieves the list of currently opened sockets owned by the application.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#method-getSockets
      * @param callback Called when the list of sockets is available.
      */
    inline def getSockets(
      callback: js.Function1[
          /* socketInfos */ js.Array[typings.chromeApps.chrome.sockets.tcpServer.SocketInfo], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSockets")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def listen(
      socketId: integer,
      address: String,
      port: integer,
      backlog: integer,
      callback: js.Function1[/* result */ integer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], backlog.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    inline def listen(
      socketId: integer,
      address: String,
      port: integer,
      callback: js.Function1[/* result */ integer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Event raised when a connection has been made to the server socket.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAccept
      */
    @JSGlobal("chrome.sockets.tcpServer.onAccept")
    @js.native
    val onAccept: typings.chromeApps.chrome.events.Event[js.Function1[/* args */ AcceptEventArgs, Unit]] = js.native
    
    /**
      * Event raised when a network error occured while the runtime was waiting
      * for new connections on the socket address and port. Once this event is
      * raised, the socket is set to paused and no more onAccept events are
      * raised for this socket until the socket is resumed.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#event-onAcceptError
      */
    @JSGlobal("chrome.sockets.tcpServer.onAcceptError")
    @js.native
    val onAcceptError: typings.chromeApps.chrome.events.Event[js.Function1[/* args */ AcceptErrorEventArgs, Unit]] = js.native
    
    /**
      * Enables or disables a listening socket from accepting new connections.
      * When paused, a listening socket accepts new connections until its backlog
      * (see listen function) is full then refuses additional connection
      * requests. onAccept events are raised only when the socket is un-paused.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#method-setPaused
      * @param callback Callback from the setPaused method.
      */
    inline def setPaused(socketId: integer, paused: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPaused(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Updates the socket properties.
      *
      * @see https://developer.chrome.com/apps/sockets_tcpServer#method-update
      * @param socketId   The socket identifier.
      * @param properties The properties to update.
      * @param callback   Called when the properties are updated.
      */
    inline def update(socketId: integer, properties: typings.chromeApps.chrome.sockets.tcpServer.SocketProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def update(
      socketId: integer,
      properties: typings.chromeApps.chrome.sockets.tcpServer.SocketProperties,
      callback: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Use the chrome.sockets.udp API to send and receive data over the network
    * using UDP connections. This API supersedes the UDP functionality previously
    * found in the 'socket' API.
    * @requires Manifest: 'sockets': {...}
    * @since Chrome 33
    * @see https://developer.chrome.com/apps/sockets_udp
    */
  object udp {
    
    @JSGlobal("chrome.sockets.udp")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def bind(
      socketId: integer,
      address: String,
      port: integer,
      callback: js.Function1[/* result */ integer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def close(socketId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(socketId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def close(socketId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a UDP socket with default properties.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#method-create
      * @param createInfo.socketId The ID of the newly created socket.
      */
    inline def create(callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      * Creates a UDP socket with the given properties.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#method-create
      * @param properties          The socket properties.
      * @param createInfo.socketId The ID of the newly created socket.
      */
    inline def create(properties: SocketProperties, callback: js.Function1[/* createInfo */ CreateInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Retrieves the state of the given socket.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#method-getInfo
      * @param socketId The socket ID.
      * @param callback Called when the socket state is available.
      */
    inline def getInfo(socketId: integer, callback: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets the multicast group addresses the socket is currently joined to.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#method-getJoinedGroups
      * @param socketId The socket ID.
      * @param callback Called with an array of strings of the result.
      */
    inline def getJoinedGroups(socketId: integer, callback: js.Function1[/* groups */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getJoinedGroups")(socketId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Retrieves the list of currently opened sockets owned by the application.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#method-getSockets
      * @param callback Called when the list of sockets is available.
      */
    inline def getSockets(callback: js.Function1[/* socketInfos */ js.Array[SocketInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSockets")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Joins the multicast group and starts to receive packets from that group.
      * The socket must be bound to a local port before calling this method.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#method-joinGroup
      * @param socketId The socket ID.
      * @param address  The group address to join. Domain names are not supported.
      * @param callback Called when the joinGroup operation completes.
      */
    inline def joinGroup(socketId: integer, address: String, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("joinGroup")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def leaveGroup(socketId: integer, address: String, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("leaveGroup")(socketId.asInstanceOf[js.Any], address.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Event raised when a UDP packet has been received for the given socket.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#event-onReceive
      */
    @JSGlobal("chrome.sockets.udp.onReceive")
    @js.native
    val onReceive: typings.chromeApps.chrome.events.Event[js.Function1[/* args */ ReceiveEventArgs, Unit]] = js.native
    
    /**
      * Event raised when a network error occured while the runtime was waiting
      * for data on the socket address and port. Once this event is raised, the
      * socket is paused and no more onReceive events will be raised for this
      * socket until the socket is resumed.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#event-onReceiveError
      */
    @JSGlobal("chrome.sockets.udp.onReceiveError")
    @js.native
    val onReceiveError: typings.chromeApps.chrome.events.Event[js.Function1[/* args */ ReceiveErrorEventArgs, Unit]] = js.native
    
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
    inline def send(
      socketId: integer,
      data: ArrayBuffer,
      address: String,
      port: integer,
      callback: js.Function1[/* sendInfo */ SendInfo, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(socketId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Enables or disables broadcast packets on this socket.
      *
      * @since Chrome 44
      * @see https://developer.chrome.com/apps/sockets_udp#method-setBroadcast
      * @param socketId The socket ID.
      * @param enabled  true to enable broadcast packets, false to disable them.
      * @param callback Callback from the setBroadcast method.
      */
    inline def setBroadcast(socketId: integer, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBroadcast")(socketId.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setBroadcast(socketId: integer, enabled: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBroadcast")(socketId.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def setMulticastLoopbackMode(socketId: integer, enabled: Boolean, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMulticastLoopbackMode")(socketId.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def setMulticastTimeToLive(socketId: integer, ttl: integer, callback: js.Function1[/* result */ integer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMulticastTimeToLive")(socketId.asInstanceOf[js.Any], ttl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def setPaused(socketId: integer, paused: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPaused(socketId: integer, paused: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPaused")(socketId.asInstanceOf[js.Any], paused.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Updates the socket properties.
      *
      * @see https://developer.chrome.com/apps/sockets_udp#method-update
      * @param socketId   The socket ID.
      * @param properties The properties to update.
      * @param callback   Called when the properties are updated.
      */
    inline def update(socketId: integer, properties: SocketProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def update(socketId: integer, properties: SocketProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(socketId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}

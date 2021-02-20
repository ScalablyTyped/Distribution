package typings.cometd

import typings.cometd.anon.Hosts
import typings.cometd.cometdBooleans.`false`
import typings.cometd.cometdBooleans.`true`
import typings.cometd.cometdStrings.debug
import typings.cometd.cometdStrings.error
import typings.cometd.cometdStrings.info
import typings.cometd.cometdStrings.warn
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cometd", "CometD")
  @js.native
  class CometD () extends StObject {
    def this(options: Configuration) = this()
    
    /**
      * Adds a listener for Bayeux messages, performing the given callback in the given scope when a
      * message for the given channel arrives.
      *
      * - Must be used to listen to meta channel messages.
      * - May be used to listen to service channel messages.
      * - Should not be used to listen broadcast channel messages (use `subscribe` instead).
      * - Does not involve any communication with the Bayeux server, and as such can be called before
      *   calling `handshake`.
      * - Is synchronous: when it returns, you are guaranteed that the listener has been added.
      *
      * @param channel the channel the listener is interested to
      * @param callback the callback to call when a message is sent to the channel
      * @returns the subscription handle to be passed to `removeListener`
      */
    def addListener(channel: String, callback: Listener): SubscriptionHandle = js.native
    
    /**
      * Executes the given callback in the given scope, surrounded by a `startBatch` and `endBatch`
      * calls.
      *
      * @param callback the callback to be executed within `startBatch` and `endBatch` calls
      */
    def batch(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Removes all listeners registered with `addListener` or `subscribe`.
      */
    def clearListeners(): Unit = js.native
    
    /**
      * Removes all subscriptions added via `subscribe`, but does not remove the listeners added via
      * `addListener`.
      */
    def clearSubscriptions(): Unit = js.native
    
    /**
      * Configures the initial Bayeux communication with the Bayeux server.
      *
      * @param configuration the URL of the Bayeux server, or a configuration object that must
      * contain a mandatory field `url`
      */
    def configure(config: String): Unit = js.native
    def configure(config: Configuration): Unit = js.native
    
    /**
      * Disconnects from the Bayeux server.
      *
      * @param disconnectCallback a function to be invoked when the disconnect is acknowledged
      */
    def disconnect(disconnectCallback: Listener): Unit = js.native
    /**
      * Disconnects from the Bayeux server.
      *
      * @param disconnectProps an object to be merged with the disconnect message
      * @param disconnectCallback a function to be invoked when the disconnect is acknowledged
      */
    def disconnect(disconnectProps: js.Object, disconnectCallback: Listener): Unit = js.native
    
    /**
      * Marks the end of a batch of application messages to be sent to the server in a single
      * request.
      */
    def endBatch(): Unit = js.native
    
    /**
      * Returns the backoff period used to increase the backoff time when retrying an unsuccessful or
      * failed message.
      *
      * @returns the backoff increment
      */
    def getBackoffIncrement(): Unit = js.native
    
    /**
      * Returns the backoff period to wait before retrying an unsuccessful or failed message.
      *
      * @returns the backoff period
      */
    def getBackoffPeriod(): Unit = js.native
    
    /**
      * Returns the client ID assigned by the Bayeux server during handshake.
      *
      * @return the client ID assigned by the Bayeux server
      */
    def getClientId(): String = js.native
    
    /**
      * Returns the configuration for this CometD object.
      *
      * @return the configuration for this CometD object
      */
    def getConfiguration(): Configuration = js.native
    
    /**
      * Find the extension registered with the given name.
      *
      * @param name the name of the extension to find
      * @return the extension found or null if no extension with the given name has been registered
      */
    def getExtension(name: String): Extension = js.native
    
    /**
      * Returns the name assigned to this CometD object, or the string 'default' if no name has been
      * explicitly passed as parameter to the constructor.
      *
      * @return the name assigned to this CometD object, or `'default'`
      */
    def getName(): String = js.native
    
    /**
      * Returns a string representing the status of the Bayeux communication with the Bayeux server.
      *
      * @return the status of the Bayeux communication
      */
    def getStatus(): Status = js.native
    
    /**
      * Gets all registered transport types.
      *
      * @return an array of all registered transport types
      */
    def getTransportTypes(): js.Array[String] = js.native
    
    /**
      * Returns the URL of the Bayeux server.
      *
      * @return the URL of the Bayeux server
      */
    def getURL(): String = js.native
    
    /**
      * Establishes the Bayeux communication with the Bayeux server via a handshake and a subsequent
      * connect.
      *
      * @param handshakeCallback a function to be invoked when the handshake is acknowledged
      */
    def handshake(handshakeCallback: HandshakeListener): Unit = js.native
    /**
      * Establishes the Bayeux communication with the Bayeux server via a handshake and a subsequent
      * connect.
      *
      * @param handshakeProps an object to be merged with the handshake message
      * @param handshakeCallback a function to be invoked when the handshake is acknowledged
      */
    def handshake(handshakeProps: js.Object, handshakeCallback: HandshakeListener): Unit = js.native
    
    /**
      * Increases the backoff period up to the maximum value configured.
      *
      * @returns the backoff period after increment
      */
    def increaseBackoffPeriod(): Double = js.native
    
    /**
      * Configures and establishes the Bayeux communication with the Bayeux server via a handshake
      * and a subsequent connect.
      *
      * @param configuration the configuration object
      * @param handshakeProps an object to be merged with the handshake message
      */
    def init(configuration: String): Unit = js.native
    def init(configuration: String, handshakeProps: js.Object): Unit = js.native
    def init(configuration: Configuration): Unit = js.native
    def init(configuration: Configuration, handshakeProps: js.Object): Unit = js.native
    
    /**
      * Returns true if this instance is disconnected or disconnecting.
      *
      * @return whether this instance disconnected or disconnecting.
      */
    def isDisconnected(): Boolean = js.native
    
    /**
      * Handler invoked every time a listener or subscriber throws an exception.
      *
      * @param exception the exception thrown
      * @param subscriptionHandle the listener or subscription that threw the exception
      * @param isListener whether it was a listener
      * @param message the message received from the Bayeux server
      */
    def onListenerException(exception: js.Any, subscriptionHandle: SubscriptionHandle, isListener: Boolean, message: String): Unit = js.native
    
    /**
      * Publishes a message on the given channel, containing the given content.
      *
      * @param channel the channel to publish the message to
      * @param content the content of the message
      * @param publishCallback a function to be invoked when the publish is acknowledged by the
      * server
      */
    def publish(channel: String, content: js.Object): Unit = js.native
    def publish(channel: String, content: js.Object, publishCallback: Listener): Unit = js.native
    /**
      * Publishes a message on the given channel, containing the given content.
      *
      * @param channel the channel to publish the message to
      * @param content the content of the message
      * @param publishProps an object to be merged with the publish message
      * @param publishCallback a function to be invoked when the publish is acknowledged by the
      * server
      */
    def publish(channel: String, content: js.Object, publishProps: js.Object): Unit = js.native
    def publish(channel: String, content: js.Object, publishProps: js.Object, publishCallback: Listener): Unit = js.native
    
    /**
      * Publishes a message with binary data on the given channel.
      *
      * The binary data chunk may be an `ArrayBuffer`, a `DataView`, a `TypedArray` (such as
      * `Uint8Array`) or a plain integer array.
      *
      * The meta data object may contain additional application data such as a file name, a mime
      * type, etc.
      *
      * @param channel the channel to publish the message to
      * @param data the binary data to publish
      * @param last whether the binary data chunk is the last
      * @param meta an object containing meta data associated to the binary chunk
      * @param callback a function to be invoked when the publish is acknowledged by the server
      */
    def publishBinary(channel: String, data: ArrayBuffer, last: Boolean): Unit = js.native
    def publishBinary(
      channel: String,
      data: ArrayBuffer,
      last: Boolean,
      meta: js.UndefOr[scala.Nothing],
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: ArrayBuffer, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(channel: String, data: ArrayBuffer, last: Boolean, meta: js.Object, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: DataView, last: Boolean): Unit = js.native
    def publishBinary(
      channel: String,
      data: DataView,
      last: Boolean,
      meta: js.UndefOr[scala.Nothing],
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: DataView, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(channel: String, data: DataView, last: Boolean, meta: js.Object, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: Uint16Array, last: Boolean): Unit = js.native
    def publishBinary(
      channel: String,
      data: Uint16Array,
      last: Boolean,
      meta: js.UndefOr[scala.Nothing],
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: Uint16Array, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(channel: String, data: Uint16Array, last: Boolean, meta: js.Object, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: Uint32Array, last: Boolean): Unit = js.native
    def publishBinary(
      channel: String,
      data: Uint32Array,
      last: Boolean,
      meta: js.UndefOr[scala.Nothing],
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: Uint32Array, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(channel: String, data: Uint32Array, last: Boolean, meta: js.Object, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: Uint8Array, last: Boolean): Unit = js.native
    def publishBinary(
      channel: String,
      data: Uint8Array,
      last: Boolean,
      meta: js.UndefOr[scala.Nothing],
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: Uint8Array, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(channel: String, data: Uint8Array, last: Boolean, meta: js.Object, callback: Listener): Unit = js.native
    
    /**
      * Registers an extension whose callbacks are called for every incoming message (that comes from
      * the server to this client implementation) and for every outgoing message (that originates
      * from this client implementation for the server).
      *
      * The format of the extension object is the following:
      *
      *     {
      *       incoming: (message) => { ... },
      *       outgoing: (message) => { ... }
      *     }
      *
      * Both properties are optional, but if they are present they will be called respectively for
      * each incoming message and for each outgoing message.
      *
      * @param name the name of the extension
      * @param extension the extension to register
      * @return true if the extension was registered, false otherwise
      */
    def registerExtension(name: String, extension: Extension): Boolean = js.native
    
    /**
      * Registers the given transport under the given transport type.
      *
      * The optional index parameter specifies the priority at which the transport is registered
      * (where `0` is the max priority).
      *
      * If a transport with the same type is already registered, this function does nothing and
      * returns `false`.
      *
      * @param type the transport type
      * @param transport the transport object
      * @param index the index at which this transport is to be registered
      * @return true if the transport has been registered, false otherwise
      */
    def registerTransport(`type`: String, transport: js.Object): Boolean = js.native
    def registerTransport(`type`: String, transport: js.Object, index: Double): Boolean = js.native
    
    /**
      * Removes the subscription obtained with a call to `addListener`.
      *
      * @param subscription the subscription to unsubscribe.
      */
    def removeListener(subscription: SubscriptionHandle): Unit = js.native
    
    /**
      * Resets the backoff period to zero.
      */
    def resetBackoffPeriod(): Unit = js.native
    
    /**
      * Resubscribes as necessary in case of a re-handshake.
      */
    def resubscribe(subscription: SubscriptionHandle): SubscriptionHandle = js.native
    def resubscribe(subscription: SubscriptionHandle, subscribeProps: js.Object): SubscriptionHandle = js.native
    
    /**
      * Sets the backoff period used to increase the backoff time when retrying an unsuccessful or
      * failed message.
      *
      * Default value is 1 second, which means if there is a persistent failure the retries will
      * happen after 1 second, then after 2 seconds, then after 3 seconds, etc. So for example with
      * 15 seconds of elapsed time, there will be 5 retries (at 1, 3, 6, 10 and 15 seconds elapsed).
      *
      * @param period the backoff period to set
      */
    def setBackoffIncrement(period: Double): Unit = js.native
    
    @JSName("setLogLevel")
    def setLogLevel_debug(level: debug): Unit = js.native
    /**
      * Sets the log level for console logging.
      *
      * @param level the log level string
      */
    @JSName("setLogLevel")
    def setLogLevel_error(level: error): Unit = js.native
    @JSName("setLogLevel")
    def setLogLevel_info(level: info): Unit = js.native
    @JSName("setLogLevel")
    def setLogLevel_warn(level: warn): Unit = js.native
    
    /**
      * Marks the start of a batch of application messages to be sent to the server in a single
      * request, obtaining a single response containing (possibly) many application reply messages.
      *
      * Messages are held in a queue and not sent until `endBatch` is called. If `startBatch` is
      * called multiple times, then an equal number of `endBatch` calls must be made to close and
      * send the batch of messages.
      */
    def startBatch(): Unit = js.native
    
    /**
      * Subscribes to the given channel, performing the given callback in the given scope when a
      * message for the channel arrives.
      *
      * - Must not be used to listen to meta channels messages (if attempted, the server returns an
      *   error).
      * - May be used to listen to service channel messages.
      * - Should be used to listen to broadcast channel messages.
      * - Involves a communication with the Bayeux server and as such cannot be called before calling
      *   `handshake`.
      * - Is asynchronous: it returns immediately, well before the Bayeux server has received the
      *   subscription request.
      *
      * @param channel the channel to subscribe to
      * @param callback the callback to call when a message is sent to the channel
      * @param subscribeCallback a function to be invoked when the subscription is acknowledged
      * @return the subscription handle to be passed to `unsubscribe`
      */
    def subscribe(channel: String, callback: Callback): SubscriptionHandle = js.native
    def subscribe(channel: String, callback: Callback, subscribeCallback: SubscribeListener): SubscriptionHandle = js.native
    /**
      * Subscribes to the given channel, performing the given callback in the given scope when a
      * message for the channel arrives.
      *
      * - Must not be used to listen to meta channels messages (if attempted, the server returns an
      *   error).
      * - May be used to listen to service channel messages.
      * - Should be used to listen to broadcast channel messages.
      * - Involves a communication with the Bayeux server and as such cannot be called before calling
      *   `handshake`.
      * - Is asynchronous: it returns immediately, well before the Bayeux server has received the
      *   subscription request.
      *
      * @param channel the channel to subscribe to
      * @param callback the callback to call when a message is sent to the channel
      * @param subscribeProps an object to be merged with the subscribe message
      * @param subscribeCallback a function to be invoked when the subscription is acknowledged
      * @return the subscription handle to be passed to `unsubscribe`
      */
    def subscribe(channel: String, callback: Callback, subscribeProps: js.Object): SubscriptionHandle = js.native
    def subscribe(
      channel: String,
      callback: Callback,
      subscribeProps: js.Object,
      subscribeCallback: SubscribeListener
    ): SubscriptionHandle = js.native
    
    /**
      * Unregister an extension previously registered with `registerExtension`.
      *
      * @param name the name of the extension to unregister.
      * @return true if the extension was unregistered, false otherwise
      */
    def unregisterExtension(name: String): Boolean = js.native
    
    /**
      * Unregisters the transport with the given transport type.
      *
      * @param type the transport type to unregister
      * @return the transport that has been unregistered, or null if no transport was previously
      * registered under the given transport type
      */
    def unregisterTransport(`type`: String): Unit = js.native
    
    /**
      * Unregisters all transports.
      */
    def unregisterTransports(): Unit = js.native
    
    /**
      * Unsubscribes the subscription obtained with a call to `subscribe`.
      *
      * @param subscription the subscription to unsubscribe.
      * @param unsubscribeCallback a function to be invoked when the unsubscription is acknowledged
      */
    def unsubscribe(subscription: SubscriptionHandle): Unit = js.native
    def unsubscribe(subscription: SubscriptionHandle, unsubscribeCallback: SubscribeListener): Unit = js.native
    /**
      * Unsubscribes the subscription obtained with a call to `subscribe`.
      *
      * @param subscription the subscription to unsubscribe.
      * @param unsubscribeProps an object to be merged with the unsubscribe message
      * @param unsubscribeCallback a function to be invoked when the unsubscription is acknowledged
      */
    def unsubscribe(subscription: SubscriptionHandle, unsubscribeProps: js.Object): Unit = js.native
    def unsubscribe(
      subscription: SubscriptionHandle,
      unsubscribeProps: js.Object,
      unsubscribeCallback: SubscribeListener
    ): Unit = js.native
  }
  
  @js.native
  trait BaseMessage extends Message {
    
    var advice: js.UndefOr[Hosts] = js.native
    
    var channel: String = js.native
    
    var clientId: js.UndefOr[String] = js.native
    
    var connectionType: js.UndefOr[ConnectionType] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var ext: js.UndefOr[js.Any] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var minimumVersion: js.UndefOr[String] = js.native
    
    var successful: Boolean = js.native
    
    var timestamp: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object BaseMessage {
    
    @scala.inline
    def apply(channel: String, successful: Boolean): BaseMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseMessage]
    }
    
    @scala.inline
    implicit class BaseMessageMutableBuilder[Self <: BaseMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvice(value: Hosts): Self = StObject.set(x, "advice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdviceUndefined: Self = StObject.set(x, "advice", js.undefined)
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExt(value: js.Any): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
      
      @scala.inline
      def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* data */ js.Any, Unit]
  
  @js.native
  trait Configuration extends StObject {
    
    /**
      * Determines whether or not the Bayeux message type (handshake, connect, disconnect) is
      * appended to the URL of the Bayeux server (see above).
      */
    var appendMessageTypeToURL: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines whether multiple publishes that get queued are sent as a batch on the first
      * occasion, without requiring explicit batching.
      */
    var autoBatch: js.UndefOr[Boolean] = js.native
    
    /**
      * The number of milliseconds that the backoff time increments every time a connection with the
      * Bayeux server fails. CometD attempts to reconnect after the backoff time elapses.
      */
    var backoffIncrement: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of milliseconds to wait for a WebSocket connection to be opened. It does
      * not apply to HTTP connections. A timeout value of 0 means to wait forever.
      */
    var connectTimeout: js.UndefOr[Double] = js.native
    
    /**
      * The log level. Possible values are: "warn", "info", "debug". Output to `window.console` if
      * available.
      */
    var logLevel: js.UndefOr[String] = js.native
    
    /**
      * The maximum number of milliseconds of the backoff time after which the backoff time is not
      * incremented further.
      */
    var maxBackoff: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of connections used to connect to the Bayeux server. Change this value
      * only if you know exactly the client’s connection limit and what "request queued behind long
      * poll" means.
      */
    var maxConnections: js.UndefOr[Double] = js.native
    
    /**
      * The maximum number of milliseconds to wait before considering a request to the Bayeux server
      * failed.
      */
    var maxNetworkDelay: js.UndefOr[Double] = js.native
    
    /**
      * The max length of the URI for a request made with the callback-polling transport. Microsoft
      * Internet Explorer 7 and 8 are known to limit the URI length, so single large messages sent by
      * CometD may fail to remain within the max URI length when encoded in JSON.
      */
    var maxURILength: js.UndefOr[Double] = js.native
    
    /**
      * An object containing the request headers to be sent for every Bayeux request (for example,
      * `{"My-Custom-Header": "MyValue"}`).
      */
    var requestHeaders: js.UndefOr[js.Object] = js.native
    
    /**
      * Only applies to the websocket transport. Determines whether to stick using the websocket
      * transport when a websocket transport failure has been detected after the websocket transport
      * was able to successfully connect to the server.
      */
    var stickyReconnect: js.UndefOr[Boolean] = js.native
    
    /**
      * The URL of the Bayeux server this client will connect to.
      */
    var url: String = js.native
    
    /**
      * Uses the scheduler service available in Web Workers via Worker.setTimeout(fn, delay) rather
      * than using that available via Window.setTimeout(fn, delay). Browsers are now throttling the
      * Window scheduler in background tabs to save battery in mobile devices, so the Window scheduler
      * events are delayed by possibly several seconds, causing CometD sessions to timeout on the
      * server. The Worker scheduler is not throttled and guarantees that scheduler events happen
      * on time.
      */
    var useWorkerScheduler: js.UndefOr[Boolean] = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(url: String): Configuration = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendMessageTypeToURL(value: Boolean): Self = StObject.set(x, "appendMessageTypeToURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendMessageTypeToURLUndefined: Self = StObject.set(x, "appendMessageTypeToURL", js.undefined)
      
      @scala.inline
      def setAutoBatch(value: Boolean): Self = StObject.set(x, "autoBatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoBatchUndefined: Self = StObject.set(x, "autoBatch", js.undefined)
      
      @scala.inline
      def setBackoffIncrement(value: Double): Self = StObject.set(x, "backoffIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffIncrementUndefined: Self = StObject.set(x, "backoffIncrement", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      @scala.inline
      def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setMaxNetworkDelay(value: Double): Self = StObject.set(x, "maxNetworkDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNetworkDelayUndefined: Self = StObject.set(x, "maxNetworkDelay", js.undefined)
      
      @scala.inline
      def setMaxURILength(value: Double): Self = StObject.set(x, "maxURILength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxURILengthUndefined: Self = StObject.set(x, "maxURILength", js.undefined)
      
      @scala.inline
      def setRequestHeaders(value: js.Object): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      @scala.inline
      def setStickyReconnect(value: Boolean): Self = StObject.set(x, "stickyReconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyReconnectUndefined: Self = StObject.set(x, "stickyReconnect", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWorkerScheduler(value: Boolean): Self = StObject.set(x, "useWorkerScheduler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWorkerSchedulerUndefined: Self = StObject.set(x, "useWorkerScheduler", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cometd.cometdStrings.`long-polling`
    - typings.cometd.cometdStrings.`callback-polling`
    - typings.cometd.cometdStrings.iframe
    - typings.cometd.cometdStrings.flash
  */
  trait ConnectionType extends StObject
  object ConnectionType {
    
    @scala.inline
    def `callback-polling`: typings.cometd.cometdStrings.`callback-polling` = "callback-polling".asInstanceOf[typings.cometd.cometdStrings.`callback-polling`]
    
    @scala.inline
    def flash: typings.cometd.cometdStrings.flash = "flash".asInstanceOf[typings.cometd.cometdStrings.flash]
    
    @scala.inline
    def iframe: typings.cometd.cometdStrings.iframe = "iframe".asInstanceOf[typings.cometd.cometdStrings.iframe]
    
    @scala.inline
    def `long-polling`: typings.cometd.cometdStrings.`long-polling` = "long-polling".asInstanceOf[typings.cometd.cometdStrings.`long-polling`]
  }
  
  @js.native
  trait Extension extends StObject {
    
    var incoming: js.UndefOr[Listener] = js.native
    
    var outgoing: js.UndefOr[Listener] = js.native
    
    var registered: js.UndefOr[js.Function2[/* name */ String, /* cometd */ CometD, Unit]] = js.native
    
    var unregistered: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object Extension {
    
    @scala.inline
    def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncoming(value: /* message */ Message => Unit): Self = StObject.set(x, "incoming", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncomingUndefined: Self = StObject.set(x, "incoming", js.undefined)
      
      @scala.inline
      def setOutgoing(value: /* message */ Message => Unit): Self = StObject.set(x, "outgoing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutgoingUndefined: Self = StObject.set(x, "outgoing", js.undefined)
      
      @scala.inline
      def setRegistered(value: (/* name */ String, /* cometd */ CometD) => Unit): Self = StObject.set(x, "registered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
      
      @scala.inline
      def setUnregistered(value: () => Unit): Self = StObject.set(x, "unregistered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnregisteredUndefined: Self = StObject.set(x, "unregistered", js.undefined)
    }
  }
  
  type HandshakeListener = js.Function1[/* message */ HandshakeMessage, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cometd.mod.SuccessfulHandshakeMessage
    - typings.cometd.mod.UnsuccessfulHandshakeMessage
  */
  trait HandshakeMessage extends Message
  object HandshakeMessage {
    
    @scala.inline
    def SuccessfulHandshakeMessage(
      channel: String,
      clientId: String,
      reestablish: Boolean,
      successful: `true`,
      supportedConnectionTypes: js.Array[ConnectionType],
      version: String
    ): typings.cometd.mod.SuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cometd.mod.SuccessfulHandshakeMessage]
    }
    
    @scala.inline
    def UnsuccessfulHandshakeMessage(channel: String, error: String, successful: `false`): typings.cometd.mod.UnsuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cometd.mod.UnsuccessfulHandshakeMessage]
    }
  }
  
  type Listener = js.Function1[/* message */ Message, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cometd.mod.BaseMessage
    - typings.cometd.mod.HandshakeMessage
    - typings.cometd.mod.SubscribeMessage
  */
  trait Message extends StObject
  object Message {
    
    @scala.inline
    def BaseMessage(channel: String, successful: Boolean): typings.cometd.mod.BaseMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cometd.mod.BaseMessage]
    }
    
    @scala.inline
    def SubscribeMessage(channel: String, subscription: String, successful: Boolean): typings.cometd.mod.SubscribeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cometd.mod.SubscribeMessage]
    }
    
    @scala.inline
    def SuccessfulHandshakeMessage(
      channel: String,
      clientId: String,
      reestablish: Boolean,
      successful: `true`,
      supportedConnectionTypes: js.Array[ConnectionType],
      version: String
    ): typings.cometd.mod.SuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cometd.mod.SuccessfulHandshakeMessage]
    }
    
    @scala.inline
    def UnsuccessfulHandshakeMessage(channel: String, error: String, successful: `false`): typings.cometd.mod.UnsuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cometd.mod.UnsuccessfulHandshakeMessage]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cometd.cometdStrings.retry
    - typings.cometd.cometdStrings.handshake
    - typings.cometd.cometdStrings.none
  */
  trait ReconnectAdvice extends StObject
  object ReconnectAdvice {
    
    @scala.inline
    def handshake: typings.cometd.cometdStrings.handshake = "handshake".asInstanceOf[typings.cometd.cometdStrings.handshake]
    
    @scala.inline
    def none: typings.cometd.cometdStrings.none = "none".asInstanceOf[typings.cometd.cometdStrings.none]
    
    @scala.inline
    def retry: typings.cometd.cometdStrings.retry = "retry".asInstanceOf[typings.cometd.cometdStrings.retry]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cometd.cometdStrings.disconnected
    - typings.cometd.cometdStrings.disconnecting
    - typings.cometd.cometdStrings.handshaking
    - typings.cometd.cometdStrings.connected
    - typings.cometd.cometdStrings.connecting
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def connected: typings.cometd.cometdStrings.connected = "connected".asInstanceOf[typings.cometd.cometdStrings.connected]
    
    @scala.inline
    def connecting: typings.cometd.cometdStrings.connecting = "connecting".asInstanceOf[typings.cometd.cometdStrings.connecting]
    
    @scala.inline
    def disconnected: typings.cometd.cometdStrings.disconnected = "disconnected".asInstanceOf[typings.cometd.cometdStrings.disconnected]
    
    @scala.inline
    def disconnecting: typings.cometd.cometdStrings.disconnecting = "disconnecting".asInstanceOf[typings.cometd.cometdStrings.disconnecting]
    
    @scala.inline
    def handshaking: typings.cometd.cometdStrings.handshaking = "handshaking".asInstanceOf[typings.cometd.cometdStrings.handshaking]
  }
  
  type SubscribeListener = js.Function1[/* message */ SubscribeMessage, Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.cometd.mod.Message because Already inherited */ @js.native
  trait SubscribeMessage extends BaseMessage {
    
    var subscription: String = js.native
  }
  object SubscribeMessage {
    
    @scala.inline
    def apply(channel: String, subscription: String, successful: Boolean): SubscribeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeMessage]
    }
    
    @scala.inline
    implicit class SubscribeMessageMutableBuilder[Self <: SubscribeMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscriptionHandle extends StObject {
    
    def callback(data: js.Any): Unit = js.native
    @JSName("callback")
    var callback_Original: Callback = js.native
    
    var channel: String = js.native
    
    var id: Double = js.native
    
    var listener: Boolean = js.native
    
    var scope: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  trait SuccessfulHandshakeMessage
    extends BaseMessage
       with HandshakeMessage {
    
    var authSuccessful: js.UndefOr[`true`] = js.native
    
    @JSName("clientId")
    var clientId_SuccessfulHandshakeMessage: String = js.native
    
    var reestablish: Boolean = js.native
    
    @JSName("successful")
    var successful_SuccessfulHandshakeMessage: `true` = js.native
    
    var supportedConnectionTypes: js.Array[ConnectionType] = js.native
    
    @JSName("version")
    var version_SuccessfulHandshakeMessage: String = js.native
  }
  object SuccessfulHandshakeMessage {
    
    @scala.inline
    def apply(
      channel: String,
      clientId: String,
      reestablish: Boolean,
      successful: `true`,
      supportedConnectionTypes: js.Array[ConnectionType],
      version: String
    ): SuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessfulHandshakeMessage]
    }
    
    @scala.inline
    implicit class SuccessfulHandshakeMessageMutableBuilder[Self <: SuccessfulHandshakeMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthSuccessful(value: `true`): Self = StObject.set(x, "authSuccessful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthSuccessfulUndefined: Self = StObject.set(x, "authSuccessful", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReestablish(value: Boolean): Self = StObject.set(x, "reestablish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessful(value: `true`): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = StObject.set(x, "supportedConnectionTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedConnectionTypesVarargs(value: ConnectionType*): Self = StObject.set(x, "supportedConnectionTypes", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnsuccessfulHandshakeMessage
    extends BaseMessage
       with HandshakeMessage {
    
    @JSName("error")
    var error_UnsuccessfulHandshakeMessage: String = js.native
    
    var reestablish: js.UndefOr[scala.Nothing] = js.native
    
    @JSName("successful")
    var successful_UnsuccessfulHandshakeMessage: `false` = js.native
    
    var supportedConnectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
  }
  object UnsuccessfulHandshakeMessage {
    
    @scala.inline
    def apply(channel: String, error: String, successful: `false`): UnsuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsuccessfulHandshakeMessage]
    }
    
    @scala.inline
    implicit class UnsuccessfulHandshakeMessageMutableBuilder[Self <: UnsuccessfulHandshakeMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessful(value: `false`): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = StObject.set(x, "supportedConnectionTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedConnectionTypesUndefined: Self = StObject.set(x, "supportedConnectionTypes", js.undefined)
      
      @scala.inline
      def setSupportedConnectionTypesVarargs(value: ConnectionType*): Self = StObject.set(x, "supportedConnectionTypes", js.Array(value :_*))
    }
  }
}

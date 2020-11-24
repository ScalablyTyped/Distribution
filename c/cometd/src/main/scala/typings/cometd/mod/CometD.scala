package typings.cometd.mod

import typings.cometd.cometdStrings.debug
import typings.cometd.cometdStrings.error
import typings.cometd.cometdStrings.info
import typings.cometd.cometdStrings.warn
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cometd", "CometD")
@js.native
class CometD () extends js.Object {
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

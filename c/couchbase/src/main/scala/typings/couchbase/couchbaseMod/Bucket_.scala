package typings.couchbase.couchbaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.couchbase.couchbaseMod.Bucket.CAS
import typings.couchbase.couchbaseMod.Bucket.DecoderFunction
import typings.couchbase.couchbaseMod.Bucket.EncoderFunction
import typings.couchbase.couchbaseMod.Bucket.FtsQueryCallback
import typings.couchbase.couchbaseMod.Bucket.FtsQueryResponse
import typings.couchbase.couchbaseMod.Bucket.MultiGetCallback
import typings.couchbase.couchbaseMod.Bucket.N1qlQueryCallback
import typings.couchbase.couchbaseMod.Bucket.N1qlQueryResponse
import typings.couchbase.couchbaseMod.Bucket.OpCallback
import typings.couchbase.couchbaseMod.Bucket.QueryCallback
import typings.couchbase.couchbaseMod.Bucket.ViewQueryResponse
import typings.couchbase.couchbaseStrings.connect
import typings.couchbase.couchbaseStrings.error
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Bucket class represents a connection to a Couchbase bucket. Never instantiate this class directly. Instead use the Cluster#openBucket method instead.
  */
@JSName("Bucket")
@js.native
trait Bucket_ extends EventEmitter {
  /**
    * Returns the version of the Node.js library as a string.
    */
  var clientVersion: String = js.native
  /**
    * Gets or sets the config throttling in milliseconds. The config throttling is the time that Bucket will wait before forcing a configuration refresh. If no refresh occurs before this period while a configuration is marked invalid, an update will be triggered.
    */
  var configThrottle: Double = js.native
  /**
    * Sets or gets the connection timeout in milliseconds. This is the timeout value used when connecting to the configuration port during the initial connection (in this case, use this as a key in the 'options' parameter in the constructor) and/or when Bucket attempts to reconnect in-situ (if the current connection has failed).
    */
  var connectionTimeout: Double = js.native
  /**
    * Gets or sets the durability interval in milliseconds. The durability interval is the time that Bucket will wait between requesting new durability information during a durability poll.
    */
  var durabilityInterval: Double = js.native
  /**
    * Gets or sets the durability timeout in milliseconds. The durability timeout is the time that Bucket will wait for a response from the server in regards to a durability request. If there are no responses received within this time frame, the request fails with an error.
    */
  var durabilityTimeout: Double = js.native
  /**
    * Returns the libcouchbase version as a string. This information will usually be in the format of 2.4.0-fffffff representing the major, minor, patch and git-commit that the built libcouchbase is based upon.
    */
  var lcbVersion: String = js.native
  /**
    * Gets or sets the management timeout in milliseconds. The management timeout is the time that Bucket will wait for a response from the server for a management request. If the response is not received within this time frame, the request is failed out with an error.
    */
  var managementTimeout: Double = js.native
  /**
    * Sets or gets the node connection timeout in msecs. This value is similar to Bucket#connectionTimeout, but defines the time to wait for a particular node to respond before trying the next one.
    */
  var nodeConnectionTimeout: Double = js.native
  /**
    * Gets or sets the operation timeout in milliseconds. The operation timeout is the time that Bucket will wait for a response from the server for a CRUD operation. If the response is not received within this time frame, the operation is failed with an error.
    */
  var operationTimeout: Double = js.native
  /**
    * Gets or sets the view timeout in milliseconds. The view timeout is the time that Bucket will wait for a response from the server for a view request. If the response is not received within this time frame, the request fails with an error.
    */
  var viewTimeout: Double = js.native
  @JSName("addListener")
  def addListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  /**
    * Similar to Bucket#upsert, but instead of setting a new key, it appends data to the existing key. Note that this function only makes sense when the stored data is a string; 'appending' to a JSON document may result in parse errors when the document is later retrieved.
    * @param key The target document key.
    * @param fragment The document's contents to append.
    * @param callback The callback function.
    */
  def append(key: String, fragment: js.Any, callback: OpCallback): Unit = js.native
  /**
    *
    * @param key The target document key.
    * @param fragment The document's contents to append.
    * @param options The options object.
    * @param callback The callback function.
    */
  def append(key: String, fragment: js.Any, options: AppendOptions, callback: OpCallback): Unit = js.native
  def append(key: Buffer, fragment: js.Any, callback: OpCallback): Unit = js.native
  def append(key: Buffer, fragment: js.Any, options: AppendOptions, callback: OpCallback): Unit = js.native
  /**
    * Increments or decrements a key's numeric value.
    * Note that JavaScript does not support 64-bit integers (while libcouchbase and the server do). You might receive an inaccurate value if the number is greater than 53-bits (JavaScript's maximum integer precision).
    * @param key The target document key.
    * @param delta The amount to add or subtract from the counter value. This value may be any non-zero integer.
    * @param callback The callback function.
    */
  def counter(key: String, delta: Double, callback: OpCallback): Unit = js.native
  /**
    *
    * @param key The target document key.
    * @param delta The amount to add or subtract from the counter value. This value may be any non-zero integer.
    * @param options The options object.
    * @param callback The callback function.
    */
  def counter(key: String, delta: Double, options: CounterOptions, callback: OpCallback): Unit = js.native
  def counter(key: Buffer, delta: Double, callback: OpCallback): Unit = js.native
  def counter(key: Buffer, delta: Double, options: CounterOptions, callback: OpCallback): Unit = js.native
  /**
    * Shuts down this connection.
    */
  def disconnect(): Unit = js.native
  /**
    * Enables N1QL support on the client. A cbq-server URI must be passed. This method will be deprecated in the future in favor of automatic configuration through the connected cluster.
    * @param hosts An array of host/port combinations which are N1QL servers attached to this cluster.
    */
  def enableN1ql(hosts: String): Unit = js.native
  def enableN1ql(hosts: js.Array[String]): Unit = js.native
  /**
    * Retrieves a document.
    * @param key The target document key.
    * @param callback The callback function.
    */
  def get(key: String, callback: OpCallback): Unit = js.native
  /**
    * @param key The target document key.
    * @param options The options object.
    * @param callback The callback function.
    */
  def get(key: String, options: js.Any, callback: OpCallback): Unit = js.native
  def get(key: Buffer, callback: OpCallback): Unit = js.native
  def get(key: Buffer, options: js.Any, callback: OpCallback): Unit = js.native
  /**
    * Lock the document on the server and retrieve it. When an document is locked, its CAS changes and subsequent operations on the document (without providing the current CAS) will fail until the lock is no longer held.
    * This function behaves identically to Bucket#get in that it will return the value. It differs in that the document is also locked. This ensures that attempts by other client instances to access this document while the lock is held will fail.
    * Once locked, a document can be unlocked either by explicitly calling Bucket#unlock or by performing a storage operation (e.g. Bucket#upsert, Bucket#replace, Bucket::append) with the current CAS value. Note that any other lock operations on this key will fail while a document is locked.
    * @param key The target document key.
    * @param callback The callback function.
    */
  def getAndLock(key: String, callback: OpCallback): Unit = js.native
  /**
    * Lock the document on the server and retrieve it. When an document is locked, its CAS changes and subsequent operations on the document (without providing the current CAS) will fail until the lock is no longer held.
    * This function behaves identically to Bucket#get in that it will return the value. It differs in that the document is also locked. This ensures that attempts by other client instances to access this document while the lock is held will fail.
    * Once locked, a document can be unlocked either by explicitly calling Bucket#unlock or by performing a storage operation (e.g. Bucket#upsert, Bucket#replace, Bucket::append) with the current CAS value. Note that any other lock operations on this key will fail while a document is locked.
    * @param key The target document key.
    * @param options The options object.
    * @param callback The callback function.
    * @returns {}
    */
  def getAndLock(key: String, options: GetAndLockOptions, callback: OpCallback): Unit = js.native
  /**
    * Retrieves a document and updates the expiry of the item at the same time.
    * @param key The target document key.
    * @param expiry The expiration time to use. If a value of 0 is provided, then the current expiration time is cleared and the key is set to never expire. Otherwise, the key is updated to expire in the time provided (in seconds).
    * @param callback The callback function.
    */
  def getAndTouch(key: String, expiry: Double, callback: OpCallback): Unit = js.native
  /**
    * Retrieves a document and updates the expiry of the item at the same time.
    * @param key The target document key.
    * @param expiry The expiration time to use. If a value of 0 is provided, then the current expiration time is cleared and the key is set to never expire. Otherwise, the key is updated to expire in the time provided (in seconds).
    * @param options The options object.
    * @param callback The callback function.
    */
  def getAndTouch(key: String, expiry: Double, options: js.Any, callback: OpCallback): Unit = js.native
  def getAndTouch(key: Buffer, expiry: Double, callback: OpCallback): Unit = js.native
  def getAndTouch(key: Buffer, expiry: Double, options: js.Any, callback: OpCallback): Unit = js.native
  /**
    * Retrieves a list of keys
    * @param keys The target document keys.
    * @param callback The callback function.
    */
  def getMulti(key: js.Array[String | Buffer], callback: MultiGetCallback): Unit = js.native
  /**
    * Get a document from a replica server in your cluster.
    * @param key The target document key.
    * @param callback The callback function.
    */
  def getReplica(key: String, callback: OpCallback): Unit = js.native
  /**
    * Get a document from a replica server in your cluster.
    * @param key The target document key.
    * @param options The options object.
    * @param callback The callback function.
    */
  def getReplica(key: String, options: GetReplicaOptions, callback: OpCallback): Unit = js.native
  def getReplica(key: Buffer, callback: OpCallback): Unit = js.native
  def getReplica(key: Buffer, options: GetReplicaOptions, callback: OpCallback): Unit = js.native
  /**
    * Identical to Bucket#upsert but will fail if the document already exists.
    * @param key The target document key.
    * @param value The document's contents.
    * @param callback The callback function.
    */
  def insert(key: String, value: js.Any, callback: OpCallback): Unit = js.native
  /**
    * Identical to Bucket#upsert but will fail if the document already exists.
    * @param key The target document key.
    * @param value The document's contents.
    * @param options The options object.
    * @param callback The callback function.
    */
  def insert(key: String, value: js.Any, options: InsertOptions, callback: OpCallback): Unit = js.native
  def insert(key: Buffer, value: js.Any, callback: OpCallback): Unit = js.native
  def insert(key: Buffer, value: js.Any, options: InsertOptions, callback: OpCallback): Unit = js.native
  /**
    * Returns an instance of a BuckerManager for performing management operations against a bucket.
    */
  def manager(): BucketManager = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  @JSName("once")
  def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  /**
    * Like Bucket#append, but prepends data to the existing value.
    * @param key The target document key.
    * @param fragment The document's contents to prepend.
    * @param callback The callback function.
    */
  def prepend(key: String, fragment: js.Any, callback: OpCallback): Unit = js.native
  /**
    * Like Bucket#append, but prepends data to the existing value.
    * @param key The target document key.
    * @param fragment The document's contents to prepend.
    * @param options The options object.
    * @param callback The callback function.
    */
  def prepend(key: String, fragment: js.Any, options: PrependOptions, callback: OpCallback): Unit = js.native
  @JSName("prependListener")
  def prependListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  /**
    * Executes a previously prepared query object.
    * @param query The query to execute.
    * @param callback The callback function.
    */
  def query(query: N1qlQuery): N1qlQueryResponse = js.native
  def query(query: N1qlQuery, callback: N1qlQueryCallback): N1qlQueryResponse = js.native
  def query(query: N1qlQuery, params: js.Array[_]): N1qlQueryResponse = js.native
  def query(query: N1qlQuery, params: js.Array[_], callback: N1qlQueryCallback): N1qlQueryResponse = js.native
  /**
    * Executes a previously prepared query object.
    * @param query The query to execute.
    * @param params A list or map to do replacements on a N1QL query.
    * @param callback The callback function.
    */
  def query(query: N1qlQuery, params: StringDictionary[js.Any]): N1qlQueryResponse = js.native
  def query(query: N1qlQuery, params: StringDictionary[js.Any], callback: N1qlQueryCallback): N1qlQueryResponse = js.native
  /**
    * Executes a previously prepared query object.
    * @param query The query to execute.
    * @param callback The callback function.
    */
  def query(query: SearchQuery): FtsQueryResponse = js.native
  def query(query: SearchQuery, callback: FtsQueryCallback): FtsQueryResponse = js.native
  def query(query: SpatialQuery): ViewQueryResponse = js.native
  def query(query: SpatialQuery, callback: QueryCallback): ViewQueryResponse = js.native
  /**
    * Executes a previously prepared query object.
    * @param query The query to execute.
    * @param callback The callback function.
    */
  def query(query: ViewQuery): ViewQueryResponse = js.native
  def query(query: ViewQuery, callback: QueryCallback): ViewQueryResponse = js.native
  /**
    * Deletes a document on the server.
    * @param key The target document key.
    * @param callback The callback function.
    */
  def remove(key: String, callback: OpCallback): Unit = js.native
  /**
    * Deletes a document on the server.
    * @param key The target document key.
    * @param options The options object.
    * @param callback The callback function.
    */
  def remove(key: String, options: RemoveOptions, callback: OpCallback): Unit = js.native
  def remove(key: Buffer, callback: OpCallback): Unit = js.native
  def remove(key: Buffer, options: RemoveOptions, callback: OpCallback): Unit = js.native
  /**
    * Identical to Bucket#upsert, but will only succeed if the document exists already (i.e. the inverse of Bucket#insert).
    * @param key The target document key.
    * @param value The document's contents.
    * @param callback The callback function.
    */
  def replace(key: String, value: js.Any, callback: OpCallback): Unit = js.native
  /**
    * Identical to Bucket#upsert, but will only succeed if the document exists already (i.e. the inverse of Bucket#insert).
    * @param key The target document key.
    * @param value The document's contents.
    * @param options The options object.
    * @param callback The callback function.
    */
  def replace(key: String, value: js.Any, options: ReplaceOptions, callback: OpCallback): Unit = js.native
  def replace(key: Buffer, value: js.Any, callback: OpCallback): Unit = js.native
  def replace(key: Buffer, value: js.Any, options: ReplaceOptions, callback: OpCallback): Unit = js.native
  /**
    * Configures a custom set of transcoder functions for encoding and decoding values that are being stored or retreived from the server.
    * @param encoder The function for encoding.
    * @param decoder The function for decoding.
    */
  def setTranscoder(encoder: EncoderFunction, decoder: DecoderFunction): Unit = js.native
  /**
    * Update the document expiration time.
    * @param key The target document key.
    * @param expiry The expiration time to use. If a value of 0 is provided, then the current expiration time is cleared and the key is set to never expire. Otherwise, the key is updated to expire in the time provided (in seconds). Values larger than 302460*60 seconds (30 days) are interpreted as absolute times (from the epoch).
    * @param options The options object.
    * @param callback The callback function.
    */
  def touch(key: String, expiry: Double, options: TouchOptions, callback: OpCallback): Unit = js.native
  def touch(key: Buffer, expiry: Double, options: TouchOptions, callback: OpCallback): Unit = js.native
  /**
    * Unlock a previously locked document on the server. See the Bucket#lock method for more details on locking.
    * @param key The target document key.
    * @param cas The CAS value returned when the key was locked. This operation will fail if the CAS value provided does not match that which was the result of the original lock operation.
    * @param callback The callback function.
    */
  def unlock(key: String, cas: CAS, callback: OpCallback): Unit = js.native
  /**
    * Unlock a previously locked document on the server. See the Bucket#lock method for more details on locking.
    * @param key The target document key.
    * @param cas The CAS value returned when the key was locked. This operation will fail if the CAS value provided does not match that which was the result of the original lock operation.
    * @param options The options object.
    * @param callback The callback function.
    */
  def unlock(key: String, cas: CAS, options: js.Any, callback: OpCallback): Unit = js.native
  def unlock(key: Buffer, cas: CAS, callback: OpCallback): Unit = js.native
  def unlock(key: Buffer, cas: CAS, options: js.Any, callback: OpCallback): Unit = js.native
  /**
    * Stores a document to the bucket.
    * @param key The target document key.
    * @param value The document's contents.
    * @param callback The callback function.
    */
  def upsert(key: String, value: js.Any, callback: OpCallback): Unit = js.native
  /**
    * Stores a document to the bucket.
    * @param key The target document key.
    * @param value The document's contents.
    * @param options The options object.
    * @param callback The callback function.
    */
  def upsert(key: String, value: js.Any, options: UpsertOptions, callback: OpCallback): Unit = js.native
  def upsert(key: Buffer, value: js.Any, callback: OpCallback): Unit = js.native
  def upsert(key: Buffer, value: js.Any, options: UpsertOptions, callback: OpCallback): Unit = js.native
}


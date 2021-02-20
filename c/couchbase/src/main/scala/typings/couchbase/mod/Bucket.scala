package typings.couchbase.mod

import org.scalablytyped.runtime.StringDictionary
import typings.couchbase.couchbaseStrings.connect
import typings.couchbase.couchbaseStrings.end
import typings.couchbase.couchbaseStrings.error
import typings.couchbase.couchbaseStrings.row
import typings.couchbase.couchbaseStrings.rows
import typings.couchbase.mod.Bucket.CAS
import typings.couchbase.mod.Bucket.DecoderFunction
import typings.couchbase.mod.Bucket.EncoderFunction
import typings.couchbase.mod.Bucket.FtsQueryCallback
import typings.couchbase.mod.Bucket.FtsQueryResponse
import typings.couchbase.mod.Bucket.FtsQueryResponse.Meta
import typings.couchbase.mod.Bucket.MultiGetCallback
import typings.couchbase.mod.Bucket.N1qlQueryCallback
import typings.couchbase.mod.Bucket.N1qlQueryResponse
import typings.couchbase.mod.Bucket.OpCallback
import typings.couchbase.mod.Bucket.QueryCallback
import typings.couchbase.mod.Bucket.ViewQueryResponse
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Bucket class represents a connection to a Couchbase bucket. Never instantiate this class directly. Instead use the Cluster#openBucket method instead.
  */
@js.native
trait Bucket extends EventEmitter {
  
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
    * Gets or sets the durability interval in milliseconds. The durability interval is the time that Bucket will wait between requesting new durability information during a durability poll.
    */
  var durabilityInterval: Double = js.native
  
  /**
    * Gets or sets the durability timeout in milliseconds. The durability timeout is the time that Bucket will wait for a response from the server in regards to a durability request. If there are no responses received within this time frame, the request fails with an error.
    */
  var durabilityTimeout: Double = js.native
  
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
    * Returns the libcouchbase version as a string. This information will usually be in the format of 2.4.0-fffffff representing the major, minor, patch and git-commit that the built libcouchbase is based upon.
    */
  var lcbVersion: String = js.native
  
  /**
    * Gets or sets the management timeout in milliseconds. The management timeout is the time that Bucket will wait for a response from the server for a management request. If the response is not received within this time frame, the request is failed out with an error.
    */
  var managementTimeout: Double = js.native
  
  /**
    * Returns an instance of a BuckerManager for performing management operations against a bucket.
    */
  def manager(): BucketManager = js.native
  
  /**
    * Sets or gets the node connection timeout in msecs. This value is similar to Bucket#connectionTimeout, but defines the time to wait for a particular node to respond before trying the next one.
    */
  var nodeConnectionTimeout: Double = js.native
  
  @JSName("on")
  def on_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  
  @JSName("once")
  def once_connect(event: connect, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  
  /**
    * Gets or sets the operation timeout in milliseconds. The operation timeout is the time that Bucket will wait for a response from the server for a CRUD operation. If the response is not received within this time frame, the operation is failed with an error.
    */
  var operationTimeout: Double = js.native
  
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
  
  /**
    * Gets or sets the view timeout in milliseconds. The view timeout is the time that Bucket will wait for a response from the server for a view request. If the response is not received within this time frame, the request fails with an error.
    */
  var viewTimeout: Double = js.native
}
object Bucket {
  
  /**
    * A class used in relation to transcoders.
    */
  @JSImport("couchbase", "Bucket.TranscoderDoc")
  @js.native
  class TranscoderDoc () extends StObject {
    
    var flags: Double = js.native
    
    var value: Buffer = js.native
  }
  
  /**
    * The CAS value is a special object that indicates the current state of the item on the server. Each time an object is mutated on the server, the value is changed. CAS objects can be used in conjunction with mutation operations to ensure that the value on the server matches the local value retrieved by the client. This is useful when doing document updates on the server as you can ensure no changes were applied by other clients while you were in the process of mutating the document locally.
    * In the Node.js SDK, the CAS is represented as an opaque value. As such, you cannot generate CAS objects, but should rather use the values returned from a Bucket.OpCallback.
    */
  @js.native
  trait CAS extends StObject
  
  /**
    * Transcoder Decoding Function.
    * This function will receive an object containing a Buffer value and an integer value representing any flags metadata whenever a retrieval operation is executed. It is expected that this function will return a value representing the original value stored and encoded with its matching EncoderFunction.
    */
  type DecoderFunction = js.Function1[/* doc */ TranscoderDoc, js.Any]
  
  /**
    * Transcoder Encoding Function.
    * This function will receive a value when a storage operation is invoked that needs to encode user-provided data for storage into Couchbase. It expects to be returned a Buffer object to store along with an integer representing any flag metadata relating to how to decode the key later using the matching DecoderFunction.
    */
  type EncoderFunction = js.Function1[/* value */ js.Any, TranscoderDoc]
  
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type FtsQueryCallback = js.Function3[
    /* error */ CouchbaseError | Null, 
    /* rows */ js.Array[js.Any] | Null, 
    /* meta */ Meta, 
    Unit
  ]
  
  /**
    * An event emitter allowing you to bind to various query result set events.
    */
  @js.native
  trait FtsQueryResponse extends EventEmitter {
    
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
    
    @JSName("on")
    def on_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("on")
    def on_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
    @JSName("on")
    def on_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
    
    @JSName("once")
    def once_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("once")
    def once_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
    @JSName("once")
    def once_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
  }
  object FtsQueryResponse {
    
    /**
      * The meta-information available from a search query response.
      */
    @js.native
    trait Meta extends StObject {
      
      /**
        * Any non-fatal errors that occurred during query processing.
        */
      var errors: js.Any = js.native
      
      /**
        * The resulting facet information for any facets that were specified
        * in the search query.
        */
      var facets: js.Any = js.native
      
      /**
        * The maximum score out of all the results in this query.
        */
      var maxScore: Double = js.native
      
      /**
        * The status information for this query, includes properties
        * such as total, failed, and successful.
        */
      var status: js.Any = js.native
      
      /**
        * The time spent processing this query.
        */
      var took: Double = js.native
      
      /**
        * The total number of hits that were available for this search query.
        */
      var totalHits: Double = js.native
    }
    object Meta {
      
      @scala.inline
      def apply(errors: js.Any, facets: js.Any, maxScore: Double, status: js.Any, took: Double, totalHits: Double): Meta = {
        val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], maxScore = maxScore.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], totalHits = totalHits.asInstanceOf[js.Any])
        __obj.asInstanceOf[Meta]
      }
      
      @scala.inline
      implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFacets(value: js.Any): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxScore(value: Double): Self = StObject.set(x, "maxScore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: js.Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTook(value: Double): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotalHits(value: Double): Self = StObject.set(x, "totalHits", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * Multi-Get Callback.
    * This callback is used to return results from a getMulti operation.
    */
  type MultiGetCallback = js.Function2[/* error */ Double, /* results */ js.Array[js.Any], Unit]
  
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type N1qlQueryCallback = js.Function3[
    /* error */ CouchbaseError | Null, 
    /* rows */ js.Array[js.Any] | Null, 
    /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
    Unit
  ]
  
  /**
    * An event emitter allowing you to bind to various query result set events.
    */
  @js.native
  trait N1qlQueryResponse extends EventEmitter {
    
    @JSName("addListener")
    def addListener_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("on")
    def on_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("on")
    def on_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("once")
    def once_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("once")
    def once_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
  }
  object N1qlQueryResponse {
    
    /**
      * The meta-information available from a view query response.
      */
    @js.native
    trait Meta extends StObject {
      
      /**
        * The identifier for this query request.
        */
      var requestID: Double = js.native
    }
    object Meta {
      
      @scala.inline
      def apply(requestID: Double): typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta = {
        val __obj = js.Dynamic.literal(requestID = requestID.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta]
      }
      
      @scala.inline
      implicit class MetaMutableBuilder[Self <: typings.couchbase.mod.Bucket.N1qlQueryResponse.Meta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRequestID(value: Double): Self = StObject.set(x, "requestID", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * Single-Key callbacks.
    * This callback is passed to all of the single key functions.
    * It returns a result objcet containing a combination of a CAS and a value, depending on which operation was invoked.
    */
  type OpCallback = js.Function2[/* error */ CouchbaseError | Null, /* result */ js.Any, Unit]
  
  /**
    * This is used as a callback from executed queries. It is a shortcut method that automatically subscribes to the rows and error events of the Bucket.ViewQueryResponse.
    */
  type QueryCallback = js.Function3[
    /* error */ CouchbaseError | Null, 
    /* rows */ js.Array[js.Any] | Null, 
    /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
    Unit
  ]
  
  /**
    * An event emitter allowing you to bind to various query result set events.
    */
  @js.native
  trait ViewQueryResponse extends EventEmitter {
    
    @JSName("addListener")
    def addListener_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("on")
    def on_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("on")
    def on_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("once")
    def once_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("once")
    def once_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependListener")
    def prependListener_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_end(
      event: end,
      listener: js.Function1[/* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, Unit]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_row(
      event: row,
      listener: js.Function2[
          /* row */ js.Any, 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_rows(
      event: rows,
      listener: js.Function2[
          /* rows */ js.Array[_], 
          /* meta */ typings.couchbase.mod.Bucket.ViewQueryResponse.Meta, 
          Unit
        ]
    ): this.type = js.native
  }
  object ViewQueryResponse {
    
    /**
      * The meta-information available from a view query response.
      */
    @js.native
    trait Meta extends StObject {
      
      /**
        * The total number of rows available in the index of the view that was queried.
        */
      var total_rows: Double = js.native
    }
    object Meta {
      
      @scala.inline
      def apply(total_rows: Double): typings.couchbase.mod.Bucket.ViewQueryResponse.Meta = {
        val __obj = js.Dynamic.literal(total_rows = total_rows.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.couchbase.mod.Bucket.ViewQueryResponse.Meta]
      }
      
      @scala.inline
      implicit class MetaMutableBuilder[Self <: typings.couchbase.mod.Bucket.ViewQueryResponse.Meta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTotal_rows(value: Double): Self = StObject.set(x, "total_rows", value.asInstanceOf[js.Any])
      }
    }
  }
}

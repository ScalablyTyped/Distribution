package typings.couchbase.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class for performing management operations against a bucket. This class should not be instantiated directly, but instead through the use of the Bucket#manager method instead.
  */
@js.native
trait BucketManager extends StObject {
  
  /**
    * Builds any indexes that were previously created with the deferred attribute.
    * @param callback The callback function.
    */
  def buildDeferredIndexes(
    callback: js.Function2[/* err */ CouchbaseError | Null, /* deferredIndexes */ js.Array[String], Unit]
  ): Unit = js.native
  
  /**
    * Creates a non-primary GSI index with an optional name.
    * @param indexName The name of the index.
    * @param fields The JSON fields to index.
    * @param options
    * @param callback The callback function.
    */
  def createIndex(
    indexName: String,
    fields: js.Array[String],
    callback: js.Function1[/* err */ CouchbaseError | Null, Unit]
  ): Unit = js.native
  /**
    * Creates a non-primary GSI index with an optional name.
    * @param indexName The name of the index.
    * @param fields The JSON fields to index.
    * @param options
    * @param callback The callback function.
    */
  def createIndex(
    indexName: String,
    fields: js.Array[String],
    options: CreateIndexOptions,
    callback: js.Function1[/* err */ CouchbaseError | Null, Unit]
  ): Unit = js.native
  
  /**
    * Creates a primary GSI index with an optional name.
    * @param options
    * @param callback The callback function.
    */
  def createPrimaryIndex(callback: js.Function1[/* err */ CouchbaseError | Null, Unit]): Unit = js.native
  /**
    * Creates a primary GSI index with an optional name.
    * @param options
    * @param callback The callback function.
    */
  def createPrimaryIndex(options: CreateIndexOptions, callback: js.Function1[/* err */ CouchbaseError | Null, Unit]): Unit = js.native
  
  /**
    * Drops a specific GSI index by name.
    * @param indexName The name of the index.
    * @param options
    * @param callback The callback function.
    */
  def dropIndex(indexName: String, callback: js.Function1[/* err */ CouchbaseError | Null, Unit]): Unit = js.native
  /**
    * Drops a specific GSI index by name.
    * @param indexName The name of the index.
    * @param options
    * @param callback The callback function.
    */
  def dropIndex(
    indexName: String,
    options: DropIndexOptions,
    callback: js.Function1[/* err */ CouchbaseError | Null, Unit]
  ): Unit = js.native
  
  /**
    * Drops a primary GSI index.
    * @param options
    * @param callback The callback function.
    */
  def dropPrimaryIndex(callback: js.Function1[/* err */ CouchbaseError | Null, Unit]): Unit = js.native
  /**
    * Drops a primary GSI index.
    * @param options
    * @param callback The callback function.
    */
  def dropPrimaryIndex(options: DropPrimaryIndexOptions, callback: js.Function1[/* err */ CouchbaseError | Null, Unit]): Unit = js.native
  
  /**
    * Flushes the cluster, deleting all data stored within this bucket. Note that this method requires the Flush permission to be enabled on the bucket from the management console before it will work.
    * @param callback The callback function.
    */
  def flush(callback: js.Function): Unit = js.native
  
  /**
    * Retrieves a specific design document from this bucket.
    * @param name
    * @param callback The callback function.
    */
  def getDesignDocument(name: String, callback: js.Function): Unit = js.native
  
  /**
    * Retrieves a list of all design documents registered to a bucket.
    * @param callback The callback function.
    */
  def getDesignDocuments(callback: js.Function): Unit = js.native
  
  /**
    * Retrieves a list of the indexes currently configured on the cluster.
    * @param callback The callback function.
    */
  def getIndexes(
    callback: js.Function2[/* err */ CouchbaseError | Null, /* indexes */ js.Array[IndexInfo] | Null, Unit]
  ): Unit = js.native
  
  /**
    * Registers a design document to this bucket, failing if it already exists.
    * @param name
    * @param data
    * @param callback The callback function.
    * @returns {}
    */
  def insertDesignDocument(name: String, data: js.Any, callback: js.Function): Unit = js.native
  
  /**
    * Unregisters a design document from this bucket.
    * @param name
    * @param callback The callback function.
    * @returns {}
    */
  def removeDesignDocument(name: String, callback: js.Function): Unit = js.native
  
  /**
    * Registers a design document to this bucket, overwriting any existing design document that was previously registered.
    * @param name
    * @param data
    * @param callback The callback function.
    * @returns {}
    */
  def upsertDesignDocument(name: String, data: js.Any, callback: js.Function): Unit = js.native
  
  /**
    * Watches a list of indexes, waiting for them to become available for use.
    * @param watchList List of indexes to watch.
    * @param callback The callback function.
    */
  def watchIndexes(watchList: js.Array[String], callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Watches a list of indexes, waiting for them to become available for use.
    * @param watchList List of indexes to watch.
    * @param options
    * @param callback The callback function.
    */
  def watchIndexes(
    watchList: js.Array[String],
    options: WatchIndexesOptions,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
}

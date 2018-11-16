package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a singular cluster containing your buckets.
 */
@JSImport("couchbase", "Cluster")
@js.native
class Cluster () extends js.Object {
  /**
       * Create a new instance of the Cluster class.
       * @param cnstr The connection string for your cluster.
       * @param options The options object.
       */
  def this(cnstr: java.lang.String) = this()
  /**
       * Create a new instance of the Cluster class.
       * @param cnstr The connection string for your cluster.
       * @param options The options object.
       */
  def this(cnstr: java.lang.String, options: ClusterConstructorOptions) = this()
  /**
       * Authenticate to the cluster using a specific authentication type.
       * @param auther
       */
  def authenticate(auther: Authenticator): scala.Unit = js.native
  /**
       * Authenticate to the cluster using role-based authentication.
       * @param username RBAC username.
       * @param password RBAC password.
       */
  def authenticate(username: java.lang.String, password: java.lang.String): scala.Unit = js.native
  /**
       * Creates a manager allowing the management of a Couchbase cluster.
       */
  def manager(): ClusterManager = js.native
  /**
       * Creates a manager allowing the management of a Couchbase cluster using credentials.
       * @param username The username for your cluster.
       * @param password The password for your cluster.
       */
  def manager(username: java.lang.String, password: java.lang.String): ClusterManager = js.native
  /**
       * Open a bucket to perform operations. This will begin the handshake process immediately and operations will complete later. Subscribe to the connect event to be alerted when the connection is ready, though be aware operations can be successfully queued before this.
       * @param name The name of the bucket to open.
       */
  def openBucket(): Bucket = js.native
  /**
       * Open a bucket to perform operations. This will begin the handshake process immediately and operations will complete later. Subscribe to the connect event to be alerted when the connection is ready, though be aware operations can be successfully queued before this.
       * @param name The name of the bucket to open.
       */
  def openBucket(name: java.lang.String): Bucket = js.native
  /**
       * Open a bucket to perform operations. This will begin the handshake process immediately and operations will complete later. Subscribe to the connect event to be alerted when the connection is ready, though be aware operations can be successfully queued before this.
       * @param name The name of the bucket to open.
       * @param callback Callback to invoke on connection success or failure.
       */
  def openBucket(name: java.lang.String, callback: js.Function): Bucket = js.native
  /**
       * Open a bucket to perform operations. This will begin the handshake process immediately and operations will complete later. Subscribe to the connect event to be alerted when the connection is ready, though be aware operations can be successfully queued before this.
       * @param name The name of the bucket to open.
       * @param password Password for the bucket.
       */
  def openBucket(name: java.lang.String, password: java.lang.String): Bucket = js.native
  /**
       * Open a bucket to perform operations. This will begin the handshake process immediately and operations will complete later. Subscribe to the connect event to be alerted when the connection is ready, though be aware operations can be successfully queued before this.
       * @param name The name of the bucket to open.
       * @param password Password for the bucket.
       * @param callback Callback to invoke on connection success or failure.
       */
  def openBucket(name: java.lang.String, password: java.lang.String, callback: js.Function): Bucket = js.native
}


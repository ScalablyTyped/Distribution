package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a singular cluster containing your buckets.
  */
@JSImport("couchbase", "Cluster")
@js.native
/**
  * Create a new instance of the Cluster class.
  * @param cnstr The connection string for your cluster.
  * @param options The options object.
  */
class Cluster () extends js.Object {
  def this(cnstr: String) = this()
  def this(cnstr: js.UndefOr[scala.Nothing], options: ClusterConstructorOptions) = this()
  def this(cnstr: String, options: ClusterConstructorOptions) = this()
  /**
    * Authenticate to the cluster using a specific authentication type.
    * @param auther
    */
  def authenticate(auther: Authenticator): Unit = js.native
  /**
    * Authenticate to the cluster using role-based authentication.
    * @param username RBAC username.
    * @param password RBAC password.
    */
  def authenticate(username: String, password: String): Unit = js.native
  /**
    * Creates a manager allowing the management of a Couchbase cluster.
    */
  def manager(): ClusterManager = js.native
  /**
    * Creates a manager allowing the management of a Couchbase cluster using credentials.
    * @param username The username for your cluster.
    * @param password The password for your cluster.
    */
  def manager(username: String, password: String): ClusterManager = js.native
  /**
    * Open a bucket to perform operations. This will begin the handshake process immediately and operations will complete later. Subscribe to the connect event to be alerted when the connection is ready, though be aware operations can be successfully queued before this.
    * @param name The name of the bucket to open.
    */
  def openBucket(): Bucket = js.native
  def openBucket(name: js.UndefOr[scala.Nothing], callback: js.Function): Bucket = js.native
  def openBucket(name: js.UndefOr[scala.Nothing], password: js.UndefOr[scala.Nothing], callback: js.Function): Bucket = js.native
  def openBucket(name: js.UndefOr[scala.Nothing], password: String): Bucket = js.native
  def openBucket(name: js.UndefOr[scala.Nothing], password: String, callback: js.Function): Bucket = js.native
  def openBucket(name: String): Bucket = js.native
  def openBucket(name: String, callback: js.Function): Bucket = js.native
  def openBucket(name: String, password: js.UndefOr[scala.Nothing], callback: js.Function): Bucket = js.native
  def openBucket(name: String, password: String): Bucket = js.native
  def openBucket(name: String, password: String, callback: js.Function): Bucket = js.native
}


package typings.couchbase.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for performing management operations against a cluster.
  */
@js.native
trait ClusterManager extends js.Object {
  /**
    *
    * @param name
    * @param callback
    */
  def createBucket(name: String, callback: js.Function): Unit = js.native
  /**
    *
    * @param name
    * @param opts
    * @param callback
    */
  def createBucket(name: String, opts: js.Any, callback: js.Function): Unit = js.native
  /**
    *
    * @param callback
    */
  def listBuckets(callback: js.Function): Unit = js.native
  /**
    *
    * @param name
    * @param callback
    */
  def removeBucket(name: String, callback: js.Function): Unit = js.native
}


package typings
package couchbaseLib.couchbaseMod

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
  def createBucket(name: java.lang.String, callback: js.Function): scala.Unit = js.native
  /**
    *
    * @param name
    * @param opts
    * @param callback
    */
  def createBucket(name: java.lang.String, opts: js.Any, callback: js.Function): scala.Unit = js.native
  /**
    *
    * @param callback
    */
  def listBuckets(callback: js.Function): scala.Unit = js.native
  /**
    *
    * @param name
    * @param callback
    */
  def removeBucket(name: java.lang.String, callback: js.Function): scala.Unit = js.native
}


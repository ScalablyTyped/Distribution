package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class for performing management operations against a cluster.
  */
@js.native
trait ClusterManager extends StObject {
  
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

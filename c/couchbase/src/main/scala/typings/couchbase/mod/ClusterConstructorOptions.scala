package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterConstructorOptions extends js.Object {
  /**
    * The path to the certificate to use for SSL connections
    */
  var certpath: String
}

object ClusterConstructorOptions {
  @scala.inline
  def apply(certpath: String): ClusterConstructorOptions = {
    val __obj = js.Dynamic.literal(certpath = certpath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterConstructorOptions]
  }
}


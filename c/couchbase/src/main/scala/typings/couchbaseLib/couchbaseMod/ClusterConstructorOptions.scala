package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterConstructorOptions extends js.Object {
  /**
    * The path to the certificate to use for SSL connections
    */
  var certpath: java.lang.String
}

object ClusterConstructorOptions {
  @scala.inline
  def apply(certpath: java.lang.String): ClusterConstructorOptions = {
    val __obj = js.Dynamic.literal(certpath = certpath)
  
    __obj.asInstanceOf[ClusterConstructorOptions]
  }
}


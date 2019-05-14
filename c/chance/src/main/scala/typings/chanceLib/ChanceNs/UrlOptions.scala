package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends js.Object {
  var domain: java.lang.String
  var domain_prefix: java.lang.String
  var extensions: js.Array[java.lang.String]
  var path: java.lang.String
  var protocol: java.lang.String
}

object UrlOptions {
  @scala.inline
  def apply(
    domain: java.lang.String,
    domain_prefix: java.lang.String,
    extensions: js.Array[java.lang.String],
    path: java.lang.String,
    protocol: java.lang.String
  ): UrlOptions = {
    val __obj = js.Dynamic.literal(domain = domain, domain_prefix = domain_prefix, extensions = extensions, path = path, protocol = protocol)
  
    __obj.asInstanceOf[UrlOptions]
  }
}


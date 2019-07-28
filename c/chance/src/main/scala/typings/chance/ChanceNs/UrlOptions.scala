package typings.chance.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends js.Object {
  var domain: String
  var domain_prefix: String
  var extensions: js.Array[String]
  var path: String
  var protocol: String
}

object UrlOptions {
  @scala.inline
  def apply(
    domain: String,
    domain_prefix: String,
    extensions: js.Array[String],
    path: String,
    protocol: String
  ): UrlOptions = {
    val __obj = js.Dynamic.literal(domain = domain, domain_prefix = domain_prefix, extensions = extensions, path = path, protocol = protocol)
  
    __obj.asInstanceOf[UrlOptions]
  }
}


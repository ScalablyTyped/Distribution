package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.UrlOptions ]: std.Pick<chance.Chance.UrlOptions, K>} */
trait KinkeyofUrlOptionsPickUrl extends js.Object {
  var domain: PickUrlOptionsdomain
  var domain_prefix: PickUrlOptionsdomainprefi
  var extensions: PickUrlOptionsextensions
  var path: PickUrlOptionspath
  var protocol: PickUrlOptionsprotocol
}

object KinkeyofUrlOptionsPickUrl {
  @scala.inline
  def apply(
    domain: PickUrlOptionsdomain,
    domain_prefix: PickUrlOptionsdomainprefi,
    extensions: PickUrlOptionsextensions,
    path: PickUrlOptionspath,
    protocol: PickUrlOptionsprotocol
  ): KinkeyofUrlOptionsPickUrl = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], domain_prefix = domain_prefix.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofUrlOptionsPickUrl]
  }
}


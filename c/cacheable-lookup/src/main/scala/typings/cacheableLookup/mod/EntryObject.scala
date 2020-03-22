package typings.cacheableLookup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryObject extends js.Object {
  /**
  	 * The IP address (can be an IPv4 or IPv5 address).
  	 */
  val address: String
  /**
  	 * The expiration timestamp.
  	 */
  val expires: Double
  /**
  	 * The IP family.
  	 */
  val family: IPFamily
  /**
  	 * The original TTL.
  	 */
  val ttl: Double
}

object EntryObject {
  @scala.inline
  def apply(address: String, expires: Double, family: IPFamily, ttl: Double): EntryObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryObject]
  }
}


package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Restrictions extends js.Object {
  /**
    * A complex type that controls the countries in which your content is distributed. CloudFront determines the location of your users using MaxMind GeoIP databases.
    */
  var GeoRestriction: typings.awsSdk.cloudfrontMod.GeoRestriction = js.native
}

object Restrictions {
  @scala.inline
  def apply(GeoRestriction: GeoRestriction): Restrictions = {
    val __obj = js.Dynamic.literal(GeoRestriction = GeoRestriction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Restrictions]
  }
}


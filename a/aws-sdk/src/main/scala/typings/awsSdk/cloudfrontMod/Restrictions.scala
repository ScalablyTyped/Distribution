package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class RestrictionsOps[Self <: Restrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeoRestriction(value: GeoRestriction): Self = this.set("GeoRestriction", value.asInstanceOf[js.Any])
  }
}

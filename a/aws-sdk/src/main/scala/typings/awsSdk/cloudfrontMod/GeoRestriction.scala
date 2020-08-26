package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRestriction extends js.Object {
  /**
    *  A complex type that contains a Location element for each country in which you want CloudFront either to distribute your content (whitelist) or not distribute your content (blacklist). The Location element is a two-letter, uppercase country code for a country that you want to include in your blacklist or whitelist. Include one Location element for each country. CloudFront and MaxMind both use ISO 3166 country codes. For the current list of countries and the corresponding codes, see ISO 3166-1-alpha-2 code on the International Organization for Standardization website. You can also refer to the country list on the CloudFront console, which includes both country names and codes.
    */
  var Items: js.UndefOr[LocationList] = js.native
  /**
    * When geo restriction is enabled, this is the number of countries in your whitelist or blacklist. Otherwise, when it is not enabled, Quantity is 0, and you can omit Items.
    */
  var Quantity: integer = js.native
  /**
    * The method that you want to use to restrict distribution of your content by country:    none: No geo restriction is enabled, meaning access to content is not restricted by client geo location.    blacklist: The Location elements specify the countries in which you don't want CloudFront to distribute your content.    whitelist: The Location elements specify the countries in which you want CloudFront to distribute your content.  
    */
  var RestrictionType: GeoRestrictionType = js.native
}

object GeoRestriction {
  @scala.inline
  def apply(Quantity: integer, RestrictionType: GeoRestrictionType): GeoRestriction = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any], RestrictionType = RestrictionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoRestriction]
  }
  @scala.inline
  implicit class GeoRestrictionOps[Self <: GeoRestriction] (val x: Self) extends AnyVal {
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
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestrictionType(value: GeoRestrictionType): Self = this.set("RestrictionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: LocationList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}


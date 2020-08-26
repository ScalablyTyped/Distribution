package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupplementaryFeature extends js.Object {
  /**
    * The name of the feature. This must be "holiday".
    */
  var Name: typings.awsSdk.forecastserviceMod.Name = js.native
  /**
    * One of the following 2 letter country codes:   "AR" - ARGENTINA   "AT" - AUSTRIA   "AU" - AUSTRALIA   "BE" - BELGIUM   "BR" - BRAZIL   "CA" - CANADA   "CN" - CHINA   "CZ" - CZECH REPUBLIC   "DK" - DENMARK   "EC" - ECUADOR   "FI" - FINLAND   "FR" - FRANCE   "DE" - GERMANY   "HU" - HUNGARY   "IE" - IRELAND   "IN" - INDIA   "IT" - ITALY   "JP" - JAPAN   "KR" - KOREA   "LU" - LUXEMBOURG   "MX" - MEXICO   "NL" - NETHERLANDS   "NO" - NORWAY   "PL" - POLAND   "PT" - PORTUGAL   "RU" - RUSSIA   "ZA" - SOUTH AFRICA   "ES" - SPAIN   "SE" - SWEDEN   "CH" - SWITZERLAND   "US" - UNITED STATES   "UK" - UNITED KINGDOM  
    */
  var Value: typings.awsSdk.forecastserviceMod.Value = js.native
}

object SupplementaryFeature {
  @scala.inline
  def apply(Name: Name, Value: Value): SupplementaryFeature = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupplementaryFeature]
  }
  @scala.inline
  implicit class SupplementaryFeatureOps[Self <: SupplementaryFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Value): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}


package typings.blueprintjsTimezone.timezoneMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimezoneMetadata extends js.Object {
  
  var abbreviation: js.UndefOr[String] = js.native
  
  var offset: Double = js.native
  
  var offsetAsString: String = js.native
  
  var population: js.UndefOr[Double] = js.native
  
  var timezone: String = js.native
}
object ITimezoneMetadata {
  
  @scala.inline
  def apply(offset: Double, offsetAsString: String, timezone: String): ITimezoneMetadata = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetAsString = offsetAsString.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimezoneMetadata]
  }
  
  @scala.inline
  implicit class ITimezoneMetadataOps[Self <: ITimezoneMetadata] (val x: Self) extends AnyVal {
    
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetAsString(value: String): Self = this.set("offsetAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbreviation(value: String): Self = this.set("abbreviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbbreviation: Self = this.set("abbreviation", js.undefined)
    
    @scala.inline
    def setPopulation(value: Double): Self = this.set("population", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopulation: Self = this.set("population", js.undefined)
  }
}

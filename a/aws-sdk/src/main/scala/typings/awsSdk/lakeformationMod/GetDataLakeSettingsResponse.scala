package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataLakeSettingsResponse extends js.Object {
  
  /**
    * A structure representing a list of AWS Lake Formation principals designated as data lake administrators.
    */
  var DataLakeSettings: js.UndefOr[typings.awsSdk.lakeformationMod.DataLakeSettings] = js.native
}
object GetDataLakeSettingsResponse {
  
  @scala.inline
  def apply(): GetDataLakeSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataLakeSettingsResponse]
  }
  
  @scala.inline
  implicit class GetDataLakeSettingsResponseOps[Self <: GetDataLakeSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setDataLakeSettings(value: DataLakeSettings): Self = this.set("DataLakeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLakeSettings: Self = this.set("DataLakeSettings", js.undefined)
  }
}

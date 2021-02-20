package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataLakeSettingsResponse extends StObject {
  
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
  implicit class GetDataLakeSettingsResponseMutableBuilder[Self <: GetDataLakeSettingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLakeSettings(value: DataLakeSettings): Self = StObject.set(x, "DataLakeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLakeSettingsUndefined: Self = StObject.set(x, "DataLakeSettings", js.undefined)
  }
}

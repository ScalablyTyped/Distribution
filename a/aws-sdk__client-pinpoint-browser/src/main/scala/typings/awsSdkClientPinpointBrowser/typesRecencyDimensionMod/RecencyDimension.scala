package typings.awsSdkClientPinpointBrowser.typesRecencyDimensionMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ACTIVE
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_14
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_30
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAY_7
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HR_24
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INACTIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecencyDimension extends js.Object {
  
  /**
    * The length of time during which users have been active or inactive with your app.
    *
    * Valid values: HR_24, DAY_7, DAY_14, DAY_30
    */
  var Duration: js.UndefOr[HR_24 | DAY_7 | DAY_14 | DAY_30 | String] = js.native
  
  /**
    * The recency dimension type:
    *
    * ACTIVE - Users who have used your app within the specified duration are included in the segment.
    *
    * INACTIVE - Users who have not used your app within the specified duration are included in the segment.
    */
  var RecencyType: js.UndefOr[ACTIVE | INACTIVE | String] = js.native
}
object RecencyDimension {
  
  @scala.inline
  def apply(): RecencyDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecencyDimension]
  }
  
  @scala.inline
  implicit class RecencyDimensionOps[Self <: RecencyDimension] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: HR_24 | DAY_7 | DAY_14 | DAY_30 | String): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setRecencyType(value: ACTIVE | INACTIVE | String): Self = this.set("RecencyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecencyType: Self = this.set("RecencyType", js.undefined)
  }
}

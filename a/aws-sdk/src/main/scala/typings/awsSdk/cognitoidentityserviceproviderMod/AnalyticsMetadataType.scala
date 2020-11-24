package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsMetadataType extends js.Object {
  
  /**
    * The endpoint ID.
    */
  var AnalyticsEndpointId: js.UndefOr[StringType] = js.native
}
object AnalyticsMetadataType {
  
  @scala.inline
  def apply(): AnalyticsMetadataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsMetadataType]
  }
  
  @scala.inline
  implicit class AnalyticsMetadataTypeOps[Self <: AnalyticsMetadataType] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsEndpointId(value: StringType): Self = this.set("AnalyticsEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsEndpointId: Self = this.set("AnalyticsEndpointId", js.undefined)
  }
}

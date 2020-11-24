package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * An array of objects with information about product views and provisioning artifacts.
    */
  var ProvisioningArtifactViews: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactViews] = js.native
}
object ListProvisioningArtifactsForServiceActionOutput {
  
  @scala.inline
  def apply(): ListProvisioningArtifactsForServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
  }
  
  @scala.inline
  implicit class ListProvisioningArtifactsForServiceActionOutputOps[Self <: ListProvisioningArtifactsForServiceActionOutput] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactViewsVarargs(value: ProvisioningArtifactView*): Self = this.set("ProvisioningArtifactViews", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningArtifactViews(value: ProvisioningArtifactViews): Self = this.set("ProvisioningArtifactViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactViews: Self = this.set("ProvisioningArtifactViews", js.undefined)
  }
}

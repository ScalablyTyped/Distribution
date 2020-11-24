package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishLayerVersionRequest extends js.Object {
  
  /**
    * A list of compatible function runtimes. Used for filtering with ListLayers and ListLayerVersions.
    */
  var CompatibleRuntimes: js.UndefOr[typings.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  
  /**
    * The function layer archive.
    */
  var Content: LayerVersionContentInput = js.native
  
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  
  /**
    * The layer's software license. It can be any of the following:   An SPDX license identifier. For example, MIT.   The URL of a license hosted on the internet. For example, https://opensource.org/licenses/MIT.   The full text of the license.  
    */
  var LicenseInfo: js.UndefOr[typings.awsSdk.lambdaMod.LicenseInfo] = js.native
}
object PublishLayerVersionRequest {
  
  @scala.inline
  def apply(Content: LayerVersionContentInput, LayerName: LayerName): PublishLayerVersionRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishLayerVersionRequest]
  }
  
  @scala.inline
  implicit class PublishLayerVersionRequestOps[Self <: PublishLayerVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setContent(value: LayerVersionContentInput): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerName(value: LayerName): Self = this.set("LayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimesVarargs(value: Runtime*): Self = this.set("CompatibleRuntimes", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleRuntimes(value: CompatibleRuntimes): Self = this.set("CompatibleRuntimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibleRuntimes: Self = this.set("CompatibleRuntimes", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLicenseInfo(value: LicenseInfo): Self = this.set("LicenseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseInfo: Self = this.set("LicenseInfo", js.undefined)
  }
}

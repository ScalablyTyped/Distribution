package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSigningPlatformResponse extends js.Object {
  
  /**
    * The category type of the target signing platform.
    */
  var category: js.UndefOr[Category] = js.native
  
  /**
    * The display name of the target signing platform.
    */
  var displayName: js.UndefOr[DisplayName] = js.native
  
  /**
    * The maximum size (in MB) of the payload that can be signed by the target platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.native
  
  /**
    * A list of partner entities that use the target signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  
  /**
    * The ID of the target signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  
  /**
    * A list of configurations applied to the target platform at signing.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.native
  
  /**
    * The format of the target platform's signing image.
    */
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.native
  
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.native
}
object GetSigningPlatformResponse {
  
  @scala.inline
  def apply(): GetSigningPlatformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningPlatformResponse]
  }
  
  @scala.inline
  implicit class GetSigningPlatformResponseOps[Self <: GetSigningPlatformResponse] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: Category): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMaxSizeInMB(value: MaxSizeInMB): Self = this.set("maxSizeInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSizeInMB: Self = this.set("maxSizeInMB", js.undefined)
    
    @scala.inline
    def setPartner(value: String): Self = this.set("partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartner: Self = this.set("partner", js.undefined)
    
    @scala.inline
    def setPlatformId(value: PlatformId): Self = this.set("platformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformId: Self = this.set("platformId", js.undefined)
    
    @scala.inline
    def setSigningConfiguration(value: SigningConfiguration): Self = this.set("signingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningConfiguration: Self = this.set("signingConfiguration", js.undefined)
    
    @scala.inline
    def setSigningImageFormat(value: SigningImageFormat): Self = this.set("signingImageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningImageFormat: Self = this.set("signingImageFormat", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}

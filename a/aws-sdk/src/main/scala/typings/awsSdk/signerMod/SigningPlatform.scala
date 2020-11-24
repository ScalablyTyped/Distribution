package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningPlatform extends js.Object {
  
  /**
    * The category of a code signing platform.
    */
  var category: js.UndefOr[Category] = js.native
  
  /**
    * The display name of a code signing platform.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The maximum size (in MB) of code that can be signed by a code signing platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.native
  
  /**
    * Any partner entities linked to a code signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  
  /**
    * The ID of a code signing; platform.
    */
  var platformId: js.UndefOr[String] = js.native
  
  /**
    * The configuration of a code signing platform. This includes the designated hash algorithm and encryption algorithm of a signing platform.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.native
  
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.native
  
  /**
    * The types of targets that can be signed by a code signing platform.
    */
  var target: js.UndefOr[String] = js.native
}
object SigningPlatform {
  
  @scala.inline
  def apply(): SigningPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningPlatform]
  }
  
  @scala.inline
  implicit class SigningPlatformOps[Self <: SigningPlatform] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
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
    def setPlatformId(value: String): Self = this.set("platformId", value.asInstanceOf[js.Any])
    
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

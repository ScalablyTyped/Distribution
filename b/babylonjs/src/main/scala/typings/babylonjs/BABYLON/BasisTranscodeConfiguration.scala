package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Etc1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasisTranscodeConfiguration extends js.Object {
  
  /**
    * If mipmap levels should be loaded for transcoded images (Default: true)
    */
  var loadMipmapLevels: js.UndefOr[Boolean] = js.native
  
  /**
    * Index of a single image to load (Default: all images)
    */
  var loadSingleImage: js.UndefOr[Double] = js.native
  
  /**
    * Supported compression formats used to determine the supported output format of the transcoder
    */
  var supportedCompressionFormats: js.UndefOr[Etc1] = js.native
}
object BasisTranscodeConfiguration {
  
  @scala.inline
  def apply(): BasisTranscodeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasisTranscodeConfiguration]
  }
  
  @scala.inline
  implicit class BasisTranscodeConfigurationOps[Self <: BasisTranscodeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLoadMipmapLevels(value: Boolean): Self = this.set("loadMipmapLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMipmapLevels: Self = this.set("loadMipmapLevels", js.undefined)
    
    @scala.inline
    def setLoadSingleImage(value: Double): Self = this.set("loadSingleImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadSingleImage: Self = this.set("loadSingleImage", js.undefined)
    
    @scala.inline
    def setSupportedCompressionFormats(value: Etc1): Self = this.set("supportedCompressionFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCompressionFormats: Self = this.set("supportedCompressionFormats", js.undefined)
  }
}

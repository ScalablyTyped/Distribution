package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Etc1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasisTranscodeConfiguration extends StObject {
  
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
  implicit class BasisTranscodeConfigurationMutableBuilder[Self <: BasisTranscodeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadMipmapLevels(value: Boolean): Self = StObject.set(x, "loadMipmapLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMipmapLevelsUndefined: Self = StObject.set(x, "loadMipmapLevels", js.undefined)
    
    @scala.inline
    def setLoadSingleImage(value: Double): Self = StObject.set(x, "loadSingleImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadSingleImageUndefined: Self = StObject.set(x, "loadSingleImage", js.undefined)
    
    @scala.inline
    def setSupportedCompressionFormats(value: Etc1): Self = StObject.set(x, "supportedCompressionFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCompressionFormatsUndefined: Self = StObject.set(x, "supportedCompressionFormats", js.undefined)
  }
}

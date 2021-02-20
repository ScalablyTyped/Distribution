package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentLanguage extends StObject {
  
  /**
    * The list of Docker images that are related by the specified programming language.
    */
  var images: js.UndefOr[EnvironmentImages] = js.native
  
  /**
    * The programming language for the Docker images.
    */
  var language: js.UndefOr[LanguageType] = js.native
}
object EnvironmentLanguage {
  
  @scala.inline
  def apply(): EnvironmentLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLanguage]
  }
  
  @scala.inline
  implicit class EnvironmentLanguageMutableBuilder[Self <: EnvironmentLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: EnvironmentImages): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: EnvironmentImage*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: LanguageType): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}

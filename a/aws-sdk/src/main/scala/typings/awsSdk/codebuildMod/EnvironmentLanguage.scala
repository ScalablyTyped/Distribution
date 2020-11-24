package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentLanguage extends js.Object {
  
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
  implicit class EnvironmentLanguageOps[Self <: EnvironmentLanguage] (val x: Self) extends AnyVal {
    
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
    def setImagesVarargs(value: EnvironmentImage*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: EnvironmentImages): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setLanguage(value: LanguageType): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}

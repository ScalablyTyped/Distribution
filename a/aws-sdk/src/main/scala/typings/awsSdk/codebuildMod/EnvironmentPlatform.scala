package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentPlatform extends StObject {
  
  /**
    * The list of programming languages that are available for the specified platform.
    */
  var languages: js.UndefOr[EnvironmentLanguages] = js.undefined
  
  /**
    * The platform's name.
    */
  var platform: js.UndefOr[PlatformType] = js.undefined
}
object EnvironmentPlatform {
  
  @scala.inline
  def apply(): EnvironmentPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentPlatform]
  }
  
  @scala.inline
  implicit class EnvironmentPlatformMutableBuilder[Self <: EnvironmentPlatform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: EnvironmentLanguages): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: EnvironmentLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    @scala.inline
    def setPlatform(value: PlatformType): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}

package typings.typescriptNn5FuAjk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageServiceEnabled extends StObject {
  
  var languageServiceEnabled: Boolean
  
  var project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project
}
object LanguageServiceEnabled {
  
  inline def apply(
    languageServiceEnabled: Boolean,
    project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project
  ): LanguageServiceEnabled = {
    val __obj = js.Dynamic.literal(languageServiceEnabled = languageServiceEnabled.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageServiceEnabled]
  }
  
  extension [Self <: LanguageServiceEnabled](x: Self) {
    
    inline def setLanguageServiceEnabled(value: Boolean): Self = StObject.set(x, "languageServiceEnabled", value.asInstanceOf[js.Any])
    
    inline def setProject(value: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}

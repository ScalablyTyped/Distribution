package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidChangeLanguageFlavorParams extends StObject {
  
  var flavor: String
  
  var language: String
  
  var uri: String
}
object DidChangeLanguageFlavorParams {
  
  @scala.inline
  def apply(flavor: String, language: String, uri: String): DidChangeLanguageFlavorParams = {
    val __obj = js.Dynamic.literal(flavor = flavor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeLanguageFlavorParams]
  }
  
  @scala.inline
  implicit class DidChangeLanguageFlavorParamsMutableBuilder[Self <: DidChangeLanguageFlavorParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlavor(value: String): Self = StObject.set(x, "flavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}

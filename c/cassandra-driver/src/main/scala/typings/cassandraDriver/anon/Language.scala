package typings.cassandraDriver.anon

import typings.cassandraDriver.typesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Language extends StObject {
  
  var language: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var readConsistency: js.UndefOr[consistencies] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var writeConsistency: js.UndefOr[consistencies] = js.native
}
object Language {
  
  @scala.inline
  def apply(): Language = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReadConsistency(value: consistencies): Self = StObject.set(x, "readConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadConsistencyUndefined: Self = StObject.set(x, "readConsistency", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setWriteConsistency(value: consistencies): Self = StObject.set(x, "writeConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteConsistencyUndefined: Self = StObject.set(x, "writeConsistency", js.undefined)
  }
}

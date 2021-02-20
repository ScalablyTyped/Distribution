package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionDocument extends StObject {
  
  /**
    * The language used to define the entity. GRAPHQL is the only valid value.
    */
  var language: DefinitionLanguage = js.native
  
  /**
    * The GraphQL text that defines the entity.
    */
  var text: DefinitionText = js.native
}
object DefinitionDocument {
  
  @scala.inline
  def apply(language: DefinitionLanguage, text: DefinitionText): DefinitionDocument = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionDocument]
  }
  
  @scala.inline
  implicit class DefinitionDocumentMutableBuilder[Self <: DefinitionDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: DefinitionLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: DefinitionText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

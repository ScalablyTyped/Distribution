package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggester extends StObject {
  
  var DocumentSuggesterOptions: typings.awsSdk.cloudsearchMod.DocumentSuggesterOptions
  
  var SuggesterName: StandardName
}
object Suggester {
  
  @scala.inline
  def apply(DocumentSuggesterOptions: DocumentSuggesterOptions, SuggesterName: StandardName): Suggester = {
    val __obj = js.Dynamic.literal(DocumentSuggesterOptions = DocumentSuggesterOptions.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggester]
  }
  
  @scala.inline
  implicit class SuggesterMutableBuilder[Self <: Suggester] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentSuggesterOptions(value: DocumentSuggesterOptions): Self = StObject.set(x, "DocumentSuggesterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggesterName(value: StandardName): Self = StObject.set(x, "SuggesterName", value.asInstanceOf[js.Any])
  }
}

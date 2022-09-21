package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThesaurusResponse extends StObject {
  
  /**
    * The unique identifier of the thesaurus. 
    */
  var Id: js.UndefOr[ThesaurusId] = js.undefined
}
object CreateThesaurusResponse {
  
  inline def apply(): CreateThesaurusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThesaurusResponse]
  }
  
  extension [Self <: CreateThesaurusResponse](x: Self) {
    
    inline def setId(value: ThesaurusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

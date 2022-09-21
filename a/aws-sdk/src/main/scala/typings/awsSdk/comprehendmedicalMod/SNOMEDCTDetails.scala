package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SNOMEDCTDetails extends StObject {
  
  /**
    *  The edition of SNOMED-CT used. The edition used for the InferSNOMEDCT editions is the US edition. 
    */
  var Edition: js.UndefOr[String] = js.undefined
  
  /**
    *  The language used in the SNOMED-CT ontology. All Amazon Comprehend Medical operations are US English (en). 
    */
  var Language: js.UndefOr[String] = js.undefined
  
  /**
    *  The version date of the SNOMED-CT ontology used. 
    */
  var VersionDate: js.UndefOr[String] = js.undefined
}
object SNOMEDCTDetails {
  
  inline def apply(): SNOMEDCTDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SNOMEDCTDetails]
  }
  
  extension [Self <: SNOMEDCTDetails](x: Self) {
    
    inline def setEdition(value: String): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setVersionDate(value: String): Self = StObject.set(x, "VersionDate", value.asInstanceOf[js.Any])
    
    inline def setVersionDateUndefined: Self = StObject.set(x, "VersionDate", js.undefined)
  }
}

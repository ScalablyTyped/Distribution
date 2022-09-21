package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRelevanceConfiguration extends StObject {
  
  /**
    * The name of the index field.
    */
  var Name: DocumentMetadataConfigurationName
  
  /**
    * Provides information for tuning the relevance of a field in a search. When a query includes terms that match the field, the results are given a boost in the response based on these tuning parameters.
    */
  var Relevance: typings.awsSdk.kendraMod.Relevance
}
object DocumentRelevanceConfiguration {
  
  inline def apply(Name: DocumentMetadataConfigurationName, Relevance: Relevance): DocumentRelevanceConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Relevance = Relevance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRelevanceConfiguration]
  }
  
  extension [Self <: DocumentRelevanceConfiguration](x: Self) {
    
    inline def setName(value: DocumentMetadataConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRelevance(value: Relevance): Self = StObject.set(x, "Relevance", value.asInstanceOf[js.Any])
  }
}

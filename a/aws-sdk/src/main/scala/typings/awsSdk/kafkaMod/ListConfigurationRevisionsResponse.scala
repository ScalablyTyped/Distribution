package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationRevisionsResponse extends StObject {
  
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * 
    List of ConfigurationRevision objects.
    
    */
  var Revisions: js.UndefOr[listOfConfigurationRevision] = js.undefined
}
object ListConfigurationRevisionsResponse {
  
  inline def apply(): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
  
  extension [Self <: ListConfigurationRevisionsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRevisions(value: listOfConfigurationRevision): Self = StObject.set(x, "Revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "Revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: ConfigurationRevision*): Self = StObject.set(x, "Revisions", js.Array(value :_*))
  }
}

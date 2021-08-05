package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSetRevisionsResponse extends StObject {
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.dataexchangeMod.NextToken] = js.undefined
  
  /**
    * The asset objects listed by the request.
    */
  var Revisions: js.UndefOr[ListOfRevisionEntry] = js.undefined
}
object ListDataSetRevisionsResponse {
  
  inline def apply(): ListDataSetRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetRevisionsResponse]
  }
  
  extension [Self <: ListDataSetRevisionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRevisions(value: ListOfRevisionEntry): Self = StObject.set(x, "Revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "Revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: RevisionEntry*): Self = StObject.set(x, "Revisions", js.Array(value :_*))
  }
}

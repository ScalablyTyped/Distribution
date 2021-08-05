package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationRevisionsOutput extends StObject {
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list application revisions call to return the next set of application revisions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of locations that contain the matching revisions.
    */
  var revisions: js.UndefOr[RevisionLocationList] = js.undefined
}
object ListApplicationRevisionsOutput {
  
  inline def apply(): ListApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationRevisionsOutput]
  }
  
  extension [Self <: ListApplicationRevisionsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRevisions(value: RevisionLocationList): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: RevisionLocation*): Self = StObject.set(x, "revisions", js.Array(value :_*))
  }
}

package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArchivesResponse extends StObject {
  
  /**
    * An array of Archive objects that include details about an archive.
    */
  var Archives: js.UndefOr[ArchiveResponseList] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.undefined
}
object ListArchivesResponse {
  
  inline def apply(): ListArchivesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArchivesResponse]
  }
  
  extension [Self <: ListArchivesResponse](x: Self) {
    
    inline def setArchives(value: ArchiveResponseList): Self = StObject.set(x, "Archives", value.asInstanceOf[js.Any])
    
    inline def setArchivesUndefined: Self = StObject.set(x, "Archives", js.undefined)
    
    inline def setArchivesVarargs(value: Archive*): Self = StObject.set(x, "Archives", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

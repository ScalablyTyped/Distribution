package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMapsResponse extends StObject {
  
  /**
    * Contains a list of maps in your AWS account
    */
  var Entries: ListMapsResponseEntryList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a following request to fetch the next set of results. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListMapsResponse {
  
  inline def apply(Entries: ListMapsResponseEntryList): ListMapsResponse = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMapsResponse]
  }
  
  extension [Self <: ListMapsResponse](x: Self) {
    
    inline def setEntries(value: ListMapsResponseEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ListMapsResponseEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

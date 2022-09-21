package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDatabasesByLFTagsResponse extends StObject {
  
  /**
    * A list of databases that meet the LF-tag conditions.
    */
  var DatabaseList: js.UndefOr[DatabaseLFTagsList] = js.undefined
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object SearchDatabasesByLFTagsResponse {
  
  inline def apply(): SearchDatabasesByLFTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDatabasesByLFTagsResponse]
  }
  
  extension [Self <: SearchDatabasesByLFTagsResponse](x: Self) {
    
    inline def setDatabaseList(value: DatabaseLFTagsList): Self = StObject.set(x, "DatabaseList", value.asInstanceOf[js.Any])
    
    inline def setDatabaseListUndefined: Self = StObject.set(x, "DatabaseList", js.undefined)
    
    inline def setDatabaseListVarargs(value: TaggedDatabase*): Self = StObject.set(x, "DatabaseList", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueRequest extends StObject {
  
  /**
    * The list of asset property value entries for the batch get request. You can specify up to 16 entries per request.
    */
  var entries: BatchGetAssetPropertyValueEntries
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object BatchGetAssetPropertyValueRequest {
  
  inline def apply(entries: BatchGetAssetPropertyValueEntries): BatchGetAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueRequest]
  }
  
  extension [Self <: BatchGetAssetPropertyValueRequest](x: Self) {
    
    inline def setEntries(value: BatchGetAssetPropertyValueEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: BatchGetAssetPropertyValueEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

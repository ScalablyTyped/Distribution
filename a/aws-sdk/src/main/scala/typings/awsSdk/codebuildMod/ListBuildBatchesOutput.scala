package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuildBatchesOutput extends StObject {
  
  /**
    * An array of strings that contains the batch build identifiers.
    */
  var ids: js.UndefOr[BuildBatchIds] = js.undefined
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to ListBuildBatches to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListBuildBatchesOutput {
  
  inline def apply(): ListBuildBatchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildBatchesOutput]
  }
  
  extension [Self <: ListBuildBatchesOutput](x: Self) {
    
    inline def setIds(value: BuildBatchIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

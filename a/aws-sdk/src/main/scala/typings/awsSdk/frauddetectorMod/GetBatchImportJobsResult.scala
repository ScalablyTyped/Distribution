package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchImportJobsResult extends StObject {
  
  /**
    * An array containing the details of each batch import job.
    */
  var batchImports: js.UndefOr[BatchImportList] = js.undefined
  
  /**
    * The next token for the subsequent resquest.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetBatchImportJobsResult {
  
  inline def apply(): GetBatchImportJobsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchImportJobsResult]
  }
  
  extension [Self <: GetBatchImportJobsResult](x: Self) {
    
    inline def setBatchImports(value: BatchImportList): Self = StObject.set(x, "batchImports", value.asInstanceOf[js.Any])
    
    inline def setBatchImportsUndefined: Self = StObject.set(x, "batchImports", js.undefined)
    
    inline def setBatchImportsVarargs(value: BatchImport*): Self = StObject.set(x, "batchImports", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

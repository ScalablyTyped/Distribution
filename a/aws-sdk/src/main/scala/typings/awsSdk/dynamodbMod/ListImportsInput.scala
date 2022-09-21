package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsInput extends StObject {
  
  /**
    *  An optional string that, if supplied, must be copied from the output of a previous call to ListImports. When provided in this manner, the API fetches the next page of results. 
    */
  var NextToken: js.UndefOr[ImportNextToken] = js.undefined
  
  /**
    *  The number of ImportSummary objects returned in a single page. 
    */
  var PageSize: js.UndefOr[ListImportsMaxLimit] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) associated with the table that was imported to. 
    */
  var TableArn: js.UndefOr[typings.awsSdk.dynamodbMod.TableArn] = js.undefined
}
object ListImportsInput {
  
  inline def apply(): ListImportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsInput]
  }
  
  extension [Self <: ListImportsInput](x: Self) {
    
    inline def setNextToken(value: ImportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: ListImportsMaxLimit): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}

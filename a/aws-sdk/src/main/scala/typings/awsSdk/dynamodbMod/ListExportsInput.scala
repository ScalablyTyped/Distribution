package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExportsInput extends StObject {
  
  /**
    * Maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[ListExportsMaxLimit] = js.native
  
  /**
    * An optional string that, if supplied, must be copied from the output of a previous call to ListExports. When provided in this manner, the API fetches the next page of results.
    */
  var NextToken: js.UndefOr[ExportNextToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) associated with the exported table.
    */
  var TableArn: js.UndefOr[typings.awsSdk.dynamodbMod.TableArn] = js.native
}
object ListExportsInput {
  
  @scala.inline
  def apply(): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsInput]
  }
  
  @scala.inline
  implicit class ListExportsInputMutableBuilder[Self <: ListExportsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListExportsMaxLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: ExportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}

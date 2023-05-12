package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsInput extends StObject {
  
  /**
    * <p> An optional string that, if supplied, must be copied from the output of a previous
    *             call to <code>ListImports</code>. When provided in this manner, the API fetches the next
    *             page of results. </p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The number of <code>ImportSummary </code>objects returned in a single page. </p>
    */
  var PageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * <p> The Amazon Resource Name (ARN) associated with the table that was imported to.
    *         </p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
}
object ListImportsInput {
  
  inline def apply(): ListImportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportsInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}

package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsInput extends StObject {
  
  /**
    * <p>Maximum number of results to return per page.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>An optional string that, if supplied, must be copied from the output of a previous
    *             call to <code>ListExports</code>. When provided in this manner, the API fetches the next
    *             page of results.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) associated with the exported table.</p>
    */
  var TableArn: js.UndefOr[String] = js.undefined
}
object ListExportsInput {
  
  inline def apply(): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
  }
}

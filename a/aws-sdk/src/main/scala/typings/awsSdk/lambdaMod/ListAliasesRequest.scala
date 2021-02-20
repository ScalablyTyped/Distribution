package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAliasesRequest extends StObject {
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  
  /**
    * Specify a function version to only list aliases that invoke that version.
    */
  var FunctionVersion: js.UndefOr[Version] = js.native
  
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * Limit the number of aliases returned.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.native
}
object ListAliasesRequest {
  
  @scala.inline
  def apply(FunctionName: FunctionName): ListAliasesRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAliasesRequest]
  }
  
  @scala.inline
  implicit class ListAliasesRequestMutableBuilder[Self <: ListAliasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersion(value: Version): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: MaxListItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}

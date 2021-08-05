package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagValuesOutput extends StObject {
  
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * A list of all tag values for the specified key in the AWS account.
    */
  var TagValues: js.UndefOr[TagValuesOutputList] = js.undefined
}
object GetTagValuesOutput {
  
  inline def apply(): GetTagValuesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagValuesOutput]
  }
  
  extension [Self <: GetTagValuesOutput](x: Self) {
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setTagValues(value: TagValuesOutputList): Self = StObject.set(x, "TagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "TagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: TagValue*): Self = StObject.set(x, "TagValues", js.Array(value :_*))
  }
}

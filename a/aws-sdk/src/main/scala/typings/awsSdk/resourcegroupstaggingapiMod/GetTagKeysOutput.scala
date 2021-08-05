package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagKeysOutput extends StObject {
  
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * A list of all tag keys in the AWS account.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.undefined
}
object GetTagKeysOutput {
  
  inline def apply(): GetTagKeysOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagKeysOutput]
  }
  
  extension [Self <: GetTagKeysOutput](x: Self) {
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}

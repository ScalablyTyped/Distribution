package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTagKeysOutput extends StObject {
  
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  
  /**
    * A list of all tag keys in the AWS account.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
}
object GetTagKeysOutput {
  
  @scala.inline
  def apply(): GetTagKeysOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagKeysOutput]
  }
  
  @scala.inline
  implicit class GetTagKeysOutputMutableBuilder[Self <: GetTagKeysOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}

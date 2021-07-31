package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagKeysInput extends StObject {
  
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.undefined
}
object GetTagKeysInput {
  
  @scala.inline
  def apply(): GetTagKeysInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagKeysInput]
  }
  
  @scala.inline
  implicit class GetTagKeysInputMutableBuilder[Self <: GetTagKeysInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}

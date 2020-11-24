package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBrokerEngineTypesResponse extends js.Object {
  
  /**
    * List of available engine types and versions.
    */
  var BrokerEngineTypes: js.UndefOr[listOfBrokerEngineType] = js.native
  
  /**
    * Required. The maximum number of engine types that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integerMin5Max100] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object DescribeBrokerEngineTypesResponse {
  
  @scala.inline
  def apply(): DescribeBrokerEngineTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerEngineTypesResponse]
  }
  
  @scala.inline
  implicit class DescribeBrokerEngineTypesResponseOps[Self <: DescribeBrokerEngineTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrokerEngineTypesVarargs(value: BrokerEngineType*): Self = this.set("BrokerEngineTypes", js.Array(value :_*))
    
    @scala.inline
    def setBrokerEngineTypes(value: listOfBrokerEngineType): Self = this.set("BrokerEngineTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerEngineTypes: Self = this.set("BrokerEngineTypes", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integerMin5Max100): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstanceStorageConfigsResponse extends js.Object {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * A valid storage type.
    */
  var StorageConfigs: js.UndefOr[InstanceStorageConfigs] = js.native
}
object ListInstanceStorageConfigsResponse {
  
  @scala.inline
  def apply(): ListInstanceStorageConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceStorageConfigsResponse]
  }
  
  @scala.inline
  implicit class ListInstanceStorageConfigsResponseOps[Self <: ListInstanceStorageConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStorageConfigsVarargs(value: InstanceStorageConfig*): Self = this.set("StorageConfigs", js.Array(value :_*))
    
    @scala.inline
    def setStorageConfigs(value: InstanceStorageConfigs): Self = this.set("StorageConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageConfigs: Self = this.set("StorageConfigs", js.undefined)
  }
}

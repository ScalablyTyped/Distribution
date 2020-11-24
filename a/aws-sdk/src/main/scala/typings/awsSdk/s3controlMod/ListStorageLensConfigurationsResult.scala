package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStorageLensConfigurationsResult extends js.Object {
  
  /**
    * If the request produced more than the maximum number of S3 Storage Lens configuration results, you can pass this value into a subsequent request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[ContinuationToken] = js.native
  
  /**
    * A list of S3 Storage Lens configurations.
    */
  var StorageLensConfigurationList: js.UndefOr[typings.awsSdk.s3controlMod.StorageLensConfigurationList] = js.native
}
object ListStorageLensConfigurationsResult {
  
  @scala.inline
  def apply(): ListStorageLensConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStorageLensConfigurationsResult]
  }
  
  @scala.inline
  implicit class ListStorageLensConfigurationsResultOps[Self <: ListStorageLensConfigurationsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: ContinuationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStorageLensConfigurationListVarargs(value: ListStorageLensConfigurationEntry*): Self = this.set("StorageLensConfigurationList", js.Array(value :_*))
    
    @scala.inline
    def setStorageLensConfigurationList(value: StorageLensConfigurationList): Self = this.set("StorageLensConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageLensConfigurationList: Self = this.set("StorageLensConfigurationList", js.undefined)
  }
}

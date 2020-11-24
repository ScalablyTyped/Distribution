package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPackagingConfigurationsResponse extends js.Object {
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * A list of MediaPackage VOD PackagingConfiguration resources.
    */
  var PackagingConfigurations: js.UndefOr[listOfPackagingConfiguration] = js.native
}
object ListPackagingConfigurationsResponse {
  
  @scala.inline
  def apply(): ListPackagingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagingConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListPackagingConfigurationsResponseOps[Self <: ListPackagingConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPackagingConfigurationsVarargs(value: PackagingConfiguration*): Self = this.set("PackagingConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setPackagingConfigurations(value: listOfPackagingConfiguration): Self = this.set("PackagingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackagingConfigurations: Self = this.set("PackagingConfigurations", js.undefined)
  }
}

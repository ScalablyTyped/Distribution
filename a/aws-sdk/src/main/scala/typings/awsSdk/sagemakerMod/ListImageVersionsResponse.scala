package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImageVersionsResponse extends js.Object {
  
  /**
    * A list of versions and their properties.
    */
  var ImageVersions: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersions] = js.native
  
  /**
    * A token for getting the next set of versions, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListImageVersionsResponse {
  
  @scala.inline
  def apply(): ListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageVersionsResponse]
  }
  
  @scala.inline
  implicit class ListImageVersionsResponseOps[Self <: ListImageVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setImageVersionsVarargs(value: ImageVersion*): Self = this.set("ImageVersions", js.Array(value :_*))
    
    @scala.inline
    def setImageVersions(value: ImageVersions): Self = this.set("ImageVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageVersions: Self = this.set("ImageVersions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

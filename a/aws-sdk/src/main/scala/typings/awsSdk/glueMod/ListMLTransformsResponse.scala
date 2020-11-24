package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMLTransformsResponse extends js.Object {
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The identifiers of all the machine learning transforms in the account, or the machine learning transforms with the specified tags.
    */
  var TransformIds: TransformIdList = js.native
}
object ListMLTransformsResponse {
  
  @scala.inline
  def apply(TransformIds: TransformIdList): ListMLTransformsResponse = {
    val __obj = js.Dynamic.literal(TransformIds = TransformIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMLTransformsResponse]
  }
  
  @scala.inline
  implicit class ListMLTransformsResponseOps[Self <: ListMLTransformsResponse] (val x: Self) extends AnyVal {
    
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
    def setTransformIdsVarargs(value: HashString*): Self = this.set("TransformIds", js.Array(value :_*))
    
    @scala.inline
    def setTransformIds(value: TransformIdList): Self = this.set("TransformIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

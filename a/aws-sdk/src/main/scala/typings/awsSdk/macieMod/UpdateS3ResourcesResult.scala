package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateS3ResourcesResult extends js.Object {
  
  /**
    * The S3 resources whose classification types can't be updated. An error code and an error message are provided for each failed item. 
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.native
}
object UpdateS3ResourcesResult {
  
  @scala.inline
  def apply(): UpdateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateS3ResourcesResult]
  }
  
  @scala.inline
  implicit class UpdateS3ResourcesResultOps[Self <: UpdateS3ResourcesResult] (val x: Self) extends AnyVal {
    
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
    def setFailedS3ResourcesVarargs(value: FailedS3Resource*): Self = this.set("failedS3Resources", js.Array(value :_*))
    
    @scala.inline
    def setFailedS3Resources(value: FailedS3Resources): Self = this.set("failedS3Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedS3Resources: Self = this.set("failedS3Resources", js.undefined)
  }
}

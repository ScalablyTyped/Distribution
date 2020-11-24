package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryBuildBatchOutput extends js.Object {
  
  var buildBatch: js.UndefOr[BuildBatch] = js.native
}
object RetryBuildBatchOutput {
  
  @scala.inline
  def apply(): RetryBuildBatchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildBatchOutput]
  }
  
  @scala.inline
  implicit class RetryBuildBatchOutputOps[Self <: RetryBuildBatchOutput] (val x: Self) extends AnyVal {
    
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
    def setBuildBatch(value: BuildBatch): Self = this.set("buildBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatch: Self = this.set("buildBatch", js.undefined)
  }
}

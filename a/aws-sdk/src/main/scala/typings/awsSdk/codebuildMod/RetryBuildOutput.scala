package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryBuildOutput extends js.Object {
  
  var build: js.UndefOr[Build] = js.native
}
object RetryBuildOutput {
  
  @scala.inline
  def apply(): RetryBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildOutput]
  }
  
  @scala.inline
  implicit class RetryBuildOutputOps[Self <: RetryBuildOutput] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: Build): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
  }
}

package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryCodeOutput extends js.Object {
  
  /**
    * The entry point to use for the source code when running the canary.
    */
  var Handler: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the Lambda layer where Synthetics stores the canary script code.
    */
  var SourceLocationArn: js.UndefOr[String] = js.native
}
object CanaryCodeOutput {
  
  @scala.inline
  def apply(): CanaryCodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryCodeOutput]
  }
  
  @scala.inline
  implicit class CanaryCodeOutputOps[Self <: CanaryCodeOutput] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: String): Self = this.set("Handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("Handler", js.undefined)
    
    @scala.inline
    def setSourceLocationArn(value: String): Self = this.set("SourceLocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLocationArn: Self = this.set("SourceLocationArn", js.undefined)
  }
}

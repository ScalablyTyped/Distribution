package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConformancePackResponse extends js.Object {
  
  /**
    * ARN of the conformance pack.
    */
  var ConformancePackArn: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackArn] = js.native
}
object PutConformancePackResponse {
  
  @scala.inline
  def apply(): PutConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutConformancePackResponse]
  }
  
  @scala.inline
  implicit class PutConformancePackResponseOps[Self <: PutConformancePackResponse] (val x: Self) extends AnyVal {
    
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
    def setConformancePackArn(value: ConformancePackArn): Self = this.set("ConformancePackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConformancePackArn: Self = this.set("ConformancePackArn", js.undefined)
  }
}

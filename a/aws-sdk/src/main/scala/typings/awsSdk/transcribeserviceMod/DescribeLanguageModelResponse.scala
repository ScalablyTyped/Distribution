package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLanguageModelResponse extends js.Object {
  
  /**
    * The name of the custom language model you requested more information about.
    */
  var LanguageModel: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageModel] = js.native
}
object DescribeLanguageModelResponse {
  
  @scala.inline
  def apply(): DescribeLanguageModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLanguageModelResponse]
  }
  
  @scala.inline
  implicit class DescribeLanguageModelResponseOps[Self <: DescribeLanguageModelResponse] (val x: Self) extends AnyVal {
    
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
    def setLanguageModel(value: LanguageModel): Self = this.set("LanguageModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageModel: Self = this.set("LanguageModel", js.undefined)
  }
}

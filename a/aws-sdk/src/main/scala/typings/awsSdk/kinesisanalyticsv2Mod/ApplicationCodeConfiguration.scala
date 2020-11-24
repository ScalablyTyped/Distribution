package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCodeConfiguration extends js.Object {
  
  /**
    * The location and type of the application code.
    */
  var CodeContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeContent] = js.native
  
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typings.awsSdk.kinesisanalyticsv2Mod.CodeContentType = js.native
}
object ApplicationCodeConfiguration {
  
  @scala.inline
  def apply(CodeContentType: CodeContentType): ApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationCodeConfigurationOps[Self <: ApplicationCodeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCodeContentType(value: CodeContentType): Self = this.set("CodeContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContent(value: CodeContent): Self = this.set("CodeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeContent: Self = this.set("CodeContent", js.undefined)
  }
}

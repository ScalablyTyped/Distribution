package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandStart. */
@js.native
trait ICommandStart extends js.Object {
  
  /** CommandStart baseDirectory */
  var baseDirectory: js.UndefOr[String | Null] = js.native
  
  /** CommandStart runtimeConfig */
  var runtimeConfig: js.UndefOr[IRuntimeConfig | Null] = js.native
  
  /** CommandStart sourcesConfig */
  var sourcesConfig: js.UndefOr[ISourcesConfig | Null] = js.native
  
  /** CommandStart supportCodeConfig */
  var supportCodeConfig: js.UndefOr[ISupportCodeConfig | Null] = js.native
}
object ICommandStart {
  
  @scala.inline
  def apply(): ICommandStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandStart]
  }
  
  @scala.inline
  implicit class ICommandStartOps[Self <: ICommandStart] (val x: Self) extends AnyVal {
    
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
    def setBaseDirectory(value: String): Self = this.set("baseDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDirectory: Self = this.set("baseDirectory", js.undefined)
    
    @scala.inline
    def setBaseDirectoryNull: Self = this.set("baseDirectory", null)
    
    @scala.inline
    def setRuntimeConfig(value: IRuntimeConfig): Self = this.set("runtimeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfig: Self = this.set("runtimeConfig", js.undefined)
    
    @scala.inline
    def setRuntimeConfigNull: Self = this.set("runtimeConfig", null)
    
    @scala.inline
    def setSourcesConfig(value: ISourcesConfig): Self = this.set("sourcesConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesConfig: Self = this.set("sourcesConfig", js.undefined)
    
    @scala.inline
    def setSourcesConfigNull: Self = this.set("sourcesConfig", null)
    
    @scala.inline
    def setSupportCodeConfig(value: ISupportCodeConfig): Self = this.set("supportCodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportCodeConfig: Self = this.set("supportCodeConfig", js.undefined)
    
    @scala.inline
    def setSupportCodeConfigNull: Self = this.set("supportCodeConfig", null)
  }
}

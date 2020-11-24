package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisSourceEntity extends js.Object {
  
  /**
    * The source template for the source entity of the analysis.
    */
  var SourceTemplate: js.UndefOr[AnalysisSourceTemplate] = js.native
}
object AnalysisSourceEntity {
  
  @scala.inline
  def apply(): AnalysisSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSourceEntity]
  }
  
  @scala.inline
  implicit class AnalysisSourceEntityOps[Self <: AnalysisSourceEntity] (val x: Self) extends AnyVal {
    
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
    def setSourceTemplate(value: AnalysisSourceTemplate): Self = this.set("SourceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTemplate: Self = this.set("SourceTemplate", js.undefined)
  }
}

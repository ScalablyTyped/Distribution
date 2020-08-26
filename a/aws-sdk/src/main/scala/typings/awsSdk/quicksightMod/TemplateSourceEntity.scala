package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSourceEntity extends js.Object {
  /**
    * The source analysis, if it is based on an analysis.
    */
  var SourceAnalysis: js.UndefOr[TemplateSourceAnalysis] = js.native
  /**
    * The source template, if it is based on an template.
    */
  var SourceTemplate: js.UndefOr[TemplateSourceTemplate] = js.native
}

object TemplateSourceEntity {
  @scala.inline
  def apply(): TemplateSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSourceEntity]
  }
  @scala.inline
  implicit class TemplateSourceEntityOps[Self <: TemplateSourceEntity] (val x: Self) extends AnyVal {
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
    def setSourceAnalysis(value: TemplateSourceAnalysis): Self = this.set("SourceAnalysis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAnalysis: Self = this.set("SourceAnalysis", js.undefined)
    @scala.inline
    def setSourceTemplate(value: TemplateSourceTemplate): Self = this.set("SourceTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceTemplate: Self = this.set("SourceTemplate", js.undefined)
  }
  
}


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
  def apply(SourceAnalysis: TemplateSourceAnalysis = null, SourceTemplate: TemplateSourceTemplate = null): TemplateSourceEntity = {
    val __obj = js.Dynamic.literal()
    if (SourceAnalysis != null) __obj.updateDynamic("SourceAnalysis")(SourceAnalysis.asInstanceOf[js.Any])
    if (SourceTemplate != null) __obj.updateDynamic("SourceTemplate")(SourceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSourceEntity]
  }
}


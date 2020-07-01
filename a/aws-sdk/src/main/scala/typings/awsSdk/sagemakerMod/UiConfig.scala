package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiConfig extends js.Object {
  /**
    * The ARN of the worker task template used to render the worker UI and tools for labeling job tasks. Do not use this parameter if you use UiTemplateS3Uri.
    */
  var HumanTaskUiArn: js.UndefOr[typings.awsSdk.sagemakerMod.HumanTaskUiArn] = js.native
  /**
    * The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to render the worker UI and tools for labeling job tasks. For more information about the contents of a UI template, see  Creating Your Custom Labeling Task Template.
    */
  var UiTemplateS3Uri: js.UndefOr[S3Uri] = js.native
}

object UiConfig {
  @scala.inline
  def apply(HumanTaskUiArn: HumanTaskUiArn = null, UiTemplateS3Uri: S3Uri = null): UiConfig = {
    val __obj = js.Dynamic.literal()
    if (HumanTaskUiArn != null) __obj.updateDynamic("HumanTaskUiArn")(HumanTaskUiArn.asInstanceOf[js.Any])
    if (UiTemplateS3Uri != null) __obj.updateDynamic("UiTemplateS3Uri")(UiTemplateS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiConfig]
  }
}


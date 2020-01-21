package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /**
    * The HTML body of the email.
    */
  var HtmlPart: js.UndefOr[typings.awsSdk.sesMod.HtmlPart] = js.native
  /**
    * The subject line of the email.
    */
  var SubjectPart: js.UndefOr[typings.awsSdk.sesMod.SubjectPart] = js.native
  /**
    * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var TextPart: js.UndefOr[typings.awsSdk.sesMod.TextPart] = js.native
}

object Template {
  @scala.inline
  def apply(
    TemplateName: TemplateName,
    HtmlPart: HtmlPart = null,
    SubjectPart: SubjectPart = null,
    TextPart: TextPart = null
  ): Template = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart.asInstanceOf[js.Any])
    if (SubjectPart != null) __obj.updateDynamic("SubjectPart")(SubjectPart.asInstanceOf[js.Any])
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}


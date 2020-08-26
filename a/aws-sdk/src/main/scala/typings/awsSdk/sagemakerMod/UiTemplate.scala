package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiTemplate extends js.Object {
  /**
    * The content of the Liquid template for the worker user interface.
    */
  var Content: TemplateContent = js.native
}

object UiTemplate {
  @scala.inline
  def apply(Content: TemplateContent): UiTemplate = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiTemplate]
  }
  @scala.inline
  implicit class UiTemplateOps[Self <: UiTemplate] (val x: Self) extends AnyVal {
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
    def setContent(value: TemplateContent): Self = this.set("Content", value.asInstanceOf[js.Any])
  }
  
}


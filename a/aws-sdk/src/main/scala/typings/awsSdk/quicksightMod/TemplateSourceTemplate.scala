package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSourceTemplate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn = js.native
}

object TemplateSourceTemplate {
  @scala.inline
  def apply(Arn: Arn): TemplateSourceTemplate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSourceTemplate]
  }
  @scala.inline
  implicit class TemplateSourceTemplateOps[Self <: TemplateSourceTemplate] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
  }
  
}


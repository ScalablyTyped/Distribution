package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTextTranslationJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with an asynchronous batch translation job.
    */
  var TextTranslationJobProperties: js.UndefOr[typings.awsSdk.translateMod.TextTranslationJobProperties] = js.native
}

object DescribeTextTranslationJobResponse {
  @scala.inline
  def apply(): DescribeTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTextTranslationJobResponse]
  }
  @scala.inline
  implicit class DescribeTextTranslationJobResponseOps[Self <: DescribeTextTranslationJobResponse] (val x: Self) extends AnyVal {
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
    def setTextTranslationJobProperties(value: TextTranslationJobProperties): Self = this.set("TextTranslationJobProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTranslationJobProperties: Self = this.set("TextTranslationJobProperties", js.undefined)
  }
  
}


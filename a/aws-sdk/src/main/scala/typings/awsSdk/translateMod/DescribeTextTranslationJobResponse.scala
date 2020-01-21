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
  def apply(TextTranslationJobProperties: TextTranslationJobProperties = null): DescribeTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (TextTranslationJobProperties != null) __obj.updateDynamic("TextTranslationJobProperties")(TextTranslationJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTextTranslationJobResponse]
  }
}


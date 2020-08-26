package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFormatConfiguration extends js.Object {
  /**
    * Specifies which serializer to use. You can choose either the ORC SerDe or the Parquet SerDe. If both are non-null, the server rejects the request.
    */
  var Serializer: js.UndefOr[typings.awsSdk.firehoseMod.Serializer] = js.native
}

object OutputFormatConfiguration {
  @scala.inline
  def apply(): OutputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputFormatConfiguration]
  }
  @scala.inline
  implicit class OutputFormatConfigurationOps[Self <: OutputFormatConfiguration] (val x: Self) extends AnyVal {
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
    def setSerializer(value: Serializer): Self = this.set("Serializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializer: Self = this.set("Serializer", js.undefined)
  }
  
}


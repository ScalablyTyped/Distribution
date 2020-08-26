package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompatibleKafkaVersionsResponse extends js.Object {
  /**
    * 
    A list of CompatibleKafkaVersion objects.
    
    */
  var CompatibleKafkaVersions: js.UndefOr[listOfCompatibleKafkaVersion] = js.native
}

object GetCompatibleKafkaVersionsResponse {
  @scala.inline
  def apply(): GetCompatibleKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleKafkaVersionsResponse]
  }
  @scala.inline
  implicit class GetCompatibleKafkaVersionsResponseOps[Self <: GetCompatibleKafkaVersionsResponse] (val x: Self) extends AnyVal {
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
    def setCompatibleKafkaVersionsVarargs(value: CompatibleKafkaVersion*): Self = this.set("CompatibleKafkaVersions", js.Array(value :_*))
    @scala.inline
    def setCompatibleKafkaVersions(value: listOfCompatibleKafkaVersion): Self = this.set("CompatibleKafkaVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleKafkaVersions: Self = this.set("CompatibleKafkaVersions", js.undefined)
  }
  
}


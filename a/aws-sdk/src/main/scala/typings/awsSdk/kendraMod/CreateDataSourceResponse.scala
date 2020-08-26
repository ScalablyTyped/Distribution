package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceResponse extends js.Object {
  /**
    * A unique identifier for the data source.
    */
  var Id: DataSourceId = js.native
}

object CreateDataSourceResponse {
  @scala.inline
  def apply(Id: DataSourceId): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
  @scala.inline
  implicit class CreateDataSourceResponseOps[Self <: CreateDataSourceResponse] (val x: Self) extends AnyVal {
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
    def setId(value: DataSourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}


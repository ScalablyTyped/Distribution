package typings.cassandraDriver.mappingMod.mapping

import typings.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingExecutionOptions extends js.Object {
  var executionProfile: js.UndefOr[String] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
  var isIdempotent: js.UndefOr[Boolean] = js.native
  var logged: js.UndefOr[Boolean] = js.native
  var pageState: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double | Long] = js.native
}

object MappingExecutionOptions {
  @scala.inline
  def apply(): MappingExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingExecutionOptions]
  }
  @scala.inline
  implicit class MappingExecutionOptionsOps[Self <: MappingExecutionOptions] (val x: Self) extends AnyVal {
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
    def setExecutionProfile(value: String): Self = this.set("executionProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionProfile: Self = this.set("executionProfile", js.undefined)
    @scala.inline
    def setFetchSize(value: Double): Self = this.set("fetchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchSize: Self = this.set("fetchSize", js.undefined)
    @scala.inline
    def setIsIdempotent(value: Boolean): Self = this.set("isIdempotent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIdempotent: Self = this.set("isIdempotent", js.undefined)
    @scala.inline
    def setLogged(value: Boolean): Self = this.set("logged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogged: Self = this.set("logged", js.undefined)
    @scala.inline
    def setPageState(value: Double): Self = this.set("pageState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageState: Self = this.set("pageState", js.undefined)
    @scala.inline
    def setTimestamp(value: Double | Long): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}


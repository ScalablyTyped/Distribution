package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMappingRequest extends js.Object {
  /**
    * Parameters for the mapping.
    */
  var Location: js.UndefOr[typings.awsSdk.glueMod.Location] = js.native
  /**
    * A list of target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.native
  /**
    * Specifies the source table.
    */
  var Source: CatalogEntry = js.native
}

object GetMappingRequest {
  @scala.inline
  def apply(Source: CatalogEntry): GetMappingRequest = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingRequest]
  }
  @scala.inline
  implicit class GetMappingRequestOps[Self <: GetMappingRequest] (val x: Self) extends AnyVal {
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
    def setSource(value: CatalogEntry): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setSinksVarargs(value: CatalogEntry*): Self = this.set("Sinks", js.Array(value :_*))
    @scala.inline
    def setSinks(value: CatalogEntries): Self = this.set("Sinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSinks: Self = this.set("Sinks", js.undefined)
  }
  
}


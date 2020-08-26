package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlanRequest extends js.Object {
  /**
    * The programming language of the code to perform the mapping.
    */
  var Language: js.UndefOr[typings.awsSdk.glueMod.Language] = js.native
  /**
    * The parameters for the mapping.
    */
  var Location: js.UndefOr[typings.awsSdk.glueMod.Location] = js.native
  /**
    * The list of mappings from a source table to target tables.
    */
  var Mapping: MappingList = js.native
  /**
    * The target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.native
  /**
    * The source table.
    */
  var Source: CatalogEntry = js.native
}

object GetPlanRequest {
  @scala.inline
  def apply(Mapping: MappingList, Source: CatalogEntry): GetPlanRequest = {
    val __obj = js.Dynamic.literal(Mapping = Mapping.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlanRequest]
  }
  @scala.inline
  implicit class GetPlanRequestOps[Self <: GetPlanRequest] (val x: Self) extends AnyVal {
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
    def setMappingVarargs(value: MappingEntry*): Self = this.set("Mapping", js.Array(value :_*))
    @scala.inline
    def setMapping(value: MappingList): Self = this.set("Mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: CatalogEntry): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Language): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("Language", js.undefined)
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


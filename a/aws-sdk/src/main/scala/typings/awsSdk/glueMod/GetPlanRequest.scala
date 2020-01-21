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
  def apply(
    Mapping: MappingList,
    Source: CatalogEntry,
    Language: Language = null,
    Location: Location = null,
    Sinks: CatalogEntries = null
  ): GetPlanRequest = {
    val __obj = js.Dynamic.literal(Mapping = Mapping.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    if (Language != null) __obj.updateDynamic("Language")(Language.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Sinks != null) __obj.updateDynamic("Sinks")(Sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlanRequest]
  }
}


package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityManagerProperties extends js.Object {
  var dataService: js.UndefOr[DataService] = js.undefined
  var keyGeneratorCtor: js.UndefOr[js.Function] = js.undefined
  var metadataStore: js.UndefOr[MetadataStore] = js.undefined
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  var saveOptions: js.UndefOr[SaveOptions] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
  var validationOptions: js.UndefOr[ValidationOptions] = js.undefined
}

object EntityManagerProperties {
  @scala.inline
  def apply(
    dataService: DataService = null,
    keyGeneratorCtor: js.Function = null,
    metadataStore: MetadataStore = null,
    queryOptions: QueryOptions = null,
    saveOptions: SaveOptions = null,
    serviceName: String = null,
    validationOptions: ValidationOptions = null
  ): EntityManagerProperties = {
    val __obj = js.Dynamic.literal()
    if (dataService != null) __obj.updateDynamic("dataService")(dataService)
    if (keyGeneratorCtor != null) __obj.updateDynamic("keyGeneratorCtor")(keyGeneratorCtor)
    if (metadataStore != null) __obj.updateDynamic("metadataStore")(metadataStore)
    if (queryOptions != null) __obj.updateDynamic("queryOptions")(queryOptions)
    if (saveOptions != null) __obj.updateDynamic("saveOptions")(saveOptions)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (validationOptions != null) __obj.updateDynamic("validationOptions")(validationOptions)
    __obj.asInstanceOf[EntityManagerProperties]
  }
}


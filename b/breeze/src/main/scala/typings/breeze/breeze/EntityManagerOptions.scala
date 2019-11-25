package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityManagerOptions extends js.Object {
  var dataService: js.UndefOr[DataService] = js.undefined
  var keyGeneratorCtor: js.UndefOr[js.Function] = js.undefined
  var metadataStore: js.UndefOr[MetadataStore] = js.undefined
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  var saveOptions: js.UndefOr[SaveOptions] = js.undefined
  var serviceName: js.UndefOr[String] = js.undefined
  var validationOptions: js.UndefOr[ValidationOptions] = js.undefined
}

object EntityManagerOptions {
  @scala.inline
  def apply(
    dataService: DataService = null,
    keyGeneratorCtor: js.Function = null,
    metadataStore: MetadataStore = null,
    queryOptions: QueryOptions = null,
    saveOptions: SaveOptions = null,
    serviceName: String = null,
    validationOptions: ValidationOptions = null
  ): EntityManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (dataService != null) __obj.updateDynamic("dataService")(dataService.asInstanceOf[js.Any])
    if (keyGeneratorCtor != null) __obj.updateDynamic("keyGeneratorCtor")(keyGeneratorCtor.asInstanceOf[js.Any])
    if (metadataStore != null) __obj.updateDynamic("metadataStore")(metadataStore.asInstanceOf[js.Any])
    if (queryOptions != null) __obj.updateDynamic("queryOptions")(queryOptions.asInstanceOf[js.Any])
    if (saveOptions != null) __obj.updateDynamic("saveOptions")(saveOptions.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (validationOptions != null) __obj.updateDynamic("validationOptions")(validationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityManagerOptions]
  }
}


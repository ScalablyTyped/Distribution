package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptions extends js.Object {
  var allowConcurrentSaves: Boolean
  var dataService: DataService
  var resourceName: String
  var tag: js.Object
  def setAsDefault(): SaveOptions
  def using(config: SaveOptionsConfiguration): SaveOptions
}

object SaveOptions {
  @scala.inline
  def apply(
    allowConcurrentSaves: Boolean,
    dataService: DataService,
    resourceName: String,
    setAsDefault: () => SaveOptions,
    tag: js.Object,
    using: SaveOptionsConfiguration => SaveOptions
  ): SaveOptions = {
    val __obj = js.Dynamic.literal(allowConcurrentSaves = allowConcurrentSaves.asInstanceOf[js.Any], dataService = dataService.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], setAsDefault = js.Any.fromFunction0(setAsDefault), tag = tag.asInstanceOf[js.Any], using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[SaveOptions]
  }
}


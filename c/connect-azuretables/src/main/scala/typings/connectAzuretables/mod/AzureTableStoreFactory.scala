package typings.connectAzuretables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureTableStoreFactory extends js.Object {
  def create(options: AzureTableStoreOptions): AzureTableStore
}

object AzureTableStoreFactory {
  @scala.inline
  def apply(create: AzureTableStoreOptions => AzureTableStore): AzureTableStoreFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[AzureTableStoreFactory]
  }
}


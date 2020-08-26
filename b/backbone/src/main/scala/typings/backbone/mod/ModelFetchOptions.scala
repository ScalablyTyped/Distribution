package typings.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelFetchOptions
  extends PersistenceOptions
     with Silenceable
     with Validable
     with Parseable

object ModelFetchOptions {
  @scala.inline
  def apply(): ModelFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelFetchOptions]
  }
}


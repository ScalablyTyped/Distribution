package typings.awsSdkRoute53IdNormalizerMiddleware.mod

import typings.awsSdkRoute53IdNormalizerMiddleware.anon.Changes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeBatchBearer extends js.Object {
  var ChangeBatch: Changes
}

object ChangeBatchBearer {
  @scala.inline
  def apply(ChangeBatch: Changes): ChangeBatchBearer = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeBatchBearer]
  }
}


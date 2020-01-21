package typings.awsSdkRoute53IdNormalizerMiddleware

import typings.awsSdkRoute53IdNormalizerMiddleware.mod.Change
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChanges extends js.Object {
  var Changes: Iterable[Change]
}

object AnonChanges {
  @scala.inline
  def apply(Changes: Iterable[Change]): AnonChanges = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChanges]
  }
}


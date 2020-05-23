package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasChangesChangedEventArgs extends js.Object {
  var entityManager: EntityManager
  var hasChanges: Boolean
}

object HasChangesChangedEventArgs {
  @scala.inline
  def apply(entityManager: EntityManager, hasChanges: Boolean): HasChangesChangedEventArgs = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChangesChangedEventArgs]
  }
}


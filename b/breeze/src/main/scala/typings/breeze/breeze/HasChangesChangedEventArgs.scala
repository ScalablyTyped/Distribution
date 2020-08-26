package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasChangesChangedEventArgs extends js.Object {
  var entityManager: EntityManager = js.native
  var hasChanges: Boolean = js.native
}

object HasChangesChangedEventArgs {
  @scala.inline
  def apply(entityManager: EntityManager, hasChanges: Boolean): HasChangesChangedEventArgs = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChangesChangedEventArgs]
  }
  @scala.inline
  implicit class HasChangesChangedEventArgsOps[Self <: HasChangesChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setEntityManager(value: EntityManager): Self = this.set("entityManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasChanges(value: Boolean): Self = this.set("hasChanges", value.asInstanceOf[js.Any])
  }
  
}


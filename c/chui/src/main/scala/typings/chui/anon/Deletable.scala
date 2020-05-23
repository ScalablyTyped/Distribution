package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deletable extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var deletable: js.UndefOr[Boolean] = js.undefined
  var deleteLabel: js.UndefOr[String] = js.undefined
  var doneLabel: js.UndefOr[String] = js.undefined
  var editLabel: js.UndefOr[String] = js.undefined
  var movable: js.UndefOr[Boolean] = js.undefined
}

object Deletable {
  @scala.inline
  def apply(
    callback: js.Function = null,
    deletable: js.UndefOr[Boolean] = js.undefined,
    deleteLabel: String = null,
    doneLabel: String = null,
    editLabel: String = null,
    movable: js.UndefOr[Boolean] = js.undefined
  ): Deletable = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(deletable)) __obj.updateDynamic("deletable")(deletable.get.asInstanceOf[js.Any])
    if (deleteLabel != null) __obj.updateDynamic("deleteLabel")(deleteLabel.asInstanceOf[js.Any])
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel.asInstanceOf[js.Any])
    if (editLabel != null) __obj.updateDynamic("editLabel")(editLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletable]
  }
}


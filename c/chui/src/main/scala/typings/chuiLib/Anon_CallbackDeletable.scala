package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDeletable extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var deletable: js.UndefOr[scala.Boolean] = js.undefined
  var deleteLabel: js.UndefOr[java.lang.String] = js.undefined
  var doneLabel: js.UndefOr[java.lang.String] = js.undefined
  var editLabel: js.UndefOr[java.lang.String] = js.undefined
  var movable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CallbackDeletable {
  @scala.inline
  def apply(
    callback: js.Function = null,
    deletable: js.UndefOr[scala.Boolean] = js.undefined,
    deleteLabel: java.lang.String = null,
    doneLabel: java.lang.String = null,
    editLabel: java.lang.String = null,
    movable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CallbackDeletable = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(deletable)) __obj.updateDynamic("deletable")(deletable)
    if (deleteLabel != null) __obj.updateDynamic("deleteLabel")(deleteLabel)
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel)
    if (editLabel != null) __obj.updateDynamic("editLabel")(editLabel)
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    __obj.asInstanceOf[Anon_CallbackDeletable]
  }
}


package typings.cradle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var continuous: js.UndefOr[Boolean] = js.undefined
  var create_target: js.UndefOr[Boolean] = js.undefined
  var doc_ids: js.UndefOr[js.Array[String]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var query_params: js.UndefOr[js.Any] = js.undefined
  var source: String | AnonUrl
  var target: String | AnonUrl
}

object AnonCancel {
  @scala.inline
  def apply(
    source: String | AnonUrl,
    target: String | AnonUrl,
    cancel: js.UndefOr[Boolean] = js.undefined,
    continuous: js.UndefOr[Boolean] = js.undefined,
    create_target: js.UndefOr[Boolean] = js.undefined,
    doc_ids: js.Array[String] = null,
    filter: String = null,
    proxy: String = null,
    query_params: js.Any = null
  ): AnonCancel = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(create_target)) __obj.updateDynamic("create_target")(create_target.asInstanceOf[js.Any])
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (query_params != null) __obj.updateDynamic("query_params")(query_params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}


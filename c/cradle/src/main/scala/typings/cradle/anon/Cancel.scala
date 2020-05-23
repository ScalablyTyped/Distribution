package typings.cradle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var continuous: js.UndefOr[Boolean] = js.undefined
  var create_target: js.UndefOr[Boolean] = js.undefined
  var doc_ids: js.UndefOr[js.Array[String]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var query_params: js.UndefOr[js.Any] = js.undefined
  var source: String | Url
  var target: String | Url
}

object Cancel {
  @scala.inline
  def apply(
    source: String | Url,
    target: String | Url,
    cancel: js.UndefOr[Boolean] = js.undefined,
    continuous: js.UndefOr[Boolean] = js.undefined,
    create_target: js.UndefOr[Boolean] = js.undefined,
    doc_ids: js.Array[String] = null,
    filter: String = null,
    proxy: String = null,
    query_params: js.Any = null
  ): Cancel = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(create_target)) __obj.updateDynamic("create_target")(create_target.get.asInstanceOf[js.Any])
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (query_params != null) __obj.updateDynamic("query_params")(query_params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}


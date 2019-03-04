package typings
package cradleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  var create_target: js.UndefOr[scala.Boolean] = js.undefined
  var doc_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var query_params: js.UndefOr[js.Any] = js.undefined
  var source: java.lang.String | Anon_Url
  var target: java.lang.String | Anon_Url
}

object Anon_Cancel {
  @scala.inline
  def apply(
    source: java.lang.String | Anon_Url,
    target: java.lang.String | Anon_Url,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    create_target: js.UndefOr[scala.Boolean] = js.undefined,
    doc_ids: js.Array[java.lang.String] = null,
    filter: java.lang.String = null,
    proxy: java.lang.String = null,
    query_params: js.Any = null
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(create_target)) __obj.updateDynamic("create_target")(create_target)
    if (doc_ids != null) __obj.updateDynamic("doc_ids")(doc_ids)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (query_params != null) __obj.updateDynamic("query_params")(query_params)
    __obj.asInstanceOf[Anon_Cancel]
  }
}


package typings.clusterizeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blocks_in_cluster: js.UndefOr[Double] = js.undefined
  var callbacks: js.UndefOr[Callbacks] = js.undefined
  var contentId: String
  var keep_parity: js.UndefOr[Boolean] = js.undefined
  var no_data_class: js.UndefOr[String] = js.undefined
  var no_data_text: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[String]] = js.undefined
  var rows_in_block: js.UndefOr[Double] = js.undefined
  var scrollId: String
  var show_no_data_row: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    contentId: String,
    scrollId: String,
    blocks_in_cluster: Int | Double = null,
    callbacks: Callbacks = null,
    keep_parity: js.UndefOr[Boolean] = js.undefined,
    no_data_class: String = null,
    no_data_text: String = null,
    rows: js.Array[String] = null,
    rows_in_block: Int | Double = null,
    show_no_data_row: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
    if (blocks_in_cluster != null) __obj.updateDynamic("blocks_in_cluster")(blocks_in_cluster.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_parity)) __obj.updateDynamic("keep_parity")(keep_parity.asInstanceOf[js.Any])
    if (no_data_class != null) __obj.updateDynamic("no_data_class")(no_data_class.asInstanceOf[js.Any])
    if (no_data_text != null) __obj.updateDynamic("no_data_text")(no_data_text.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rows_in_block != null) __obj.updateDynamic("rows_in_block")(rows_in_block.asInstanceOf[js.Any])
    if (!js.isUndefined(show_no_data_row)) __obj.updateDynamic("show_no_data_row")(show_no_data_row.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


package typings
package clusterizeDotJsLib.clusterizeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blocks_in_cluster: js.UndefOr[scala.Double] = js.undefined
  var callbacks: js.UndefOr[Callbacks] = js.undefined
  var contentId: java.lang.String
  var keep_parity: js.UndefOr[scala.Boolean] = js.undefined
  var no_data_class: js.UndefOr[java.lang.String] = js.undefined
  var no_data_text: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var rows_in_block: js.UndefOr[scala.Double] = js.undefined
  var scrollId: java.lang.String
  var show_no_data_row: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    contentId: java.lang.String,
    scrollId: java.lang.String,
    blocks_in_cluster: scala.Int | scala.Double = null,
    callbacks: Callbacks = null,
    keep_parity: js.UndefOr[scala.Boolean] = js.undefined,
    no_data_class: java.lang.String = null,
    no_data_text: java.lang.String = null,
    rows: js.Array[java.lang.String] = null,
    rows_in_block: scala.Int | scala.Double = null,
    show_no_data_row: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(contentId = contentId, scrollId = scrollId)
    if (blocks_in_cluster != null) __obj.updateDynamic("blocks_in_cluster")(blocks_in_cluster.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (!js.isUndefined(keep_parity)) __obj.updateDynamic("keep_parity")(keep_parity)
    if (no_data_class != null) __obj.updateDynamic("no_data_class")(no_data_class)
    if (no_data_text != null) __obj.updateDynamic("no_data_text")(no_data_text)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (rows_in_block != null) __obj.updateDynamic("rows_in_block")(rows_in_block.asInstanceOf[js.Any])
    if (!js.isUndefined(show_no_data_row)) __obj.updateDynamic("show_no_data_row")(show_no_data_row)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Options]
  }
}


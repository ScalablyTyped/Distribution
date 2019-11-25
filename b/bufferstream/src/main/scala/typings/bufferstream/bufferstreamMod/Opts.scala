package typings.bufferstream.bufferstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  /*
  			if true and the source is a child_process the stream will block the entire process (timeouts wont work anymore, but splitting and listening on data still works, because they work sync)
  		*/
  var blocking: js.UndefOr[Boolean] = js.undefined
  /*
  			immediately call disable
  		*/
  var disabled: js.UndefOr[Boolean] = js.undefined
  /*
  			default encoding for writing strings
  		*/
  var encoding: js.UndefOr[String] = js.undefined
  /*
  			defines buffer level or sets buffer to given size (see ↓setSize for more)
  		*/
  var size: js.UndefOr[js.Any] = js.undefined
  /*
  			short form for:
  			split(token, function (chunk) {emit('data', chunk)})
  		*/
  // String or Buffer
  var split: js.UndefOr[js.Any] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    blocking: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    size: js.Any = null,
    split: js.Any = null
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocking)) __obj.updateDynamic("blocking")(blocking.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}


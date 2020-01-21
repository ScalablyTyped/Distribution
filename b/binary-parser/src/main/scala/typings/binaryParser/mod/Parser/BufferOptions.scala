package typings.binaryParser.mod.Parser

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends Options {
  @JSName("clone")
  var clone_FBufferOptions: js.UndefOr[Boolean] = js.undefined
  var length: js.UndefOr[
    Double | String | (js.ThisFunction0[/* this */ typings.binaryParser.mod.Parser[_], Double])
  ] = js.undefined
  var readUntil: js.UndefOr[String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean])] = js.undefined
}

object BufferOptions {
  @scala.inline
  def apply(
    assert: String | Double | (js.Function1[/* value */ Data, Boolean]) = null,
    clone: js.UndefOr[Boolean] = js.undefined,
    formatter: /* value */ Data => _ = null,
    length: Double | String | (js.ThisFunction0[/* this */ typings.binaryParser.mod.Parser[_], Double]) = null,
    readUntil: String | (js.Function2[/* item */ Double, /* buffer */ Buffer, Boolean]) = null
  ): BufferOptions = {
    val __obj = js.Dynamic.literal()
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (readUntil != null) __obj.updateDynamic("readUntil")(readUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
}


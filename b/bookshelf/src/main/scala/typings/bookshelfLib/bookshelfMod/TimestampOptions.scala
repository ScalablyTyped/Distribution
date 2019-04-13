package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampOptions extends js.Object {
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object TimestampOptions {
  @scala.inline
  def apply(method: java.lang.String = null): TimestampOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[TimestampOptions]
  }
}


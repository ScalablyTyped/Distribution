package typings.cliTable3.mod

import typings.cliTable3.AnonBorder
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof cli-table3.cli-table3.TableOptions ]:? cli-table3.cli-table3.TableOptions[P]} */ trait TableConstructorOptions extends js.Object {
  var chars: js.UndefOr[Partial[Record[CharName, String]]] = js.undefined
  var style: js.UndefOr[Partial[AnonBorder]] = js.undefined
}

object TableConstructorOptions {
  @scala.inline
  def apply(chars: Partial[Record[CharName, String]] = null, style: Partial[AnonBorder] = null): TableConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableConstructorOptions]
  }
}


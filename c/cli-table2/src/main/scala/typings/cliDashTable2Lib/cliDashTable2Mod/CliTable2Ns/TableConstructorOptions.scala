package typings
package cliDashTable2Lib.cliDashTable2Mod.CliTable2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof cli-table2.cli-table2.CliTable2.TableOptions ]:? cli-table2.cli-table2.CliTable2.TableOptions[P]} */ trait TableConstructorOptions extends js.Object {
  var chars: js.UndefOr[stdLib.Partial[stdLib.Record[CharName, java.lang.String]]] = js.undefined
  var style: js.UndefOr[stdLib.Partial[cliDashTable2Lib.Anon_Border]] = js.undefined
}

object TableConstructorOptions {
  @scala.inline
  def apply(
    chars: stdLib.Partial[stdLib.Record[CharName, java.lang.String]] = null,
    style: stdLib.Partial[cliDashTable2Lib.Anon_Border] = null
  ): TableConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (chars != null) __obj.updateDynamic("chars")(chars)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableConstructorOptions]
  }
}


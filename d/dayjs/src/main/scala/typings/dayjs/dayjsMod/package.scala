package typings.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dayjsMod {
  import org.scalablytyped.runtime.Instantiable1
  import typings.dayjs.Anon_Format
  import typings.std.Date

  type ConfigType = String | Double | Date | Dayjs
  type OptionType = Anon_Format | String
  type PluginFunc = js.Function3[
    /* option */ js.Any, 
    /* c */ Instantiable1[js.UndefOr[/* config */ ConfigType], Dayjs], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    Unit
  ]
}

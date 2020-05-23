package typings.dayjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigType = java.lang.String | scala.Double | typings.std.Date | typings.dayjs.mod.Dayjs
  type OptionType = typings.dayjs.anon.Format | java.lang.String
  type PluginFunc[T] = js.Function3[
    /* option */ T, 
    /* c */ org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* config */ typings.dayjs.mod.ConfigType], typings.dayjs.mod.Dayjs], 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dayjs */ /* d */ js.Any, 
    scala.Unit
  ]
}

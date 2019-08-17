package typings.csvDashParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEs5Mod {
  import typings.std.Date
  import typings.std.Error

  type Callback = js.Function3[/* err */ js.UndefOr[Error], /* records */ js.UndefOr[js.Any], /* info */ Info, Unit]
  type CastingDateFunction = js.Function2[/* value */ String, /* context */ CastingContext, Date]
  type CastingFunction = js.Function2[/* value */ String, /* context */ CastingContext, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - typings.csvDashParse.csvDashParseNumbers.`false`
    - typings.csvDashParse.Anon_Name
  */
  type ColumnOption = js.UndefOr[_ColumnOption | String | Null]
}

package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableSpecimenProps extends js.Object {
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var rows: js.Array[org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode]]
}

object TableSpecimenProps {
  @scala.inline
  def apply(
    rows: js.Array[org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode]],
    columns: js.Array[java.lang.String] = null
  ): TableSpecimenProps = {
    val __obj = js.Dynamic.literal(rows = rows)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    __obj.asInstanceOf[TableSpecimenProps]
  }
}


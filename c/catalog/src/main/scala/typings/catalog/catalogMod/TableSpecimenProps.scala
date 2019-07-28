package typings.catalog.catalogMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableSpecimenProps extends js.Object {
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var rows: js.Array[StringDictionary[ReactNode]]
}

object TableSpecimenProps {
  @scala.inline
  def apply(rows: js.Array[StringDictionary[ReactNode]], columns: js.Array[String] = null): TableSpecimenProps = {
    val __obj = js.Dynamic.literal(rows = rows)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    __obj.asInstanceOf[TableSpecimenProps]
  }
}


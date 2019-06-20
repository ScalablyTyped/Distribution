package typings
package atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnNameProps extends js.Object {
  /**
    * The name displayed in the header of the column.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback to override the default name rendering behavior. The default
    * behavior is to simply use the `ColumnHeaderCell`s name prop.
    *
    * This render callback can be used, for example, to provide a
    * `EditableName` component for editing column names.
    *
    * If you define this callback, we recommend you also set
    * `<Table enableColumnInteractionBar={true}>` to avoid issues with menus or selection.
    *
    * The callback will also receive the column index if an `index` was originally
    * provided via props.
    */
  var nameRenderer: js.UndefOr[
    js.Function2[
      /* name */ java.lang.String, 
      /* index */ js.UndefOr[scala.Double], 
      reactLib.reactMod.ReactElement
    ]
  ] = js.undefined
}

object IColumnNameProps {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    nameRenderer: (/* name */ java.lang.String, /* index */ js.UndefOr[scala.Double]) => reactLib.reactMod.ReactElement = null
  ): IColumnNameProps = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2(nameRenderer))
    __obj.asInstanceOf[IColumnNameProps]
  }
}


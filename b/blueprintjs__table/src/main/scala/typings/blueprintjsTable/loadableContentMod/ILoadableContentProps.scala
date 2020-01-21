package typings.blueprintjsTable.loadableContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadableContentProps extends js.Object {
  /**
    * If true, render a skeleton. Otherwise render the single, non-string child passed to this
    * component.
    */
  var loading: Boolean
  /**
    * If true, show a skeleton of random width (25-75% cell width) when rendering the loading state.
    * @default false
    */
  var variableLength: js.UndefOr[Boolean] = js.undefined
}

object ILoadableContentProps {
  @scala.inline
  def apply(loading: Boolean, variableLength: js.UndefOr[Boolean] = js.undefined): ILoadableContentProps = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    if (!js.isUndefined(variableLength)) __obj.updateDynamic("variableLength")(variableLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadableContentProps]
  }
}


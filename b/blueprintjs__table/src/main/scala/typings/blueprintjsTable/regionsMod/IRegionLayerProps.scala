package typings.blueprintjsTable.regionsMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegionLayerProps extends IProps {
  /**
    * The array of CSS styles to apply to each region. The ith style object in this array will be
    * applied to the ith region in `regions`.
    */
  var regionStyles: js.UndefOr[js.Array[CSSProperties]] = js.undefined
  /**
    * The array of regions to render.
    */
  var regions: js.UndefOr[js.Array[IRegion]] = js.undefined
}

object IRegionLayerProps {
  @scala.inline
  def apply(
    className: String = null,
    regionStyles: js.Array[CSSProperties] = null,
    regions: js.Array[IRegion] = null
  ): IRegionLayerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (regionStyles != null) __obj.updateDynamic("regionStyles")(regionStyles.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegionLayerProps]
  }
}


package typings.blueprintjsTable.regionsMod

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRegionLayerProps extends IProps {
  
  /**
    * The array of CSS styles to apply to each region. The ith style object in this array will be
    * applied to the ith region in `regions`.
    */
  var regionStyles: js.UndefOr[js.Array[CSSProperties]] = js.native
  
  /**
    * The array of regions to render.
    */
  var regions: js.UndefOr[js.Array[IRegion]] = js.native
}
object IRegionLayerProps {
  
  @scala.inline
  def apply(): IRegionLayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegionLayerProps]
  }
  
  @scala.inline
  implicit class IRegionLayerPropsOps[Self <: IRegionLayerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegionStylesVarargs(value: CSSProperties*): Self = this.set("regionStyles", js.Array(value :_*))
    
    @scala.inline
    def setRegionStyles(value: js.Array[CSSProperties]): Self = this.set("regionStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionStyles: Self = this.set("regionStyles", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: IRegion*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[IRegion]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
}

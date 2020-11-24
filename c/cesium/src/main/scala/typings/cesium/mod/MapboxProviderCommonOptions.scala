package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxProviderCommonOptions extends js.Object {
  
  /**
    * A credit for the data source, which is displayed on the canvas
    */
  var credit: js.UndefOr[Credit | String] = js.native
  
  /**
    * The ellipsoid.
    * If not specified, the WGS84 ellipsoid is used
    */
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  
  /**
    * The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit
    * @default undefined
    */
  var maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * The minimum level-of-detail supported by the imagery provider.
    * Take care when specifying this that the number of tiles at the minimum level is small, such as four or less.
    * A larger number is likely to result in rendering problems
    * @default 0
    */
  var minimumLevel: js.UndefOr[Double] = js.native
  
  /**
    * The rectangle, in radians, covered by the image
    * @defualt Rectangle.MAX_VALUE
    */
  var rectangle: js.UndefOr[Rectangle] = js.native
}
object MapboxProviderCommonOptions {
  
  @scala.inline
  def apply(): MapboxProviderCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapboxProviderCommonOptions]
  }
  
  @scala.inline
  implicit class MapboxProviderCommonOptionsOps[Self <: MapboxProviderCommonOptions] (val x: Self) extends AnyVal {
    
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
    def setCredit(value: Credit | String): Self = this.set("credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredit: Self = this.set("credit", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = this.set("maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLevel: Self = this.set("maximumLevel", js.undefined)
    
    @scala.inline
    def setMinimumLevel(value: Double): Self = this.set("minimumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLevel: Self = this.set("minimumLevel", js.undefined)
    
    @scala.inline
    def setRectangle(value: Rectangle): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
  }
}

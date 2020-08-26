package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataBinningOptions extends js.Object {
  /* The name of a property in the Pushpin.metadata object on which to perform calculations (average, count, sum) against the pushpins in each data bin. */
  var aggregationProperty: js.UndefOr[String] = js.native
  /*
    * A callback function which defines the color a data bin polygon should be. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a color value.
    */
  var colorCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      String | Color
    ]
  ] = js.native
  /* The shape of the data bin to generate. Default: hexagon */
  var dataBinType: js.UndefOr[DataBinType] = js.native
  /* The distance units of the radius option. Default: meters */
  var distanceUnits: js.UndefOr[DistanceUnits] = js.native
  /* The default options used for rendering the data bin polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  /*
    * A spatial distance which will be converted into a pixel distance at the equater and used to generate symetrically sized data bins
    * that have the apprimate spatial distance radius. Default: 1000
    */
  var radius: js.UndefOr[Double] = js.native
  /*
    * A callback function which defines how much to scale a data bins size. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a number between 0 and 1.
    */
  var scaleCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      Double
    ]
  ] = js.native
}

object IDataBinningOptions {
  @scala.inline
  def apply(): IDataBinningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataBinningOptions]
  }
  @scala.inline
  implicit class IDataBinningOptionsOps[Self <: IDataBinningOptions] (val x: Self) extends AnyVal {
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
    def setAggregationProperty(value: String): Self = this.set("aggregationProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationProperty: Self = this.set("aggregationProperty", js.undefined)
    @scala.inline
    def setColorCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => String | Color
    ): Self = this.set("colorCallback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteColorCallback: Self = this.set("colorCallback", js.undefined)
    @scala.inline
    def setDataBinType(value: DataBinType): Self = this.set("dataBinType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataBinType: Self = this.set("dataBinType", js.undefined)
    @scala.inline
    def setDistanceUnits(value: DistanceUnits): Self = this.set("distanceUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceUnits: Self = this.set("distanceUnits", js.undefined)
    @scala.inline
    def setPolygonOptions(value: IPolygonOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setScaleCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => Double
    ): Self = this.set("scaleCallback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteScaleCallback: Self = this.set("scaleCallback", js.undefined)
  }
  
}


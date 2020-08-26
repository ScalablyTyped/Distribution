package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IDataBinningOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.DataBinningLayer")
@js.native
/**
  * Initializes the data binning layer.
  * @param pushpins The array of pushpins that are used to generate the data bins.
  * @param options The options used for calculating and rendering the data bins.
  */
class DataBinningLayer ()
  extends typings.bingmaps.Microsoft.Maps.DataBinningLayer {
  def this(pushpins: js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]) = this()
  def this(pushpins: js.UndefOr[scala.Nothing], options: IDataBinningOptions) = this()
  def this(pushpins: js.Array[typings.bingmaps.Microsoft.Maps.Pushpin], options: IDataBinningOptions) = this()
}


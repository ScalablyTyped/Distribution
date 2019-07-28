package typings.bingmaps.MicrosoftNs.MapsNs

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
class DataBinningLayer () extends Layer {
  def this(pushpins: js.Array[Pushpin]) = this()
  def this(pushpins: js.Array[Pushpin], options: IDataBinningOptions) = this()
  /**
    * Gets the options used for calculating and rendering the data bins.
    * @returns The options used for calculating and rendering the data bins.
    */
  def getOptions(): IDataBinningOptions = js.native
  /**
    * Gets all pushpins that are in the layers.
    * @returns All pushpins that are in the layers.
    */
  def getPushpins(): js.Array[Pushpin] = js.native
  /**
    * Sets the options used for calculating and rendering the data bins.
    * @param options The options used for calculating and rendering the data bins.
    */
  def setOptions(options: IDataBinningOptions): Unit = js.native
  /**
    * Sets the array of pushpins that are used to generate the data bins.
    * @param pushpins The array of pushpins that are used to generate the data bins.
    */
  def setPushpins(pushpins: js.Array[Pushpin]): Unit = js.native
}


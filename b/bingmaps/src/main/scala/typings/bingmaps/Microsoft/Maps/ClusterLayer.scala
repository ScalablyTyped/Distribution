package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLayer extends IDataLayer {
  /**
    * Gets the pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The pushpin in the specified cluster grid cell which can be either a ClusterPushpin if there are multiple pushpins in a cell or a single Pushpin.
    */
  def getClusterPushpinByGridKey(gridKey: Double): ClusterPushpin | Pushpin = js.native
  /**
    * Gets all the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    * @returns All the pushpins that are in the current map view. If clustering is disabled, all pushpins in the clustering layer are returned.
    */
  def getDisplayedPushpins(): js.Array[Pushpin] = js.native
  /**
    * Gets the current options used by the cluster layer.
    * @returns The current options used by the cluster layer.
    */
  def getOptions(): IClusterLayerOptions = js.native
  /**
    * Gets all pushpins that are in the layers.
    * @returns An array of all the pushpins that are in the layers.
    */
  def getPushpins(): js.Array[Pushpin] = js.native
  /**
    * Gets the original pushpins that are in the specified grid cell.
    * @param The gridKey index to retrieve the pushpins for.
    * @returns The original pushpins that are in the specified grid cell.
    */
  def getPushpinsByGridKey(gridKey: Double): js.Array[Pushpin] = js.native
  /**
    * Sets the clustering options to use in the layer.
    * @params options The clustering options to use in the layer.
    */
  def setOptions(options: IClusterLayerOptions): Unit = js.native
  /**
    * Sets the array of pushpins that are used in the clustering layer.
    * @param pushpins An array of pushpins that are to be used by the clustering layer.
    */
  def setPushpins(pushpins: js.Array[Pushpin]): Unit = js.native
}

object ClusterLayer {
  @scala.inline
  def apply(
    clear: () => Unit,
    getClusterPushpinByGridKey: Double => ClusterPushpin | Pushpin,
    getDisplayedPushpins: () => js.Array[Pushpin],
    getOptions: () => IClusterLayerOptions,
    getPushpins: () => js.Array[Pushpin],
    getPushpinsByGridKey: Double => js.Array[Pushpin],
    setOptions: IClusterLayerOptions => Unit,
    setPushpins: js.Array[Pushpin] => Unit
  ): ClusterLayer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getClusterPushpinByGridKey = js.Any.fromFunction1(getClusterPushpinByGridKey), getDisplayedPushpins = js.Any.fromFunction0(getDisplayedPushpins), getOptions = js.Any.fromFunction0(getOptions), getPushpins = js.Any.fromFunction0(getPushpins), getPushpinsByGridKey = js.Any.fromFunction1(getPushpinsByGridKey), setOptions = js.Any.fromFunction1(setOptions), setPushpins = js.Any.fromFunction1(setPushpins))
    __obj.asInstanceOf[ClusterLayer]
  }
  @scala.inline
  implicit class ClusterLayerOps[Self <: ClusterLayer] (val x: Self) extends AnyVal {
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
    def setGetClusterPushpinByGridKey(value: Double => ClusterPushpin | Pushpin): Self = this.set("getClusterPushpinByGridKey", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDisplayedPushpins(value: () => js.Array[Pushpin]): Self = this.set("getDisplayedPushpins", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOptions(value: () => IClusterLayerOptions): Self = this.set("getOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPushpins(value: () => js.Array[Pushpin]): Self = this.set("getPushpins", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPushpinsByGridKey(value: Double => js.Array[Pushpin]): Self = this.set("getPushpinsByGridKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOptions(value: IClusterLayerOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPushpins(value: js.Array[Pushpin] => Unit): Self = this.set("setPushpins", js.Any.fromFunction1(value))
  }
  
}


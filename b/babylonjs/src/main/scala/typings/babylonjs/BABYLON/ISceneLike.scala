package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISceneLike extends js.Object {
  var offlineProvider: IOfflineProvider
  def _addPendingData(data: js.Any): Unit
  def _removePendingData(data: js.Any): Unit
}

object ISceneLike {
  @scala.inline
  def apply(
    _addPendingData: js.Any => Unit,
    _removePendingData: js.Any => Unit,
    offlineProvider: IOfflineProvider
  ): ISceneLike = {
    val __obj = js.Dynamic.literal(_addPendingData = js.Any.fromFunction1(_addPendingData), _removePendingData = js.Any.fromFunction1(_removePendingData), offlineProvider = offlineProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLike]
  }
}


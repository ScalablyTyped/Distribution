package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerEngineType extends js.Object {
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.native
  /**
    * The list of engine versions.
    */
  var EngineVersions: js.UndefOr[listOfEngineVersion] = js.native
}

object BrokerEngineType {
  @scala.inline
  def apply(EngineType: EngineType = null, EngineVersions: listOfEngineVersion = null): BrokerEngineType = {
    val __obj = js.Dynamic.literal()
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersions != null) __obj.updateDynamic("EngineVersions")(EngineVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerEngineType]
  }
}


package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingEngine extends js.Object {
  /**
    * The name of the rendering engine.
    */
  var name: js.UndefOr[RenderingEngineType] = js.native
  /**
    * The version of the rendering engine.
    */
  var version: js.UndefOr[RenderingEngineVersionType] = js.native
}

object RenderingEngine {
  @scala.inline
  def apply(name: RenderingEngineType = null, version: RenderingEngineVersionType = null): RenderingEngine = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingEngine]
  }
}


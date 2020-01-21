package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleEventConfiguration extends js.Object {
  /**
    * A ShutdownEventConfiguration object that specifies the Shutdown event configuration.
    */
  var Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.native
}

object LifecycleEventConfiguration {
  @scala.inline
  def apply(Shutdown: ShutdownEventConfiguration = null): LifecycleEventConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Shutdown != null) __obj.updateDynamic("Shutdown")(Shutdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleEventConfiguration]
  }
}


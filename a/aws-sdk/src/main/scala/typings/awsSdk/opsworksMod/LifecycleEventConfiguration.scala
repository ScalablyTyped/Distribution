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
  def apply(): LifecycleEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleEventConfiguration]
  }
  @scala.inline
  implicit class LifecycleEventConfigurationOps[Self <: LifecycleEventConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShutdown(value: ShutdownEventConfiguration): Self = this.set("Shutdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShutdown: Self = this.set("Shutdown", js.undefined)
  }
  
}


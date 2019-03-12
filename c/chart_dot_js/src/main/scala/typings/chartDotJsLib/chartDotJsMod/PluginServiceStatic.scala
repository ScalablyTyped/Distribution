package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceStatic extends js.Object {
  def register(
    plugin: chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceGlobalRegistration with chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceRegistrationOptions
  ): scala.Unit
  def unregister(
    plugin: chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceGlobalRegistration with chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceRegistrationOptions
  ): scala.Unit
}

object PluginServiceStatic {
  @scala.inline
  def apply(
    register: chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceGlobalRegistration with chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceRegistrationOptions => scala.Unit,
    unregister: chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceGlobalRegistration with chartDotJsLib.chartDotJsMod.ChartNs.PluginServiceRegistrationOptions => scala.Unit
  ): PluginServiceStatic = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[PluginServiceStatic]
  }
}


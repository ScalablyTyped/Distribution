package typings.chartJs.mod

import typings.chartJs.anon.keyinScaleTypeScaleOption
import typings.chartJs.basicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaults_
  extends StObject
     with CoreChartOptions[ChartType]
     with ElementChartOptions[ChartType]
     with PluginChartOptions[ChartType] {
  
  def describe(scope: String, values: AnyObject): AnyObject = js.native
  
  def get(scope: String): AnyObject = js.native
  
  def `override`(scope: String, values: AnyObject): AnyObject = js.native
  
  /**
    * Routes the named defaults to fallback to another scope/name.
    * This routing is useful when those target values, like defaults.color, are changed runtime.
    * If the values would be copied, the runtime change would not take effect. By routing, the
    * fallback is evaluated at each access, so its always up to date.
    *
    * Example:
    *
    *   defaults.route('elements.arc', 'backgroundColor', '', 'color')
    *    - reads the backgroundColor from defaults.color when undefined locally
    *
    * @param scope Scope this route applies to.
    * @param name Property name that should be routed to different namespace when not defined here.
    * @param targetScope The namespace where those properties should be routed to.
    * Empty string ('') is the root of defaults.
    * @param targetName The target name in the target scope the property should be routed to.
    */
  def route(scope: String, name: String, targetScope: String, targetName: String): Unit = js.native
  
  var scale: ScaleOptionsByType[ScaleType] = js.native
  
  var scales: keyinScaleTypeScaleOption = js.native
  
  def set(scope: String, values: AnyObject): AnyObject = js.native
  def set(values: AnyObject): AnyObject = js.native
}

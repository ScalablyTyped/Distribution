package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/core", "createConfigItem")
@js.native
object createConfigItem extends js.Object {
  
  def apply(value: js.Tuple2[PluginTarget, PluginOptions]): ConfigItem = js.native
  def apply(value: js.Tuple2[PluginTarget, PluginOptions], options: CreateConfigItemOptions): ConfigItem = js.native
  def apply(value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]]): ConfigItem = js.native
  def apply(
    value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]],
    options: CreateConfigItemOptions
  ): ConfigItem = js.native
  def apply(value: PluginTarget): ConfigItem = js.native
  def apply(value: PluginTarget, options: CreateConfigItemOptions): ConfigItem = js.native
}

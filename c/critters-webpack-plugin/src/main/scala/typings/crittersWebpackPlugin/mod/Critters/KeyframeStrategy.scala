package typings.crittersWebpackPlugin.mod.Critters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Controls which keyframes rules are inlined
  * - "critical": Inline keyframes rules used by the critical CSS.
  * - "all" Inline all keyframes rules.
  * - "none" Remove all keyframes rules
  */
/* Rewritten from type alias, can be one of: 
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.critical
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.all
  - typings.crittersWebpackPlugin.crittersWebpackPluginStrings.none
*/
trait KeyframeStrategy extends js.Object

object KeyframeStrategy {
  @scala.inline
  def all: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.all = "all".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.all]
  @scala.inline
  def critical: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.critical = "critical".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.critical]
  @scala.inline
  def none: typings.crittersWebpackPlugin.crittersWebpackPluginStrings.none = "none".asInstanceOf[typings.crittersWebpackPlugin.crittersWebpackPluginStrings.none]
}


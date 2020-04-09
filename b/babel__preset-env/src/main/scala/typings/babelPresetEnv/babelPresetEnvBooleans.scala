package typings.babelPresetEnv

import typings.babelPresetEnv.mod.ModuleOption
import typings.babelPresetEnv.mod.UseBuiltInsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object babelPresetEnvBooleans {
  @js.native
  sealed trait `false`
    extends ModuleOption
       with UseBuiltInsOption
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}


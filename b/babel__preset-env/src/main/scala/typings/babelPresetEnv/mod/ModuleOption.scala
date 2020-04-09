package typings.babelPresetEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelPresetEnv.babelPresetEnvBooleans.`false`
  - typings.babelPresetEnv.babelPresetEnvStrings.amd
  - typings.babelPresetEnv.babelPresetEnvStrings.umd
  - typings.babelPresetEnv.babelPresetEnvStrings.systemjs
  - typings.babelPresetEnv.babelPresetEnvStrings.commonjs
  - typings.babelPresetEnv.babelPresetEnvStrings.cjs
  - typings.babelPresetEnv.babelPresetEnvStrings.auto
*/
trait ModuleOption extends js.Object

object ModuleOption {
  @scala.inline
  def amd: typings.babelPresetEnv.babelPresetEnvStrings.amd = this.cast("amd")
  @scala.inline
  def auto: typings.babelPresetEnv.babelPresetEnvStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cjs: typings.babelPresetEnv.babelPresetEnvStrings.cjs = this.cast("cjs")
  @scala.inline
  def commonjs: typings.babelPresetEnv.babelPresetEnvStrings.commonjs = this.cast("commonjs")
  @scala.inline
  def `false`: typings.babelPresetEnv.babelPresetEnvBooleans.`false` = this.cast(false)
  @scala.inline
  def systemjs: typings.babelPresetEnv.babelPresetEnvStrings.systemjs = this.cast("systemjs")
  @scala.inline
  def umd: typings.babelPresetEnv.babelPresetEnvStrings.umd = this.cast("umd")
}


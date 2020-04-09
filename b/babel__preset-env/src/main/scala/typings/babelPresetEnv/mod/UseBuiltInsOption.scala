package typings.babelPresetEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelPresetEnv.babelPresetEnvBooleans.`false`
  - typings.babelPresetEnv.babelPresetEnvStrings.usage
  - typings.babelPresetEnv.babelPresetEnvStrings.entry
*/
trait UseBuiltInsOption extends js.Object

object UseBuiltInsOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def entry: typings.babelPresetEnv.babelPresetEnvStrings.entry = this.cast("entry")
  @scala.inline
  def `false`: typings.babelPresetEnv.babelPresetEnvBooleans.`false` = this.cast(false)
  @scala.inline
  def usage: typings.babelPresetEnv.babelPresetEnvStrings.usage = this.cast("usage")
}


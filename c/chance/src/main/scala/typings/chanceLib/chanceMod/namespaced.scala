package typings
package chanceLib.chanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chance", JSImport.Namespace)
@js.native
class namespaced ()
  extends chanceLib.ChanceNs.Chance {
  def this(generator: js.Function0[_]) = this()
  def this(seed: chanceLib.ChanceNs.Seed) = this()
  /* CompleteClass */
  override var seed: chanceLib.ChanceNs.Seed = js.native
}


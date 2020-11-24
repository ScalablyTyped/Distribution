package typings.chance.mod

import org.scalablytyped.runtime.TopLevel
import typings.chance.Chance.Chance
import typings.chance.Chance.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chance", JSImport.Namespace)
@js.native
class ^ () extends Chance {
  def this(generator: js.Function0[_]) = this()
  def this(seed: Seed) = this()
}
@JSImport("chance", JSImport.Namespace)
@js.native
object ^ extends TopLevel[ExportedChance]

package typings.chance

import org.scalablytyped.runtime.Shortcut
import typings.chance.Chance.ChanceStatic
import typings.chance.Chance.Seed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chance", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typings.chance.Chance.Chance {
    def this(generator: js.Function0[_]) = this()
    def this(seed: Seed) = this()
  }
  @JSImport("chance", JSImport.Namespace)
  @js.native
  val ^ : ExportedChance = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chance", "Chance")
  @js.native
  class Chance ()
    extends typings.chance.Chance.Chance {
    def this(generator: js.Function0[_]) = this()
    def this(seed: Seed) = this()
  }
  
  @js.native
  trait ExportedChance extends ChanceStatic {
    
    def Chance(): typings.chance.Chance.Chance = js.native
    def Chance(generator: js.Function0[_]): typings.chance.Chance.Chance = js.native
    def Chance(seed: Seed): typings.chance.Chance.Chance = js.native
    @JSName("Chance")
    var Chance_Original: ExportedChance = js.native
  }
  
  type _To = ExportedChance
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ExportedChance = ^
}

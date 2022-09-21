package typings.crocks.mod

import typings.crocks.maybeMaybeMod.Just
import typings.crocks.maybeMaybeMod.Nothing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Maybe {
  
  @JSImport("crocks", "Maybe.default")
  @js.native
  open class default ()
    extends typings.crocks.maybeMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typings.crocks.maybeMaybeMod.Maybe = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.maybeMaybeMod.Maybe]
    
    @JSImport("crocks", "Maybe.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("crocks", "Maybe.default.Just")
    @js.native
    def Just: js.Function1[/* val */ scala.Any, typings.crocks.maybeMaybeMod.Just] = js.native
    inline def Just_=(x: js.Function1[/* val */ scala.Any, Just]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Just")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("crocks", "Maybe.default.Nothing")
    @js.native
    def Nothing: js.Function1[/* val */ scala.Any, typings.crocks.maybeMaybeMod.Nothing] = js.native
    inline def Nothing_=(x: js.Function1[/* val */ scala.Any, Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nothing")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def of(`val`: scala.Any): Just = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Just]
    
    /* static member */
    inline def zero(): Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Nothing]
  }
}

package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscUniqueIdGeneratorMod {
  
  @JSImport("babylonjs/Misc/uniqueIdGenerator", "UniqueIdGenerator")
  @js.native
  open class UniqueIdGenerator () extends StObject
  /* static members */
  object UniqueIdGenerator {
    
    @JSImport("babylonjs/Misc/uniqueIdGenerator", "UniqueIdGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Misc/uniqueIdGenerator", "UniqueIdGenerator._UniqueIdCounter")
    @js.native
    def _UniqueIdCounter: Any = js.native
    inline def _UniqueIdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UniqueIdCounter")(x.asInstanceOf[js.Any])
  }
}

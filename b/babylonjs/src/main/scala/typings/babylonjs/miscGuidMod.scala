package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscGuidMod {
  
  @JSImport("babylonjs/Misc/guid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object GUID {
    
    @JSImport("babylonjs/Misc/guid", "GUID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
      * Be aware Math.random() could cause collisions, but:
      * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
      * @returns a pseudo random id
      */
    inline def RandomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomId")().asInstanceOf[String]
    /**
      * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
      * Be aware Math.random() could cause collisions, but:
      * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
      * @returns a pseudo random id
      */
    @JSImport("babylonjs/Misc/guid", "GUID.RandomId")
    @js.native
    def RandomId_FGUID: js.Function0[String] = js.native
    
    inline def RandomId_FGUID_=(x: js.Function0[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RandomId")(x.asInstanceOf[js.Any])
  }
  
  inline def RandomGUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomGUID")().asInstanceOf[String]
}

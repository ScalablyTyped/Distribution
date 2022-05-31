package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeStoreMod {
  
  @JSImport("babylonjs/Misc/typeStore", "_TypeStore")
  @js.native
  class TypeStore () extends StObject
  /* static members */
  object TypeStore {
    
    @JSImport("babylonjs/Misc/typeStore", "_TypeStore")
    @js.native
    val ^ : js.Any = js.native
    
    /** @hidden */
    inline def GetClass(fqdn: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClass")(fqdn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** @hidden */
    @JSImport("babylonjs/Misc/typeStore", "_TypeStore.RegisteredTypes")
    @js.native
    def RegisteredTypes: StringDictionary[js.Object] = js.native
    inline def RegisteredTypes_=(x: StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegisteredTypes")(x.asInstanceOf[js.Any])
  }
}

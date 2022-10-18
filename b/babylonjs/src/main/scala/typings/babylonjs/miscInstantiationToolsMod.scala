package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscInstantiationToolsMod {
  
  @JSImport("babylonjs/Misc/instantiationTools", "InstantiationTools")
  @js.native
  open class InstantiationTools () extends StObject
  /* static members */
  object InstantiationTools {
    
    @JSImport("babylonjs/Misc/instantiationTools", "InstantiationTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Tries to instantiate a new object from a given class name
      * @param className defines the class name to instantiate
      * @returns the new object or null if the system was not able to do the instantiation
      */
    inline def Instantiate(className: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Instantiate")(className.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Use this object to register external classes like custom textures or material
      * to allow the loaders to instantiate them
      */
    @JSImport("babylonjs/Misc/instantiationTools", "InstantiationTools.RegisteredExternalClasses")
    @js.native
    def RegisteredExternalClasses: StringDictionary[js.Object] = js.native
    inline def RegisteredExternalClasses_=(x: StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegisteredExternalClasses")(x.asInstanceOf[js.Any])
  }
}

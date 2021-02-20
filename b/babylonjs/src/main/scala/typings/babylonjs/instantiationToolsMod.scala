package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instantiationToolsMod {
  
  @JSImport("babylonjs/Misc/instantiationTools", "InstantiationTools")
  @js.native
  class InstantiationTools () extends StObject
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
    @JSImport("babylonjs/Misc/instantiationTools", "InstantiationTools.Instantiate")
    @js.native
    def Instantiate(className: String): js.Any = js.native
    
    /**
      * Use this object to register external classes like custom textures or material
      * to allow the laoders to instantiate them
      */
    @JSImport("babylonjs/Misc/instantiationTools", "InstantiationTools.RegisteredExternalClasses")
    @js.native
    def RegisteredExternalClasses: StringDictionary[js.Object] = js.native
    @scala.inline
    def RegisteredExternalClasses_=(x: StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegisteredExternalClasses")(x.asInstanceOf[js.Any])
  }
}

package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/instantiationTools", JSImport.Namespace)
@js.native
object instantiationToolsMod extends js.Object {
  @js.native
  class InstantiationTools () extends js.Object
  
  /* static members */
  @js.native
  object InstantiationTools extends js.Object {
    /**
      * Use this object to register external classes like custom textures or material
      * to allow the laoders to instantiate them
      */
    var RegisteredExternalClasses: StringDictionary[js.Object] = js.native
    /**
      * Tries to instantiate a new object from a given class name
      * @param className defines the class name to instantiate
      * @returns the new object or null if the system was not able to do the instantiation
      */
    def Instantiate(className: String): js.Any = js.native
  }
  
}


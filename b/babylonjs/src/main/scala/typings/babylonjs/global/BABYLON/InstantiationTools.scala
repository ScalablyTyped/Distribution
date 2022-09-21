package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InstantiationTools")
@js.native
open class InstantiationTools ()
  extends StObject
     with typings.babylonjs.BABYLON.InstantiationTools
/* static members */
object InstantiationTools {
  
  @JSGlobal("BABYLON.InstantiationTools")
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
  @JSGlobal("BABYLON.InstantiationTools.RegisteredExternalClasses")
  @js.native
  def RegisteredExternalClasses: org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  inline def RegisteredExternalClasses_=(x: org.scalablytyped.runtime.StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegisteredExternalClasses")(x.asInstanceOf[js.Any])
}

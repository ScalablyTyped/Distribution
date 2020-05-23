package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.InstantiationTools")
@js.native
class InstantiationTools ()
  extends typings.babylonjs.BABYLON.InstantiationTools

/* static members */
@JSGlobal("BABYLON.InstantiationTools")
@js.native
object InstantiationTools extends js.Object {
  /**
    * Use this object to register external classes like custom textures or material
    * to allow the laoders to instantiate them
    */
  var RegisteredExternalClasses: org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  /**
    * Tries to instantiate a new object from a given class name
    * @param className defines the class name to instantiate
    * @returns the new object or null if the system was not able to do the instantiation
    */
  def Instantiate(className: String): js.Any = js.native
}


package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON._TypeStore")
@js.native
class TypeStore ()
  extends typings.babylonjs.BABYLON.TypeStore
/* static members */
object TypeStore {
  
  @JSGlobal("BABYLON._TypeStore")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON._TypeStore.GetClass")
  @js.native
  def GetClass(fqdn: String): js.Any = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON._TypeStore.RegisteredTypes")
  @js.native
  def RegisteredTypes: org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  @scala.inline
  def RegisteredTypes_=(x: org.scalablytyped.runtime.StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegisteredTypes")(x.asInstanceOf[js.Any])
}

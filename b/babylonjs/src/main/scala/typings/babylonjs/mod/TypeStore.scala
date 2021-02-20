package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "_TypeStore")
@js.native
class TypeStore ()
  extends typings.babylonjs.legacyMod.TypeStore
/* static members */
object TypeStore {
  
  @JSImport("babylonjs", "_TypeStore")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  @JSImport("babylonjs", "_TypeStore.GetClass")
  @js.native
  def GetClass(fqdn: String): js.Any = js.native
  
  /** @hidden */
  @JSImport("babylonjs", "_TypeStore.RegisteredTypes")
  @js.native
  def RegisteredTypes: org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  @scala.inline
  def RegisteredTypes_=(x: org.scalablytyped.runtime.StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegisteredTypes")(x.asInstanceOf[js.Any])
}

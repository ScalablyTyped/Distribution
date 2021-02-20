package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "_TypeStore")
@js.native
class TypeStore ()
  extends typings.babylonjs.miscIndexMod.TypeStore
/* static members */
object TypeStore {
  
  @JSImport("babylonjs/index", "_TypeStore")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "_TypeStore.GetClass")
  @js.native
  def GetClass(fqdn: String): js.Any = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "_TypeStore.RegisteredTypes")
  @js.native
  def RegisteredTypes: org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  @scala.inline
  def RegisteredTypes_=(x: org.scalablytyped.runtime.StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegisteredTypes")(x.asInstanceOf[js.Any])
}

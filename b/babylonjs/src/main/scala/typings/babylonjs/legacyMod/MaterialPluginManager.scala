package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "MaterialPluginManager")
@js.native
open class MaterialPluginManager protected ()
  extends typings.babylonjs.indexMod.MaterialPluginManager {
  /**
    * Creates a new instance of the plugin manager
    * @param material material that this manager will manage the plugins for
    */
  def this(material: typings.babylonjs.materialMod.Material) = this()
}
/* static members */
object MaterialPluginManager {
  
  @JSImport("babylonjs/Legacy/legacy", "MaterialPluginManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** Map a plugin class name to a #define name (used in the vertex/fragment shaders as a marker of the plugin usage) */
  @JSImport("babylonjs/Legacy/legacy", "MaterialPluginManager._MaterialPluginClassToMainDefine")
  @js.native
  def _MaterialPluginClassToMainDefine: Any = js.native
  inline def _MaterialPluginClassToMainDefine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MaterialPluginClassToMainDefine")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "MaterialPluginManager._MaterialPluginCounter")
  @js.native
  def _MaterialPluginCounter: Any = js.native
  inline def _MaterialPluginCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MaterialPluginCounter")(x.asInstanceOf[js.Any])
}

package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "AtlasTexture")
@js.native
open class AtlasTexture protected ()
  extends typings.blackEngine.atlasTextureMod.AtlasTexture {
  def this(nativeElement: Any, jsonObject: Any) = this()
  def this(nativeElement: Any, jsonObject: Any, scale: Double) = this()
}
/* static members */
object AtlasTexture {
  
  @JSImport("black-engine", "AtlasTexture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "AtlasTexture.__naturalComparer")
  @js.native
  def __naturalComparer: Any = js.native
  inline def __naturalComparer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__naturalComparer")(x.asInstanceOf[js.Any])
  
  inline def naturalSort(dataset: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("naturalSort")(dataset.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def naturalSort(dataset: js.Array[Any], field: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("naturalSort")(dataset.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

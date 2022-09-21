package typings.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "KhronosTextureContainer")
@js.native
open class KhronosTextureContainer protected ()
  extends typings.babylonjs.khronosTextureContainerMod.KhronosTextureContainer {
  /**
    * Creates a new KhronosTextureContainer
    * @param data contents of the KTX container file
    * @param facesExpected should be either 1 or 6, based whether a cube texture or or
    */
  def this(
    /** contents of the KTX container file */
  data: js.typedarray.ArrayBufferView,
    facesExpected: Double
  ) = this()
}
/* static members */
object KhronosTextureContainer {
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer.COMPRESSED_2D")
  @js.native
  def COMPRESSED_2D: Any = js.native
  inline def COMPRESSED_2D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_2D")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer.COMPRESSED_3D")
  @js.native
  def COMPRESSED_3D: Any = js.native
  inline def COMPRESSED_3D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_3D")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer.HEADER_LEN")
  @js.native
  def HEADER_LEN: Any = js.native
  inline def HEADER_LEN_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_LEN")(x.asInstanceOf[js.Any])
  
  /**
    * Checks if the given data starts with a KTX file identifier.
    * @param data the data to check
    * @returns true if the data is a KTX file or false otherwise
    */
  inline def IsValid(data: js.typedarray.ArrayBufferView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsValid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer.TEX_2D")
  @js.native
  def TEX_2D: Any = js.native
  inline def TEX_2D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEX_2D")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "KhronosTextureContainer.TEX_3D")
  @js.native
  def TEX_3D: Any = js.native
  inline def TEX_3D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEX_3D")(x.asInstanceOf[js.Any])
}

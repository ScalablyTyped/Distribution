package typings.babylonjs.mod

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "KhronosTextureContainer")
@js.native
class KhronosTextureContainer protected ()
  extends typings.babylonjs.legacyMod.KhronosTextureContainer {
  /**
    * Creates a new KhronosTextureContainer
    * @param data contents of the KTX container file
    * @param facesExpected should be either 1 or 6, based whether a cube texture or or
    * @param threeDExpected provision for indicating that data should be a 3D texture, not implemented
    * @param textureArrayExpected provision for indicating that data should be a texture array, not implemented
    */
  def this(/** contents of the KTX container file */
  data: ArrayBufferView, facesExpected: Double) = this()
  def this(
    /** contents of the KTX container file */
  data: ArrayBufferView,
    facesExpected: Double,
    threeDExpected: Boolean
  ) = this()
  def this(
    /** contents of the KTX container file */
  data: ArrayBufferView,
    facesExpected: Double,
    threeDExpected: Boolean,
    textureArrayExpected: Boolean
  ) = this()
  def this(
    /** contents of the KTX container file */
  data: ArrayBufferView,
    facesExpected: Double,
    threeDExpected: Unit,
    textureArrayExpected: Boolean
  ) = this()
}
/* static members */
object KhronosTextureContainer {
  
  @JSImport("babylonjs", "KhronosTextureContainer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "KhronosTextureContainer.COMPRESSED_2D")
  @js.native
  def COMPRESSED_2D: js.Any = js.native
  inline def COMPRESSED_2D_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_2D")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer.COMPRESSED_3D")
  @js.native
  def COMPRESSED_3D: js.Any = js.native
  inline def COMPRESSED_3D_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_3D")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer.HEADER_LEN")
  @js.native
  def HEADER_LEN: js.Any = js.native
  inline def HEADER_LEN_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_LEN")(x.asInstanceOf[js.Any])
  
  /**
    * Checks if the given data starts with a KTX file identifier.
    * @param data the data to check
    * @returns true if the data is a KTX file or false otherwise
    */
  inline def IsValid(data: ArrayBufferView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsValid")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("babylonjs", "KhronosTextureContainer.TEX_2D")
  @js.native
  def TEX_2D: js.Any = js.native
  inline def TEX_2D_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEX_2D")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "KhronosTextureContainer.TEX_3D")
  @js.native
  def TEX_3D: js.Any = js.native
  inline def TEX_3D_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEX_3D")(x.asInstanceOf[js.Any])
}

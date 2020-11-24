package typings.babylonjs.legacyMod

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "KhronosTextureContainer")
@js.native
class KhronosTextureContainer protected ()
  extends typings.babylonjs.indexMod.KhronosTextureContainer {
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
    threeDExpected: js.UndefOr[scala.Nothing],
    textureArrayExpected: Boolean
  ) = this()
  def this(
    /** contents of the KTX container file */
  data: ArrayBufferView,
    facesExpected: Double,
    threeDExpected: Boolean,
    textureArrayExpected: Boolean
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "KhronosTextureContainer")
@js.native
object KhronosTextureContainer extends js.Object {
  
  var COMPRESSED_2D: js.Any = js.native
  
  var COMPRESSED_3D: js.Any = js.native
  
  var HEADER_LEN: js.Any = js.native
  
  /**
    * Checks if the given data starts with a KTX file identifier.
    * @param data the data to check
    * @returns true if the data is a KTX file or false otherwise
    */
  def IsValid(data: ArrayBufferView): Boolean = js.native
  
  var TEX_2D: js.Any = js.native
  
  var TEX_3D: js.Any = js.native
}

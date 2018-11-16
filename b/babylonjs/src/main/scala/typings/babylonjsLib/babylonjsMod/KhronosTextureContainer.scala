package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
     * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
     */
@JSImport("babylonjs", "KhronosTextureContainer")
@js.native
class KhronosTextureContainer protected ()
  extends babylonjsLib.BABYLONNs.KhronosTextureContainer {
  /**
           * Creates a new KhronosTextureContainer
           * @param arrayBuffer contents of the KTX container file
           * @param facesExpected should be either 1 or 6, based whether a cube texture or or
           * @param threeDExpected provision for indicating that data should be a 3D texture, not implemented
           * @param textureArrayExpected provision for indicating that data should be a texture array, not implemented
           */
  def this(/** contents of the KTX container file */
  arrayBuffer: js.Any, facesExpected: scala.Double) = this()
  /**
           * Creates a new KhronosTextureContainer
           * @param arrayBuffer contents of the KTX container file
           * @param facesExpected should be either 1 or 6, based whether a cube texture or or
           * @param threeDExpected provision for indicating that data should be a 3D texture, not implemented
           * @param textureArrayExpected provision for indicating that data should be a texture array, not implemented
           */
  def this(/** contents of the KTX container file */
  arrayBuffer: js.Any, facesExpected: scala.Double, threeDExpected: scala.Boolean) = this()
  /**
           * Creates a new KhronosTextureContainer
           * @param arrayBuffer contents of the KTX container file
           * @param facesExpected should be either 1 or 6, based whether a cube texture or or
           * @param threeDExpected provision for indicating that data should be a 3D texture, not implemented
           * @param textureArrayExpected provision for indicating that data should be a texture array, not implemented
           */
  def this(/** contents of the KTX container file */
  arrayBuffer: js.Any, facesExpected: scala.Double, threeDExpected: scala.Boolean, textureArrayExpected: scala.Boolean) = this()
}

/**
     * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
     * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
     */
@JSImport("babylonjs", "KhronosTextureContainer")
@js.native
object KhronosTextureContainer extends js.Object {
  var COMPRESSED_2D: js.Any = js.native
  var COMPRESSED_3D: js.Any = js.native
  var HEADER_LEN: js.Any = js.native
  var TEX_2D: js.Any = js.native
  var TEX_3D: js.Any = js.native
}


package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.typesMod.DataArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "VertexBuffer")
@js.native
class VertexBuffer protected ()
  extends typings.babylonjs.bufferMod.VertexBuffer {
  /**
    * Constructor
    * @param engine the engine
    * @param data the data to use for this vertex buffer
    * @param kind the vertex buffer kind
    * @param updatable whether the data is updatable
    * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
    * @param stride the stride (optional)
    * @param instanced whether the buffer is instanced (optional)
    * @param offset the offset of the data (optional)
    * @param size the number of components (optional)
    * @param type the type of the component (optional)
    * @param normalized whether the data contains normalized data (optional)
    * @param useBytes set to true if stride and offset are in bytes (optional)
    * @param divisor defines the instance divisor to use (1 by default)
    * @param takeBufferOwnership defines if the buffer should be released when the vertex buffer is disposed
    */
  def this(
    engine: js.Any,
    data: DataArray | typings.babylonjs.bufferMod.Buffer,
    kind: String,
    updatable: Boolean,
    postponeInternalCreation: js.UndefOr[Boolean],
    stride: js.UndefOr[Double],
    instanced: js.UndefOr[Boolean],
    offset: js.UndefOr[Double],
    size: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    normalized: js.UndefOr[Boolean],
    useBytes: js.UndefOr[Boolean],
    divisor: js.UndefOr[Double],
    takeBufferOwnership: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Meshes/index", "VertexBuffer")
@js.native
object VertexBuffer extends js.Object {
  
  /**
    * The byte type.
    */
  val BYTE: Double = js.native
  
  /**
    * Colors
    */
  val ColorKind: String = js.native
  
  /**
    * Deduces the stride given a kind.
    * @param kind The kind string to deduce
    * @returns The deduced stride
    */
  def DeduceStride(kind: String): Double = js.native
  
  /**
    * The float type.
    */
  val FLOAT: Double = js.native
  
  /**
    * Enumerates each value of the given parameters as numbers.
    * @param data the data to enumerate
    * @param byteOffset the byte offset of the data
    * @param byteStride the byte stride of the data
    * @param componentCount the number of components per element
    * @param componentType the type of the component
    * @param count the number of values to enumerate
    * @param normalized whether the data is normalized
    * @param callback the callback function called for each value
    */
  def ForEach(
    data: DataArray,
    byteOffset: Double,
    byteStride: Double,
    componentCount: Double,
    componentType: Double,
    count: Double,
    normalized: Boolean,
    callback: js.Function2[/* value */ Double, /* index */ Double, Unit]
  ): Unit = js.native
  
  /**
    * Gets the byte length of the given type.
    * @param type the type
    * @returns the number of bytes
    */
  def GetTypeByteLength(`type`: Double): Double = js.native
  
  /**
    * The integer type.
    */
  val INT: Double = js.native
  
  /**
    * Additional matrix indices (for bones)
    */
  val MatricesIndicesExtraKind: String = js.native
  
  /**
    * Matrix indices (for bones)
    */
  val MatricesIndicesKind: String = js.native
  
  /**
    * Additional matrix weights (for bones)
    */
  val MatricesWeightsExtraKind: String = js.native
  
  /**
    * Matrix weights (for bones)
    */
  val MatricesWeightsKind: String = js.native
  
  /**
    * Normals
    */
  val NormalKind: String = js.native
  
  /**
    * Positions
    */
  val PositionKind: String = js.native
  
  /**
    * The short type.
    */
  val SHORT: Double = js.native
  
  /**
    * Tangents
    */
  val TangentKind: String = js.native
  
  /**
    * The unsigned byte type.
    */
  val UNSIGNED_BYTE: Double = js.native
  
  /**
    * The unsigned integer type.
    */
  val UNSIGNED_INT: Double = js.native
  
  /**
    * The unsigned short type.
    */
  val UNSIGNED_SHORT: Double = js.native
  
  /**
    * Texture coordinates 2
    */
  val UV2Kind: String = js.native
  
  /**
    * Texture coordinates 3
    */
  val UV3Kind: String = js.native
  
  /**
    * Texture coordinates 4
    */
  val UV4Kind: String = js.native
  
  /**
    * Texture coordinates 5
    */
  val UV5Kind: String = js.native
  
  /**
    * Texture coordinates 6
    */
  val UV6Kind: String = js.native
  
  /**
    * Texture coordinates
    */
  val UVKind: String = js.native
  
  var _GetFloatValue: js.Any = js.native
}

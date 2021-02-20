package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "VertexBuffer")
@js.native
class VertexBuffer protected ()
  extends typings.babylonjs.indexMod.VertexBuffer {
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
object VertexBuffer {
  
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The byte type.
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.BYTE")
  @js.native
  val BYTE: Double = js.native
  
  /**
    * Colors
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.ColorKind")
  @js.native
  val ColorKind: String = js.native
  
  /**
    * Deduces the stride given a kind.
    * @param kind The kind string to deduce
    * @returns The deduced stride
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.DeduceStride")
  @js.native
  def DeduceStride(kind: String): Double = js.native
  
  /**
    * The float type.
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.FLOAT")
  @js.native
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
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.ForEach")
  @js.native
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
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.GetTypeByteLength")
  @js.native
  def GetTypeByteLength(`type`: Double): Double = js.native
  
  /**
    * The integer type.
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.INT")
  @js.native
  val INT: Double = js.native
  
  /**
    * Additional matrix indices (for bones)
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.MatricesIndicesExtraKind")
  @js.native
  val MatricesIndicesExtraKind: String = js.native
  
  /**
    * Matrix indices (for bones)
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.MatricesIndicesKind")
  @js.native
  val MatricesIndicesKind: String = js.native
  
  /**
    * Additional matrix weights (for bones)
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.MatricesWeightsExtraKind")
  @js.native
  val MatricesWeightsExtraKind: String = js.native
  
  /**
    * Matrix weights (for bones)
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.MatricesWeightsKind")
  @js.native
  val MatricesWeightsKind: String = js.native
  
  /**
    * Normals
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.NormalKind")
  @js.native
  val NormalKind: String = js.native
  
  /**
    * Positions
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.PositionKind")
  @js.native
  val PositionKind: String = js.native
  
  /**
    * The short type.
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.SHORT")
  @js.native
  val SHORT: Double = js.native
  
  /**
    * Tangents
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.TangentKind")
  @js.native
  val TangentKind: String = js.native
  
  /**
    * The unsigned byte type.
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UNSIGNED_BYTE")
  @js.native
  val UNSIGNED_BYTE: Double = js.native
  
  /**
    * The unsigned integer type.
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UNSIGNED_INT")
  @js.native
  val UNSIGNED_INT: Double = js.native
  
  /**
    * The unsigned short type.
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UNSIGNED_SHORT")
  @js.native
  val UNSIGNED_SHORT: Double = js.native
  
  /**
    * Texture coordinates 2
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UV2Kind")
  @js.native
  val UV2Kind: String = js.native
  
  /**
    * Texture coordinates 3
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UV3Kind")
  @js.native
  val UV3Kind: String = js.native
  
  /**
    * Texture coordinates 4
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UV4Kind")
  @js.native
  val UV4Kind: String = js.native
  
  /**
    * Texture coordinates 5
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UV5Kind")
  @js.native
  val UV5Kind: String = js.native
  
  /**
    * Texture coordinates 6
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UV6Kind")
  @js.native
  val UV6Kind: String = js.native
  
  /**
    * Texture coordinates
    */
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer.UVKind")
  @js.native
  val UVKind: String = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "VertexBuffer._GetFloatValue")
  @js.native
  def _GetFloatValue: js.Any = js.native
  @scala.inline
  def _GetFloatValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatValue")(x.asInstanceOf[js.Any])
}

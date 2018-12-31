package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specialized buffer used to store vertex data
  */
@JSGlobal("BABYLON.VertexBuffer")
@js.native
class VertexBuffer protected () extends js.Object {
  def this(engine: js.Any, data: Buffer, kind: java.lang.String, updatable: scala.Boolean, postponeInternalCreation: js.UndefOr[scala.Boolean], stride: js.UndefOr[scala.Double], instanced: js.UndefOr[scala.Boolean], offset: js.UndefOr[scala.Double], size: js.UndefOr[scala.Double], `type`: js.UndefOr[scala.Double], normalized: js.UndefOr[scala.Boolean], useBytes: js.UndefOr[scala.Boolean]) = this()
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
    */
  def this(engine: js.Any, data: DataArray, kind: java.lang.String, updatable: scala.Boolean, postponeInternalCreation: js.UndefOr[scala.Boolean], stride: js.UndefOr[scala.Double], instanced: js.UndefOr[scala.Boolean], offset: js.UndefOr[scala.Double], size: js.UndefOr[scala.Double], `type`: js.UndefOr[scala.Double], normalized: js.UndefOr[scala.Boolean], useBytes: js.UndefOr[scala.Boolean]) = this()
  /** @hidden */
  var _buffer: Buffer = js.native
  var _instanceDivisor: js.Any = js.native
  var _instanced: js.Any = js.native
  var _kind: js.Any = js.native
  var _ownsBuffer: js.Any = js.native
  var _size: js.Any = js.native
  /**
    * Gets the byte offset.
    */
  val byteOffset: scala.Double = js.native
  /**
    * Gets the byte stride.
    */
  val byteStride: scala.Double = js.native
  /**
    * Gets or sets the instance divisor when in instanced mode
    */
  var instanceDivisor: scala.Double = js.native
  /**
    * Gets whether integer data values should be normalized into a certain range when being casted to a float.
    */
  val normalized: scala.Boolean = js.native
  /**
    * Gets the data type of each component in the array.
    */
  val `type`: scala.Double = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /**
    * Store data into the buffer. If the buffer was already used it will be either recreated or updated depending on isUpdatable property
    * @param data defines the data to store
    */
  def create(): scala.Unit = js.native
  def create(data: DataArray): scala.Unit = js.native
  /**
    * Disposes the VertexBuffer and the underlying WebGLBuffer.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Enumerates each value of this vertex buffer as numbers.
    * @param count the number of values to enumerate
    * @param callback the callback function called for each value
    */
  def forEach(
    count: scala.Double,
    callback: js.Function2[/* value */ scala.Double, /* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets underlying native buffer
    * @returns underlying native buffer
    */
  def getBuffer(): Nullable[babylonjsLib.WebGLBuffer] = js.native
  /**
    * Gets current buffer's data
    * @returns a DataArray or null
    */
  def getData(): Nullable[DataArray] = js.native
  /**
    * Returns the instancing divisor, zero for non-instanced (integer).
    * @returns a number
    */
  def getInstanceDivisor(): scala.Double = js.native
  /**
    * Gets a boolean indicating is the internal buffer of the VertexBuffer is instanced
    * @returns true if this buffer is instanced
    */
  def getIsInstanced(): scala.Boolean = js.native
  /**
    * Returns the kind of the VertexBuffer (string)
    * @returns a string
    */
  def getKind(): java.lang.String = js.native
  /**
    * Returns the offset as a multiple of the type byte length.
    * DEPRECATED. Use byteOffset instead.
    * @returns the offset in bytes
    */
  def getOffset(): scala.Double = js.native
  /**
    * Returns the number of components per vertex attribute (integer)
    * @returns the size in float
    */
  def getSize(): scala.Double = js.native
  /**
    * Gets the stride in float32 units (i.e. byte stride / 4).
    * May not be an integer if the byte stride is not divisible by 4.
    * DEPRECATED. Use byteStride instead.
    * @returns the stride in float32 units
    */
  def getStrideSize(): scala.Double = js.native
  /**
    * Gets a boolean indicating if the VertexBuffer is updatable?
    * @returns true if the buffer is updatable
    */
  def isUpdatable(): scala.Boolean = js.native
  /**
    * Updates the underlying buffer according to the passed numeric array or Float32Array.
    * This function will create a new buffer if the current one is not updatable
    * @param data defines the data to store
    */
  def update(data: DataArray): scala.Unit = js.native
  /**
    * Updates directly the underlying WebGLBuffer according to the passed numeric array or Float32Array.
    * Returns the directly updated WebGLBuffer.
    * @param data the new data
    * @param offset the new offset
    * @param useBytes set to true if the offset is in bytes
    */
  def updateDirectly(data: DataArray, offset: scala.Double): scala.Unit = js.native
  def updateDirectly(data: DataArray, offset: scala.Double, useBytes: scala.Boolean): scala.Unit = js.native
}

/**
  * Specialized buffer used to store vertex data
  */
@JSGlobal("BABYLON.VertexBuffer")
@js.native
object VertexBuffer extends js.Object {
  /**
    * The byte type.
    */
  val BYTE: scala.Double = js.native
  /**
    * Colors
    */
  val ColorKind: java.lang.String = js.native
  /**
    * The float type.
    */
  val FLOAT: scala.Double = js.native
  /**
    * The integer type.
    */
  val INT: scala.Double = js.native
  /**
    * Additional matrix indices (for bones)
    */
  val MatricesIndicesExtraKind: java.lang.String = js.native
  /**
    * Matrix indices (for bones)
    */
  val MatricesIndicesKind: java.lang.String = js.native
  /**
    * Additional matrix weights (for bones)
    */
  val MatricesWeightsExtraKind: java.lang.String = js.native
  /**
    * Matrix weights (for bones)
    */
  val MatricesWeightsKind: java.lang.String = js.native
  /**
    * Normals
    */
  val NormalKind: java.lang.String = js.native
  /**
    * Positions
    */
  val PositionKind: java.lang.String = js.native
  /**
    * The short type.
    */
  val SHORT: scala.Double = js.native
  /**
    * Tangents
    */
  val TangentKind: java.lang.String = js.native
  /**
    * The unsigned byte type.
    */
  val UNSIGNED_BYTE: scala.Double = js.native
  /**
    * The unsigned integer type.
    */
  val UNSIGNED_INT: scala.Double = js.native
  /**
    * The unsigned short type.
    */
  val UNSIGNED_SHORT: scala.Double = js.native
  /**
    * Texture coordinates 2
    */
  val UV2Kind: java.lang.String = js.native
  /**
    * Texture coordinates 3
    */
  val UV3Kind: java.lang.String = js.native
  /**
    * Texture coordinates 4
    */
  val UV4Kind: java.lang.String = js.native
  /**
    * Texture coordinates 5
    */
  val UV5Kind: java.lang.String = js.native
  /**
    * Texture coordinates 6
    */
  val UV6Kind: java.lang.String = js.native
  /**
    * Texture coordinates
    */
  val UVKind: java.lang.String = js.native
  var _GetFloatValue: js.Any = js.native
  /**
    * Deduces the stride given a kind.
    * @param kind The kind string to deduce
    * @returns The deduced stride
    */
  def DeduceStride(kind: java.lang.String): scala.Double = js.native
  /**
    * Enumerates each value of the given parameters as numbers.
    * @param data the data to enumerate
    * @param byteOffset the byte offset of the data
    * @param byteStride the byte stride of the data
    * @param componentCount the number of components per element
    * @param componentType the type of the component
    * @param count the total number of components
    * @param normalized whether the data is normalized
    * @param callback the callback function called for each value
    */
  def ForEach(
    data: babylonjsLib.BABYLONNs.DataArray,
    byteOffset: scala.Double,
    byteStride: scala.Double,
    componentCount: scala.Double,
    componentType: scala.Double,
    count: scala.Double,
    normalized: scala.Boolean,
    callback: js.Function2[/* value */ scala.Double, /* index */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the byte length of the given type.
    * @param type the type
    * @returns the number of bytes
    */
  def GetTypeByteLength(`type`: scala.Double): scala.Double = js.native
}


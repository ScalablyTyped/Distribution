package typings.babylonjs

import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  @js.native
  class Buffer protected () extends js.Object {
    /**
      * Constructor
      * @param engine the engine
      * @param data the data to use for this buffer
      * @param updatable whether the data is updatable
      * @param stride the stride (optional)
      * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
      * @param instanced whether the buffer is instanced (optional)
      * @param useBytes set to true if the stride in in bytes (optional)
      * @param divisor sets an optional divisor for instances (1 by default)
      */
    def this(engine: js.Any, data: DataArray, updatable: Boolean) = this()
    def this(engine: js.Any, data: DataArray, updatable: Boolean, stride: Double) = this()
    def this(
      engine: js.Any,
      data: DataArray,
      updatable: Boolean,
      stride: Double,
      postponeInternalCreation: Boolean
    ) = this()
    def this(
      engine: js.Any,
      data: DataArray,
      updatable: Boolean,
      stride: Double,
      postponeInternalCreation: Boolean,
      instanced: Boolean
    ) = this()
    def this(
      engine: js.Any,
      data: DataArray,
      updatable: Boolean,
      stride: Double,
      postponeInternalCreation: Boolean,
      instanced: Boolean,
      useBytes: Boolean
    ) = this()
    def this(
      engine: js.Any,
      data: DataArray,
      updatable: Boolean,
      stride: Double,
      postponeInternalCreation: Boolean,
      instanced: Boolean,
      useBytes: Boolean,
      divisor: Double
    ) = this()
    var _buffer: js.Any = js.native
    /** @hidden */
    var _data: Nullable[DataArray] = js.native
    var _divisor: js.Any = js.native
    var _engine: js.Any = js.native
    var _instanced: js.Any = js.native
    var _updatable: js.Any = js.native
    /**
      * Gets the byte stride.
      */
    val byteStride: Double = js.native
    /** @hidden */
    def _rebuild(): Unit = js.native
    /**
      * Store data into the buffer. If the buffer was already used it will be either recreated or updated depending on isUpdatable property
      * @param data defines the data to store
      */
    def create(): Unit = js.native
    def create(data: Nullable[DataArray]): Unit = js.native
    /**
      * Create a new VertexBuffer based on the current buffer
      * @param kind defines the vertex buffer kind (position, normal, etc.)
      * @param offset defines offset in the buffer (0 by default)
      * @param size defines the size in floats of attributes (position is 3 for instance)
      * @param stride defines the stride size in floats in the buffer (the offset to apply to reach next value when data is interleaved)
      * @param instanced defines if the vertex buffer contains indexed data
      * @param useBytes defines if the offset and stride are in bytes     *
      * @param divisor sets an optional divisor for instances (1 by default)
      * @returns the new vertex buffer
      */
    def createVertexBuffer(kind: String, offset: Double, size: Double): VertexBuffer = js.native
    def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double): VertexBuffer = js.native
    def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double, instanced: Boolean): VertexBuffer = js.native
    def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double, instanced: Boolean, useBytes: Boolean): VertexBuffer = js.native
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Double,
      instanced: Boolean,
      useBytes: Boolean,
      divisor: Double
    ): VertexBuffer = js.native
    /**
      * Release all resources
      */
    def dispose(): Unit = js.native
    /**
      * Gets underlying native buffer
      * @returns underlying native buffer
      */
    def getBuffer(): Nullable[DataBuffer] = js.native
    /**
      * Gets current buffer's data
      * @returns a DataArray or null
      */
    def getData(): Nullable[DataArray] = js.native
    /**
      * Gets the stride in float32 units (i.e. byte stride / 4).
      * May not be an integer if the byte stride is not divisible by 4.
      * @returns the stride in float32 units
      * @deprecated Please use byteStride instead.
      */
    def getStrideSize(): Double = js.native
    /**
      * Gets a boolean indicating if the Buffer is updatable?
      * @returns true if the buffer is updatable
      */
    def isUpdatable(): Boolean = js.native
    /**
      * Update current buffer data
      * @param data defines the data to store
      */
    def update(data: DataArray): Unit = js.native
    /**
      * Updates the data directly.
      * @param data the new data
      * @param offset the new offset
      * @param vertexCount the vertex count (optional)
      * @param useBytes set to true if the offset is in bytes
      */
    def updateDirectly(data: DataArray, offset: Double): Unit = js.native
    def updateDirectly(data: DataArray, offset: Double, vertexCount: Double): Unit = js.native
    def updateDirectly(data: DataArray, offset: Double, vertexCount: Double, useBytes: Boolean): Unit = js.native
  }
  
  @js.native
  class VertexBuffer protected () extends js.Object {
    def this(
      engine: js.Any,
      data: Buffer,
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
      divisor: js.UndefOr[Double]
    ) = this()
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
      */
    def this(
      engine: js.Any,
      data: DataArray,
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
      divisor: js.UndefOr[Double]
    ) = this()
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
    val byteOffset: Double = js.native
    /**
      * Gets the byte stride.
      */
    val byteStride: Double = js.native
    /**
      * Gets whether integer data values should be normalized into a certain range when being casted to a float.
      */
    val normalized: Boolean = js.native
    /**
      * Gets the data type of each component in the array.
      */
    val `type`: Double = js.native
    /** @hidden */
    def _rebuild(): Unit = js.native
    /**
      * Store data into the buffer. If the buffer was already used it will be either recreated or updated depending on isUpdatable property
      * @param data defines the data to store
      */
    def create(): Unit = js.native
    def create(data: DataArray): Unit = js.native
    /**
      * Disposes the VertexBuffer and the underlying WebGLBuffer.
      */
    def dispose(): Unit = js.native
    /**
      * Enumerates each value of this vertex buffer as numbers.
      * @param count the number of values to enumerate
      * @param callback the callback function called for each value
      */
    def forEach(count: Double, callback: js.Function2[/* value */ Double, /* index */ Double, Unit]): Unit = js.native
    /**
      * Gets underlying native buffer
      * @returns underlying native buffer
      */
    def getBuffer(): Nullable[DataBuffer] = js.native
    /**
      * Gets current buffer's data
      * @returns a DataArray or null
      */
    def getData(): Nullable[DataArray] = js.native
    /**
      * Returns the instancing divisor, zero for non-instanced (integer).
      * @returns a number
      */
    def getInstanceDivisor(): Double = js.native
    /**
      * Gets a boolean indicating is the internal buffer of the VertexBuffer is instanced
      * @returns true if this buffer is instanced
      */
    def getIsInstanced(): Boolean = js.native
    /**
      * Returns the kind of the VertexBuffer (string)
      * @returns a string
      */
    def getKind(): String = js.native
    /**
      * Returns the offset as a multiple of the type byte length.
      * @returns the offset in bytes
      * @deprecated Please use byteOffset instead.
      */
    def getOffset(): Double = js.native
    /**
      * Returns the number of components per vertex attribute (integer)
      * @returns the size in float
      */
    def getSize(): Double = js.native
    /**
      * Gets the stride in float32 units (i.e. byte stride / 4).
      * May not be an integer if the byte stride is not divisible by 4.
      * @returns the stride in float32 units
      * @deprecated Please use byteStride instead.
      */
    def getStrideSize(): Double = js.native
    /**
      * Gets or sets the instance divisor when in instanced mode
      */
    def instanceDivisor(): Double = js.native
    def instanceDivisor(value: Double): js.Any = js.native
    /**
      * Gets a boolean indicating if the VertexBuffer is updatable?
      * @returns true if the buffer is updatable
      */
    def isUpdatable(): Boolean = js.native
    /**
      * Updates the underlying buffer according to the passed numeric array or Float32Array.
      * This function will create a new buffer if the current one is not updatable
      * @param data defines the data to store
      */
    def update(data: DataArray): Unit = js.native
    /**
      * Updates directly the underlying WebGLBuffer according to the passed numeric array or Float32Array.
      * Returns the directly updated WebGLBuffer.
      * @param data the new data
      * @param offset the new offset
      * @param useBytes set to true if the offset is in bytes
      */
    def updateDirectly(data: DataArray, offset: Double): Unit = js.native
    def updateDirectly(data: DataArray, offset: Double, useBytes: Boolean): Unit = js.native
  }
  
  /* static members */
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
      * The float type.
      */
    val FLOAT: Double = js.native
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
    /**
      * Deduces the stride given a kind.
      * @param kind The kind string to deduce
      * @returns The deduced stride
      */
    def DeduceStride(kind: String): Double = js.native
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
  }
  
}


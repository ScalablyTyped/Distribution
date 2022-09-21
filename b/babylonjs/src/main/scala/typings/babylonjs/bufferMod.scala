package typings.babylonjs

import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("babylonjs/Buffers/buffer", "Buffer")
  @js.native
  open class Buffer protected () extends StObject {
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
    def this(
      engine: Any,
      data: DataArray | DataBuffer,
      updatable: Boolean,
      stride: js.UndefOr[Double],
      postponeInternalCreation: js.UndefOr[Boolean],
      instanced: js.UndefOr[Boolean],
      useBytes: js.UndefOr[Boolean],
      divisor: js.UndefOr[Double]
    ) = this()
    
    /* private */ var _buffer: Any = js.native
    
    /** @hidden */
    var _data: Nullable[DataArray] = js.native
    
    /* private */ var _divisor: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /** @hidden */
    def _increaseReferences(): Unit = js.native
    
    /* private */ var _instanced: Any = js.native
    
    /* private */ var _isAlreadyOwned: Any = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /* private */ var _updatable: Any = js.native
    
    /**
      * Gets the byte stride.
      */
    val byteStride: Double = js.native
    
    /**
      * Store data into the buffer. Creates the buffer if not used already.
      * If the buffer was already used, it will be updated only if it is updatable, otherwise it will do nothing.
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
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Double,
      instanced: Boolean,
      useBytes: Unit,
      divisor: Double
    ): VertexBuffer = js.native
    def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double, instanced: Unit, useBytes: Boolean): VertexBuffer = js.native
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Double,
      instanced: Unit,
      useBytes: Boolean,
      divisor: Double
    ): VertexBuffer = js.native
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Double,
      instanced: Unit,
      useBytes: Unit,
      divisor: Double
    ): VertexBuffer = js.native
    def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Unit, instanced: Boolean): VertexBuffer = js.native
    def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Unit, instanced: Boolean, useBytes: Boolean): VertexBuffer = js.native
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Unit,
      instanced: Boolean,
      useBytes: Boolean,
      divisor: Double
    ): VertexBuffer = js.native
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Unit,
      instanced: Boolean,
      useBytes: Unit,
      divisor: Double
    ): VertexBuffer = js.native
    def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Unit, instanced: Unit, useBytes: Boolean): VertexBuffer = js.native
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Unit,
      instanced: Unit,
      useBytes: Boolean,
      divisor: Double
    ): VertexBuffer = js.native
    def createVertexBuffer(
      kind: String,
      offset: Double,
      size: Double,
      stride: Unit,
      instanced: Unit,
      useBytes: Unit,
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
    def updateDirectly(data: DataArray, offset: Double, vertexCount: Unit, useBytes: Boolean): Unit = js.native
  }
  
  @JSImport("babylonjs/Buffers/buffer", "VertexBuffer")
  @js.native
  open class VertexBuffer protected () extends StObject {
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
      engine: Any,
      data: DataArray | Buffer | DataBuffer,
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
    
    /** @hidden */
    var _buffer: Buffer = js.native
    
    /* private */ var _computeHashCode: Any = js.native
    
    /* private */ var _instanceDivisor: Any = js.native
    
    /* private */ var _instanced: Any = js.native
    
    /* private */ var _kind: Any = js.native
    
    /* private */ var _ownsBuffer: Any = js.native
    
    /** @hidden */
    def _rebuild(): Unit = js.native
    
    /* private */ var _size: Any = js.native
    
    /** @hidden */
    var _validOffsetRange: Boolean = js.native
    
    /**
      * Gets the byte offset.
      */
    val byteOffset: Double = js.native
    
    /**
      * Gets the byte stride.
      */
    val byteStride: Double = js.native
    
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
      * Gets current buffer's data as a float array. Float data is constructed if the vertex buffer data cannot be returned directly.
      * @param totalVertices number of vertices in the buffer to take into account
      * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
      * @returns a float array containing vertex data
      */
    def getFloatData(totalVertices: Double): Nullable[FloatArray] = js.native
    def getFloatData(totalVertices: Double, forceCopy: Boolean): Nullable[FloatArray] = js.native
    
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
      * Returns the number of components or the byte size per vertex attribute
      * @param sizeInBytes If true, returns the size in bytes or else the size in number of components of the vertex attribute (default: false)
      * @returns the number of components
      */
    def getSize(): Double = js.native
    def getSize(sizeInBytes: Boolean): Double = js.native
    
    /**
      * Gets the stride in float32 units (i.e. byte stride / 4).
      * May not be an integer if the byte stride is not divisible by 4.
      * @returns the stride in float32 units
      * @deprecated Please use byteStride instead.
      */
    def getStrideSize(): Double = js.native
    
    /**
      * Gets a hash code representing the format (type, normalized, size, instanced, stride) of this buffer
      * All buffers with the same format will have the same hash code
      */
    @JSName("hashCode")
    val hashCode_FVertexBuffer: Double = js.native
    
    /**
      * Gets or sets the instance divisor when in instanced mode
      */
    def instanceDivisor: Double = js.native
    def instanceDivisor_=(value: Double): Unit = js.native
    
    /**
      * Gets a boolean indicating if the VertexBuffer is updatable?
      * @returns true if the buffer is updatable
      */
    def isUpdatable(): Boolean = js.native
    
    /**
      * Gets whether integer data values should be normalized into a certain range when being casted to a float.
      */
    val normalized: Boolean = js.native
    
    /**
      * Gets the data type of each component in the array.
      */
    val `type`: Double = js.native
    
    /**
      * Gets the unique id of this vertex buffer
      */
    val uniqueId: Double = js.native
    
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
  object VertexBuffer {
    
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The byte type.
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.BYTE")
    @js.native
    val BYTE: Double = js.native
    
    /**
      * Instance Colors
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.ColorInstanceKind")
    @js.native
    val ColorInstanceKind: String = js.native
    
    /**
      * Colors
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.ColorKind")
    @js.native
    val ColorKind: String = js.native
    
    /**
      * Deduces the stride given a kind.
      * @param kind The kind string to deduce
      * @returns The deduced stride
      */
    inline def DeduceStride(kind: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DeduceStride")(kind.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * The float type.
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.FLOAT")
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
    inline def ForEach(
      data: DataArray,
      byteOffset: Double,
      byteStride: Double,
      componentCount: Double,
      componentType: Double,
      count: Double,
      normalized: Boolean,
      callback: js.Function2[/* value */ Double, /* index */ Double, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ForEach")(data.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], byteStride.asInstanceOf[js.Any], componentCount.asInstanceOf[js.Any], componentType.asInstanceOf[js.Any], count.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets the byte length of the given type.
      * @param type the type
      * @returns the number of bytes
      */
    inline def GetTypeByteLength(`type`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTypeByteLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * The integer type.
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.INT")
    @js.native
    val INT: Double = js.native
    
    /**
      * Additional matrix indices (for bones)
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.MatricesIndicesExtraKind")
    @js.native
    val MatricesIndicesExtraKind: String = js.native
    
    /**
      * Matrix indices (for bones)
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.MatricesIndicesKind")
    @js.native
    val MatricesIndicesKind: String = js.native
    
    /**
      * Additional matrix weights (for bones)
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.MatricesWeightsExtraKind")
    @js.native
    val MatricesWeightsExtraKind: String = js.native
    
    /**
      * Matrix weights (for bones)
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.MatricesWeightsKind")
    @js.native
    val MatricesWeightsKind: String = js.native
    
    /**
      * Normals
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.NormalKind")
    @js.native
    val NormalKind: String = js.native
    
    /**
      * Positions
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.PositionKind")
    @js.native
    val PositionKind: String = js.native
    
    /**
      * The short type.
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.SHORT")
    @js.native
    val SHORT: Double = js.native
    
    /**
      * Tangents
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.TangentKind")
    @js.native
    val TangentKind: String = js.native
    
    /**
      * The unsigned byte type.
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UNSIGNED_BYTE")
    @js.native
    val UNSIGNED_BYTE: Double = js.native
    
    /**
      * The unsigned integer type.
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UNSIGNED_INT")
    @js.native
    val UNSIGNED_INT: Double = js.native
    
    /**
      * The unsigned short type.
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UNSIGNED_SHORT")
    @js.native
    val UNSIGNED_SHORT: Double = js.native
    
    /**
      * Texture coordinates 2
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UV2Kind")
    @js.native
    val UV2Kind: String = js.native
    
    /**
      * Texture coordinates 3
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UV3Kind")
    @js.native
    val UV3Kind: String = js.native
    
    /**
      * Texture coordinates 4
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UV4Kind")
    @js.native
    val UV4Kind: String = js.native
    
    /**
      * Texture coordinates 5
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UV5Kind")
    @js.native
    val UV5Kind: String = js.native
    
    /**
      * Texture coordinates 6
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UV6Kind")
    @js.native
    val UV6Kind: String = js.native
    
    /**
      * Texture coordinates
      */
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer.UVKind")
    @js.native
    val UVKind: String = js.native
    
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer._Counter")
    @js.native
    def _Counter: Any = js.native
    inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Buffers/buffer", "VertexBuffer._GetFloatValue")
    @js.native
    def _GetFloatValue: Any = js.native
    inline def _GetFloatValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatValue")(x.asInstanceOf[js.Any])
  }
}

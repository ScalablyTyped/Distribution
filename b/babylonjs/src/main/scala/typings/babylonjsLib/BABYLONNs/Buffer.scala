package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store data that will be store in GPU memory
  */
@JSGlobal("BABYLON.Buffer")
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
    */
  def this(engine: js.Any, data: DataArray, updatable: scala.Boolean) = this()
  def this(engine: js.Any, data: DataArray, updatable: scala.Boolean, stride: scala.Double) = this()
  def this(engine: js.Any, data: DataArray, updatable: scala.Boolean, stride: scala.Double, postponeInternalCreation: scala.Boolean) = this()
  def this(engine: js.Any, data: DataArray, updatable: scala.Boolean, stride: scala.Double, postponeInternalCreation: scala.Boolean, instanced: scala.Boolean) = this()
  def this(engine: js.Any, data: DataArray, updatable: scala.Boolean, stride: scala.Double, postponeInternalCreation: scala.Boolean, instanced: scala.Boolean, useBytes: scala.Boolean) = this()
  var _buffer: js.Any = js.native
  /** @hidden */
  var _data: Nullable[DataArray] = js.native
  var _engine: js.Any = js.native
  var _instanced: js.Any = js.native
  var _updatable: js.Any = js.native
  /**
    * Gets the byte stride.
    */
  val byteStride: scala.Double = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /**
    * Store data into the buffer. If the buffer was already used it will be either recreated or updated depending on isUpdatable property
    * @param data defines the data to store
    */
  def create(): scala.Unit = js.native
  def create(data: Nullable[DataArray]): scala.Unit = js.native
  /**
    * Create a new VertexBuffer based on the current buffer
    * @param kind defines the vertex buffer kind (position, normal, etc.)
    * @param offset defines offset in the buffer (0 by default)
    * @param size defines the size in floats of attributes (position is 3 for instance)
    * @param stride defines the stride size in floats in the buffer (the offset to apply to reach next value when data is interleaved)
    * @param instanced defines if the vertex buffer contains indexed data
    * @param useBytes defines if the offset and stride are in bytes
    * @returns the new vertex buffer
    */
  def createVertexBuffer(kind: java.lang.String, offset: scala.Double, size: scala.Double): VertexBuffer = js.native
  def createVertexBuffer(kind: java.lang.String, offset: scala.Double, size: scala.Double, stride: scala.Double): VertexBuffer = js.native
  def createVertexBuffer(
    kind: java.lang.String,
    offset: scala.Double,
    size: scala.Double,
    stride: scala.Double,
    instanced: scala.Boolean
  ): VertexBuffer = js.native
  def createVertexBuffer(
    kind: java.lang.String,
    offset: scala.Double,
    size: scala.Double,
    stride: scala.Double,
    instanced: scala.Boolean,
    useBytes: scala.Boolean
  ): VertexBuffer = js.native
  /**
    * Release all resources
    */
  def dispose(): scala.Unit = js.native
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
    * Gets the stride in float32 units (i.e. byte stride / 4).
    * May not be an integer if the byte stride is not divisible by 4.
    * DEPRECATED. Use byteStride instead.
    * @returns the stride in float32 units
    */
  def getStrideSize(): scala.Double = js.native
  /**
    * Gets a boolean indicating if the Buffer is updatable?
    * @returns true if the buffer is updatable
    */
  def isUpdatable(): scala.Boolean = js.native
  /**
    * Update current buffer data
    * @param data defines the data to store
    */
  def update(data: DataArray): scala.Unit = js.native
  /**
    * Updates the data directly.
    * @param data the new data
    * @param offset the new offset
    * @param vertexCount the vertex count (optional)
    * @param useBytes set to true if the offset is in bytes
    */
  def updateDirectly(data: DataArray, offset: scala.Double): scala.Unit = js.native
  def updateDirectly(data: DataArray, offset: scala.Double, vertexCount: scala.Double): scala.Unit = js.native
  def updateDirectly(data: DataArray, offset: scala.Double, vertexCount: scala.Double, useBytes: scala.Boolean): scala.Unit = js.native
}


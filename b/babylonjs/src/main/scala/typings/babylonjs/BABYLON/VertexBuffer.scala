package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VertexBuffer extends StObject {
  
  /** @hidden */
  var _buffer: Buffer = js.native
  
  var _instanceDivisor: js.Any = js.native
  
  var _instanced: js.Any = js.native
  
  var _kind: js.Any = js.native
  
  var _ownsBuffer: js.Any = js.native
  
  /** @hidden */
  def _rebuild(): Unit = js.native
  
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

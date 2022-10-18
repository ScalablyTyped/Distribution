package typings.babylonjs

import typings.babylonjs.buffersDataBufferMod.DataBuffer
import typings.babylonjs.buffersStorageBufferMod.StorageBuffer
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsEngineDotstorageBufferMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      def createStorageBuffer(data: Double, creationFlags: Double): DataBuffer = js.native
      /**
        * Creates a storage buffer
        * @param data the data for the storage buffer or the size of the buffer
        * @param creationFlags flags to use when creating the buffer (see Constants.BUFFER_CREATIONFLAG_XXX). The BUFFER_CREATIONFLAG_STORAGE flag will be automatically added
        * @returns the new buffer
        */
      def createStorageBuffer(data: DataArray, creationFlags: Double): DataBuffer = js.native
      
      /**
        * Read data from a storage buffer
        * @param storageBuffer The storage buffer to read from
        * @param offset The offset in the storage buffer to start reading from (default: 0)
        * @param size  The number of bytes to read from the storage buffer (default: capacity of the buffer)
        * @param buffer The buffer to write the data we have read from the storage buffer to (optional)
        * @returns If not undefined, returns the (promise) buffer (as provided by the 4th parameter) filled with the data, else it returns a (promise) Uint8Array with the data read from the storage buffer
        */
      def readFromStorageBuffer(storageBuffer: DataBuffer): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      
      /**
        * Sets a storage buffer in the shader
        * @param name Defines the name of the storage buffer as defined in the shader
        * @param buffer Defines the value to give to the uniform
        */
      def setStorageBuffer(name: String, buffer: Nullable[StorageBuffer]): Unit = js.native
      
      /**
        * Updates a storage buffer
        * @param buffer the storage buffer to update
        * @param data the data used to update the storage buffer
        * @param byteOffset the byte offset of the data
        * @param byteLength the byte length of the data
        */
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray): Unit = js.native
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Unit, byteLength: Double): Unit = js.native
    }
  }
}

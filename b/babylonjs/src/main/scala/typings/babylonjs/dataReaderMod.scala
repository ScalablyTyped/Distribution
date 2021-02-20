package typings.babylonjs

import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataReaderMod {
  
  @JSImport("babylonjs/Misc/dataReader", "DataReader")
  @js.native
  class DataReader protected () extends StObject {
    /**
      * Constructor
      * @param buffer The buffer to read
      */
    def this(buffer: IDataBuffer) = this()
    
    var _dataByteOffset: js.Any = js.native
    
    var _dataView: js.Any = js.native
    
    /**
      * The data buffer associated with this data reader.
      */
    val buffer: IDataBuffer = js.native
    
    /**
      * The current byte offset from the beginning of the data buffer.
      */
    var byteOffset: Double = js.native
    
    /**
      * Loads the given byte length.
      * @param byteLength The byte length to load
      * @returns A promise that resolves when the load is complete
      */
    def loadAsync(byteLength: Double): js.Promise[Unit] = js.native
    
    /**
      * Read a string from the currently loaded data range.
      * @param byteLength The byte length to read
      * @returns The string read
      */
    def readString(byteLength: Double): String = js.native
    
    /**
      * Read a unsigned 32-bit integer from the currently loaded data range.
      * @returns The 32-bit integer read
      */
    def readUint32(): Double = js.native
    
    /**
      * Read a byte array from the currently loaded data range.
      * @param byteLength The byte length to read
      * @returns The byte array read
      */
    def readUint8Array(byteLength: Double): Uint8Array = js.native
    
    /**
      * Skips the given byte length the currently loaded data range.
      * @param byteLength The byte length to skip
      */
    def skipBytes(byteLength: Double): Unit = js.native
  }
  
  @js.native
  trait IDataBuffer extends StObject {
    
    /**
      * The byte length of the buffer.
      */
    val byteLength: Double = js.native
    
    /**
      * Reads bytes from the data buffer.
      * @param byteOffset The byte offset to read
      * @param byteLength The byte length to read
      * @returns A promise that resolves when the bytes are read
      */
    def readAsync(byteOffset: Double, byteLength: Double): js.Promise[ArrayBufferView] = js.native
  }
  object IDataBuffer {
    
    @scala.inline
    def apply(byteLength: Double, readAsync: (Double, Double) => js.Promise[ArrayBufferView]): IDataBuffer = {
      val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], readAsync = js.Any.fromFunction2(readAsync))
      __obj.asInstanceOf[IDataBuffer]
    }
    
    @scala.inline
    implicit class IDataBufferMutableBuilder[Self <: IDataBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadAsync(value: (Double, Double) => js.Promise[ArrayBufferView]): Self = StObject.set(x, "readAsync", js.Any.fromFunction2(value))
    }
  }
}

package typings.checksum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generates a checksum for the given value
    * @param value    Any value
    * @param options    Allows to set the algorithm
    * @returns    Checksum
    */
  inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Any, options: ChecksumOptions): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("checksum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param callback    Callback which is called with the result or an error
    */
  inline def file(filename: String, callback: js.Function2[/* error */ js.Error, /* hash */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param options    Options object to indicate hash algo
    * @param callback    Callback which is called with the result or an error
    */
  inline def file(
    filename: String,
    options: ChecksumOptions,
    callback: js.Function2[/* error */ js.Error, /* hash */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Options object for all functions
    */
  trait ChecksumOptions extends StObject {
    
    /**
      * Algorithm to use, default 'sha1'
      * Can be 'sha1' or 'md5'  (see module 'crypto').
      */
    var algorithm: js.UndefOr[String] = js.undefined
    
    /**
      * Encoding to use, default 'hex'
      * Can be 'base64' (see NodeJS encoding support)
      */
    var encoding: js.UndefOr[String] = js.undefined
  }
  object ChecksumOptions {
    
    inline def apply(): ChecksumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChecksumOptions]
    }
    
    extension [Self <: ChecksumOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}

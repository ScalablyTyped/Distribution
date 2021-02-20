package typings.checksum

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generates a checksum for the given value
    * @param value    Any value
    * @param options    Allows to set the algorithm
    * @returns    Checksum
    */
  @JSImport("checksum", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): String = js.native
  @JSImport("checksum", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, options: ChecksumOptions): String = js.native
  
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param callback    Callback which is called with the result or an error
    */
  @JSImport("checksum", "file")
  @js.native
  def file(filename: String, callback: js.Function2[/* error */ Error, /* hash */ String, Unit]): Unit = js.native
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param options    Options object to indicate hash algo
    * @param callback    Callback which is called with the result or an error
    */
  @JSImport("checksum", "file")
  @js.native
  def file(
    filename: String,
    options: ChecksumOptions,
    callback: js.Function2[/* error */ Error, /* hash */ String, Unit]
  ): Unit = js.native
  
  /**
    * Options object for all functions
    */
  @js.native
  trait ChecksumOptions extends StObject {
    
    /**
      * Algorithm to use, default 'sha1'
      * Can be 'sha1' or 'md5'  (see module 'crypto').
      */
    var algorithm: js.UndefOr[String] = js.native
  }
  object ChecksumOptions {
    
    @scala.inline
    def apply(): ChecksumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChecksumOptions]
    }
    
    @scala.inline
    implicit class ChecksumOptionsMutableBuilder[Self <: ChecksumOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    }
  }
}

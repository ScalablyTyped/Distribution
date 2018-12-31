package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "io")
@js.native
object ioNs extends js.Object {
  /**
    * Applicable when part of a file or directory cannot be found.
    *
    * @example throw new errors.io.DirectoryNotFoundError("/var/log", err)
    */
  @js.native
  class DirectoryNotFoundError protected () extends IOError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, inner_error: commonDashErrorsLib.commonDashErrorsMod.Error) = this()
  }
  
  /**
    * Applicable when trying to access a drive or share that is not
    * available.
    *
    * @example throw new errors.io.DriveNotFoundError("c", err)
    */
  @js.native
  class DriveNotFoundError protected () extends IOError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, inner_error: commonDashErrorsLib.commonDashErrorsMod.Error) = this()
  }
  
  /**
    * Applicable when reading is attempted past the end of a stream.
    *
    * @example throw new errors.io.EndOfStreamError("EOS while reading header", err)
    */
  @js.native
  class EndOfStreamError protected () extends IOError {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, inner_error: commonDashErrorsLib.commonDashErrorsMod.Error) = this()
  }
  
  /**
    * Applicable when a file is found and read but cannot be loaded.
    *
    * @example throw new errors.io.FileLoadError("./package.json", err)
    */
  @js.native
  class FileLoadError protected () extends IOError {
    /**
      * @param file_name   any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(file_name: java.lang.String) = this()
    def this(file_name: java.lang.String, inner_error: commonDashErrorsLib.commonDashErrorsMod.Error) = this()
  }
  
  /**
    * Applicable when an attempt to access a file that does not exist on
    * disk fails.
    *
    * @example throw new errors.io.FileNotFoundError("./package.json", err)
    */
  @js.native
  class FileNotFoundError protected () extends IOError {
    /**
      * @param file_name   any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(file_name: java.lang.String) = this()
    def this(file_name: java.lang.String, inner_error: commonDashErrorsLib.commonDashErrorsMod.Error) = this()
  }
  
  /**
    * Base class for Errors while accessing information using streams,
    * files and directories.
    *
    * @example throw new errors.io.IOError("Could not open file", err)
    */
  @js.native
  class IOError protected ()
    extends commonDashErrorsLib.commonDashErrorsMod.ErrorConstructor {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current
      *                    error. Stack trace will be appended.
      */
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, inner_error: commonDashErrorsLib.commonDashErrorsMod.Error) = this()
  }
  
}


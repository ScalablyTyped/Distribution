package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait System extends StObject {
  
  var args: Array[java.lang.String] = js.native
  
  var base64decode: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.native
  
  var base64encode: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.native
  
  var clearScreen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var clearTimeout: js.UndefOr[js.Function1[/* timeoutId */ Any, Unit]] = js.native
  
  def createDirectory(path: java.lang.String): Unit = js.native
  
  /**
    * A good implementation is node.js' `crypto.createHash`. (https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm)
    */
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  
  /** This must be cryptographically secure. Only implement this method using `crypto.createHash("sha256")`. */
  var createSHA256Hash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  
  var deleteFile: js.UndefOr[js.Function1[/* path */ java.lang.String, Unit]] = js.native
  
  def directoryExists(path: java.lang.String): Boolean = js.native
  
  def exit(): Unit = js.native
  def exit(exitCode: Double): Unit = js.native
  
  def fileExists(path: java.lang.String): Boolean = js.native
  
  def getCurrentDirectory(): java.lang.String = js.native
  
  def getDirectories(path: java.lang.String): Array[java.lang.String] = js.native
  
  def getExecutingFilePath(): java.lang.String = js.native
  
  var getFileSize: js.UndefOr[js.Function1[/* path */ java.lang.String, Double]] = js.native
  
  var getMemoryUsage: js.UndefOr[js.Function0[Double]] = js.native
  
  var getModifiedTime: js.UndefOr[js.Function1[/* path */ java.lang.String, js.UndefOr[Date]]] = js.native
  
  var getWidthOfTerminal: js.UndefOr[js.Function0[Double]] = js.native
  
  var newLine: java.lang.String = js.native
  
  def readDirectory(path: java.lang.String): Array[java.lang.String] = js.native
  def readDirectory(path: java.lang.String, extensions: Unit, exclude: Unit, include: Unit, depth: Double): Array[java.lang.String] = js.native
  def readDirectory(path: java.lang.String, extensions: Unit, exclude: Unit, include: Array[java.lang.String]): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Unit,
    exclude: Unit,
    include: Array[java.lang.String],
    depth: Double
  ): Array[java.lang.String] = js.native
  def readDirectory(path: java.lang.String, extensions: Unit, exclude: Array[java.lang.String]): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Unit,
    exclude: Array[java.lang.String],
    include: Unit,
    depth: Double
  ): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Unit,
    exclude: Array[java.lang.String],
    include: Array[java.lang.String]
  ): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Unit,
    exclude: Array[java.lang.String],
    include: Array[java.lang.String],
    depth: Double
  ): Array[java.lang.String] = js.native
  def readDirectory(path: java.lang.String, extensions: Array[java.lang.String]): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Array[java.lang.String],
    exclude: Unit,
    include: Unit,
    depth: Double
  ): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Array[java.lang.String],
    exclude: Unit,
    include: Array[java.lang.String]
  ): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Array[java.lang.String],
    exclude: Unit,
    include: Array[java.lang.String],
    depth: Double
  ): Array[java.lang.String] = js.native
  def readDirectory(path: java.lang.String, extensions: Array[java.lang.String], exclude: Array[java.lang.String]): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Array[java.lang.String],
    exclude: Array[java.lang.String],
    include: Unit,
    depth: Double
  ): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Array[java.lang.String],
    exclude: Array[java.lang.String],
    include: Array[java.lang.String]
  ): Array[java.lang.String] = js.native
  def readDirectory(
    path: java.lang.String,
    extensions: Array[java.lang.String],
    exclude: Array[java.lang.String],
    include: Array[java.lang.String],
    depth: Double
  ): Array[java.lang.String] = js.native
  
  def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def readFile(path: java.lang.String, encoding: java.lang.String): js.UndefOr[java.lang.String] = js.native
  
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  
  def resolvePath(path: java.lang.String): java.lang.String = js.native
  
  var setModifiedTime: js.UndefOr[js.Function2[/* path */ java.lang.String, /* time */ Date, Unit]] = js.native
  
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ Any, Unit], 
      /* ms */ Double, 
      /* repeated */ Any, 
      Any
    ]
  ] = js.native
  
  var useCaseSensitiveFileNames: Boolean = js.native
  
  var watchDirectory: js.UndefOr[
    js.Function4[
      /* path */ java.lang.String, 
      /* callback */ DirectoryWatcherCallback, 
      /* recursive */ js.UndefOr[Boolean], 
      /* options */ js.UndefOr[WatchOptions], 
      FileWatcher
    ]
  ] = js.native
  
  /**
    * @pollingInterval - this parameter is used in polling-based watchers and ignored in watchers that
    * use native OS file watching
    */
  var watchFile: js.UndefOr[
    js.Function4[
      /* path */ java.lang.String, 
      /* callback */ FileWatcherCallback, 
      /* pollingInterval */ js.UndefOr[Double], 
      /* options */ js.UndefOr[WatchOptions], 
      FileWatcher
    ]
  ] = js.native
  
  def write(s: java.lang.String): Unit = js.native
  
  def writeFile(path: java.lang.String, data: java.lang.String): Unit = js.native
  def writeFile(path: java.lang.String, data: java.lang.String, writeByteOrderMark: Boolean): Unit = js.native
  
  var writeOutputIsTTY: js.UndefOr[js.Function0[Boolean]] = js.native
}

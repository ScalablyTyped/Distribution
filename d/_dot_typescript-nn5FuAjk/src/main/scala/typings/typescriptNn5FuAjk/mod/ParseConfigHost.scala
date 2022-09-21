package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseConfigHost extends StObject {
  
  /**
    * Gets a value indicating whether the specified path exists and is a file.
    * @param path The path to test.
    */
  def fileExists(path: java.lang.String): Boolean = js.native
  
  def readDirectory(
    rootDir: java.lang.String,
    extensions: Array[java.lang.String],
    excludes: Unit,
    includes: Array[java.lang.String]
  ): Array[java.lang.String] = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: Array[java.lang.String],
    excludes: Unit,
    includes: Array[java.lang.String],
    depth: Double
  ): Array[java.lang.String] = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: Array[java.lang.String],
    excludes: Array[java.lang.String],
    includes: Array[java.lang.String]
  ): Array[java.lang.String] = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: Array[java.lang.String],
    excludes: Array[java.lang.String],
    includes: Array[java.lang.String],
    depth: Double
  ): Array[java.lang.String] = js.native
  
  def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  
  var useCaseSensitiveFileNames: Boolean = js.native
}

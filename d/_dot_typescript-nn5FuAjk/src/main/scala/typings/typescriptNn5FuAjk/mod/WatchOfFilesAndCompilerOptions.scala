package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates the watch that generates program using the root files and compiler options
  */
trait WatchOfFilesAndCompilerOptions[T]
  extends StObject
     with Watch[T] {
  
  /** Updates the root files in the program, only if this is not config file compilation */
  def updateRootFileNames(fileNames: Array[java.lang.String]): Unit
}
object WatchOfFilesAndCompilerOptions {
  
  inline def apply[T](close: () => Unit, getProgram: () => T, updateRootFileNames: Array[java.lang.String] => Unit): WatchOfFilesAndCompilerOptions[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram), updateRootFileNames = js.Any.fromFunction1(updateRootFileNames))
    __obj.asInstanceOf[WatchOfFilesAndCompilerOptions[T]]
  }
  
  extension [Self <: WatchOfFilesAndCompilerOptions[?], T](x: Self & WatchOfFilesAndCompilerOptions[T]) {
    
    inline def setUpdateRootFileNames(value: Array[java.lang.String] => Unit): Self = StObject.set(x, "updateRootFileNames", js.Any.fromFunction1(value))
  }
}

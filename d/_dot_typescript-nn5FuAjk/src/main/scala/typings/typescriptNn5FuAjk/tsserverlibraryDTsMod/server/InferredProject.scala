package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If a file is opened and no tsconfig (or jsconfig) is found,
  * the file and its imports/references are put into an InferredProject.
  */
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.InferredProject")
@js.native
open class InferredProject () extends Project {
  
  /* private */ var _isJsInferredProject: Any = js.native
  
  def isProjectWithSingleRoot(): Boolean = js.native
  
  /** this is canonical project root path */
  val projectRootPath: js.UndefOr[String] = js.native
  
  def setCompilerOptions(): Unit = js.native
  
  def toggleJsInferredProject(isJsInferredProject: Boolean): Unit = js.native
}

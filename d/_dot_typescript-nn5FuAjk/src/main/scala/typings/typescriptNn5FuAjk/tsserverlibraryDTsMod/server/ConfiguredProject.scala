package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * If a file is opened, the server will look for a tsconfig (or jsconfig)
  * and if successful create a ConfiguredProject for it.
  * Otherwise it will create an InferredProject.
  */
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ConfiguredProject")
@js.native
open class ConfiguredProject () extends Project {
  
  val canonicalConfigFilePath: NormalizedPath = js.native
  
  /** Ref count to the project when opened from external project */
  /* private */ var externalProjectRefCount: Any = js.native
  
  def getConfigFilePath(): NormalizedPath = js.native
  
  def getEffectiveTypeRoots(): Array[String] = js.native
  
  @JSName("getProjectReferences")
  def getProjectReferences_MConfiguredProject(): js.UndefOr[Array[ProjectReference]] = js.native
  
  /* private */ var projectReferences: Any = js.native
  
  def updateReferences(): Unit = js.native
  def updateReferences(refs: Array[ProjectReference]): Unit = js.native
}

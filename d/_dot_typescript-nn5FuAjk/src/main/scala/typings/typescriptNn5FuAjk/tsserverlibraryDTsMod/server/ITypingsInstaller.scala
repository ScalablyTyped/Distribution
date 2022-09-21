package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Promise
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ApplyCodeActionCommandResult
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SortedReadonlyArray
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITypingsInstaller extends StObject {
  
  def attach(projectService: ProjectService): Unit = js.native
  
  def enqueueInstallTypingsRequest(p: Project, typeAcquisition: TypeAcquisition): Unit = js.native
  def enqueueInstallTypingsRequest(p: Project, typeAcquisition: TypeAcquisition, unresolvedImports: SortedReadonlyArray[String]): Unit = js.native
  
  val globalTypingsCacheLocation: js.UndefOr[String] = js.native
  
  def installPackage(options: InstallPackageOptionsWithProject): Promise[ApplyCodeActionCommandResult] = js.native
  
  def isKnownTypesPackageName(name: String): Boolean = js.native
  
  def onProjectClosed(p: Project): Unit = js.native
}

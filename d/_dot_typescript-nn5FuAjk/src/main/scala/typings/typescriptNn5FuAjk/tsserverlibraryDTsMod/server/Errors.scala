package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Errors {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.Errors")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThrowNoProject(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("ThrowNoProject")().asInstanceOf[scala.Nothing]
  
  inline def ThrowProjectDoesNotContainDocument(fileName: String, project: Project): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("ThrowProjectDoesNotContainDocument")(fileName.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def ThrowProjectLanguageServiceDisabled(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("ThrowProjectLanguageServiceDisabled")().asInstanceOf[scala.Nothing]
}

package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Project whose configuration is handled externally, such as in a '.csproj'.
  * These are created only if a host explicitly calls `openExternalProject`.
  */
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ExternalProject")
@js.native
open class ExternalProject () extends Project {
  
  var excludedFiles: Array[NormalizedPath] = js.native
  
  var externalProjectName: String = js.native
}

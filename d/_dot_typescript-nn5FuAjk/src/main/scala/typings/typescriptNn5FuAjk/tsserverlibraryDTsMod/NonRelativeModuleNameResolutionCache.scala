package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.CommonJS
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonRelativeModuleNameResolutionCache
  extends StObject
     with PackageJsonInfoCache {
  
  def getOrCreateCacheForModuleName(nonRelativeModuleName: java.lang.String): PerModuleNameCache = js.native
  def getOrCreateCacheForModuleName(nonRelativeModuleName: java.lang.String, mode: Unit, redirectedReference: ResolvedProjectReference): PerModuleNameCache = js.native
  def getOrCreateCacheForModuleName(nonRelativeModuleName: java.lang.String, mode: CommonJS): PerModuleNameCache = js.native
  def getOrCreateCacheForModuleName(
    nonRelativeModuleName: java.lang.String,
    mode: CommonJS,
    redirectedReference: ResolvedProjectReference
  ): PerModuleNameCache = js.native
  def getOrCreateCacheForModuleName(nonRelativeModuleName: java.lang.String, mode: ESNext): PerModuleNameCache = js.native
  def getOrCreateCacheForModuleName(
    nonRelativeModuleName: java.lang.String,
    mode: ESNext,
    redirectedReference: ResolvedProjectReference
  ): PerModuleNameCache = js.native
}

package typings.typescriptNn5FuAjk.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable6
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.CompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Path
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.JS
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.JSX
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.TS
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.TSX
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind.Unknown
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SortedArray
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SortedReadonlyArray
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypeAcquisition
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.DiscoverTypings
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ITypingsInstaller
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Logger
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.NormalizedPath
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.NormalizedPathMap
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ScriptInfoVersion
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ServerCancellationToken
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ServerHost
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.SessionOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.WatchOptionsAndErrors
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CompileOnSaveMixin
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ExternalProjectCompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FormatCodeSettings
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.InferredProjectCompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ScriptKindName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofserver extends StObject {
  
  var AutoImportProviderProject: Instantiable0[
    typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.AutoImportProviderProject
  ] = js.native
  
  val CommandNames: Any = js.native
  
  val ConfigFileDiagEvent: /* "configFileDiag" */ String = js.native
  
  /**
    * If a file is opened, the server will look for a tsconfig (or jsconfig)
    * and if successful create a ConfiguredProject for it.
    * Otherwise it will create an InferredProject.
    */
  var ConfiguredProject: Instantiable0[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ConfiguredProject] = js.native
  
  val Errors: TypeofErrors = js.native
  
  /**
    * Project whose configuration is handled externally, such as in a '.csproj'.
    * These are created only if a host explicitly calls `openExternalProject`.
    */
  var ExternalProject: Instantiable0[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ExternalProject] = js.native
  
  /**
    * If a file is opened and no tsconfig (or jsconfig) is found,
    * the file and its imports/references are put into an InferredProject.
    */
  var InferredProject: Instantiable0[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.InferredProject] = js.native
  
  val LargeFileReferencedEvent: /* "largeFileReferenced" */ String = js.native
  
  val Msg: Any = js.native
  
  val OpenFileInfoTelemetryEvent: /* "openFileInfo" */ String = js.native
  
  var Project: Instantiable0[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project] & TypeofProject = js.native
  
  val ProjectInfoTelemetryEvent: /* "projectInfo" */ String = js.native
  
  val ProjectLanguageServiceStateEvent: /* "projectLanguageServiceState" */ String = js.native
  
  val ProjectLoadingFinishEvent: /* "projectLoadingFinish" */ String = js.native
  
  val ProjectLoadingStartEvent: /* "projectLoadingStart" */ String = js.native
  
  var ProjectService: TypeofProjectService = js.native
  
  val ProjectsUpdatedInBackgroundEvent: /* "projectsUpdatedInBackground" */ String = js.native
  
  var ScriptInfo: Instantiable6[
    /* host */ ServerHost, 
    /* fileName */ NormalizedPath, 
    /* scriptKind */ ScriptKind, 
    /* hasMixedContent */ Boolean, 
    /* path */ Path, 
    /* initialVersion */ js.UndefOr[ScriptInfoVersion], 
    typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.ScriptInfo
  ] = js.native
  
  var Session: (Instantiable1[
    /* opts */ SessionOptions, 
    typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Session[js.Object]
  ]) & TypeofSession = js.native
  
  def allFilesAreJsOrDts(project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project): Boolean = js.native
  
  def allRootFilesAreJsOrDts(project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project): Boolean = js.native
  
  def asNormalizedPath(fileName: String): NormalizedPath = js.native
  
  def convertCompilerOptions(protocolOptions: ExternalProjectCompilerOptions): CompilerOptions & CompileOnSaveMixin = js.native
  
  def convertFormatOptions(protocolOptions: FormatCodeSettings): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FormatCodeSettings = js.native
  
  def convertScriptKindName(scriptKindName: ScriptKindName): Unknown | JS | JSX | TS | TSX = js.native
  
  def convertTypeAcquisition(protocolOptions: InferredProjectCompilerOptions): js.UndefOr[TypeAcquisition] = js.native
  
  def convertWatchOptions(protocolOptions: ExternalProjectCompilerOptions): js.UndefOr[WatchOptionsAndErrors] = js.native
  def convertWatchOptions(protocolOptions: ExternalProjectCompilerOptions, currentDirectory: String): js.UndefOr[WatchOptionsAndErrors] = js.native
  
  def createInstallTypingsRequest(
    project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project,
    typeAcquisition: TypeAcquisition,
    unresolvedImports: SortedReadonlyArray[String]
  ): DiscoverTypings = js.native
  def createInstallTypingsRequest(
    project: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.Project,
    typeAcquisition: TypeAcquisition,
    unresolvedImports: SortedReadonlyArray[String],
    cachePath: String
  ): DiscoverTypings = js.native
  
  def createNormalizedPathMap[T](): NormalizedPathMap[T] = js.native
  
  def createSortedArray[T](): SortedArray[T] = js.native
  
  val emptyArray: SortedReadonlyArray[scala.Nothing] = js.native
  
  def formatMessage[T /* <: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.Message */](
    msg: T,
    logger: Logger,
    byteLength: js.Function2[/* s */ String, /* encoding */ String, Double],
    newLine: String
  ): String = js.native
  
  def isDynamicFileName(fileName: NormalizedPath): Boolean = js.native
  
  def isInferredProjectName(name: String): Boolean = js.native
  
  def makeInferredProjectName(counter: Double): String = js.native
  
  val maxProgramSizeForNonTsFiles: Double = js.native
  
  def normalizedPathToPath(
    normalizedPath: NormalizedPath,
    currentDirectory: String,
    getCanonicalFileName: js.Function1[/* f */ String, String]
  ): Path = js.native
  
  val nullCancellationToken: ServerCancellationToken = js.native
  
  val nullTypingsInstaller: ITypingsInstaller = js.native
  
  /**
    * Declaration module describing the TypeScript Server protocol
    */
  val protocol: Any = js.native
  
  def toNormalizedPath(fileName: String): NormalizedPath = js.native
  
  def tryConvertScriptKindName(scriptKindName: ScriptKind): ScriptKind = js.native
  def tryConvertScriptKindName(scriptKindName: ScriptKindName): ScriptKind = js.native
}

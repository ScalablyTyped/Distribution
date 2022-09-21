package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.Promise
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ApplyCodeActionCommandResult
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.CompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Diagnostic
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.EmitResult
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FileReference
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.HostCancellationToken
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.InstallPackageOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageService
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceHost
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Map
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.CommonJS
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ESNext
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleResolutionCache
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Path
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.PluginImport
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ProjectReference
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ResolvedModuleFull
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ResolvedModuleWithFailedLookupLocations
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ResolvedProjectReference
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ResolvedTypeReferenceDirective
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SortedReadonlyArray
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SourceFile
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypeAcquisition
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.Project")
@js.native
abstract class Project ()
  extends StObject
     with LanguageServiceHost {
  
  def addMissingFileRoot(fileName: NormalizedPath): Unit = js.native
  
  /* private */ var addMissingFileWatcher: Any = js.native
  
  def addRoot(info: ScriptInfo): Unit = js.native
  def addRoot(info: ScriptInfo, fileName: NormalizedPath): Unit = js.native
  
  /* private */ var builderState: Any = js.native
  
  /* private */ val cancellationToken: Any = js.native
  
  /* private */ var clearGeneratedFileWatch: Any = js.native
  
  def close(): Unit = js.native
  
  var compileOnSaveEnabled: Boolean = js.native
  
  /* private */ var compilerOptions: Any = js.native
  
  def containsFile(filename: NormalizedPath): Boolean = js.native
  def containsFile(filename: NormalizedPath, requireOpen: Boolean): Boolean = js.native
  
  def containsScriptInfo(info: ScriptInfo): Boolean = js.native
  
  /* private */ var createGeneratedFileWatcher: Any = js.native
  
  /* private */ var detachScriptInfoFromProject: Any = js.native
  
  /* private */ var detachScriptInfoIfNotRoot: Any = js.native
  
  @JSName("directoryExists")
  def directoryExists_MProject(path: String): Boolean = js.native
  
  def disableLanguageService(): Unit = js.native
  def disableLanguageService(lastFileExceededProgramSize: String): Unit = js.native
  
  /* private */ var documentRegistry: Any = js.native
  
  /**
    * Returns true if emit was conducted
    */
  def emitFile(
    scriptInfo: ScriptInfo,
    writeFile: js.Function3[
      /* path */ String, 
      /* data */ String, 
      /* writeByteOrderMark */ js.UndefOr[Boolean], 
      Unit
    ]
  ): EmitResult = js.native
  
  /* protected */ def enableGlobalPlugins(options: CompilerOptions): Unit = js.native
  /* protected */ def enableGlobalPlugins(options: CompilerOptions, pluginConfigOverrides: Map[Any]): Unit = js.native
  
  def enableLanguageService(): Unit = js.native
  
  /* protected */ def enablePlugin(pluginConfigEntry: PluginImport, searchPaths: Array[String]): Unit = js.native
  /* protected */ def enablePlugin(pluginConfigEntry: PluginImport, searchPaths: Array[String], pluginConfigOverrides: Map[Any]): Unit = js.native
  
  /* private */ var enableProxy: Any = js.native
  
  @JSName("error")
  def error_MProject(s: String): Unit = js.native
  
  /* private */ var externalFiles: Any = js.native
  
  def filesToString(writeProjectFileNames: Boolean): String = js.native
  
  /* private */ var generatedFilesMap: Any = js.native
  
  /**
    * Get all the project errors
    */
  def getAllProjectErrors(): Array[Diagnostic] = js.native
  
  @JSName("getCancellationToken")
  def getCancellationToken_MProject(): HostCancellationToken = js.native
  
  def getCompileOnSaveAffectedFileList(scriptInfo: ScriptInfo): Array[String] = js.native
  
  def getCompilerOptions(): CompilerOptions = js.native
  
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MProject(): String = js.native
  
  def getDefaultLibFileName(): String = js.native
  
  @JSName("getDirectories")
  def getDirectories_MProject(path: String): Array[String] = js.native
  
  def getExcludedFiles(): Array[NormalizedPath] = js.native
  
  def getExternalFiles(): SortedReadonlyArray[String] = js.native
  
  def getFileNames(): Array[NormalizedPath] = js.native
  def getFileNames(excludeFilesFromExternalLibraries: Boolean): Array[NormalizedPath] = js.native
  def getFileNames(excludeFilesFromExternalLibraries: Boolean, excludeConfigFiles: Boolean): Array[NormalizedPath] = js.native
  def getFileNames(excludeFilesFromExternalLibraries: Unit, excludeConfigFiles: Boolean): Array[NormalizedPath] = js.native
  
  /**
    * Get the errors that dont have any file name associated
    */
  def getGlobalProjectErrors(): Array[Diagnostic] = js.native
  
  def getLanguageService(): LanguageService = js.native
  def getLanguageService(ensureSynchronized: Boolean): LanguageService = js.native
  
  def getModuleResolutionCache(): js.UndefOr[ModuleResolutionCache] = js.native
  
  @JSName("getNewLine")
  def getNewLine_MProject(): String = js.native
  
  /* private */ var getOrCreateScriptInfoAndAttachToProject: Any = js.native
  
  def getProjectName(): String = js.native
  
  @JSName("getProjectReferences")
  def getProjectReferences_MProject(): js.UndefOr[Array[ProjectReference]] = js.native
  
  @JSName("getProjectVersion")
  def getProjectVersion_MProject(): String = js.native
  
  @JSName("getResolvedModuleWithFailedLookupLocationsFromCache")
  def getResolvedModuleWithFailedLookupLocationsFromCache_MProject(moduleName: String, containingFile: String): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  @JSName("getResolvedModuleWithFailedLookupLocationsFromCache")
  def getResolvedModuleWithFailedLookupLocationsFromCache_MProject(moduleName: String, containingFile: String, resolutionMode: CommonJS): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  @JSName("getResolvedModuleWithFailedLookupLocationsFromCache")
  def getResolvedModuleWithFailedLookupLocationsFromCache_MProject(moduleName: String, containingFile: String, resolutionMode: ESNext): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  
  def getRootFiles(): Array[NormalizedPath] = js.native
  
  def getRootScriptInfos(): Array[ScriptInfo] = js.native
  
  def getScriptInfo(uncheckedFileName: String): js.UndefOr[ScriptInfo] = js.native
  
  def getScriptInfoForNormalizedPath(fileName: NormalizedPath): js.UndefOr[ScriptInfo] = js.native
  
  def getScriptInfos(): Array[ScriptInfo] = js.native
  
  @JSName("getScriptKind")
  def getScriptKind_MProject(fileName: String): ScriptKind = js.native
  
  def getSourceFile(path: Path): js.UndefOr[SourceFile] = js.native
  
  def getTypeAcquisition(): TypeAcquisition = js.native
  
  def hasConfigFile(configFilePath: NormalizedPath): Boolean = js.native
  
  def hasRoots(): Boolean = js.native
  
  @JSName("installPackage")
  def installPackage_MProject(options: InstallPackageOptions): Promise[ApplyCodeActionCommandResult] = js.native
  
  def isClosed(): Boolean = js.native
  
  /* protected */ def isInitialLoadPending(): Boolean = js.native
  
  def isJsOnlyProject(): Boolean = js.native
  
  @JSName("isKnownTypesPackageName")
  def isKnownTypesPackageName_MProject(name: String): Boolean = js.native
  
  def isNonTsProject(): Boolean = js.native
  
  def isRoot(info: ScriptInfo): Boolean = js.native
  
  /* private */ var isValidGeneratedFileWatcher: Any = js.native
  
  /* private */ var isWatchedMissingFile: Any = js.native
  
  /* protected */ var languageService: LanguageService = js.native
  
  var languageServiceEnabled: Boolean = js.native
  
  /**
    * Set of files that was returned from the last call to getChangesSinceVersion.
    */
  /* private */ var lastReportedFileNames: Any = js.native
  
  /**
    * Last version that was reported.
    */
  /* private */ var lastReportedVersion: Any = js.native
  
  @JSName("log")
  def log_MProject(s: String): Unit = js.native
  
  def markAsDirty(): Unit = js.native
  
  /* private */ var missingFilesMap: Any = js.native
  
  /* private */ var plugins: Any = js.native
  
  /* private */ var program: Any = js.native
  
  /* protected */ var projectErrors: js.UndefOr[Array[Diagnostic]] = js.native
  
  val projectKind: ProjectKind = js.native
  
  val projectName: String = js.native
  
  /**
    * Current project's program version. (incremented everytime new program is created that is not complete reuse from the old one)
    * This property is changed in 'updateGraph' based on the set of files in program
    */
  /* private */ var projectProgramVersion: Any = js.native
  
  val projectService: ProjectService = js.native
  
  /**
    * Current version of the project state. It is changed when:
    * - new root file was added/removed
    * - edit happen in some file that is currently included in the project.
    * This property is different from projectStructureVersion since in most cases edits don't affect set of files in the project
    */
  /* private */ var projectStateVersion: Any = js.native
  
  @JSName("readDirectory")
  def readDirectory_MProject(path: String): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Unit, exclude: Unit, include: Unit, depth: Double): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Unit, exclude: Unit, include: Array[String]): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Unit, exclude: Unit, include: Array[String], depth: Double): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Unit, exclude: Array[String]): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Unit, exclude: Array[String], include: Unit, depth: Double): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Unit, exclude: Array[String], include: Array[String]): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Unit, exclude: Array[String], include: Array[String], depth: Double): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Array[String]): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Array[String], exclude: Unit, include: Unit, depth: Double): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Array[String], exclude: Unit, include: Array[String]): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Array[String], exclude: Unit, include: Array[String], depth: Double): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Array[String], exclude: Array[String]): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Array[String], exclude: Array[String], include: Unit, depth: Double): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(path: String, extensions: Array[String], exclude: Array[String], include: Array[String]): Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MProject(
    path: String,
    extensions: Array[String],
    exclude: Array[String],
    include: Array[String],
    depth: Double
  ): Array[String] = js.native
  
  @JSName("realpath")
  val realpath_Project: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  
  /** Starts a new check for diagnostics. Call this if some file has updated that would cause diagnostics to be changed. */
  def refreshDiagnostics(): Unit = js.native
  
  def registerFileUpdate(fileName: String): Unit = js.native
  
  /* protected */ def removeExistingTypings(include: Array[String]): Array[String] = js.native
  
  def removeFile(info: ScriptInfo, fileExists: Boolean, detachFromProject: Boolean): Unit = js.native
  
  /* protected */ def removeLocalTypingsFromTypeAcquisition(newTypeAcquisition: TypeAcquisition): TypeAcquisition = js.native
  
  /* protected */ def removeRoot(info: ScriptInfo): Unit = js.native
  
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(moduleNames: Array[String], containingFile: String): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Unit,
    redirectedReference: Unit,
    _options: Unit,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Unit,
    redirectedReference: Unit,
    _options: CompilerOptions
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Unit,
    redirectedReference: Unit,
    _options: CompilerOptions,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Unit,
    redirectedReference: ResolvedProjectReference
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Unit,
    redirectedReference: ResolvedProjectReference,
    _options: Unit,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Unit,
    redirectedReference: ResolvedProjectReference,
    _options: CompilerOptions
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Unit,
    redirectedReference: ResolvedProjectReference,
    _options: CompilerOptions,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(moduleNames: Array[String], containingFile: String, reusedNames: Array[String]): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Array[String],
    redirectedReference: Unit,
    _options: Unit,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Array[String],
    redirectedReference: Unit,
    _options: CompilerOptions
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Array[String],
    redirectedReference: Unit,
    _options: CompilerOptions,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Array[String],
    redirectedReference: ResolvedProjectReference
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Array[String],
    redirectedReference: ResolvedProjectReference,
    _options: Unit,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Array[String],
    redirectedReference: ResolvedProjectReference,
    _options: CompilerOptions
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  @JSName("resolveModuleNames")
  def resolveModuleNames_MProject(
    moduleNames: Array[String],
    containingFile: String,
    reusedNames: Array[String],
    redirectedReference: ResolvedProjectReference,
    _options: CompilerOptions,
    containingSourceFile: SourceFile
  ): Array[js.UndefOr[ResolvedModuleFull]] = js.native
  
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(typeDirectiveNames: Array[FileReference | String], containingFile: String): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(
    typeDirectiveNames: Array[FileReference | String],
    containingFile: String,
    redirectedReference: Unit,
    _options: Unit,
    containingFileMode: js.UndefOr[CommonJS | ESNext]
  ): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(
    typeDirectiveNames: Array[FileReference | String],
    containingFile: String,
    redirectedReference: Unit,
    _options: CompilerOptions
  ): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(
    typeDirectiveNames: Array[FileReference | String],
    containingFile: String,
    redirectedReference: Unit,
    _options: CompilerOptions,
    containingFileMode: js.UndefOr[CommonJS | ESNext]
  ): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(
    typeDirectiveNames: Array[FileReference | String],
    containingFile: String,
    redirectedReference: ResolvedProjectReference
  ): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(
    typeDirectiveNames: Array[FileReference | String],
    containingFile: String,
    redirectedReference: ResolvedProjectReference,
    _options: Unit,
    containingFileMode: js.UndefOr[CommonJS | ESNext]
  ): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(
    typeDirectiveNames: Array[FileReference | String],
    containingFile: String,
    redirectedReference: ResolvedProjectReference,
    _options: CompilerOptions
  ): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  @JSName("resolveTypeReferenceDirectives")
  def resolveTypeReferenceDirectives_MProject(
    typeDirectiveNames: Array[FileReference | String],
    containingFile: String,
    redirectedReference: ResolvedProjectReference,
    _options: CompilerOptions,
    containingFileMode: js.UndefOr[CommonJS | ESNext]
  ): Array[js.UndefOr[ResolvedTypeReferenceDirective]] = js.native
  
  /* private */ var rootFiles: Any = js.native
  
  /* private */ var rootFilesMap: Any = js.native
  
  def setCompilerOptions(compilerOptions: CompilerOptions): Unit = js.native
  
  /* private */ var setInternalCompilerOptionsForEmittingJsFiles: Any = js.native
  
  def setProjectErrors(): Unit = js.native
  def setProjectErrors(projectErrors: Array[Diagnostic]): Unit = js.native
  
  def setTypeAcquisition(): Unit = js.native
  def setTypeAcquisition(newTypeAcquisition: TypeAcquisition): Unit = js.native
  
  @JSName("trace")
  val trace_Project: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
  
  /* private */ def typingsCache: Any = js.native
  
  /**
    * Updates set of files that contribute to this project
    * @returns: true if set of files in the project stays the same and false - otherwise.
    */
  def updateGraph(): Boolean = js.native
  
  /* private */ var updateGraphWorker: Any = js.native
  
  /**
    * Set of files names that were updated since the last call to getChangesSinceVersion.
    */
  /* private */ var updatedFileNames: Any = js.native
  
  @JSName("useCaseSensitiveFileNames")
  def useCaseSensitiveFileNames_MProject(): Boolean = js.native
  
  /* protected */ var watchOptions: js.UndefOr[WatchOptions] = js.native
  
  @JSName("writeFile")
  def writeFile_MProject(fileName: String, content: String): Unit = js.native
}
object Project {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.Project")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def resolveModule(
    moduleName: String,
    initialDir: String,
    host: ServerHost,
    log: js.Function1[/* message */ String, Unit]
  ): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModule")(moduleName.asInstanceOf[js.Any], initialDir.asInstanceOf[js.Any], host.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
  inline def resolveModule(
    moduleName: String,
    initialDir: String,
    host: ServerHost,
    log: js.Function1[/* message */ String, Unit],
    logErrors: js.Function1[/* message */ String, Unit]
  ): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModule")(moduleName.asInstanceOf[js.Any], initialDir.asInstanceOf[js.Any], host.asInstanceOf[js.Any], log.asInstanceOf[js.Any], logErrors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
}

package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.anon.`0`
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FormatCodeSettings
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.HostCancellationToken
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceMode
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Map
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Path
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ConfigurePluginRequestArguments
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ConfigureRequestArguments
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.InferredProjectCompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.UserPreferences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectService")
@js.native
open class ProjectService protected () extends StObject {
  def this(opts: ProjectServiceOptions) = this()
  
  /* private */ var addFilesToNonInferredProject: Any = js.native
  
  /* private */ var addMissingSourceMapFile: Any = js.native
  
  /* private */ var addSourceInfoToSourceMap: Any = js.native
  
  /* private */ val allJsFilesForOpenFileTelemetry: Any = js.native
  
  val allowLocalPluginLoads: Boolean = js.native
  
  def applySafeList(proj: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ExternalProject): Array[NormalizedPath] = js.native
  
  /* private */ var assignOrphanScriptInfosToInferredProject: Any = js.native
  
  /* private */ var assignProjectToOpenedScriptInfo: Any = js.native
  
  val cancellationToken: HostCancellationToken = js.native
  
  /* private */ var cleanupAfterOpeningFile: Any = js.native
  
  /**
    * Close file whose contents is managed by the client
    * @param filename is absolute pathname
    */
  def closeClientFile(uncheckedFileName: String): Unit = js.native
  
  /* private */ var closeConfiguredProjectReferencedFromExternalProject: Any = js.native
  
  def closeExternalProject(uncheckedFileName: String): Unit = js.native
  
  def closeLog(): Unit = js.native
  
  /**
    * Remove this file from the set of open, non-configured files.
    * @param info The file that has been closed or newly configured
    */
  /* private */ var closeOpenFile: Any = js.native
  
  /* private */ var collectChanges: Any = js.native
  
  /* private */ var compilerOptionsForInferredProjects: Any = js.native
  
  /* private */ var compilerOptionsForInferredProjectsPerProjectRoot: Any = js.native
  
  /**
    * Returns true if the configFileExistenceInfo is needed/impacted by open files that are root of inferred project
    */
  /* private */ var configFileExistenceImpactsRootOfInferredProject: Any = js.native
  
  /* private */ var configFileExists: Any = js.native
  
  def configurePlugin(args: ConfigurePluginRequestArguments): Unit = js.native
  
  /**
    * projects specified by a tsconfig.json file
    */
  val configuredProjects: Map[ConfiguredProject] = js.native
  
  /* private */ var createAncestorProjects: Any = js.native
  
  /* private */ var createExternalProject: Any = js.native
  
  /* private */ var createInferredProject: Any = js.native
  
  /* private */ var createNodeModulesWatcher: Any = js.native
  
  val currentDirectory: NormalizedPath = js.native
  
  /* private */ var currentPluginConfigOverrides: Any = js.native
  
  /* private */ var delayUpdateProjectGraph: Any = js.native
  
  /* private */ var delayUpdateProjectGraphs: Any = js.native
  
  /* private */ var delayUpdateProjectsOfScriptInfoPath: Any = js.native
  
  /* private */ var delayUpdateSourceInfoProjects: Any = js.native
  
  /* private */ var deleteScriptInfo: Any = js.native
  
  /* private */ var doEnsureDefaultProjectForFile: Any = js.native
  
  /* private */ var ensureProjectChildren: Any = js.native
  
  /**
    * This function is to update the project structure for every inferred project.
    * It is called on the premise that all the configured projects are
    * up to date.
    * This will go through open files and assign them to inferred project if open file is not part of any other project
    * After that all the inferred project graphs are updated
    */
  /* private */ var ensureProjectForOpenFiles: Any = js.native
  
  /**
    * Ensures the project structures are upto date
    * This means,
    * - we go through all the projects and update them if they are dirty
    * - if updates reflect some change in structure or there was pending request to ensure projects for open files
    *   ensure that each open script info has project
    */
  /* private */ var ensureProjectStructuresUptoDate: Any = js.native
  
  /* private */ val eventHandler: Any = js.native
  
  /**
    * maps external project file name to list of config files that were the part of this project
    */
  /* private */ val externalProjectToConfiguredProjectMap: Any = js.native
  
  /**
    * external projects (configuration and list of root files is not controlled by tsserver)
    */
  val externalProjects: Array[ExternalProject] = js.native
  
  /**
    * Contains all the deleted script info's version information so that
    * it does not reset when creating script info again
    * (and could have potentially collided with version where contents mismatch)
    */
  /* private */ val filenameToScriptInfoVersion: Any = js.native
  
  /* private */ var findExternalProjectByProjectName: Any = js.native
  
  /* private */ var findExternalProjectContainingOpenScriptInfo: Any = js.native
  
  def findProject(projectName: String): js.UndefOr[Project] = js.native
  
  /**
    * This function tries to search for a tsconfig.json for the given file.
    * This is different from the method the compiler uses because
    * the compiler can assume it will always start searching in the
    * current directory (the directory in which tsc was invoked).
    * The server must start searching from the directory containing
    * the newly opened file.
    */
  /* private */ var forEachConfigFileLocation: Any = js.native
  
  /**
    * This function tries to search for a tsconfig.json for the given file.
    * This is different from the method the compiler uses because
    * the compiler can assume it will always start searching in the
    * current directory (the directory in which tsc was invoked).
    * The server must start searching from the directory containing
    * the newly opened file.
    * If script info is passed in, it is asserted to be open script info
    * otherwise just file name
    */
  /* private */ var getConfigFileNameForFile: Any = js.native
  
  /* private */ var getConfiguredProjectByCanonicalConfigFilePath: Any = js.native
  
  def getDefaultProjectForFile(fileName: NormalizedPath, ensureProject: Boolean): js.UndefOr[Project] = js.native
  
  /** Get a filename if the language service exceeds the maximum allowed program size; otherwise returns undefined. */
  /* private */ var getFilenameForExceededTotalSizeLimitForNonTsFiles: Any = js.native
  
  def getFormatCodeOptions(file: NormalizedPath): FormatCodeSettings = js.native
  
  def getHostFormatCodeOptions(): FormatCodeSettings = js.native
  
  def getHostPreferences(): UserPreferences = js.native
  
  /* private */ var getModifiedTime: Any = js.native
  
  /* private */ var getOrCreateInferredProjectForProjectRootPathIfEnabled: Any = js.native
  
  /* private */ var getOrCreateOpenScriptInfo: Any = js.native
  
  def getOrCreateScriptInfoForNormalizedPath(fileName: NormalizedPath, openedByClient: Boolean): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(fileName: NormalizedPath, openedByClient: Boolean, fileContent: String): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: String,
    scriptKind: Unit,
    hasMixedContent: Boolean
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: String,
    scriptKind: Unit,
    hasMixedContent: Boolean,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: String,
    scriptKind: Unit,
    hasMixedContent: Unit,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(fileName: NormalizedPath, openedByClient: Boolean, fileContent: String, scriptKind: ScriptKind): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: String,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: String,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: String,
    scriptKind: ScriptKind,
    hasMixedContent: Unit,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: Unit,
    scriptKind: Unit,
    hasMixedContent: Boolean
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: Unit,
    scriptKind: Unit,
    hasMixedContent: Boolean,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: Unit,
    scriptKind: Unit,
    hasMixedContent: Unit,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(fileName: NormalizedPath, openedByClient: Boolean, fileContent: Unit, scriptKind: ScriptKind): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: Unit,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: Unit,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  def getOrCreateScriptInfoForNormalizedPath(
    fileName: NormalizedPath,
    openedByClient: Boolean,
    fileContent: Unit,
    scriptKind: ScriptKind,
    hasMixedContent: Unit,
    hostToQueryFileExistsOn: `0`
  ): js.UndefOr[ScriptInfo] = js.native
  
  /* private */ var getOrCreateScriptInfoNotOpenedByClientForNormalizedPath: Any = js.native
  
  /* private */ var getOrCreateScriptInfoOpenedByClientForNormalizedPath: Any = js.native
  
  /* private */ var getOrCreateScriptInfoWorker: Any = js.native
  
  /* private */ var getOrCreateSingleInferredProjectIfEnabled: Any = js.native
  
  /* private */ var getOrCreateSingleInferredWithoutProjectRoot: Any = js.native
  
  def getPreferences(file: NormalizedPath): UserPreferences = js.native
  
  def getScriptInfo(uncheckedFileName: String): js.UndefOr[ScriptInfo] = js.native
  
  def getScriptInfoEnsuringProjectsUptoDate(uncheckedFileName: String): js.UndefOr[ScriptInfo] = js.native
  
  /**
    * This gets the script info for the normalized path. If the path is not rooted disk path then the open script info with project root context is preferred
    */
  def getScriptInfoForNormalizedPath(fileName: NormalizedPath): js.UndefOr[ScriptInfo] = js.native
  
  def getScriptInfoForPath(fileName: Path): js.UndefOr[ScriptInfo] = js.native
  
  /* private */ val globalCacheLocationDirectoryPath: Any = js.native
  
  val globalPlugins: Array[String] = js.native
  
  /* private */ var handleDeletedFile: Any = js.native
  
  /* private */ var handleSourceMapProjects: Any = js.native
  
  def hasDeferredExtension(): Boolean = js.native
  
  val host: ServerHost = js.native
  
  /* private */ val hostConfiguration: Any = js.native
  
  /**
    * projects built from openFileRoots
    */
  val inferredProjects: Array[InferredProject] = js.native
  
  /* private */ val legacySafelist: Any = js.native
  
  /* private */ var loadTypesMap: Any = js.native
  
  val logger: Logger = js.native
  
  /* private */ val nodeModulesWatchers: Any = js.native
  
  /* private */ var onSourceFileChanged: Any = js.native
  
  /**
    * Open file whose contents is managed by the client
    * @param filename is absolute pathname
    * @param fileContent is a known version of the file content that is more up to date than the one on disk
    */
  def openClientFile(fileName: String): OpenConfiguredProjectResult = js.native
  def openClientFile(fileName: String, fileContent: String): OpenConfiguredProjectResult = js.native
  def openClientFile(fileName: String, fileContent: String, scriptKind: Unit, projectRootPath: String): OpenConfiguredProjectResult = js.native
  def openClientFile(fileName: String, fileContent: String, scriptKind: ScriptKind): OpenConfiguredProjectResult = js.native
  def openClientFile(fileName: String, fileContent: String, scriptKind: ScriptKind, projectRootPath: String): OpenConfiguredProjectResult = js.native
  def openClientFile(fileName: String, fileContent: Unit, scriptKind: Unit, projectRootPath: String): OpenConfiguredProjectResult = js.native
  def openClientFile(fileName: String, fileContent: Unit, scriptKind: ScriptKind): OpenConfiguredProjectResult = js.native
  def openClientFile(fileName: String, fileContent: Unit, scriptKind: ScriptKind, projectRootPath: String): OpenConfiguredProjectResult = js.native
  
  def openClientFileWithNormalizedPath(fileName: NormalizedPath): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(fileName: NormalizedPath, fileContent: String): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(fileName: NormalizedPath, fileContent: String, scriptKind: Unit, hasMixedContent: Boolean): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: String,
    scriptKind: Unit,
    hasMixedContent: Boolean,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: String,
    scriptKind: Unit,
    hasMixedContent: Unit,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(fileName: NormalizedPath, fileContent: String, scriptKind: ScriptKind): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(fileName: NormalizedPath, fileContent: String, scriptKind: ScriptKind, hasMixedContent: Boolean): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: String,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: String,
    scriptKind: ScriptKind,
    hasMixedContent: Unit,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(fileName: NormalizedPath, fileContent: Unit, scriptKind: Unit, hasMixedContent: Boolean): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: Unit,
    scriptKind: Unit,
    hasMixedContent: Boolean,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: Unit,
    scriptKind: Unit,
    hasMixedContent: Unit,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(fileName: NormalizedPath, fileContent: Unit, scriptKind: ScriptKind): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(fileName: NormalizedPath, fileContent: Unit, scriptKind: ScriptKind, hasMixedContent: Boolean): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: Unit,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  def openClientFileWithNormalizedPath(
    fileName: NormalizedPath,
    fileContent: Unit,
    scriptKind: ScriptKind,
    hasMixedContent: Unit,
    projectRootPath: NormalizedPath
  ): OpenConfiguredProjectResult = js.native
  
  def openExternalProject(proj: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ExternalProject): Unit = js.native
  
  def openExternalProjects(projects: Array[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ExternalProject]): Unit = js.native
  
  /**
    * Open files: with value being project root path, and key being Path of the file that is open
    */
  val openFiles: Map[js.UndefOr[NormalizedPath]] = js.native
  
  /**
    * Map of open files that are opened without complete path but have projectRoot as current directory
    */
  /* private */ val openFilesWithNonRootedDiskPath: Any = js.native
  
  /* private */ var pendingProjectUpdates: Any = js.native
  
  /* private */ var performanceEventHandler: Any = js.native
  
  val pluginProbeLocations: Array[String] = js.native
  
  /* private */ var printProjects: Any = js.native
  
  /**
    * Project size for configured or external projects
    */
  /* private */ val projectToSizeMap: Any = js.native
  
  /* private */ var refreshScriptInfo: Any = js.native
  
  /* private */ var refreshScriptInfosInDirectory: Any = js.native
  
  /**
    * This function goes through all the openFiles and tries to file the config file for them.
    * If the config file is found and it refers to existing project, it reloads it either immediately
    * or schedules it for reload depending on delayReload option
    * If there is no existing project it just opens the configured project for the config file
    * reloadForInfo provides a way to filter out files to reload configured project for
    */
  /* private */ var reloadConfiguredProjectForFiles: Any = js.native
  
  /**
    * This function rebuilds the project for every file opened by the client
    * This does not reload contents of open files from disk. But we could do that if needed
    */
  def reloadProjects(): Unit = js.native
  
  /* private */ var removeOrphanConfiguredProjects: Any = js.native
  
  /* private */ var removeOrphanScriptInfos: Any = js.native
  
  /* private */ var removeProject: Any = js.native
  
  /**
    * Remove the root of inferred project if script info is part of another project
    */
  /* private */ var removeRootOfInferredProjectIfNowPartOfOtherProject: Any = js.native
  
  def resetSafeList(): Unit = js.native
  
  /* private */ var safelist: Any = js.native
  
  /** Tracks projects that we have already sent telemetry for. */
  /* private */ val seenProjects: Any = js.native
  
  /* private */ var sendConfigFileDiagEvent: Any = js.native
  
  val serverMode: LanguageServiceMode = js.native
  
  def setCompilerOptionsForInferredProjects(projectCompilerOptions: InferredProjectCompilerOptions): Unit = js.native
  def setCompilerOptionsForInferredProjects(projectCompilerOptions: InferredProjectCompilerOptions, projectRootPath: String): Unit = js.native
  
  def setHostConfiguration(args: ConfigureRequestArguments): Unit = js.native
  
  /**
    * This is called on file close, so that we stop watching the config file for this script info
    */
  /* private */ var stopWatchingConfigFilesForClosedScriptInfo: Any = js.native
  
  /* private */ var stopWatchingScriptInfo: Any = js.native
  
  /* private */ val suppressDiagnosticEvents: Any = js.native
  
  /** @deprecated use serverMode instead */
  val syntaxOnly: Boolean = js.native
  
  /* private */ var telemetryOnOpenFile: Any = js.native
  
  val throttleWaitMilliseconds: js.UndefOr[Double] = js.native
  
  def toCanonicalFileName(f: String): String = js.native
  
  def toPath(fileName: String): Path = js.native
  
  /* private */ var typeAcquisitionForInferredProjects: Any = js.native
  
  /* private */ var typeAcquisitionForInferredProjectsPerProjectRoot: Any = js.native
  
  val typesMapLocation: js.UndefOr[String] = js.native
  
  val typingsInstaller: ITypingsInstaller = js.native
  
  /* private */ var updateNonInferredProjectFiles: Any = js.native
  
  /* private */ var updateRootAndOptionsOfNonInferredProject: Any = js.native
  
  def updateTypingsForProject(response: InvalidateCachedTypings): Unit = js.native
  def updateTypingsForProject(response: PackageInstalledResponse): Unit = js.native
  def updateTypingsForProject(response: SetTypings): Unit = js.native
  
  val useInferredProjectPerProjectRoot: Boolean = js.native
  
  val useSingleInferredProject: Boolean = js.native
  
  /* private */ var watchClosedScriptInfo: Any = js.native
  
  /* private */ var watchClosedScriptInfoInNodeModules: Any = js.native
  
  /* private */ var watchOptionsForInferredProjects: Any = js.native
  
  /* private */ var watchOptionsForInferredProjectsPerProjectRoot: Any = js.native
}
/* static members */
object ProjectService {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectService")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectService.escapeFilenameForRegex")
  @js.native
  def escapeFilenameForRegex: Any = js.native
  inline def escapeFilenameForRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeFilenameForRegex")(x.asInstanceOf[js.Any])
  
  /** Makes a filename safe to insert in a RegExp */
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ProjectService.filenameEscapeRegexp")
  @js.native
  val filenameEscapeRegexp: Any = js.native
}

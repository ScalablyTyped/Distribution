package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptNn5FuAjk.anon.Exclude
import typings.typescriptNn5FuAjk.anon.Typescript
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
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.^
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CompileOnSaveMixin
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ExternalProjectCompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.FormatCodeSettings
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.InferredProjectCompilerOptions
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.Message
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.ScriptKindName
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.actionColonColoninvalidate
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.actionColonColonpackageInstalled
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.actionColonColonset
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.eventColonColonbeginInstallTypes
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.eventColonColonendInstallTypes
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.eventColonColoninitializationFailed
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.eventColonColontypesRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CommandNames: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("CommandNames").asInstanceOf[Any]
type CommandNames = CommandTypes

inline def allFilesAreJsOrDts(project: Project): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allFilesAreJsOrDts")(project.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def allRootFilesAreJsOrDts(project: Project): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allRootFilesAreJsOrDts")(project.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def asNormalizedPath(fileName: String): NormalizedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("asNormalizedPath")(fileName.asInstanceOf[js.Any]).asInstanceOf[NormalizedPath]

inline def convertCompilerOptions(protocolOptions: ExternalProjectCompilerOptions): CompilerOptions & CompileOnSaveMixin = ^.asInstanceOf[js.Dynamic].applyDynamic("convertCompilerOptions")(protocolOptions.asInstanceOf[js.Any]).asInstanceOf[CompilerOptions & CompileOnSaveMixin]

inline def convertFormatOptions(protocolOptions: FormatCodeSettings): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FormatCodeSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFormatOptions")(protocolOptions.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FormatCodeSettings]

inline def convertScriptKindName(scriptKindName: ScriptKindName): Unknown | JS | JSX | TS | TSX = ^.asInstanceOf[js.Dynamic].applyDynamic("convertScriptKindName")(scriptKindName.asInstanceOf[js.Any]).asInstanceOf[Unknown | JS | JSX | TS | TSX]

inline def convertTypeAcquisition(protocolOptions: InferredProjectCompilerOptions): js.UndefOr[TypeAcquisition] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTypeAcquisition")(protocolOptions.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TypeAcquisition]]

inline def convertWatchOptions(protocolOptions: ExternalProjectCompilerOptions): js.UndefOr[WatchOptionsAndErrors] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertWatchOptions")(protocolOptions.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[WatchOptionsAndErrors]]
inline def convertWatchOptions(protocolOptions: ExternalProjectCompilerOptions, currentDirectory: String): js.UndefOr[WatchOptionsAndErrors] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertWatchOptions")(protocolOptions.asInstanceOf[js.Any], currentDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[WatchOptionsAndErrors]]

inline def createInstallTypingsRequest(project: Project, typeAcquisition: TypeAcquisition, unresolvedImports: SortedReadonlyArray[String]): DiscoverTypings = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstallTypingsRequest")(project.asInstanceOf[js.Any], typeAcquisition.asInstanceOf[js.Any], unresolvedImports.asInstanceOf[js.Any])).asInstanceOf[DiscoverTypings]
inline def createInstallTypingsRequest(
  project: Project,
  typeAcquisition: TypeAcquisition,
  unresolvedImports: SortedReadonlyArray[String],
  cachePath: String
): DiscoverTypings = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstallTypingsRequest")(project.asInstanceOf[js.Any], typeAcquisition.asInstanceOf[js.Any], unresolvedImports.asInstanceOf[js.Any], cachePath.asInstanceOf[js.Any])).asInstanceOf[DiscoverTypings]

inline def createNormalizedPathMap[T](): NormalizedPathMap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNormalizedPathMap")().asInstanceOf[NormalizedPathMap[T]]

inline def createSortedArray[T](): SortedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSortedArray")().asInstanceOf[SortedArray[T]]

inline def emptyArray: SortedReadonlyArray[scala.Nothing] = ^.asInstanceOf[js.Dynamic].selectDynamic("emptyArray").asInstanceOf[SortedReadonlyArray[scala.Nothing]]

inline def formatMessage[T /* <: Message */](
  msg: T,
  logger: Logger,
  byteLength: js.Function2[/* s */ String, /* encoding */ String, Double],
  newLine: String
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(msg.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], byteLength.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[String]

inline def isDynamicFileName(fileName: NormalizedPath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicFileName")(fileName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isInferredProjectName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInferredProjectName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def makeInferredProjectName(counter: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeInferredProjectName")(counter.asInstanceOf[js.Any]).asInstanceOf[String]

inline def maxProgramSizeForNonTsFiles: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("maxProgramSizeForNonTsFiles").asInstanceOf[Double]

inline def normalizedPathToPath(
  normalizedPath: NormalizedPath,
  currentDirectory: String,
  getCanonicalFileName: js.Function1[/* f */ String, String]
): Path = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizedPathToPath")(normalizedPath.asInstanceOf[js.Any], currentDirectory.asInstanceOf[js.Any], getCanonicalFileName.asInstanceOf[js.Any])).asInstanceOf[Path]

inline def nullCancellationToken: ServerCancellationToken = ^.asInstanceOf[js.Dynamic].selectDynamic("nullCancellationToken").asInstanceOf[ServerCancellationToken]

inline def nullTypingsInstaller: ITypingsInstaller = ^.asInstanceOf[js.Dynamic].selectDynamic("nullTypingsInstaller").asInstanceOf[ITypingsInstaller]

inline def toNormalizedPath(fileName: String): NormalizedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toNormalizedPath")(fileName.asInstanceOf[js.Any]).asInstanceOf[NormalizedPath]

inline def tryConvertScriptKindName(scriptKindName: ScriptKind): ScriptKind = ^.asInstanceOf[js.Dynamic].applyDynamic("tryConvertScriptKindName")(scriptKindName.asInstanceOf[js.Any]).asInstanceOf[ScriptKind]
inline def tryConvertScriptKindName(scriptKindName: ScriptKindName): ScriptKind = ^.asInstanceOf[js.Dynamic].applyDynamic("tryConvertScriptKindName")(scriptKindName.asInstanceOf[js.Any]).asInstanceOf[ScriptKind]

type ActionInvalidate = actionColonColoninvalidate

type ActionPackageInstalled = actionColonColonpackageInstalled

type ActionSet = actionColonColonset

type Event = js.Function2[/* body */ js.Object, /* eventName */ String, Unit]

type EventBeginInstallTypes = eventColonColonbeginInstallTypes

type EventEndInstallTypes = eventColonColonendInstallTypes

type EventInitializationFailed = eventColonColoninitializationFailed

type EventTypesRegistry = eventColonColontypesRegistry

type PluginModuleFactory = js.Function1[/* mod */ Typescript, PluginModule]

type ProjectServiceEventHandler = js.Function1[/* event */ ProjectServiceEvent, Unit]

type SafeList = StringDictionary[Exclude]

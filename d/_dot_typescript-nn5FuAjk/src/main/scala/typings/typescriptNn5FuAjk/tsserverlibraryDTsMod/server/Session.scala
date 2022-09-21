package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Error
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.Message
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.Session")
@js.native
open class Session[TMessage] protected ()
  extends StObject
     with EventSender {
  def this(opts: SessionOptions) = this()
  
  /* private */ var addPerformanceData: Any = js.native
  
  def addProtocolHandler(command: String, handler: js.Function1[/* request */ Request, HandlerResponse]): Unit = js.native
  
  /* private */ var applyCodeActionCommand: Any = js.native
  
  /* protected */ def byteLength(buf: String): Double = js.native
  /* protected */ def byteLength(buf: String, encoding: String): Double = js.native
  
  /* protected */ var canUseEvents: Boolean = js.native
  
  /* private */ val cancellationToken: Any = js.native
  
  /* private */ var change: Any = js.native
  
  /* private */ var changeSeq: Any = js.native
  
  /* private */ var cleanProjects: Any = js.native
  
  /* private */ var cleanup: Any = js.native
  
  /* private */ var closeClientFile: Any = js.native
  
  /* private */ var commentSelection: Any = js.native
  
  /* private */ var configurePlugin: Any = js.native
  
  /* private */ var convertTextChangeToCodeEdit: Any = js.native
  
  /* private */ var convertToDiagnosticsWithLinePosition: Any = js.native
  
  /* private */ var convertToDiagnosticsWithLinePositionFromDiagnosticFile: Any = js.native
  
  /* private */ var currentRequestId: Any = js.native
  
  /* private */ var defaultEventHandler: Any = js.native
  
  /* private */ var doOutput: Any = js.native
  
  /* private */ var emitFile: Any = js.native
  
  /* private */ var errorCheck: Any = js.native
  
  /* CompleteClass */
  override def event[T /* <: js.Object */](body: T, eventName: String): Unit = js.native
  
  /* private */ var eventHandler: Any = js.native
  
  /* CompleteClass */
  @JSName("event")
  var event_Original: Event = js.native
  
  def executeCommand(request: Request): HandlerResponse = js.native
  
  def executeWithRequestId[T](requestId: Double, f: js.Function0[T]): T = js.native
  
  def exit(): Unit = js.native
  
  /* private */ var extractPositionOrRange: Any = js.native
  
  /* private */ var findSourceDefinition: Any = js.native
  
  /* private */ val gcTimer: Any = js.native
  
  /* private */ var getApplicableRefactors: Any = js.native
  
  /* private */ var getBraceMatching: Any = js.native
  
  /* private */ var getBreakpointStatement: Any = js.native
  
  def getCanonicalFileName(fileName: String): String = js.native
  
  /* private */ var getCodeFixes: Any = js.native
  
  /* private */ var getCombinedCodeFix: Any = js.native
  
  /* private */ var getCompileOnSaveAffectedFileList: Any = js.native
  
  /* private */ var getCompilerOptionsDiagnostics: Any = js.native
  
  /* private */ var getCompletionEntryDetails: Any = js.native
  
  /* private */ var getCompletions: Any = js.native
  
  /* private */ var getConfigFileAndProject: Any = js.native
  
  /* private */ var getConfigFileDiagnostics: Any = js.native
  
  /* private */ var getDefaultProject: Any = js.native
  
  /* private */ var getDefinition: Any = js.native
  
  /* private */ var getDefinitionAndBoundSpan: Any = js.native
  
  /* private */ var getDiagnostics: Any = js.native
  
  /* private */ var getDiagnosticsForProject: Any = js.native
  
  /* private */ var getDiagnosticsWorker: Any = js.native
  
  /* private */ var getDocCommentTemplate: Any = js.native
  
  /* private */ var getDocumentHighlights: Any = js.native
  
  /* private */ var getEditsForFileRename: Any = js.native
  
  /* private */ var getEditsForRefactor: Any = js.native
  
  /* private */ var getEmitOutput: Any = js.native
  
  /* private */ var getEncodedSemanticClassifications: Any = js.native
  
  /* private */ var getEncodedSyntacticClassifications: Any = js.native
  
  /* private */ var getFileAndLanguageServiceForSyntacticOperation: Any = js.native
  
  /* private */ var getFileAndProject: Any = js.native
  
  /* private */ var getFileAndProjectWorker: Any = js.native
  
  /* private */ var getFileReferences: Any = js.native
  
  /* private */ var getFormatOptions: Any = js.native
  
  /* private */ var getFormattingEditsAfterKeystroke: Any = js.native
  
  /* private */ var getFormattingEditsAfterKeystrokeFull: Any = js.native
  
  /* private */ var getFormattingEditsForDocumentFull: Any = js.native
  
  /* private */ var getFormattingEditsForRange: Any = js.native
  
  /* private */ var getFormattingEditsForRangeFull: Any = js.native
  
  /* private */ var getFullNavigateToItems: Any = js.native
  
  /* private */ var getHostFormatOptions: Any = js.native
  
  /* private */ var getHostPreferences: Any = js.native
  
  /* private */ var getImplementation: Any = js.native
  
  /* private */ var getIndentation: Any = js.native
  
  /* private */ var getJsxClosingTag: Any = js.native
  
  /* private */ var getNameOrDottedNameSpan: Any = js.native
  
  /* private */ var getNavigateToItems: Any = js.native
  
  /* private */ var getNavigationBarItems: Any = js.native
  
  /* private */ var getNavigationTree: Any = js.native
  
  /* private */ var getOccurrences: Any = js.native
  
  /* private */ var getOutliningSpans: Any = js.native
  
  /* private */ var getPosition: Any = js.native
  
  /* private */ var getPositionInFile: Any = js.native
  
  /* private */ var getPreferences: Any = js.native
  
  /* private */ var getProject: Any = js.native
  
  /* private */ var getProjectInfo: Any = js.native
  
  /* private */ var getProjectInfoWorker: Any = js.native
  
  /* private */ var getProjects: Any = js.native
  
  /* private */ var getQuickInfoWorker: Any = js.native
  
  /* private */ var getRange: Any = js.native
  
  /* private */ var getReferences: Any = js.native
  
  /* private */ var getRenameInfo: Any = js.native
  
  /* private */ var getRenameLocations: Any = js.native
  
  /* private */ var getScriptInfoFromProjectService: Any = js.native
  
  /* private */ var getSemanticDiagnosticsSync: Any = js.native
  
  /* private */ var getSignatureHelpItems: Any = js.native
  
  /* private */ var getSmartSelectionRange: Any = js.native
  
  /* private */ var getSpanOfEnclosingComment: Any = js.native
  
  /* private */ var getStartAndEndPosition: Any = js.native
  
  /* private */ var getSuggestionDiagnosticsSync: Any = js.native
  
  /* private */ var getSupportedCodeFixes: Any = js.native
  
  /* private */ var getSyntacticDiagnosticsSync: Any = js.native
  
  /* private */ var getTodoComments: Any = js.native
  
  /* private */ var getTypeDefinition: Any = js.native
  
  /* private */ var handlers: Any = js.native
  
  /* protected */ var host: ServerHost = js.native
  
  /* private */ var hrtime: Any = js.native
  
  /* private */ var isLocation: Any = js.native
  
  /* private */ var isValidBraceCompletion: Any = js.native
  
  def logError(err: Error, cmd: String): Unit = js.native
  
  /* private */ var logErrorWorker: Any = js.native
  
  /* protected */ var logger: Logger = js.native
  
  /* private */ var mapCodeAction: Any = js.native
  
  /* private */ var mapCodeFixAction: Any = js.native
  
  /* private */ var mapDefinitionInfo: Any = js.native
  
  /* private */ var mapDefinitionInfoLocations: Any = js.native
  
  /* private */ var mapDisplayParts: Any = js.native
  
  /* private */ var mapImplementationLocations: Any = js.native
  
  /* private */ var mapJSDocTagInfo: Any = js.native
  
  /* private */ var mapLocationNavigationBarItems: Any = js.native
  
  /* private */ var mapRenameInfo: Any = js.native
  
  /* private */ var mapSelectionRange: Any = js.native
  
  /* private */ var mapSignatureHelpItems: Any = js.native
  
  /* private */ var mapTextChangeToCodeEdit: Any = js.native
  
  /* private */ var mapTextChangesToCodeEdits: Any = js.native
  
  /* private */ val noGetErrOnBackgroundUpdate: Any = js.native
  
  /* private */ var notRequired: Any = js.native
  
  def onMessage(message: TMessage): Unit = js.native
  
  /**
    * @param fileName is the name of the file to be opened
    * @param fileContent is a version of the file content that is known to be more up to date than the one on disk
    */
  /* private */ var openClientFile: Any = js.native
  
  /* private */ var organizeImports: Any = js.native
  
  /** @deprecated */
  def output(info: Any, cmdName: String): Unit = js.native
  def output(info: Any, cmdName: String, reqSeq: Double): Unit = js.native
  def output(info: Any, cmdName: String, reqSeq: Double, errorMsg: String): Unit = js.native
  def output(info: Any, cmdName: String, reqSeq: Unit, errorMsg: String): Unit = js.native
  
  /* protected */ def parseMessage(message: TMessage): Request = js.native
  
  /* private */ var performanceData: Any = js.native
  
  /* private */ var performanceEventHandler: Any = js.native
  
  /* private */ var prepareCallHierarchy: Any = js.native
  
  /* protected */ var projectService: ProjectService = js.native
  
  /* private */ var projectsUpdatedInBackgroundEvent: Any = js.native
  
  /* private */ var provideCallHierarchyIncomingCalls: Any = js.native
  
  /* private */ var provideCallHierarchyOutgoingCalls: Any = js.native
  
  /* private */ var provideInlayHints: Any = js.native
  
  /* private */ var reload: Any = js.native
  
  /* private */ var requiredResponse: Any = js.native
  
  /* private */ var resetCurrentRequest: Any = js.native
  
  /* private */ var saveToTmp: Any = js.native
  
  /* private */ var semanticCheck: Any = js.native
  
  def send(msg: Message): Unit = js.native
  
  /* private */ var sendDiagnosticsEvent: Any = js.native
  
  /* private */ var sendRequestCompletedEvent: Any = js.native
  
  /* private */ var setCompilerOptionsForInferredProjects: Any = js.native
  
  /* private */ var setCurrentRequest: Any = js.native
  
  /* private */ var suggestionCheck: Any = js.native
  
  /* private */ var suppressDiagnosticEvents: Any = js.native
  
  /* private */ var syntacticCheck: Any = js.native
  
  /* private */ var toFileSpan: Any = js.native
  
  /* private */ var toFileSpanWithContext: Any = js.native
  
  /* private */ var toLocationNavigationTree: Any = js.native
  
  /* private */ var toPendingErrorCheck: Any = js.native
  
  /* private */ var toProtocolCallHierarchyIncomingCall: Any = js.native
  
  /* private */ var toProtocolCallHierarchyItem: Any = js.native
  
  /* private */ var toProtocolCallHierarchyOutgoingCall: Any = js.native
  
  /* private */ var toSpanGroups: Any = js.native
  
  /* protected */ def toStringMessage(message: TMessage): String = js.native
  
  /* private */ var toggleLineComment: Any = js.native
  
  /* private */ var toggleMultilineComment: Any = js.native
  
  /* protected */ val typingsInstaller: ITypingsInstaller = js.native
  
  /* private */ var uncommentSelection: Any = js.native
  
  /** It is the caller's responsibility to verify that `!this.suppressDiagnosticEvents`. */
  /* private */ var updateErrorCheck: Any = js.native
  
  /* protected */ def writeMessage(msg: Message): Unit = js.native
}
object Session {
  
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.Session")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.Session.mapToOriginalLocation")
  @js.native
  def mapToOriginalLocation: Any = js.native
  inline def mapToOriginalLocation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapToOriginalLocation")(x.asInstanceOf[js.Any])
}

package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandTypes extends StObject
@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.protocol.CommandTypes")
@js.native
object CommandTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CommandTypes & String] = js.native
  
  @js.native
  sealed trait ApplyCodeActionCommand
    extends StObject
       with CommandTypes
  /* "applyCodeActionCommand" */ val ApplyCodeActionCommand: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ApplyCodeActionCommand & String = js.native
  
  @js.native
  sealed trait Brace
    extends StObject
       with CommandTypes
  /* "brace" */ val Brace: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Brace & String = js.native
  
  @js.native
  sealed trait BraceCompletion
    extends StObject
       with CommandTypes
  /* "braceCompletion" */ val BraceCompletion: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.BraceCompletion & String = js.native
  
  @js.native
  sealed trait Change
    extends StObject
       with CommandTypes
  /* "change" */ val Change: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Change & String = js.native
  
  @js.native
  sealed trait Close
    extends StObject
       with CommandTypes
  /* "close" */ val Close: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Close & String = js.native
  
  @js.native
  sealed trait CloseExternalProject
    extends StObject
       with CommandTypes
  /* "closeExternalProject" */ val CloseExternalProject: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CloseExternalProject & String = js.native
  
  @js.native
  sealed trait CommentSelection
    extends StObject
       with CommandTypes
  /* "commentSelection" */ val CommentSelection: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CommentSelection & String = js.native
  
  @js.native
  sealed trait CompileOnSaveAffectedFileList
    extends StObject
       with CommandTypes
  /* "compileOnSaveAffectedFileList" */ val CompileOnSaveAffectedFileList: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CompileOnSaveAffectedFileList & String = js.native
  
  @js.native
  sealed trait CompileOnSaveEmitFile
    extends StObject
       with CommandTypes
  /* "compileOnSaveEmitFile" */ val CompileOnSaveEmitFile: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CompileOnSaveEmitFile & String = js.native
  
  @js.native
  sealed trait CompilerOptionsForInferredProjects
    extends StObject
       with CommandTypes
  /* "compilerOptionsForInferredProjects" */ val CompilerOptionsForInferredProjects: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CompilerOptionsForInferredProjects & String = js.native
  
  @js.native
  sealed trait CompletionDetails
    extends StObject
       with CommandTypes
  /* "completionEntryDetails" */ val CompletionDetails: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CompletionDetails & String = js.native
  
  @js.native
  sealed trait CompletionInfo
    extends StObject
       with CommandTypes
  /* "completionInfo" */ val CompletionInfo: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.CompletionInfo & String = js.native
  
  /** @deprecated Prefer CompletionInfo -- see comment on CompletionsResponse */
  @js.native
  sealed trait Completions
    extends StObject
       with CommandTypes
  /* "completions" */ val Completions: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Completions & String = js.native
  
  @js.native
  sealed trait Configure
    extends StObject
       with CommandTypes
  /* "configure" */ val Configure: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Configure & String = js.native
  
  @js.native
  sealed trait ConfigurePlugin
    extends StObject
       with CommandTypes
  /* "configurePlugin" */ val ConfigurePlugin: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ConfigurePlugin & String = js.native
  
  @js.native
  sealed trait Definition
    extends StObject
       with CommandTypes
  /* "definition" */ val Definition: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Definition & String = js.native
  
  @js.native
  sealed trait DefinitionAndBoundSpan
    extends StObject
       with CommandTypes
  /* "definitionAndBoundSpan" */ val DefinitionAndBoundSpan: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.DefinitionAndBoundSpan & String = js.native
  
  @js.native
  sealed trait DocCommentTemplate
    extends StObject
       with CommandTypes
  /* "docCommentTemplate" */ val DocCommentTemplate: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.DocCommentTemplate & String = js.native
  
  @js.native
  sealed trait DocumentHighlights
    extends StObject
       with CommandTypes
  /* "documentHighlights" */ val DocumentHighlights: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.DocumentHighlights & String = js.native
  
  @js.native
  sealed trait Exit
    extends StObject
       with CommandTypes
  /* "exit" */ val Exit: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Exit & String = js.native
  
  @js.native
  sealed trait FileReferences
    extends StObject
       with CommandTypes
  /* "fileReferences" */ val FileReferences: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.FileReferences & String = js.native
  
  @js.native
  sealed trait FindSourceDefinition
    extends StObject
       with CommandTypes
  /* "findSourceDefinition" */ val FindSourceDefinition: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.FindSourceDefinition & String = js.native
  
  @js.native
  sealed trait Format
    extends StObject
       with CommandTypes
  /* "format" */ val Format: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Format & String = js.native
  
  @js.native
  sealed trait Formatonkey
    extends StObject
       with CommandTypes
  /* "formatonkey" */ val Formatonkey: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Formatonkey & String = js.native
  
  @js.native
  sealed trait GetApplicableRefactors
    extends StObject
       with CommandTypes
  /* "getApplicableRefactors" */ val GetApplicableRefactors: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetApplicableRefactors & String = js.native
  
  @js.native
  sealed trait GetCodeFixes
    extends StObject
       with CommandTypes
  /* "getCodeFixes" */ val GetCodeFixes: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetCodeFixes & String = js.native
  
  @js.native
  sealed trait GetCombinedCodeFix
    extends StObject
       with CommandTypes
  /* "getCombinedCodeFix" */ val GetCombinedCodeFix: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetCombinedCodeFix & String = js.native
  
  @js.native
  sealed trait GetEditsForFileRename
    extends StObject
       with CommandTypes
  /* "getEditsForFileRename" */ val GetEditsForFileRename: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetEditsForFileRename & String = js.native
  
  @js.native
  sealed trait GetEditsForRefactor
    extends StObject
       with CommandTypes
  /* "getEditsForRefactor" */ val GetEditsForRefactor: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetEditsForRefactor & String = js.native
  
  @js.native
  sealed trait GetOutliningSpans
    extends StObject
       with CommandTypes
  /* "getOutliningSpans" */ val GetOutliningSpans: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetOutliningSpans & String = js.native
  
  @js.native
  sealed trait GetSpanOfEnclosingComment
    extends StObject
       with CommandTypes
  /* "getSpanOfEnclosingComment" */ val GetSpanOfEnclosingComment: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetSpanOfEnclosingComment & String = js.native
  
  @js.native
  sealed trait GetSupportedCodeFixes
    extends StObject
       with CommandTypes
  /* "getSupportedCodeFixes" */ val GetSupportedCodeFixes: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GetSupportedCodeFixes & String = js.native
  
  @js.native
  sealed trait Geterr
    extends StObject
       with CommandTypes
  /* "geterr" */ val Geterr: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Geterr & String = js.native
  
  @js.native
  sealed trait GeterrForProject
    extends StObject
       with CommandTypes
  /* "geterrForProject" */ val GeterrForProject: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.GeterrForProject & String = js.native
  
  @js.native
  sealed trait Implementation
    extends StObject
       with CommandTypes
  /* "implementation" */ val Implementation: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Implementation & String = js.native
  
  @js.native
  sealed trait Indentation
    extends StObject
       with CommandTypes
  /* "indentation" */ val Indentation: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Indentation & String = js.native
  
  @js.native
  sealed trait JsxClosingTag
    extends StObject
       with CommandTypes
  /* "jsxClosingTag" */ val JsxClosingTag: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.JsxClosingTag & String = js.native
  
  @js.native
  sealed trait NavBar
    extends StObject
       with CommandTypes
  /* "navbar" */ val NavBar: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.NavBar & String = js.native
  
  @js.native
  sealed trait NavTree
    extends StObject
       with CommandTypes
  /* "navtree" */ val NavTree: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.NavTree & String = js.native
  
  @js.native
  sealed trait NavTreeFull
    extends StObject
       with CommandTypes
  /* "navtree-full" */ val NavTreeFull: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.NavTreeFull & String = js.native
  
  @js.native
  sealed trait Navto
    extends StObject
       with CommandTypes
  /* "navto" */ val Navto: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Navto & String = js.native
  
  /** @deprecated */
  @js.native
  sealed trait Occurrences
    extends StObject
       with CommandTypes
  /* "occurrences" */ val Occurrences: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Occurrences & String = js.native
  
  @js.native
  sealed trait Open
    extends StObject
       with CommandTypes
  /* "open" */ val Open: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Open & String = js.native
  
  @js.native
  sealed trait OpenExternalProject
    extends StObject
       with CommandTypes
  /* "openExternalProject" */ val OpenExternalProject: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.OpenExternalProject & String = js.native
  
  @js.native
  sealed trait OpenExternalProjects
    extends StObject
       with CommandTypes
  /* "openExternalProjects" */ val OpenExternalProjects: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.OpenExternalProjects & String = js.native
  
  @js.native
  sealed trait OrganizeImports
    extends StObject
       with CommandTypes
  /* "organizeImports" */ val OrganizeImports: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.OrganizeImports & String = js.native
  
  @js.native
  sealed trait PrepareCallHierarchy
    extends StObject
       with CommandTypes
  /* "prepareCallHierarchy" */ val PrepareCallHierarchy: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.PrepareCallHierarchy & String = js.native
  
  @js.native
  sealed trait ProjectInfo
    extends StObject
       with CommandTypes
  /* "projectInfo" */ val ProjectInfo: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProjectInfo & String = js.native
  
  @js.native
  sealed trait ProvideCallHierarchyIncomingCalls
    extends StObject
       with CommandTypes
  /* "provideCallHierarchyIncomingCalls" */ val ProvideCallHierarchyIncomingCalls: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProvideCallHierarchyIncomingCalls & String = js.native
  
  @js.native
  sealed trait ProvideCallHierarchyOutgoingCalls
    extends StObject
       with CommandTypes
  /* "provideCallHierarchyOutgoingCalls" */ val ProvideCallHierarchyOutgoingCalls: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProvideCallHierarchyOutgoingCalls & String = js.native
  
  @js.native
  sealed trait ProvideInlayHints
    extends StObject
       with CommandTypes
  /* "provideInlayHints" */ val ProvideInlayHints: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ProvideInlayHints & String = js.native
  
  @js.native
  sealed trait Quickinfo
    extends StObject
       with CommandTypes
  /* "quickinfo" */ val Quickinfo: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Quickinfo & String = js.native
  
  @js.native
  sealed trait References
    extends StObject
       with CommandTypes
  /* "references" */ val References: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.References & String = js.native
  
  @js.native
  sealed trait Reload
    extends StObject
       with CommandTypes
  /* "reload" */ val Reload: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Reload & String = js.native
  
  @js.native
  sealed trait ReloadProjects
    extends StObject
       with CommandTypes
  /* "reloadProjects" */ val ReloadProjects: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ReloadProjects & String = js.native
  
  @js.native
  sealed trait Rename
    extends StObject
       with CommandTypes
  /* "rename" */ val Rename: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Rename & String = js.native
  
  @js.native
  sealed trait Saveto
    extends StObject
       with CommandTypes
  /* "saveto" */ val Saveto: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Saveto & String = js.native
  
  @js.native
  sealed trait SelectionRange
    extends StObject
       with CommandTypes
  /* "selectionRange" */ val SelectionRange: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SelectionRange & String = js.native
  
  @js.native
  sealed trait SemanticDiagnosticsSync
    extends StObject
       with CommandTypes
  /* "semanticDiagnosticsSync" */ val SemanticDiagnosticsSync: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SemanticDiagnosticsSync & String = js.native
  
  @js.native
  sealed trait SignatureHelp
    extends StObject
       with CommandTypes
  /* "signatureHelp" */ val SignatureHelp: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SignatureHelp & String = js.native
  
  @js.native
  sealed trait Status
    extends StObject
       with CommandTypes
  /* "status" */ val Status: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Status & String = js.native
  
  @js.native
  sealed trait SuggestionDiagnosticsSync
    extends StObject
       with CommandTypes
  /* "suggestionDiagnosticsSync" */ val SuggestionDiagnosticsSync: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SuggestionDiagnosticsSync & String = js.native
  
  @js.native
  sealed trait SyntacticDiagnosticsSync
    extends StObject
       with CommandTypes
  /* "syntacticDiagnosticsSync" */ val SyntacticDiagnosticsSync: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.SyntacticDiagnosticsSync & String = js.native
  
  @js.native
  sealed trait TodoComments
    extends StObject
       with CommandTypes
  /* "todoComments" */ val TodoComments: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.TodoComments & String = js.native
  
  @js.native
  sealed trait ToggleLineComment
    extends StObject
       with CommandTypes
  /* "toggleLineComment" */ val ToggleLineComment: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ToggleLineComment & String = js.native
  
  @js.native
  sealed trait ToggleMultilineComment
    extends StObject
       with CommandTypes
  /* "toggleMultilineComment" */ val ToggleMultilineComment: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.ToggleMultilineComment & String = js.native
  
  @js.native
  sealed trait TypeDefinition
    extends StObject
       with CommandTypes
  /* "typeDefinition" */ val TypeDefinition: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.TypeDefinition & String = js.native
  
  @js.native
  sealed trait UncommentSelection
    extends StObject
       with CommandTypes
  /* "uncommentSelection" */ val UncommentSelection: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.UncommentSelection & String = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with CommandTypes
  /* "unknown" */ val Unknown: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.Unknown & String = js.native
  
  @js.native
  sealed trait UpdateOpen
    extends StObject
       with CommandTypes
  /* "updateOpen" */ val UpdateOpen: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.CommandTypes.UpdateOpen & String = js.native
}

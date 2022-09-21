package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.`navtree-full`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.applyCodeActionCommand
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.brace
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.braceCompletion
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.change
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.close
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.closeExternalProject
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.commentSelection
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compileOnSaveAffectedFileList
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compileOnSaveEmitFile
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compilerOptionsForInferredProjects
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completionEntryDetails
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completionInfo
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completions
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.configure
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.configurePlugin
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.definition
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.definitionAndBoundSpan
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.docCommentTemplate
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.documentHighlights
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.exit
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.fileReferences
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.findSourceDefinition
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.format
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.formatonkey
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getApplicableRefactors
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getCodeFixes
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getCombinedCodeFix
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getEditsForFileRename
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getEditsForRefactor
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getOutliningSpans
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getSpanOfEnclosingComment
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getSupportedCodeFixes
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.geterr
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.geterrForProject
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.implementation
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.indentation
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.jsxClosingTag
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navbar
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navto
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navtree
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.occurrences
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.open
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.openExternalProject
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.openExternalProjects
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.organizeImports
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.prepareCallHierarchy
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.projectInfo
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideCallHierarchyIncomingCalls
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideCallHierarchyOutgoingCalls
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideInlayHints
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.quickinfo
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.references
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.reload
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.reloadProjects
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.rename
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.saveto
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.selectionRange
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.semanticDiagnosticsSync
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.signatureHelp
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.status
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.suggestionDiagnosticsSync
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.syntacticDiagnosticsSync
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.todoComments
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.toggleLineComment
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.toggleMultilineComment
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.typeDefinition
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.uncommentSelection
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.unknown
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.updateOpen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.jsxClosingTag
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.brace
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.braceCompletion
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getSpanOfEnclosingComment
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.change
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.close
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completions
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completionInfo
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.completionEntryDetails
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compileOnSaveAffectedFileList
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compileOnSaveEmitFile
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.configure
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.definition
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.definitionAndBoundSpan
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.implementation
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.exit
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.fileReferences
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.format
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.formatonkey
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.geterr
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.geterrForProject
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.semanticDiagnosticsSync
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.syntacticDiagnosticsSync
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.suggestionDiagnosticsSync
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navbar
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navto
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.navtree
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.`navtree-full`
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.occurrences
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.documentHighlights
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.open
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.quickinfo
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.references
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.reload
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.rename
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.saveto
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.signatureHelp
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.findSourceDefinition
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.status
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.typeDefinition
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.projectInfo
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.reloadProjects
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.unknown
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.openExternalProject
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.openExternalProjects
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.closeExternalProject
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.updateOpen
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getOutliningSpans
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.todoComments
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.indentation
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.docCommentTemplate
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compilerOptionsForInferredProjects
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getCodeFixes
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getCombinedCodeFix
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.applyCodeActionCommand
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getSupportedCodeFixes
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getApplicableRefactors
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getEditsForRefactor
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.organizeImports
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.getEditsForFileRename
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.configurePlugin
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.selectionRange
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.toggleLineComment
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.toggleMultilineComment
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.commentSelection
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.uncommentSelection
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.prepareCallHierarchy
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideCallHierarchyIncomingCalls
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideCallHierarchyOutgoingCalls
  - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.provideInlayHints
*/
trait CommandTypes extends StObject
object CommandTypes {
  
  inline def ApplyCodeActionCommand: applyCodeActionCommand = "applyCodeActionCommand".asInstanceOf[applyCodeActionCommand]
  
  inline def Brace: brace = "brace".asInstanceOf[brace]
  
  inline def BraceCompletion: braceCompletion = "braceCompletion".asInstanceOf[braceCompletion]
  
  inline def Change: change = "change".asInstanceOf[change]
  
  inline def Close: close = "close".asInstanceOf[close]
  
  inline def CloseExternalProject: closeExternalProject = "closeExternalProject".asInstanceOf[closeExternalProject]
  
  inline def CommentSelection: commentSelection = "commentSelection".asInstanceOf[commentSelection]
  
  inline def CompileOnSaveAffectedFileList: compileOnSaveAffectedFileList = "compileOnSaveAffectedFileList".asInstanceOf[compileOnSaveAffectedFileList]
  
  inline def CompileOnSaveEmitFile: compileOnSaveEmitFile = "compileOnSaveEmitFile".asInstanceOf[compileOnSaveEmitFile]
  
  inline def CompilerOptionsForInferredProjects: compilerOptionsForInferredProjects = "compilerOptionsForInferredProjects".asInstanceOf[compilerOptionsForInferredProjects]
  
  inline def CompletionDetails: completionEntryDetails = "completionEntryDetails".asInstanceOf[completionEntryDetails]
  
  inline def CompletionInfo: completionInfo = "completionInfo".asInstanceOf[completionInfo]
  
  /** @deprecated Prefer CompletionInfo -- see comment on CompletionsResponse */
  inline def Completions: completions = "completions".asInstanceOf[completions]
  
  inline def Configure: configure = "configure".asInstanceOf[configure]
  
  inline def ConfigurePlugin: configurePlugin = "configurePlugin".asInstanceOf[configurePlugin]
  
  inline def Definition: definition = "definition".asInstanceOf[definition]
  
  inline def DefinitionAndBoundSpan: definitionAndBoundSpan = "definitionAndBoundSpan".asInstanceOf[definitionAndBoundSpan]
  
  inline def DocCommentTemplate: docCommentTemplate = "docCommentTemplate".asInstanceOf[docCommentTemplate]
  
  inline def DocumentHighlights: documentHighlights = "documentHighlights".asInstanceOf[documentHighlights]
  
  inline def Exit: exit = "exit".asInstanceOf[exit]
  
  inline def FileReferences: fileReferences = "fileReferences".asInstanceOf[fileReferences]
  
  inline def FindSourceDefinition: findSourceDefinition = "findSourceDefinition".asInstanceOf[findSourceDefinition]
  
  inline def Format: format = "format".asInstanceOf[format]
  
  inline def Formatonkey: formatonkey = "formatonkey".asInstanceOf[formatonkey]
  
  inline def GetApplicableRefactors: getApplicableRefactors = "getApplicableRefactors".asInstanceOf[getApplicableRefactors]
  
  inline def GetCodeFixes: getCodeFixes = "getCodeFixes".asInstanceOf[getCodeFixes]
  
  inline def GetCombinedCodeFix: getCombinedCodeFix = "getCombinedCodeFix".asInstanceOf[getCombinedCodeFix]
  
  inline def GetEditsForFileRename: getEditsForFileRename = "getEditsForFileRename".asInstanceOf[getEditsForFileRename]
  
  inline def GetEditsForRefactor: getEditsForRefactor = "getEditsForRefactor".asInstanceOf[getEditsForRefactor]
  
  inline def GetOutliningSpans: getOutliningSpans = "getOutliningSpans".asInstanceOf[getOutliningSpans]
  
  inline def GetSpanOfEnclosingComment: getSpanOfEnclosingComment = "getSpanOfEnclosingComment".asInstanceOf[getSpanOfEnclosingComment]
  
  inline def GetSupportedCodeFixes: getSupportedCodeFixes = "getSupportedCodeFixes".asInstanceOf[getSupportedCodeFixes]
  
  inline def Geterr: geterr = "geterr".asInstanceOf[geterr]
  
  inline def GeterrForProject: geterrForProject = "geterrForProject".asInstanceOf[geterrForProject]
  
  inline def Implementation: implementation = "implementation".asInstanceOf[implementation]
  
  inline def Indentation: indentation = "indentation".asInstanceOf[indentation]
  
  inline def JsxClosingTag: jsxClosingTag = "jsxClosingTag".asInstanceOf[jsxClosingTag]
  
  inline def NavBar: navbar = "navbar".asInstanceOf[navbar]
  
  inline def NavTree: navtree = "navtree".asInstanceOf[navtree]
  
  inline def NavTreeFull: `navtree-full` = "navtree-full".asInstanceOf[`navtree-full`]
  
  inline def Navto: navto = "navto".asInstanceOf[navto]
  
  /** @deprecated */
  inline def Occurrences: occurrences = "occurrences".asInstanceOf[occurrences]
  
  inline def Open: open = "open".asInstanceOf[open]
  
  inline def OpenExternalProject: openExternalProject = "openExternalProject".asInstanceOf[openExternalProject]
  
  inline def OpenExternalProjects: openExternalProjects = "openExternalProjects".asInstanceOf[openExternalProjects]
  
  inline def OrganizeImports: organizeImports = "organizeImports".asInstanceOf[organizeImports]
  
  inline def PrepareCallHierarchy: prepareCallHierarchy = "prepareCallHierarchy".asInstanceOf[prepareCallHierarchy]
  
  inline def ProjectInfo: projectInfo = "projectInfo".asInstanceOf[projectInfo]
  
  inline def ProvideCallHierarchyIncomingCalls: provideCallHierarchyIncomingCalls = "provideCallHierarchyIncomingCalls".asInstanceOf[provideCallHierarchyIncomingCalls]
  
  inline def ProvideCallHierarchyOutgoingCalls: provideCallHierarchyOutgoingCalls = "provideCallHierarchyOutgoingCalls".asInstanceOf[provideCallHierarchyOutgoingCalls]
  
  inline def ProvideInlayHints: provideInlayHints = "provideInlayHints".asInstanceOf[provideInlayHints]
  
  inline def Quickinfo: quickinfo = "quickinfo".asInstanceOf[quickinfo]
  
  inline def References: references = "references".asInstanceOf[references]
  
  inline def Reload: reload = "reload".asInstanceOf[reload]
  
  inline def ReloadProjects: reloadProjects = "reloadProjects".asInstanceOf[reloadProjects]
  
  inline def Rename: rename = "rename".asInstanceOf[rename]
  
  inline def Saveto: saveto = "saveto".asInstanceOf[saveto]
  
  inline def SelectionRange: selectionRange = "selectionRange".asInstanceOf[selectionRange]
  
  inline def SemanticDiagnosticsSync: semanticDiagnosticsSync = "semanticDiagnosticsSync".asInstanceOf[semanticDiagnosticsSync]
  
  inline def SignatureHelp: signatureHelp = "signatureHelp".asInstanceOf[signatureHelp]
  
  inline def Status: status = "status".asInstanceOf[status]
  
  inline def SuggestionDiagnosticsSync: suggestionDiagnosticsSync = "suggestionDiagnosticsSync".asInstanceOf[suggestionDiagnosticsSync]
  
  inline def SyntacticDiagnosticsSync: syntacticDiagnosticsSync = "syntacticDiagnosticsSync".asInstanceOf[syntacticDiagnosticsSync]
  
  inline def TodoComments: todoComments = "todoComments".asInstanceOf[todoComments]
  
  inline def ToggleLineComment: toggleLineComment = "toggleLineComment".asInstanceOf[toggleLineComment]
  
  inline def ToggleMultilineComment: toggleMultilineComment = "toggleMultilineComment".asInstanceOf[toggleMultilineComment]
  
  inline def TypeDefinition: typeDefinition = "typeDefinition".asInstanceOf[typeDefinition]
  
  inline def UncommentSelection: uncommentSelection = "uncommentSelection".asInstanceOf[uncommentSelection]
  
  inline def Unknown: unknown = "unknown".asInstanceOf[unknown]
  
  inline def UpdateOpen: updateOpen = "updateOpen".asInstanceOf[updateOpen]
}

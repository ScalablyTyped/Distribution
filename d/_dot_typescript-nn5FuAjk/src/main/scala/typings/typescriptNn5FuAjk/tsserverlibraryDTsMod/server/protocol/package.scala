package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.anon.Action
import typings.typescriptNn5FuAjk.anon.TriggerReason
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypeAcquisition
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.beginInstallTypes
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.endInstallTypes
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.largeFileReferenced
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.projectLanguageServiceState
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.projectLoadingFinish
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.projectLoadingStart
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.projectsUpdatedInBackground
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.requestCompleted
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.surveyReady
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.telemetry
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.typesInstallerInitializationFailed
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.typingsInstalled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplyCodeActionCommandResponse = Response

type BeginInstallTypesEventBody = InstallTypesEventBody

type BeginInstallTypesEventName = beginInstallTypes

/**
  * Response to CloseExternalProjectRequest request. This is just an acknowledgement, so
  * no body field is required.
  */
type CloseExternalProjectResponse = Response

type ConfigurePluginResponse = Response

/**
  * Response to "configure" request.  This is just an acknowledgement, so
  * no body field is required.
  */
type ConfigureResponse = Response

/** @deprecated Use `DefinitionInfoAndBoundSpanResponse` instead. */
type DefinitionInfoAndBoundSpanReponse = DefinitionInfoAndBoundSpanResponse

type EndInstallTypesEventName = endInstallTypes

type GetApplicableRefactorsRequestArgs = FileLocationOrRangeRequestArgs & TriggerReason

/**
  * Request the edits that a particular refactoring action produces.
  * Callers must specify the name of the refactor and the name of the action.
  */
type GetEditsForRefactorRequestArgs = FileLocationOrRangeRequestArgs & Action

/**
  * External projects have a typeAcquisition option so they need to be added separately to compiler options for inferred projects.
  */
type InferredProjectCompilerOptions = ExternalProjectCompilerOptions & TypeAcquisition

type JsxClosingTagRequestArgs = FileLocationRequestArgs

type LargeFileReferencedEventName = largeFileReferenced

/**
  * Arguments to OpenExternalProjectRequest request
  */
type OpenExternalProjectArgs = ExternalProject

/**
  * Response to OpenExternalProjectRequest request. This is just an acknowledgement, so
  * no body field is required.
  */
type OpenExternalProjectResponse = Response

/**
  * Response to OpenExternalProjectsRequest request. This is just an acknowledgement, so
  * no body field is required.
  */
type OpenExternalProjectsResponse = Response

type OrganizeImportsScope = GetCombinedCodeFixScope

type ProjectLanguageServiceStateEventName = projectLanguageServiceState

type ProjectLoadingFinishEventName = projectLoadingFinish

type ProjectLoadingStartEventName = projectLoadingStart

type ProjectsUpdatedInBackgroundEventName = projectsUpdatedInBackground

/**
  * Response to "reload" request. This is just an acknowledgement, so
  * no body field is required.
  */
type ReloadResponse = Response

type RequestCompletedEventName = requestCompleted

/**
  * Response to SetCompilerOptionsForInferredProjectsResponse request. This is just an acknowledgement, so
  * no body field is required.
  */
type SetCompilerOptionsForInferredProjectsResponse = Response

type SuggestionDiagnosticsSyncRequestArgs = SemanticDiagnosticsSyncRequestArgs

type SuggestionDiagnosticsSyncResponse = SemanticDiagnosticsSyncResponse

type SurveyReadyEventName = surveyReady

type TelemetryEventName = telemetry

type TypesInstallerInitializationFailedEventName = typesInstallerInitializationFailed

type TypingsInstalledTelemetryEventName = typingsInstalled

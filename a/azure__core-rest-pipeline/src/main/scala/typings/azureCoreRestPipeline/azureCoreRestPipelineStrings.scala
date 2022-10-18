package typings.azureCoreRestPipeline

import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.HttpMethods
import typings.azureCoreRestPipeline.typesLatestCoreRestPipelineMod.PipelinePhase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureCoreRestPipelineStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait Deserialize
    extends StObject
       with PipelinePhase
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelinePhase
  inline def Deserialize: Deserialize = "Deserialize".asInstanceOf[Deserialize]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait Retry
    extends StObject
       with PipelinePhase
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelinePhase
  inline def Retry: Retry = "Retry".asInstanceOf[Retry]
  
  @js.native
  sealed trait Serialize
    extends StObject
       with PipelinePhase
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelinePhase
  inline def Serialize: Serialize = "Serialize".asInstanceOf[Serialize]
  
  @js.native
  sealed trait Sign
    extends StObject
       with PipelinePhase
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.PipelinePhase
  inline def Sign: Sign = "Sign".asInstanceOf[Sign]
  
  @js.native
  sealed trait TRACE
    extends StObject
       with HttpMethods
       with typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod.HttpMethods
  inline def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
}

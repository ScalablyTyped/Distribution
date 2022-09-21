package typings.azureCoreLro

import typings.azureCoreLro.mod.LroResourceLocationConfig
import typings.azureCoreLro.mod.OperationStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureCoreLroStrings {
  
  @js.native
  sealed trait `azure-async-operation`
    extends StObject
       with LroResourceLocationConfig
  inline def `azure-async-operation`: `azure-async-operation` = "azure-async-operation".asInstanceOf[`azure-async-operation`]
  
  @js.native
  sealed trait canceled
    extends StObject
       with OperationStatus
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait failed
    extends StObject
       with OperationStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait location
    extends StObject
       with LroResourceLocationConfig
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait notStarted
    extends StObject
       with OperationStatus
  inline def notStarted: notStarted = "notStarted".asInstanceOf[notStarted]
  
  @js.native
  sealed trait `original-uri`
    extends StObject
       with LroResourceLocationConfig
  inline def `original-uri`: `original-uri` = "original-uri".asInstanceOf[`original-uri`]
  
  @js.native
  sealed trait running
    extends StObject
       with OperationStatus
  inline def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait succeeded
    extends StObject
       with OperationStatus
  inline def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
}

package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.event_
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.reloadProjects
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.request
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to reload the project structure for all the opened files
  */
trait ReloadProjectsRequest
  extends StObject
     with Message {
  
  var command: reloadProjects
}
object ReloadProjectsRequest {
  
  inline def apply(seq: Double, `type`: request | response | event_): ReloadProjectsRequest = {
    val __obj = js.Dynamic.literal(command = "reloadProjects", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReloadProjectsRequest]
  }
  
  extension [Self <: ReloadProjectsRequest](x: Self) {
    
    inline def setCommand(value: reloadProjects): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}

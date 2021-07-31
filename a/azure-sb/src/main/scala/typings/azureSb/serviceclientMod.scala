package typings.azureSb

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceclientMod {
  
  @JSImport("azure-sb/lib/serviceclient", JSImport.Namespace)
  @js.native
  class ^ () extends ServiceClient
  
  @js.native
  trait ServiceClient extends EventEmitter {
    
    var host: String = js.native
    
    var port: Double = js.native
    
    var protocol: String = js.native
  }
}

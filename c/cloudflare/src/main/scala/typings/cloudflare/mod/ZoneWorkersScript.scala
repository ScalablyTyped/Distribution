package typings.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneWorkersScript extends StObject {
  
  def del(): js.Promise[js.Object] = js.native
  
  def read(zone_id: String): js.Promise[js.Object] = js.native
  def read(zone_id: String, script: String): js.Promise[js.Object] = js.native
}

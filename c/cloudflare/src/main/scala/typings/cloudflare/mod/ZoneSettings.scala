package typings.cloudflare.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoneSettings extends StObject {
  
  def browse(id: String): js.Promise[js.Object] = js.native
  
  def edit(id: String, setting: String, value: String): js.Promise[js.Object] = js.native
  def edit(id: String, setting: String, value: Record[String, Any]): js.Promise[js.Object] = js.native
  
  def editAll(id: String, settings: Any): js.Promise[js.Object] = js.native
  
  def read(id: String, setting: String): js.Promise[js.Object] = js.native
}

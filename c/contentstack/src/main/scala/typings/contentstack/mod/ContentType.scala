package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "ContentType")
@js.native
open class ContentType () extends StObject {
  
  def Entry(uid: String): typings.contentstack.mod.Entry = js.native
  
  def Query(): typings.contentstack.mod.Query = js.native
  
  var content_type_uid: String = js.native
  
  def fetch(): js.Promise[Any] = js.native
  def fetch(fetchOptions: js.Object): js.Promise[Any] = js.native
}

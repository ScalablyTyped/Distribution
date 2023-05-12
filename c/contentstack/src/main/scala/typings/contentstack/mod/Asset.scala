package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "Asset")
@js.native
open class Asset () extends StObject {
  
  var _query: js.Object = js.native
  
  def addParam(key: String, value: Any): Asset = js.native
  
  var asset_uid: String = js.native
  
  def fetch(): js.Promise[Any] = js.native
  def fetch(fetchOptions: js.Object): js.Promise[Any] = js.native
  
  def includeFallback(): Asset = js.native
  
  def toJSON(): Asset = js.native
}

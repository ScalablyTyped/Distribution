package typings.contentstack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "Entry")
@js.native
class Entry () extends js.Object {
  
  def addParam(key: String, value: js.Any): Entry = js.native
  
  def addQuery(key: String, value: String): Entry = js.native
  
  def fetch(): js.Promise[_] = js.native
  
  def includeContentType(): Entry = js.native
  
  def includeOwner(): Entry = js.native
  
  def includeReference(`val`: String*): Entry = js.native
  def includeReference(`val`: js.Array[String]): Entry = js.native
  
  def includeReferenceContentTypeUID(): Entry = js.native
  
  def includeSchema(): Entry = js.native
  
  def language(language_code: String): Entry = js.native
  
  def setCachePolicy(policy: Double): Entry = js.native
  
  def setCacheProvider(provider: js.Object): Entry = js.native
  
  def toJSON(): Entry = js.native
}

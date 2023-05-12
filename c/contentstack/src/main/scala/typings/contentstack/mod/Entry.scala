package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "Entry")
@js.native
open class Entry () extends StObject {
  
  var _query: js.Object = js.native
  
  def addParam(key: String, value: Any): this.type = js.native
  
  def addQuery(key: String, value: String): this.type = js.native
  
  var cachePolicy: Double = js.native
  
  var content_type_uid: String = js.native
  
  var entry_uid: String = js.native
  
  def except(field_uid: String): this.type = js.native
  def except(field_uids: js.Array[String]): this.type = js.native
  def except(reference_field_uid: String, field_uid: String): this.type = js.native
  def except(reference_field_uid: String, field_uids: js.Array[String]): this.type = js.native
  
  def fetch(): js.Promise[Any] = js.native
  def fetch(fetchOptions: js.Object): js.Promise[Any] = js.native
  
  def includeContentType(): this.type = js.native
  
  def includeEmbeddedItems(): this.type = js.native
  
  def includeFallback(): this.type = js.native
  
  /**
    * @deprecated since version 3.3.0
    */
  def includeOwner(): this.type = js.native
  
  def includeReference(`val`: String*): this.type = js.native
  def includeReference(`val`: js.Array[String]): this.type = js.native
  
  def includeReferenceContentTypeUID(): this.type = js.native
  
  /**
    * @deprecated since version 3.3.0
    */
  def includeSchema(): this.type = js.native
  
  def language(language_code: String): this.type = js.native
  
  def only(field_uid: String): this.type = js.native
  def only(field_uids: js.Array[String]): this.type = js.native
  def only(reference_field_uid: String, field_uid: String): this.type = js.native
  def only(reference_field_uid: String, field_uids: js.Array[String]): this.type = js.native
  
  var provider: Any = js.native
  
  var queryCachePolicy: Double = js.native
  
  def setCachePolicy(policy: Double): this.type = js.native
  
  def setCacheProvider(provider: js.Object): this.type = js.native
  
  def toJSON(): this.type = js.native
}

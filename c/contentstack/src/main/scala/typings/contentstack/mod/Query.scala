package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentstack", "Query")
@js.native
open class Query () extends Entry {
  
  def afterUid(uid: String): Query = js.native
  
  def and(queries: Query*): Query = js.native
  
  def ascending(key: String): Query = js.native
  
  def beforeUid(uid: String): Query = js.native
  
  def containedIn(key: String, value: js.Array[String | Double]): Query = js.native
  
  def count(): Query = js.native
  def count(fetchOptions: js.Object): Query = js.native
  
  def descending(key: String): Query = js.native
  
  def equalTo(key: String, value: String): Query = js.native
  def equalTo(key: String, value: Boolean): Query = js.native
  def equalTo(key: String, value: Double): Query = js.native
  
  def exists(key: String): Query = js.native
  
  def find(): js.Promise[Any] = js.native
  def find(fetchOptions: js.Object): js.Promise[Any] = js.native
  
  def findOne(): js.Promise[Any] = js.native
  
  def getQuery(): Query = js.native
  
  def greaterThan(key: String, value: String): Query = js.native
  def greaterThan(key: String, value: Double): Query = js.native
  
  def greaterThanOrEqualTo(key: String, value: String): Query = js.native
  def greaterThanOrEqualTo(key: String, value: Double): Query = js.native
  
  def includeCount(): Query = js.native
  
  def lessThan(key: String, value: String): Query = js.native
  def lessThan(key: String, value: Double): Query = js.native
  
  def lessThanOrEqualTo(key: String, value: String): Query = js.native
  def lessThanOrEqualTo(key: String, value: Double): Query = js.native
  
  def limit(limit: Double): Query = js.native
  
  def notContainedIn(key: String, value: js.Array[String | Double]): Query = js.native
  
  def notEqualTo(key: String, value: String): Query = js.native
  def notEqualTo(key: String, value: Boolean): Query = js.native
  def notEqualTo(key: String, value: Double): Query = js.native
  
  def notExists(key: String): Query = js.native
  
  def or(queries: Query*): Query = js.native
  
  def query(query: js.Object): Query = js.native
  
  def referenceIn(key: String, query: js.Object): Query = js.native
  def referenceIn(key: String, query: Query): Query = js.native
  
  def referenceNotIn(key: String, query: js.Object): Query = js.native
  def referenceNotIn(key: String, query: Query): Query = js.native
  
  def regex(key: String, value: String): Query = js.native
  def regex(key: String, value: String, options: String): Query = js.native
  
  /**
    * @deprecated since version 3.15.0
    */
  def search(value: String): Query = js.native
  
  def skip(skip: Double): Query = js.native
  
  def tags(value: js.Array[String]): Query = js.native
  
  def where(key: String, value: String): Query = js.native
  def where(key: String, value: Boolean): Query = js.native
  def where(key: String, value: Double): Query = js.native
}

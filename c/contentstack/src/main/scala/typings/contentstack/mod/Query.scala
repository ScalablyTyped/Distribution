package typings.contentstack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("contentstack", "Query")
@js.native
class Query () extends Entry {
  def containedIn(key: String, value: js.Any): Query = js.native
  def count(): Query = js.native
  def equalTo(key: String, value: js.Any): Query = js.native
  def find(): js.Promise[_] = js.native
  def findOne(): js.Promise[_] = js.native
  def getQuery(): Query = js.native
  def greaterThan(key: String, value: js.Any): Query = js.native
  def greaterThanOrEqualTo(key: String, value: js.Any): Query = js.native
  def includeCount(): Query = js.native
  def lessThan(key: String, value: js.Any): Query = js.native
  def lessThanOrEqualTo(key: String, value: js.Any): Query = js.native
  def notEqualTo(key: String, value: js.Any): Query = js.native
  def query(query: js.Any): Query = js.native
  def referenceIn(key: String, query: Query): Query = js.native
  def referenceNotIn(key: String, query: Query): Query = js.native
  def regex(key: String, value: js.Any, options: String): Query = js.native
  def search(value: String): Query = js.native
  def tags(value: js.Array[_]): Query = js.native
  def where(key: String, value: js.Any): Query = js.native
}


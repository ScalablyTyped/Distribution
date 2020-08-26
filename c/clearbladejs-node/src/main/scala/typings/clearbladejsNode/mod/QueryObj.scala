package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObj extends js.Object {
  var OR: js.Array[Query] = js.native
  var URI: String = js.native
  var endpoint: String = js.native
  var limit: Double = js.native
  var offset: Double = js.native
  var query: Query = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def ascending(field: String): Query = js.native
  def descending(field: String): Query = js.native
  def equalTo(field: String, value: QueryValue): Query = js.native
  def fetch(callback: CbCallback): Unit = js.native
  def greaterThan(field: String, value: QueryValue): Query = js.native
  def greaterThanEqualTo(field: String, value: QueryValue): Query = js.native
  def lessThan(field: String, value: QueryValue): Query = js.native
  def lessThanEqualTo(field: String, value: QueryValue): Query = js.native
  def matches(field: String, pattern: String): Query = js.native
  def notEqualTo(field: String, value: QueryValue): Query = js.native
  def or(query: QueryObj): Query = js.native
  def remove(callback: CbCallback): Unit = js.native
  def setPage(pageSize: Double, pageNum: Double): Query = js.native
  def update(changes: js.Object, callback: CbCallback): Unit = js.native
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: String,
    ascending: String => Query,
    descending: String => Query,
    endpoint: String,
    equalTo: (String, QueryValue) => Query,
    fetch: CbCallback => Unit,
    greaterThan: (String, QueryValue) => Query,
    greaterThanEqualTo: (String, QueryValue) => Query,
    lessThan: (String, QueryValue) => Query,
    lessThanEqualTo: (String, QueryValue) => Query,
    limit: Double,
    matches: (String, String) => Query,
    notEqualTo: (String, QueryValue) => Query,
    offset: Double,
    or: QueryObj => Query,
    query: Query,
    remove: CbCallback => Unit,
    setPage: (Double, Double) => Query,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Unit,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], ascending = js.Any.fromFunction1(ascending), descending = js.Any.fromFunction1(descending), endpoint = endpoint.asInstanceOf[js.Any], equalTo = js.Any.fromFunction2(equalTo), fetch = js.Any.fromFunction1(fetch), greaterThan = js.Any.fromFunction2(greaterThan), greaterThanEqualTo = js.Any.fromFunction2(greaterThanEqualTo), lessThan = js.Any.fromFunction2(lessThan), lessThanEqualTo = js.Any.fromFunction2(lessThanEqualTo), limit = limit.asInstanceOf[js.Any], matches = js.Any.fromFunction2(matches), notEqualTo = js.Any.fromFunction2(notEqualTo), offset = offset.asInstanceOf[js.Any], or = js.Any.fromFunction1(or), query = query.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), setPage = js.Any.fromFunction2(setPage), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction2(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObj]
  }
  @scala.inline
  implicit class QueryObjOps[Self <: QueryObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setORVarargs(value: Query*): Self = this.set("OR", js.Array(value :_*))
    @scala.inline
    def setOR(value: js.Array[Query]): Self = this.set("OR", value.asInstanceOf[js.Any])
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setAscending(value: String => Query): Self = this.set("ascending", js.Any.fromFunction1(value))
    @scala.inline
    def setDescending(value: String => Query): Self = this.set("descending", js.Any.fromFunction1(value))
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setEqualTo(value: (String, QueryValue) => Query): Self = this.set("equalTo", js.Any.fromFunction2(value))
    @scala.inline
    def setFetch(value: CbCallback => Unit): Self = this.set("fetch", js.Any.fromFunction1(value))
    @scala.inline
    def setGreaterThan(value: (String, QueryValue) => Query): Self = this.set("greaterThan", js.Any.fromFunction2(value))
    @scala.inline
    def setGreaterThanEqualTo(value: (String, QueryValue) => Query): Self = this.set("greaterThanEqualTo", js.Any.fromFunction2(value))
    @scala.inline
    def setLessThan(value: (String, QueryValue) => Query): Self = this.set("lessThan", js.Any.fromFunction2(value))
    @scala.inline
    def setLessThanEqualTo(value: (String, QueryValue) => Query): Self = this.set("lessThanEqualTo", js.Any.fromFunction2(value))
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatches(value: (String, String) => Query): Self = this.set("matches", js.Any.fromFunction2(value))
    @scala.inline
    def setNotEqualTo(value: (String, QueryValue) => Query): Self = this.set("notEqualTo", js.Any.fromFunction2(value))
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: CbCallback => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPage(value: (Double, Double) => Query): Self = this.set("setPage", js.Any.fromFunction2(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: (js.Object, CbCallback) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}


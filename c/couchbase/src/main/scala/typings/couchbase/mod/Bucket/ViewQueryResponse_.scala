package typings.couchbase.mod.Bucket

import typings.couchbase.couchbaseStrings.end
import typings.couchbase.couchbaseStrings.error
import typings.couchbase.couchbaseStrings.row
import typings.couchbase.couchbaseStrings.rows
import typings.couchbase.mod.Bucket.ViewQueryResponse.Meta
import typings.couchbase.mod.CouchbaseError
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event emitter allowing you to bind to various query result set events.
  */
@js.native
trait ViewQueryResponse_ extends EventEmitter {
  
  @JSName("addListener")
  def addListener_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
  
  @JSName("on")
  def on_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  @JSName("on")
  def on_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
  @JSName("on")
  def on_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
  
  @JSName("once")
  def once_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  @JSName("once")
  def once_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
  @JSName("once")
  def once_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function1[/* meta */ Meta, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ CouchbaseError, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_row(event: row, listener: js.Function2[/* row */ js.Any, /* meta */ Meta, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_rows(event: rows, listener: js.Function2[/* rows */ js.Array[_], /* meta */ Meta, Unit]): this.type = js.native
}

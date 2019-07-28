package typings.cradle.cradleMod

import typings.cradle.Anon_Descending
import typings.cradle.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cradle", "Database")
@js.native
class Database () extends js.Object {
  var name: String = js.native
  def all(callback: Callback): Unit = js.native
  def all(options: js.Any, callback: Callback): Unit = js.native
  def changes(callback: js.Function2[/* error */ js.Any, /* list */ js.Array[_], Unit]): Unit = js.native
  def changes(options: ChangesOptions): js.Any = js.native
  def changes(options: ChangesOptions, callback: js.Function2[/* error */ js.Any, /* list */ js.Array[_], Unit]): Unit = js.native
  def compact(callback: Callback): Unit = js.native
  def compact(design: String, callback: Callback): Unit = js.native
  def create(callback: ErrorCallback): Unit = js.native
  def destroy(callback: ErrorCallback): Unit = js.native
  def exists(callback: js.Function2[/* error */ js.Any, /* exists */ Boolean, Unit]): Unit = js.native
  def get(id: String, callback: js.Function2[/* error */ js.Any, /* document */ js.Any, Unit]): Unit = js.native
  def get(id: String, rev: String, callback: js.Function2[/* error */ js.Any, /* document */ js.Any, Unit]): Unit = js.native
  def get(ids: js.Array[String], callback: Callback): Unit = js.native
  def getAttachment(id: String, attachmentName: String, callback: Callback): Unit = js.native
  @JSName("get")
  def get_T[T](id: String, callback: js.Function2[/* error */ js.Any, /* document */ T, Unit]): Unit = js.native
  @JSName("get")
  def get_T[T](id: String, rev: String, callback: js.Function2[/* error */ js.Any, /* document */ T, Unit]): Unit = js.native
  def info(callback: Callback): Unit = js.native
  def merge(id: String, document: js.Any, callback: Callback): Unit = js.native
  def merge[T](id: String, document: T, callback: Callback): Unit = js.native
  def remove(id: String, revision: String, callback: Callback): Unit = js.native
  def removeAttachment(id: String, attachmentName: String, callback: Callback): Unit = js.native
  def replicate(target: String, callback: Callback): Unit = js.native
  def replicate(target: String, options: js.Any, callback: Callback): Unit = js.native
  def save(document: js.Any, callback: Callback): Unit = js.native
  def save(documents: js.Array[_], callback: Callback): Unit = js.native
  def save(id: String, document: js.Any, callback: Callback): Unit = js.native
  def save(id: String, revision: String, document: js.Any, callback: Callback): Unit = js.native
  def save[T](document: T, callback: Callback): Unit = js.native
  def save[T](id: String, document: T, callback: Callback): Unit = js.native
  def save[T](id: String, revision: String, document: T, callback: Callback): Unit = js.native
  def saveAttachment(idAndRevData: Anon_Id, attachmentData: js.Any, callback: Callback): Unit = js.native
  def temporaryView(view: js.Any, callback: Callback): Unit = js.native
  def update(name: String, id: String, queryObject: js.Any, documentBody: js.Any, callback: Callback): Unit = js.native
  def view(name: String, callback: Callback): Unit = js.native
  def view(name: String, options: Anon_Descending, callback: Callback): Unit = js.native
  def viewCleanup(callback: Callback): Unit = js.native
}


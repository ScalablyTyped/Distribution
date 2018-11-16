package typings
package cradleLib.cradleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cradle", "Database")
@js.native
class Database () extends js.Object {
  var name: java.lang.String = js.native
  def all(callback: Callback): scala.Unit = js.native
  def all(options: js.Any, callback: Callback): scala.Unit = js.native
  def changes(callback: js.Function2[/* error */ js.Any, /* list */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def changes(options: ChangesOptions): js.Any = js.native
  def changes(
    options: ChangesOptions,
    callback: js.Function2[/* error */ js.Any, /* list */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def compact(callback: Callback): scala.Unit = js.native
  def compact(design: java.lang.String, callback: Callback): scala.Unit = js.native
  def create(callback: ErrorCallback): scala.Unit = js.native
  def destroy(callback: ErrorCallback): scala.Unit = js.native
  def exists(callback: js.Function2[/* error */ js.Any, /* exists */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def get(
    id: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* document */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def get(
    id: java.lang.String,
    rev: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* document */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def get(ids: js.Array[java.lang.String], callback: Callback): scala.Unit = js.native
  def getAttachment(id: java.lang.String, attachmentName: java.lang.String, callback: Callback): scala.Unit = js.native
  @JSName("get")
  def get_T[T](id: java.lang.String, callback: js.Function2[/* error */ js.Any, /* document */ T, scala.Unit]): scala.Unit = js.native
  @JSName("get")
  def get_T[T](
    id: java.lang.String,
    rev: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* document */ T, scala.Unit]
  ): scala.Unit = js.native
  def info(callback: Callback): scala.Unit = js.native
  def merge(id: java.lang.String, document: js.Any, callback: Callback): scala.Unit = js.native
  def merge[T](id: java.lang.String, document: T, callback: Callback): scala.Unit = js.native
  def remove(id: java.lang.String, revision: java.lang.String, callback: Callback): scala.Unit = js.native
  def removeAttachment(id: java.lang.String, attachmentName: java.lang.String, callback: Callback): scala.Unit = js.native
  def replicate(target: java.lang.String, callback: Callback): scala.Unit = js.native
  def replicate(target: java.lang.String, options: js.Any, callback: Callback): scala.Unit = js.native
  def save(document: js.Any, callback: Callback): scala.Unit = js.native
  def save(documents: js.Array[_], callback: Callback): scala.Unit = js.native
  def save(id: java.lang.String, document: js.Any, callback: Callback): scala.Unit = js.native
  def save(id: java.lang.String, revision: java.lang.String, document: js.Any, callback: Callback): scala.Unit = js.native
  def save[T](document: T, callback: Callback): scala.Unit = js.native
  def save[T](id: java.lang.String, document: T, callback: Callback): scala.Unit = js.native
  def save[T](id: java.lang.String, revision: java.lang.String, document: T, callback: Callback): scala.Unit = js.native
  def saveAttachment(idAndRevData: cradleLib.Anon_Rev, attachmentData: js.Any, callback: Callback): scala.Unit = js.native
  def temporaryView(view: js.Any, callback: Callback): scala.Unit = js.native
  def update(
    name: java.lang.String,
    id: java.lang.String,
    queryObject: js.Any,
    documentBody: js.Any,
    callback: Callback
  ): scala.Unit = js.native
  def view(name: java.lang.String, callback: Callback): scala.Unit = js.native
  def view(name: java.lang.String, options: cradleLib.Anon_Includedocs, callback: Callback): scala.Unit = js.native
  def viewCleanup(callback: Callback): scala.Unit = js.native
}


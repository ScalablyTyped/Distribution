package typings.cloudeventsSdk.spec03Mod

import typings.cloudeventsSdk.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @typedef {import("../../../cloudevent")} CloudEvent */
/**
  * Decorates a CloudEvent with the 0.3 specification getters and setters
  * @ignore
  */
@js.native
trait Spec03 extends js.Object {
  var payload: Id = js.native
  def addExtension(key: js.Any, value: js.Any): Spec03 = js.native
  def check(): Unit = js.native
  def data: js.Any = js.native
  def dataContentEncoding: js.Any = js.native
  def dataContentEncoding_=(arg: js.Any): Unit = js.native
  def dataContentType: js.Any = js.native
  def dataContentType_=(arg: js.Any): Unit = js.native
  def data_=(arg: js.Any): Unit = js.native
  def id: js.Any = js.native
  def id_=(arg: js.Any): Unit = js.native
  def schemaURL: js.Any = js.native
  def schemaURL_=(arg: js.Any): Unit = js.native
  def source: js.Any = js.native
  def source_=(arg: js.Any): Unit = js.native
  def specversion: String = js.native
  def subject: js.Any = js.native
  def subject_=(arg: js.Any): Unit = js.native
  def time: String = js.native
  def time_=(arg: String): Unit = js.native
  def `type`: js.Any = js.native
  def type_=(arg: js.Any): Unit = js.native
}


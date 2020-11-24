package typings.cloudeventsSdk.spec1Mod

import typings.cloudeventsSdk.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import("../../../cloudevent")} CloudEvent */
/**
  * Decorates a CloudEvent with the 1.0 specification getters and setters
  * @ignore
  */
@js.native
trait Spec1 extends js.Object {
  
  def addExtension(key: js.Any, value: js.Any): Spec1 = js.native
  
  def check(): Unit = js.native
  
  def data: js.Any = js.native
  
  def dataContentType: js.Any = js.native
  def dataContentType_=(arg: js.Any): Unit = js.native
  
  def dataSchema: js.Any = js.native
  def dataSchema_=(arg: js.Any): Unit = js.native
  
  def data_=(arg: js.Any): Unit = js.native
  
  def id: js.Any = js.native
  def id_=(arg: js.Any): Unit = js.native
  
  var payload: Id = js.native
  
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

package typings
package cradleLib.cradleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cradle", "Connection")
@js.native
class Connection () extends js.Object {
  def this(uri: java.lang.String) = this()
  def this(uri: java.lang.String, port: scala.Double) = this()
  def this(uri: java.lang.String, port: scala.Double, options: Options) = this()
  def activeTasks(callback: Callback): scala.Unit = js.native
  def config(callback: Callback): scala.Unit = js.native
  def database(name: java.lang.String): Database = js.native
  def databases(Callback: Callback): scala.Unit = js.native
  def info(callback: Callback): scala.Unit = js.native
  def replicate(options: cradleLib.Anon_Cancel, callback: Callback): scala.Unit = js.native
  def stats(callback: Callback): scala.Unit = js.native
  def uuids(callback: Callback): scala.Unit = js.native
  def uuids(count: scala.Double, callback: Callback): scala.Unit = js.native
}


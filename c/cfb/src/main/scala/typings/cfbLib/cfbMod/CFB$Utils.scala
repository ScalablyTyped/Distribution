package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFB$Utils extends js.Object {
  def CheckField(hexstr: java.lang.String): scala.Unit = js.native
  def CheckField(hexstr: java.lang.String, fld: java.lang.String): scala.Unit = js.native
  def ReadShift(size: scala.Double): scala.Double | java.lang.String = js.native
  def ReadShift(size: scala.Double, t: java.lang.String): scala.Double | java.lang.String = js.native
  def WarnField(hexstr: java.lang.String): scala.Unit = js.native
  def WarnField(hexstr: java.lang.String, fld: java.lang.String): scala.Unit = js.native
  def bconcat(bufs: js.Array[_]): js.Any = js.native
  def cfb_add(cfb: CFB$Container, name: java.lang.String, content: js.Any): CFB$Entry = js.native
  def cfb_add(cfb: CFB$Container, name: java.lang.String, content: js.Any, opts: CFB$AddOpts): CFB$Entry = js.native
  def cfb_del(cfb: CFB$Container, name: java.lang.String): scala.Boolean = js.native
  def cfb_gc(cfb: CFB$Container): scala.Unit = js.native
  def cfb_mov(cfb: CFB$Container, old_name: java.lang.String, new_name: java.lang.String): scala.Boolean = js.native
  def cfb_new(): CFB$Container = js.native
  def cfb_new(opts: js.Any): CFB$Container = js.native
  def prep_blob(blob: js.Any): CFB$Blob = js.native
  def prep_blob(blob: js.Any, pos: scala.Double): CFB$Blob = js.native
}


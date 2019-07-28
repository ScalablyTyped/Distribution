package typings.cfb.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFB$Utils extends js.Object {
  def CheckField(hexstr: String): Unit = js.native
  def CheckField(hexstr: String, fld: String): Unit = js.native
  def ReadShift(size: Double): Double | String = js.native
  def ReadShift(size: Double, t: String): Double | String = js.native
  def WarnField(hexstr: String): Unit = js.native
  def WarnField(hexstr: String, fld: String): Unit = js.native
  def bconcat(bufs: js.Array[_]): js.Any = js.native
  def cfb_add(cfb: CFB$Container, name: String, content: js.Any): CFB$Entry = js.native
  def cfb_add(cfb: CFB$Container, name: String, content: js.Any, opts: CFB$AddOpts): CFB$Entry = js.native
  def cfb_del(cfb: CFB$Container, name: String): Boolean = js.native
  def cfb_gc(cfb: CFB$Container): Unit = js.native
  def cfb_mov(cfb: CFB$Container, old_name: String, new_name: String): Boolean = js.native
  def cfb_new(): CFB$Container = js.native
  def cfb_new(opts: js.Any): CFB$Container = js.native
  def prep_blob(blob: js.Any): CFB$Blob = js.native
  def prep_blob(blob: js.Any, pos: Double): CFB$Blob = js.native
}


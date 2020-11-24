package typings.cfb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CFBUtils extends js.Object {
  
  def CheckField(hexstr: String): Unit = js.native
  def CheckField(hexstr: String, fld: String): Unit = js.native
  
  def ReadShift(size: Double): Double | String = js.native
  def ReadShift(size: Double, t: String): Double | String = js.native
  
  def WarnField(hexstr: String): Unit = js.native
  def WarnField(hexstr: String, fld: String): Unit = js.native
  
  def bconcat(bufs: js.Array[_]): js.Any = js.native
  
  def cfb_add(cfb: CFBContainer, name: String, content: js.Any): CFBEntry = js.native
  def cfb_add(cfb: CFBContainer, name: String, content: js.Any, opts: CFBAddOpts): CFBEntry = js.native
  
  def cfb_del(cfb: CFBContainer, name: String): Boolean = js.native
  
  def cfb_gc(cfb: CFBContainer): Unit = js.native
  
  def cfb_mov(cfb: CFBContainer, old_name: String, new_name: String): Boolean = js.native
  
  def cfb_new(): CFBContainer = js.native
  def cfb_new(opts: js.Any): CFBContainer = js.native
  
  def prep_blob(blob: js.Any): CFBBlob = js.native
  def prep_blob(blob: js.Any, pos: Double): CFBBlob = js.native
}

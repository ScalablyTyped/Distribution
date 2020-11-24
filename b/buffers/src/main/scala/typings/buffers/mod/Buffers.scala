package typings.buffers.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffers extends js.Object {
  
  var buffers: js.Array[Buffer] = js.native
  
  def copy(dst: Buffer): Double = js.native
  def copy(dst: Buffer, dstStart: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  def copy(dst: Buffer, dstStart: js.UndefOr[scala.Nothing], start: Double): Double = js.native
  def copy(dst: Buffer, dstStart: js.UndefOr[scala.Nothing], start: Double, end: Double): Double = js.native
  def copy(dst: Buffer, dstStart: Double): Double = js.native
  def copy(dst: Buffer, dstStart: Double, start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  def copy(dst: Buffer, dstStart: Double, start: Double): Double = js.native
  def copy(dst: Buffer, dstStart: Double, start: Double, end: Double): Double = js.native
  
  def get(i: Double): js.Any = js.native
  
  def indexOf(needle: String): Double = js.native
  def indexOf(needle: String, offset: Double): Double = js.native
  def indexOf(needle: Buffer): Double = js.native
  def indexOf(needle: Buffer, offset: Double): Double = js.native
  
  var length: Double = js.native
  
  def push(items: Buffer*): Double = js.native
  
  def set(i: Double, b: js.Any): Unit = js.native
  
  def slice(): Buffer = js.native
  def slice(i: js.UndefOr[scala.Nothing], j: Double): Buffer = js.native
  def slice(i: Double): Buffer = js.native
  def slice(i: Double, j: Double): Buffer = js.native
  
  def splice(i: Double, howMany: js.UndefOr[scala.Nothing], items: Buffer*): Buffers = js.native
  def splice(i: Double, howMany: Double, items: Buffer*): Buffers = js.native
  
  def toBuffer(): Buffer = js.native
  
  def toString(encoding: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def toString(encoding: js.UndefOr[scala.Nothing], start: Double): String = js.native
  def toString(encoding: js.UndefOr[scala.Nothing], start: Double, end: Double): String = js.native
  def toString(encoding: js.Any): String = js.native
  def toString(encoding: js.Any, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def toString(encoding: js.Any, start: Double): String = js.native
  def toString(encoding: js.Any, start: Double, end: Double): String = js.native
  
  def unshift(items: Buffer*): Double = js.native
}

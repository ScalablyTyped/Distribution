package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.ArrayBufferLike
import typings.typescriptNn5FuAjk.ArrayLike
import typings.typescriptNn5FuAjk.Iterable
import typings.typescriptNn5FuAjk.Uint16ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Uint16Array")
@js.native
open class Uint16Array ()
  extends StObject
     with typings.typescriptNn5FuAjk.Uint16Array {
  def this(array: ArrayBufferLike) = this()
  def this(array: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
}
object Uint16Array {
  
  inline def apply: Uint16ArrayConstructor = js.Dynamic.global.selectDynamic("Uint16Array").asInstanceOf[Uint16ArrayConstructor]
}

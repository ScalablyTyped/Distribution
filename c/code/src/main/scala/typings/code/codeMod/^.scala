package typings.code.codeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("code", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val settings: Settings = js.native
  def count(): Double = js.native
  def expect[T](value: T): AssertionChain[T] = js.native
  def expect[T](value: T, prefix: String): AssertionChain[T] = js.native
  def expect[T](value: js.Array[T]): AssertionChain[T] = js.native
  def expect[T](value: js.Array[T], prefix: String): AssertionChain[T] = js.native
  def fail(message: String): Unit = js.native
  def incomplete(): js.Array[String] | Null = js.native
  def thrownAt(): CodeError = js.native
  def thrownAt(error: Error): CodeError = js.native
}


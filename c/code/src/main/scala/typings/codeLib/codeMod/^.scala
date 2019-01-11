package typings
package codeLib.codeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("code", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val settings: codeLib.codeMod.Settings = js.native
  def count(): scala.Double = js.native
  def expect[T](value: T): codeLib.codeMod.AssertionChain[T] = js.native
  def expect[T](value: T, prefix: java.lang.String): codeLib.codeMod.AssertionChain[T] = js.native
  def expect[T](value: js.Array[T]): codeLib.codeMod.AssertionChain[T] = js.native
  def expect[T](value: js.Array[T], prefix: java.lang.String): codeLib.codeMod.AssertionChain[T] = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  def incomplete(): js.Array[java.lang.String] | scala.Null = js.native
  def thrownAt(): codeLib.codeMod.CodeError = js.native
  def thrownAt(error: stdLib.Error): codeLib.codeMod.CodeError = js.native
}


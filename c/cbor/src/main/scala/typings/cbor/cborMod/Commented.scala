package typings.cbor.cborMod

import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "Commented")
@js.native
class Commented () extends Transform {
  def this(options: CommentedOptions) = this()
}

/* static members */
@JSImport("cbor", "Commented")
@js.native
object Commented extends js.Object {
  def comment(input: String): js.Promise[String] = js.native
  def comment(input: String, cb: commentCallback): Unit = js.native
  def comment(input: String, options: String): js.Promise[String] = js.native
  def comment(input: String, options: String, cb: commentCallback): Unit = js.native
  def comment(input: String, options: CommentOptions): js.Promise[String] = js.native
  def comment(input: String, options: CommentOptions, cb: commentCallback): Unit = js.native
  def comment(input: Buffer): js.Promise[String] = js.native
  def comment(input: Buffer, cb: commentCallback): Unit = js.native
  def comment(input: Buffer, options: String): js.Promise[String] = js.native
  def comment(input: Buffer, options: String, cb: commentCallback): Unit = js.native
  def comment(input: Buffer, options: CommentOptions): js.Promise[String] = js.native
  def comment(input: Buffer, options: CommentOptions, cb: commentCallback): Unit = js.native
}


package typings.createDashHash.createDashHashMod

import typings.node.Buffer
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashAlgorithm extends js.Object {
  def digest(): Buffer = js.native
  def digest(target: encoding): String = js.native
  def end(): Unit = js.native
  def read(): Unit = js.native
  def update(data: String): this.type = js.native
  def update(data: String, encoding: String): this.type = js.native
  def update(data: TypedArray): this.type = js.native
  def update(data: TypedArray, encoding: String): this.type = js.native
  def update(data: Buffer): this.type = js.native
  def update(data: Buffer, encoding: String): this.type = js.native
  def update(data: DataView): this.type = js.native
  def update(data: DataView, encoding: String): this.type = js.native
  def write(data: String): this.type = js.native
  def write(data: String, encoding: String): this.type = js.native
  def write(data: TypedArray): this.type = js.native
  def write(data: TypedArray, encoding: String): this.type = js.native
  def write(data: Buffer): this.type = js.native
  def write(data: Buffer, encoding: String): this.type = js.native
  def write(data: DataView): this.type = js.native
  def write(data: DataView, encoding: String): this.type = js.native
}


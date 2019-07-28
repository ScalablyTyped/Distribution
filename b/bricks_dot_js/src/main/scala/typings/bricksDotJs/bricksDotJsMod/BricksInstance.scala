package typings.bricksDotJs.bricksDotJsMod

import typings.bricksDotJs.bricksDotJsStrings.pack
import typings.bricksDotJs.bricksDotJsStrings.resize
import typings.bricksDotJs.bricksDotJsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BricksInstance extends js.Object {
  @JSName("off")
  def off_pack(event: pack): BricksInstance = js.native
  @JSName("off")
  def off_pack(event: pack, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("off")
  def off_resize(event: resize): BricksInstance = js.native
  @JSName("off")
  def off_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, _]): BricksInstance = js.native
  @JSName("off")
  def off_update(event: update): BricksInstance = js.native
  @JSName("off")
  def off_update(event: update, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("on")
  def on_pack(event: pack, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("on")
  def on_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, _]): BricksInstance = js.native
  @JSName("on")
  def on_update(event: update, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("once")
  def once_pack(event: pack, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("once")
  def once_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, _]): BricksInstance = js.native
  @JSName("once")
  def once_update(event: update, listener: js.Function0[_]): BricksInstance = js.native
  def pack(): BricksInstance = js.native
  def resize(): BricksInstance = js.native
  def resize(flag: Boolean): BricksInstance = js.native
  def update(): BricksInstance = js.native
}


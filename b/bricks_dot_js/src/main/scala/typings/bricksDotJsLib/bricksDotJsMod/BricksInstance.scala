package typings
package bricksDotJsLib.bricksDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BricksInstance extends js.Object {
  @JSName("off")
  def off_pack(event: bricksDotJsLib.bricksDotJsLibStrings.pack): BricksInstance = js.native
  @JSName("off")
  def off_pack(event: bricksDotJsLib.bricksDotJsLibStrings.pack, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("off")
  def off_resize(event: bricksDotJsLib.bricksDotJsLibStrings.resize): BricksInstance = js.native
  @JSName("off")
  def off_resize(
    event: bricksDotJsLib.bricksDotJsLibStrings.resize,
    listener: js.Function1[/* sizeDetail */ SizeDetail, _]
  ): BricksInstance = js.native
  @JSName("off")
  def off_update(event: bricksDotJsLib.bricksDotJsLibStrings.update): BricksInstance = js.native
  @JSName("off")
  def off_update(event: bricksDotJsLib.bricksDotJsLibStrings.update, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("on")
  def on_pack(event: bricksDotJsLib.bricksDotJsLibStrings.pack, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("on")
  def on_resize(
    event: bricksDotJsLib.bricksDotJsLibStrings.resize,
    listener: js.Function1[/* sizeDetail */ SizeDetail, _]
  ): BricksInstance = js.native
  @JSName("on")
  def on_update(event: bricksDotJsLib.bricksDotJsLibStrings.update, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("once")
  def once_pack(event: bricksDotJsLib.bricksDotJsLibStrings.pack, listener: js.Function0[_]): BricksInstance = js.native
  @JSName("once")
  def once_resize(
    event: bricksDotJsLib.bricksDotJsLibStrings.resize,
    listener: js.Function1[/* sizeDetail */ SizeDetail, _]
  ): BricksInstance = js.native
  @JSName("once")
  def once_update(event: bricksDotJsLib.bricksDotJsLibStrings.update, listener: js.Function0[_]): BricksInstance = js.native
  def pack(): BricksInstance = js.native
  def resize(): BricksInstance = js.native
  def resize(flag: scala.Boolean): BricksInstance = js.native
  def update(): BricksInstance = js.native
}


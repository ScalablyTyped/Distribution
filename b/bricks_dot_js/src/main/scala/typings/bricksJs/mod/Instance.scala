package typings.bricksJs.mod

import typings.bricksJs.bricksJsStrings.pack
import typings.bricksJs.bricksJsStrings.resize
import typings.bricksJs.bricksJsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  @JSName("off")
  def off_pack(event: pack): Instance = js.native
  @JSName("off")
  def off_pack(event: pack, listener: js.Function0[_]): Instance = js.native
  @JSName("off")
  def off_resize(event: resize): Instance = js.native
  @JSName("off")
  def off_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, _]): Instance = js.native
  @JSName("off")
  def off_update(event: update): Instance = js.native
  @JSName("off")
  def off_update(event: update, listener: js.Function0[_]): Instance = js.native
  
  @JSName("on")
  def on_pack(event: pack, listener: js.Function0[_]): Instance = js.native
  @JSName("on")
  def on_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, _]): Instance = js.native
  @JSName("on")
  def on_update(event: update, listener: js.Function0[_]): Instance = js.native
  
  @JSName("once")
  def once_pack(event: pack, listener: js.Function0[_]): Instance = js.native
  @JSName("once")
  def once_resize(event: resize, listener: js.Function1[/* sizeDetail */ SizeDetail, _]): Instance = js.native
  @JSName("once")
  def once_update(event: update, listener: js.Function0[_]): Instance = js.native
  
  def pack(): Instance = js.native
  
  def resize(): Instance = js.native
  def resize(flag: Boolean): Instance = js.native
  
  def update(): Instance = js.native
}

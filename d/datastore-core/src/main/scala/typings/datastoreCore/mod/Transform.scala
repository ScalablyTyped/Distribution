package typings.datastoreCore.mod

import typings.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends js.Object {
  
  /**
    * Forward transform function.
    * @param key Input key.
    * @example
    * // Forward prefix transform
    * const convert = (key: Key) => new Key('/abc').child(key)
    */
  def convert(key: Key): Key = js.native
  
  /**
    * Inverse transform function.
    * @param key Input key.
    * @example
    * // Inverse prefix transform
    * const invert = (key: Key) => Key.withNamespaces(key.list().slice(1))
    */
  def invert(key: Key): Key = js.native
}
object Transform {
  
  @scala.inline
  def apply(convert: Key => Key, invert: Key => Key): Transform = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), invert = js.Any.fromFunction1(invert))
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConvert(value: Key => Key): Self = this.set("convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvert(value: Key => Key): Self = this.set("invert", js.Any.fromFunction1(value))
  }
}

package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode_ extends js.Object {
  
  /**
    * Processes the data block at offset.
    *
    * @param words The data words to operate on.
    * @param offset The offset where the block starts.
    *
    * @example
    *
    *     mode.processBlock(data.words, offset);
    */
  def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
}
object Mode_ {
  
  @scala.inline
  def apply(processBlock: (js.Array[Double], Double) => Unit): Mode_ = {
    val __obj = js.Dynamic.literal(processBlock = js.Any.fromFunction2(processBlock))
    __obj.asInstanceOf[Mode_]
  }
  
  @scala.inline
  implicit class Mode_Ops[Self <: Mode_] (val x: Self) extends AnyVal {
    
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
    def setProcessBlock(value: (js.Array[Double], Double) => Unit): Self = this.set("processBlock", js.Any.fromFunction2(value))
  }
}

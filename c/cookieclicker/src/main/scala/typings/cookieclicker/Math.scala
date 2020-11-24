package typings.cookieclicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Math extends js.Object {
  
  /**
    * Changes `Math.random` to output numbers based on the seed
    */
  def seedrandom(seed: String): Unit = js.native
}
object Math {
  
  @scala.inline
  def apply(seedrandom: String => Unit): Math = {
    val __obj = js.Dynamic.literal(seedrandom = js.Any.fromFunction1(seedrandom))
    __obj.asInstanceOf[Math]
  }
  
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
    
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
    def setSeedrandom(value: String => Unit): Self = this.set("seedrandom", js.Any.fromFunction1(value))
  }
}

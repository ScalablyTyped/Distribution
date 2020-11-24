package typings.cassandraDriver.mod.token

import typings.cassandraDriver.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  def compare(other: Token): Double = js.native
  
  def equals(other: Token): Boolean = js.native
  
  def getType(): Code = js.native
  
  def getValue(): js.Any = js.native
}
object Token {
  
  @scala.inline
  def apply(compare: Token => Double, equals: Token => Boolean, getType: () => Code, getValue: () => js.Any): Token = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), equals = js.Any.fromFunction1(equals), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setCompare(value: Token => Double): Self = this.set("compare", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: Token => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetType(value: () => Code): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
  }
}

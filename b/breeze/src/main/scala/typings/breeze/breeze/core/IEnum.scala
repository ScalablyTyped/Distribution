package typings.breeze.breeze.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnum extends js.Object {
  
  def contains(`object`: js.Any): Boolean = js.native
  
  def fromName(name: String): EnumSymbol = js.native
  
  def getNames(): js.Array[String] = js.native
  
  def getSymbols(): js.Array[EnumSymbol] = js.native
}
object IEnum {
  
  @scala.inline
  def apply(
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): IEnum = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[IEnum]
  }
  
  @scala.inline
  implicit class IEnumOps[Self <: IEnum] (val x: Self) extends AnyVal {
    
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
    def setContains(value: js.Any => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromName(value: String => EnumSymbol): Self = this.set("fromName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNames(value: () => js.Array[String]): Self = this.set("getNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSymbols(value: () => js.Array[EnumSymbol]): Self = this.set("getSymbols", js.Any.fromFunction0(value))
  }
}

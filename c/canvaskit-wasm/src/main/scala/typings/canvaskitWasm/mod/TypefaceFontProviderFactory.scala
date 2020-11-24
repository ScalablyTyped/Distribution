package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypefaceFontProviderFactory extends js.Object {
  
  /**
    * Return an empty TypefaceFontProvider
    */
  def Make(): TypefaceFontProvider = js.native
}
object TypefaceFontProviderFactory {
  
  @scala.inline
  def apply(Make: () => TypefaceFontProvider): TypefaceFontProviderFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction0(Make))
    __obj.asInstanceOf[TypefaceFontProviderFactory]
  }
  
  @scala.inline
  implicit class TypefaceFontProviderFactoryOps[Self <: TypefaceFontProviderFactory] (val x: Self) extends AnyVal {
    
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
    def setMake(value: () => TypefaceFontProvider): Self = this.set("Make", js.Any.fromFunction0(value))
  }
}

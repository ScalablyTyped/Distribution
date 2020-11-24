package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbindSingleton extends js.Object {
  
  // Technically Embind includes the other methods too, but they should not be called for a
  // singleton.
  def isAliasOf(other: js.Any): Boolean = js.native
}
object EmbindSingleton {
  
  @scala.inline
  def apply(isAliasOf: js.Any => Boolean): EmbindSingleton = {
    val __obj = js.Dynamic.literal(isAliasOf = js.Any.fromFunction1(isAliasOf))
    __obj.asInstanceOf[EmbindSingleton]
  }
  
  @scala.inline
  implicit class EmbindSingletonOps[Self <: EmbindSingleton] (val x: Self) extends AnyVal {
    
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
    def setIsAliasOf(value: js.Any => Boolean): Self = this.set("isAliasOf", js.Any.fromFunction1(value))
  }
}

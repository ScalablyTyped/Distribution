package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateableIndexBuilder extends js.Object {
  
  def withOptions(opts: MappedDict[String]): this.type = js.native
}
object CreateableIndexBuilder {
  
  @scala.inline
  def apply(withOptions: MappedDict[String] => CreateableIndexBuilder): CreateableIndexBuilder = {
    val __obj = js.Dynamic.literal(withOptions = js.Any.fromFunction1(withOptions))
    __obj.asInstanceOf[CreateableIndexBuilder]
  }
  
  @scala.inline
  implicit class CreateableIndexBuilderOps[Self <: CreateableIndexBuilder] (val x: Self) extends AnyVal {
    
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
    def setWithOptions(value: MappedDict[String] => CreateableIndexBuilder): Self = this.set("withOptions", js.Any.fromFunction1(value))
  }
}

package typings.babelGenerator.mod

import typings.babelGenerator.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorResult extends js.Object {
  
  var code: String = js.native
  
  var map: File | Null = js.native
}
object GeneratorResult {
  
  @scala.inline
  def apply(code: String): GeneratorResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorResult]
  }
  
  @scala.inline
  implicit class GeneratorResultOps[Self <: GeneratorResult] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: File): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapNull: Self = this.set("map", null)
  }
}

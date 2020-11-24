package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.RestProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestProperty_
  extends Node
     with UnaryLike {
  
  var argument: LVal = js.native
  
  @JSName("type")
  var type_RestProperty_ : RestProperty = js.native
}
object RestProperty_ {
  
  @scala.inline
  def apply(argument: LVal, end: Double, loc: SourceLocation, start: Double, `type`: RestProperty): RestProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestProperty_]
  }
  
  @scala.inline
  implicit class RestProperty_Ops[Self <: RestProperty_] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: LVal): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RestProperty): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

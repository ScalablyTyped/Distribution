package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.Directive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directive_ extends Node {
  
  @JSName("type")
  var type_Directive_ : Directive = js.native
  
  var value: DirectiveLiteral_ = js.native
}
object Directive_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: Directive, value: DirectiveLiteral_): Directive_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive_]
  }
  
  @scala.inline
  implicit class Directive_Ops[Self <: Directive_] (val x: Self) extends AnyVal {
    
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
    def setType(value: Directive): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DirectiveLiteral_): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}

package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXIdentifier_
  extends Node
     with Expression
     with JSX {
  
  var name: String = js.native
  
  @JSName("type")
  var type_JSXIdentifier_ : JSXIdentifier = js.native
}
object JSXIdentifier_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, name: String, start: Double, `type`: JSXIdentifier): JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXIdentifier_]
  }
  
  @scala.inline
  implicit class JSXIdentifier_Ops[Self <: JSXIdentifier_] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXIdentifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

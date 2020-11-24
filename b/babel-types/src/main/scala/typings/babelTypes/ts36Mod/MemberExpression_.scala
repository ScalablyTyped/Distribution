package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.MemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberExpression_
  extends Node
     with Expression
     with LVal {
  
  var computed: Boolean = js.native
  
  var `object`: Expression | Super = js.native
  
  var property: Expression = js.native
  
  @JSName("type")
  var type_MemberExpression_ : MemberExpression = js.native
}
object MemberExpression_ {
  
  @scala.inline
  def apply(
    computed: Boolean,
    end: Double,
    loc: SourceLocation,
    `object`: Expression | Super,
    property: Expression,
    start: Double,
    `type`: MemberExpression
  ): MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberExpression_]
  }
  
  @scala.inline
  implicit class MemberExpression_Ops[Self <: MemberExpression_] (val x: Self) extends AnyVal {
    
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
    def setComputed(value: Boolean): Self = this.set("computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression | Super): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Expression): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MemberExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

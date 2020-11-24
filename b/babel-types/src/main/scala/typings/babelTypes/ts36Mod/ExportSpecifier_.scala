package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSpecifier_
  extends Node
     with ModuleSpecifier {
  
  var exported: Identifier_ = js.native
  
  var imported: Identifier_ = js.native
  
  var local: Identifier_ = js.native
  
  @JSName("type")
  var type_ExportSpecifier_ : ExportSpecifier = js.native
}
object ExportSpecifier_ {
  
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier_,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ExportSpecifier
  ): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier_]
  }
  
  @scala.inline
  implicit class ExportSpecifier_Ops[Self <: ExportSpecifier_] (val x: Self) extends AnyVal {
    
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
    def setExported(value: Identifier_): Self = this.set("exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImported(value: Identifier_): Self = this.set("imported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Identifier_): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

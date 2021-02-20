package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportNamespaceSpecifier_
  extends Node
     with ModuleSpecifier {
  
  var exported: Identifier_ = js.native
  
  @JSName("type")
  var type_ExportNamespaceSpecifier_ : ExportNamespaceSpecifier = js.native
}
object ExportNamespaceSpecifier_ {
  
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ExportNamespaceSpecifier
  ): ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamespaceSpecifier_]
  }
  
  @scala.inline
  implicit class ExportNamespaceSpecifier_MutableBuilder[Self <: ExportNamespaceSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExported(value: Identifier_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

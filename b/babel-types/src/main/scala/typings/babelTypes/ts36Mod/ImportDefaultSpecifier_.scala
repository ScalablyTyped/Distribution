package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDefaultSpecifier_
  extends Node
     with ModuleSpecifier {
  
  var local: Identifier_ = js.native
  
  @JSName("type")
  var type_ImportDefaultSpecifier_ : ImportDefaultSpecifier = js.native
}
object ImportDefaultSpecifier_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportDefaultSpecifier
  ): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
  
  @scala.inline
  implicit class ImportDefaultSpecifier_MutableBuilder[Self <: ImportDefaultSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

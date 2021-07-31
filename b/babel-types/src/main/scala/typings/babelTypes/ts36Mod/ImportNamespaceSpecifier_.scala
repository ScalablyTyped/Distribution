package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNamespaceSpecifier_
  extends StObject
     with Node
     with ModuleSpecifier {
  
  var local: Identifier_
  
  @JSName("type")
  var type_ImportNamespaceSpecifier_ : ImportNamespaceSpecifier
}
object ImportNamespaceSpecifier_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, local: Identifier_, start: Double): ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[ImportNamespaceSpecifier_]
  }
  
  @scala.inline
  implicit class ImportNamespaceSpecifier_MutableBuilder[Self <: ImportNamespaceSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

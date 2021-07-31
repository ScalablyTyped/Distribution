package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ImportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `197` extends StObject {
  
  var `type`: ImportNamespaceSpecifier
}
object `197` {
  
  @scala.inline
  def apply(): `197` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[`197`]
  }
  
  @scala.inline
  implicit class `197MutableBuilder`[Self <: `197`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

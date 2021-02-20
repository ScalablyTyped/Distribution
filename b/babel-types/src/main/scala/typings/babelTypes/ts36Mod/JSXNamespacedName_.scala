package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXNamespacedName_
  extends Node
     with JSX {
  
  var name: JSXIdentifier_ = js.native
  
  var namespace: JSXIdentifier_ = js.native
  
  @JSName("type")
  var type_JSXNamespacedName_ : JSXNamespacedName = js.native
}
object JSXNamespacedName_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_,
    namespace: JSXIdentifier_,
    start: Double,
    `type`: JSXNamespacedName
  ): JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName_]
  }
  
  @scala.inline
  implicit class JSXNamespacedName_MutableBuilder[Self <: JSXNamespacedName_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JSXIdentifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: JSXIdentifier_): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

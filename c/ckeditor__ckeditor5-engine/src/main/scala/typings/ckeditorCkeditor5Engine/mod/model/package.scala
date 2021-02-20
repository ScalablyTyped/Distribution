package typings.ckeditorCkeditor5Engine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object model {
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.mod.model.Node
    - typings.ckeditorCkeditor5Engine.mod.model.TextProxy
    - java.lang.String
    - typings.ckeditorCkeditor5Engine.mod.model.NodeList
    - typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment
    - typings.std.Iterable[js.Any]
  */
  type NodeSet = typings.ckeditorCkeditor5Engine.mod.model._NodeSet | typings.std.Iterable[js.Any] | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.mod.model.Node
    - typings.ckeditorCkeditor5Engine.mod.model.Position
    - typings.ckeditorCkeditor5Engine.mod.model.SchemaContext
    - java.lang.String
    - js.Array[java.lang.String | typings.ckeditorCkeditor5Engine.mod.model.Node]
  */
  type SchemaContextDefinition = typings.ckeditorCkeditor5Engine.mod.model._SchemaContextDefinition | (js.Array[java.lang.String | typings.ckeditorCkeditor5Engine.mod.model.Node]) | java.lang.String
  
  @scala.inline
  def getItems(options: js.Object): typings.std.Iterable[typings.ckeditorCkeditor5Engine.mod.model.Item] = typings.ckeditorCkeditor5Engine.mod.model.^.asInstanceOf[js.Dynamic].applyDynamic("getItems")(options.asInstanceOf[js.Any]).asInstanceOf[typings.std.Iterable[typings.ckeditorCkeditor5Engine.mod.model.Item]]
}

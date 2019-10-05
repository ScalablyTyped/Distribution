package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object model {
  import typings.std.Iterable

  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Node
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.TextProxy
    - java.lang.String
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.NodeList
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.DocumentFragment
    - typings.std.Iterable[js.Any]
  */
  type NodeSet = _NodeSet | Iterable[js.Any] | String
  /* Rewritten from type alias, can be one of: 
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Node
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Position
    - typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.SchemaContext
    - java.lang.String
    - js.Array[
  java.lang.String | typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Node]
  */
  type SchemaContextDefinition = _SchemaContextDefinition | (js.Array[String | Node]) | String
}

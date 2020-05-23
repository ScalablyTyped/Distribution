package typings.ckeditorCkeditor5Engine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object view {
  // engine/view/elementdefinition
  type ElementDefinition = java.lang.String | typings.ckeditorCkeditor5Engine.anon.Attributes
  type MatcherPattern = (js.Function1[
    /* element */ typings.ckeditorCkeditor5Engine.mod.view.Element, 
    scala.Null | typings.ckeditorCkeditor5Engine.anon.Attribute
  ]) | java.lang.String | typings.std.RegExp | typings.ckeditorCkeditor5Engine.anon.Classes
}

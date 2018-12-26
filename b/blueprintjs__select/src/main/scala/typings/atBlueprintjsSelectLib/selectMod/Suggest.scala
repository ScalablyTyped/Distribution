package typings
package atBlueprintjsSelectLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", "Suggest")
@js.native
class Suggest[T] protected ()
  extends atBlueprintjsSelectLib.libEsmComponentsMod.Suggest[T] {
  def this(props: atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod.ISuggestProps[T]) = this()
  def this(props: atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod.ISuggestProps[T], context: js.Any) = this()
}

@JSImport("@blueprintjs/select", "Suggest")
@js.native
object Suggest extends js.Object {
  var defaultProps: atBlueprintjsSelectLib.Anon_CloseOnSelect = js.native
  var displayName: java.lang.String = js.native
  def ofType[T](): org.scalablytyped.runtime.Instantiable1[
    /* props */ atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod.ISuggestProps[T], 
    atBlueprintjsSelectLib.libEsmComponentsSelectSuggestMod.Suggest[T]
  ] = js.native
}


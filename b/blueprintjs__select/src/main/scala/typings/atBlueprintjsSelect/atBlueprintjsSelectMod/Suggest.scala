package typings.atBlueprintjsSelect.atBlueprintjsSelectMod

import org.scalablytyped.runtime.Instantiable1
import typings.atBlueprintjsSelect.libEsmComponentsSelectSuggestMod.ISuggestProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", "Suggest")
@js.native
class Suggest[T] ()
  extends typings.atBlueprintjsSelect.libEsmComponentsMod.Suggest[T]

/* static members */
@JSImport("@blueprintjs/select", "Suggest")
@js.native
object Suggest extends js.Object {
  var defaultProps: Partial[ISuggestProps[_]] = js.native
  var displayName: String = js.native
  def ofType[T](): Instantiable1[
    /* props */ ISuggestProps[T], 
    typings.atBlueprintjsSelect.libEsmComponentsSelectSuggestMod.Suggest[T]
  ] = js.native
}


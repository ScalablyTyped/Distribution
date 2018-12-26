package typings
package atBlueprintjsSelectLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select", "Select")
@js.native
class Select[T] protected ()
  extends atBlueprintjsSelectLib.libEsmComponentsMod.Select[T] {
  def this(props: atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod.ISelectProps[T]) = this()
  def this(props: atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod.ISelectProps[T], context: js.Any) = this()
}

@JSImport("@blueprintjs/select", "Select")
@js.native
object Select extends js.Object {
  var displayName: java.lang.String = js.native
  def ofType[T](): org.scalablytyped.runtime.Instantiable1[
    /* props */ atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod.ISelectProps[T], 
    atBlueprintjsSelectLib.libEsmComponentsSelectSelectMod.Select[T]
  ] = js.native
}


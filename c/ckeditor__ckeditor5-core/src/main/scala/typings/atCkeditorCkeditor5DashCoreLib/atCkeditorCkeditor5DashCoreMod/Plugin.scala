package typings
package atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "Plugin")
@js.native
abstract class Plugin[T] protected ()
  extends atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Observable {
  def this(editor: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.editorNs.Editor) = this()
  var afterInit: js.UndefOr[js.Function0[scala.Null | js.Promise[T]]] = js.native
  var destroy: js.UndefOr[js.Function0[scala.Null | js.Promise[T]]] = js.native
  val editor: atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.editorNs.Editor = js.native
  var init: js.UndefOr[js.Function0[scala.Null | js.Promise[T]]] = js.native
}

@JSImport("@ckeditor/ckeditor5-core", "Plugin")
@js.native
object Plugin extends js.Object {
  val pluginName: js.UndefOr[java.lang.String] = js.native
  val requires: js.UndefOr[
    js.Array[
      org.scalablytyped.runtime.Instantiable1[
        /* editor */ atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.editorNs.Editor, 
        atCkeditorCkeditor5DashCoreLib.atCkeditorCkeditor5DashCoreMod.Plugin[scala.Unit]
      ]
    ]
  ] = js.native
}


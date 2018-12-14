package typings
package atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "PluginCollection")
@js.native
class PluginCollection[P /* <: Plugin[_] */] protected () extends js.Object {
  def this(editor: atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor) = this()
  def this(editor: atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor, availablePlugins: js.Array[
      org.scalablytyped.runtime.Instantiable1[
        /* editor */ atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor, 
        P
      ]
    ]) = this()
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[
    stdLib.Iterator[
      js.Tuple2[
        org.scalablytyped.runtime.Instantiable1[
          /* editor */ atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor, 
          P
        ], 
        P
      ]
    ]
  ] = js.native
  def destroy(): js.Promise[js.Array[P with atCkeditorCkeditor5DashCoreLib.Anon_Destroy]] = js.native
  def get(key: java.lang.String): js.UndefOr[P] = js.native
  def get(
    key: org.scalablytyped.runtime.Instantiable1[
      /* editor */ atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor, 
      P
    ]
  ): js.UndefOr[P] = js.native
  def load(
    plugins: js.Array[
      java.lang.String | (org.scalablytyped.runtime.Instantiable1[
        /* editor */ atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor, 
        P
      ])
    ]
  ): js.Promise[js.Array[P]] = js.native
  def load(
    plugins: js.Array[
      java.lang.String | (org.scalablytyped.runtime.Instantiable1[
        /* editor */ atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor, 
        P
      ])
    ],
    removePlugins: js.Array[
      java.lang.String | (org.scalablytyped.runtime.Instantiable1[
        /* editor */ atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod.editorNs.Editor, 
        P
      ])
    ]
  ): js.Promise[js.Array[P]] = js.native
}


package typings
package atBlueprintjsCoreLib.libEsmCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DISPLAYNAME_PREFIX: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.Blueprint3 = js.native
  def getPositionIgnoreAngles(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.left | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.right | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.bottom | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.top = js.native
  def isPositionHorizontal(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): scala.Boolean = js.native
  def isPositionVertical(position: atBlueprintjsCoreLib.libEsmCommonPositionMod.Position): scala.Boolean = js.native
  def removeNonHTMLProps(props: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(
    props: org.scalablytyped.runtime.StringDictionary[js.Any],
    invalidProps: js.Array[java.lang.String]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(
    props: org.scalablytyped.runtime.StringDictionary[js.Any],
    invalidProps: js.Array[java.lang.String],
    shouldMerge: scala.Boolean
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}


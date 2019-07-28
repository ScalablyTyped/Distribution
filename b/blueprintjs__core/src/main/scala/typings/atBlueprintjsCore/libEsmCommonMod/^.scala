package typings.atBlueprintjsCore.libEsmCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.Blueprint3
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.bottom
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.left
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.right
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DISPLAYNAME_PREFIX: Blueprint3 = js.native
  def getPositionIgnoreAngles(position: typings.atBlueprintjsCore.libEsmCommonPositionMod.Position): left | right | bottom | top = js.native
  def isPositionHorizontal(position: typings.atBlueprintjsCore.libEsmCommonPositionMod.Position): Boolean = js.native
  def isPositionVertical(position: typings.atBlueprintjsCore.libEsmCommonPositionMod.Position): Boolean = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String]): StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
}


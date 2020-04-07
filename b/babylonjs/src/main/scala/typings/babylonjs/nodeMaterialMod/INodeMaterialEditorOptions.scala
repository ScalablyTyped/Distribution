package typings.babylonjs.nodeMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeMaterialEditorOptions extends js.Object {
  /** Define the URl to load node editor script */
  var editorURL: js.UndefOr[String] = js.undefined
}

object INodeMaterialEditorOptions {
  @scala.inline
  def apply(editorURL: String = null): INodeMaterialEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (editorURL != null) __obj.updateDynamic("editorURL")(editorURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeMaterialEditorOptions]
  }
}


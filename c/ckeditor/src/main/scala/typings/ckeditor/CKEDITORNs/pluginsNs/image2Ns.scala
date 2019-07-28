package typings.ckeditor.CKEDITORNs.pluginsNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.Anon_Removed
import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.image2")
@js.native
object image2Ns extends js.Object {
  def checkHasNaturalRatio(image: element): Boolean = js.native
  def getLinkAttributesGetter(): js.Function2[/* editor */ editor, /* data */ StringDictionary[String], Anon_Removed] = js.native
  def getLinkAttributesParser(): js.Function2[/* editor */ editor, /* element */ element, StringDictionary[String]] = js.native
  def getNatural(image: element): StringDictionary[String] = js.native
}


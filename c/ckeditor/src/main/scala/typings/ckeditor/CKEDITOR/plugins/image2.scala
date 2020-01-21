package typings.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.AnonRemoved
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.image2")
@js.native
object image2 extends js.Object {
  def checkHasNaturalRatio(image: element): Boolean = js.native
  def getLinkAttributesGetter(): js.Function2[/* editor */ editor, /* data */ StringDictionary[String], AnonRemoved] = js.native
  def getLinkAttributesParser(): js.Function2[/* editor */ editor, /* element */ element, StringDictionary[String]] = js.native
  def getNatural(image: element): StringDictionary[String] = js.native
}


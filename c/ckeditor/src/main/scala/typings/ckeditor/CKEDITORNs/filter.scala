package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.filterNs.allowedContentRules
import typings.ckeditor.CKEDITORNs.filterNs.contentRule
import typings.ckeditor.CKEDITORNs.filterNs.disallowedContentRules
import typings.ckeditor.CKEDITORNs.filterNs.transformation
import typings.ckeditor.CKEDITORNs.htmlParserNs.element
import typings.ckeditor.CKEDITORNs.htmlParserNs.fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.filter")
@js.native
class filter protected () extends js.Object {
  def this(editorOrRules: typings.ckeditor.CKEDITORNs.editor) = this()
  def this(editorOrRules: allowedContentRules) = this()
  val allowedContent: js.Array[allowedContentRules] = js.native
  val customConfig: Boolean = js.native
  val disabled: Boolean = js.native
  val disallowedContent: js.Array[_] = js.native
  val editor: typings.ckeditor.CKEDITORNs.editor = js.native
  val elementCallbacks: js.Array[js.Function1[/* element */ element, Double]] = js.native
  val id: Double = js.native
  def addContentForms(forms: js.Array[_]): Unit = js.native
  def addElementCallback(callback: js.Function1[/* element */ element, Double]): Unit = js.native
  def addFeature(feature: feature): Boolean = js.native
  def addTransformations(transformations: js.Array[js.Array[String | transformation]]): Unit = js.native
  def allow(newRules: allowedContentRules): Boolean = js.native
  def allow(newRules: allowedContentRules, featureName: String): Boolean = js.native
  def allow(newRules: allowedContentRules, featureName: String, overrideCustom: Boolean): Boolean = js.native
  def applyTo(fragment: element): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def applyTo(fragment: fragment): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def check(test: contentRule): Boolean = js.native
  def check(test: contentRule, applyTransformations: Boolean): Boolean = js.native
  def check(test: contentRule, applyTransformations: Boolean, strictCheck: Boolean): Boolean = js.native
  def checkFeature(feature: feature): Boolean = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def disallow(newRules: disallowedContentRules): Unit = js.native
  def getAllowedEnterMode(defaultMode: Double): Double = js.native
  def getAllowedEnterMode(defaultMode: Double, reverse: Boolean): Double = js.native
}

/* static members */
@JSGlobal("CKEDITOR.filter")
@js.native
object filter extends js.Object {
  var instances: StringDictionary[filter] = js.native
}


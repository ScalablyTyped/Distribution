package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.filter.allowedContentRule
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.filter.contentRule
import typings.ckeditor.CKEDITOR.filter.disallowedContentRules
import typings.ckeditor.CKEDITOR.filter.transformation
import typings.ckeditor.CKEDITOR.filter.transformationTools
import typings.ckeditor.CKEDITOR.htmlParser.element
import typings.ckeditor.CKEDITOR.htmlParser.fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.filter")
@js.native
class filter protected () extends js.Object {
  def this(editorOrRules: typings.ckeditor.CKEDITOR.editor) = this()
  def this(editorOrRules: allowedContentRules) = this()
  val allowedContent: js.Array[allowedContentRules] = js.native
  val customConfig: Boolean = js.native
  val disabled: Boolean = js.native
  val disallowedContent: js.Array[_] = js.native
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
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
  @js.native
  trait transformation extends js.Object {
    var check: js.UndefOr[String] = js.native
    var element: js.UndefOr[String | style] = js.native
    var left: js.UndefOr[js.Function1[/* element */ element | style, Boolean]] = js.native
    def right(element: element, tools: String): Boolean = js.native
    def right(element: element, tools: transformationTools): Boolean = js.native
  }
  
  @js.native
  trait transformationTools extends js.Object {
    def alignmentToAttribute(element: element): Unit = js.native
    def alignmentToStyle(element: element): Unit = js.native
    def lengthToAttribute(element: element, styleName: String): Unit = js.native
    def lengthToAttribute(element: element, styleName: String, attrName: String): Unit = js.native
    def lengthToStyle(element: element, styleName: String): Unit = js.native
    def lengthToStyle(element: element, styleName: String, attrName: String): Unit = js.native
    def matchesTyle(element: element, style: style): Unit = js.native
    def sizeToAttribute(element: element): Unit = js.native
    def sizeToStyle(element: element): Unit = js.native
    def splitBorderShorthand(element: element): Unit = js.native
    def splitMarginShorthand(element: element): Unit = js.native
    def transform(element: element, form: String): Unit = js.native
    def transform(element: element, form: style): Unit = js.native
  }
  
  var instances: StringDictionary[filter] = js.native
  var transformationTools: transformationTools = js.native
  type allowedContentRule = String | style | StringDictionary[js.Any]
  type allowedContentRules = allowedContentRule | js.Array[allowedContentRule]
  type contentRule = String | style
  type disallowedContentRules = String | StringDictionary[js.Any]
}


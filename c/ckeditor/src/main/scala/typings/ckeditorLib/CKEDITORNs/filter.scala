package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.filter")
@js.native
class filter protected () extends js.Object {
  def this(editorOrRules: editor) = this()
  def this(editorOrRules: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules) = this()
  val allowedContent: js.Array[ckeditorLib.CKEDITORNs.filterNs.allowedContentRules] = js.native
  val customConfig: scala.Boolean = js.native
  val disabled: scala.Boolean = js.native
  val disallowedContent: js.Array[_] = js.native
  val editor: ckeditorLib.CKEDITORNs.editor = js.native
  val elementCallbacks: js.Array[
    js.Function1[/* element */ ckeditorLib.CKEDITORNs.htmlParserNs.element, scala.Double]
  ] = js.native
  val id: scala.Double = js.native
  def addContentForms(forms: js.Array[_]): scala.Unit = js.native
  def addElementCallback(callback: js.Function1[/* element */ ckeditorLib.CKEDITORNs.htmlParserNs.element, scala.Double]): scala.Unit = js.native
  def addFeature(feature: feature): scala.Boolean = js.native
  def addTransformations(
    transformations: js.Array[js.Array[java.lang.String | ckeditorLib.CKEDITORNs.filterNs.transformation]]
  ): scala.Unit = js.native
  def allow(newRules: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules): scala.Boolean = js.native
  def allow(newRules: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules, featureName: java.lang.String): scala.Boolean = js.native
  def allow(
    newRules: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules,
    featureName: java.lang.String,
    overrideCustom: scala.Boolean
  ): scala.Boolean = js.native
  def applyTo(fragment: ckeditorLib.CKEDITORNs.htmlParserNs.element): scala.Boolean = js.native
  def applyTo(fragment: ckeditorLib.CKEDITORNs.htmlParserNs.element, toHtml: scala.Boolean): scala.Boolean = js.native
  def applyTo(
    fragment: ckeditorLib.CKEDITORNs.htmlParserNs.element,
    toHtml: scala.Boolean,
    transformOnly: scala.Boolean
  ): scala.Boolean = js.native
  def applyTo(
    fragment: ckeditorLib.CKEDITORNs.htmlParserNs.element,
    toHtml: scala.Boolean,
    transformOnly: scala.Boolean,
    enterMode: scala.Double
  ): scala.Boolean = js.native
  def applyTo(fragment: ckeditorLib.CKEDITORNs.htmlParserNs.fragment): scala.Boolean = js.native
  def applyTo(fragment: ckeditorLib.CKEDITORNs.htmlParserNs.fragment, toHtml: scala.Boolean): scala.Boolean = js.native
  def applyTo(
    fragment: ckeditorLib.CKEDITORNs.htmlParserNs.fragment,
    toHtml: scala.Boolean,
    transformOnly: scala.Boolean
  ): scala.Boolean = js.native
  def applyTo(
    fragment: ckeditorLib.CKEDITORNs.htmlParserNs.fragment,
    toHtml: scala.Boolean,
    transformOnly: scala.Boolean,
    enterMode: scala.Double
  ): scala.Boolean = js.native
  def check(test: ckeditorLib.CKEDITORNs.filterNs.contentRule): scala.Boolean = js.native
  def check(test: ckeditorLib.CKEDITORNs.filterNs.contentRule, applyTransformations: scala.Boolean): scala.Boolean = js.native
  def check(
    test: ckeditorLib.CKEDITORNs.filterNs.contentRule,
    applyTransformations: scala.Boolean,
    strictCheck: scala.Boolean
  ): scala.Boolean = js.native
  def checkFeature(feature: feature): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def disallow(newRules: ckeditorLib.CKEDITORNs.filterNs.disallowedContentRules): scala.Unit = js.native
  def getAllowedEnterMode(defaultMode: scala.Double): scala.Double = js.native
  def getAllowedEnterMode(defaultMode: scala.Double, reverse: scala.Boolean): scala.Double = js.native
}

/* static members */
@JSGlobal("CKEDITOR.filter")
@js.native
object filter extends js.Object {
  var instances: org.scalablytyped.runtime.StringDictionary[ckeditorLib.CKEDITORNs.filter] = js.native
}


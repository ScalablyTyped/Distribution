package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor4.CKEDITOR.filter.allowedContentRules
import typings.ckeditor4.CKEDITOR.filter.contentRule
import typings.ckeditor4.CKEDITOR.filter.disallowedContentRules
import typings.ckeditor4.CKEDITOR.filter.transformation
import typings.ckeditor4.CKEDITOR.htmlParser.element
import typings.ckeditor4.CKEDITOR.htmlParser.fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait filter extends StObject {
  
  def addContentForms(forms: js.Array[Any]): Unit = js.native
  
  def addElementCallback(callback: js.Function1[/* element */ element, Double]): Unit = js.native
  
  def addFeature(feature: feature): Boolean = js.native
  
  def addTransformations(transformations: js.Array[js.Array[String | transformation]]): Unit = js.native
  
  def allow(newRules: allowedContentRules): Boolean = js.native
  def allow(newRules: allowedContentRules, featureName: String): Boolean = js.native
  def allow(newRules: allowedContentRules, featureName: String, overrideCustom: Boolean): Boolean = js.native
  def allow(newRules: allowedContentRules, featureName: Unit, overrideCustom: Boolean): Boolean = js.native
  
  val allowedContent: js.Array[allowedContentRules] = js.native
  
  def applyTo(fragment: element): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def applyTo(fragment: element, toHtml: Boolean, transformOnly: Unit, enterMode: Double): Boolean = js.native
  def applyTo(fragment: element, toHtml: Unit, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: element, toHtml: Unit, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def applyTo(fragment: element, toHtml: Unit, transformOnly: Unit, enterMode: Double): Boolean = js.native
  def applyTo(fragment: fragment): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Boolean, transformOnly: Unit, enterMode: Double): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Unit, transformOnly: Boolean): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Unit, transformOnly: Boolean, enterMode: Double): Boolean = js.native
  def applyTo(fragment: fragment, toHtml: Unit, transformOnly: Unit, enterMode: Double): Boolean = js.native
  
  def check(test: contentRule): Boolean = js.native
  def check(test: contentRule, applyTransformations: Boolean): Boolean = js.native
  def check(test: contentRule, applyTransformations: Boolean, strictCheck: Boolean): Boolean = js.native
  def check(test: contentRule, applyTransformations: Unit, strictCheck: Boolean): Boolean = js.native
  
  def checkFeature(feature: feature): Boolean = js.native
  
  val customConfig: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def disable(): Unit = js.native
  
  val disabled: Boolean = js.native
  
  def disallow(newRules: disallowedContentRules): Unit = js.native
  
  val disallowedContent: js.Array[Any] = js.native
  
  val editor: typings.ckeditor4.CKEDITOR.editor = js.native
  
  val elementCallbacks: js.Array[js.Function1[/* element */ element, Double]] = js.native
  
  def getAllowedEnterMode(defaultMode: Double): Double = js.native
  def getAllowedEnterMode(defaultMode: Double, reverse: Boolean): Double = js.native
  
  val id: Double = js.native
}
object filter {
  
  type allowedContentRule = String | style | StringDictionary[Any]
  
  type allowedContentRules = allowedContentRule | js.Array[allowedContentRule]
  
  type contentRule = String | style
  
  type disallowedContentRules = String | StringDictionary[Any]
  
  @js.native
  trait transformation extends StObject {
    
    var check: js.UndefOr[String] = js.native
    
    var element: js.UndefOr[String | style] = js.native
    
    var left: js.UndefOr[js.Function1[/* element */ element | style, Boolean]] = js.native
    
    def right(element: element, tools: String): Boolean = js.native
    def right(element: element, tools: transformationTools): Boolean = js.native
  }
  
  @js.native
  trait transformationTools extends StObject {
    
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
}

package typings.chocolatechipjs

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  /**
    * If no argument is provided, return the document as a ChocolateChipElementArray.
    */
  @JSName("$")
  def $(): js.Array[Document]
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback A function to execute after the DOM is ready.
    */
  @JSName("$")
  def $(callback: js.Function0[js.Any]): Unit
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param elementArray An array of DOM elements to convert into a ChocolateChip Collection.
    */
  @JSName("$")
  def $(elementArray: ChocolateChipElementArray): ChocolateChipElementArray
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param selector A string containing a selector expression
    * @param context A DOM HTMLElement to use as context
    */
  @JSName("$")
  def $(selector: String): ChocolateChipElementArray
  @JSName("$")
  def $(selector: String, context: ChocolateChipElementArray): ChocolateChipElementArray
  @JSName("$")
  def $(selector: String, context: HTMLElement): ChocolateChipElementArray
  @JSName("$")
  def $(selector: Document): ChocolateChipElementArray
  @JSName("$")
  def $(selector: Document, context: ChocolateChipElementArray): ChocolateChipElementArray
  @JSName("$")
  def $(selector: Document, context: HTMLElement): ChocolateChipElementArray
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param element A DOM element to wrap in an array.
    */
  @JSName("$")
  def $(selector: HTMLElement): ChocolateChipElementArray
  @JSName("$")
  def $(selector: HTMLElement, context: ChocolateChipElementArray): ChocolateChipElementArray
  @JSName("$")
  def $(selector: HTMLElement, context: HTMLElement): ChocolateChipElementArray
  /**
    * Accepts the document element and returns it wrapped in an array.
    *
    * @param document The document object.
    */
  @JSName("$")
  def $_Array(document: Document): js.Array[Document]
  @JSName("$")
  var $_Original: ChocolateChipStatic
  
  /**
    * If no argument is provided, return the document as a ChocolateChipElementArray.
    */
  def chocolatechipjs(): js.Array[Document]
  /**
    * Binds a function to be executed when the DOM has finished loading.
    *
    * @param callback A function to execute after the DOM is ready.
    */
  def chocolatechipjs(callback: js.Function0[js.Any]): Unit
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param elementArray An array of DOM elements to convert into a ChocolateChip Collection.
    */
  def chocolatechipjs(elementArray: ChocolateChipElementArray): ChocolateChipElementArray
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param selector A string containing a selector expression
    * @param context A DOM HTMLElement to use as context
    */
  def chocolatechipjs(selector: String): ChocolateChipElementArray
  def chocolatechipjs(selector: String, context: ChocolateChipElementArray): ChocolateChipElementArray
  def chocolatechipjs(selector: String, context: HTMLElement): ChocolateChipElementArray
  def chocolatechipjs(selector: Document): ChocolateChipElementArray
  def chocolatechipjs(selector: Document, context: ChocolateChipElementArray): ChocolateChipElementArray
  def chocolatechipjs(selector: Document, context: HTMLElement): ChocolateChipElementArray
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    *
    * @param element A DOM element to wrap in an array.
    */
  def chocolatechipjs(selector: HTMLElement): ChocolateChipElementArray
  def chocolatechipjs(selector: HTMLElement, context: ChocolateChipElementArray): ChocolateChipElementArray
  def chocolatechipjs(selector: HTMLElement, context: HTMLElement): ChocolateChipElementArray
  /**
    * Accepts the document element and returns it wrapped in an array.
    *
    * @param document The document object.
    */
  @JSName("chocolatechipjs")
  def chocolatechipjs_Array(document: Document): js.Array[Document]
  @JSName("chocolatechipjs")
  var chocolatechipjs_Original: ChocolateChipStatic
  
  var jsonp: js.Any
}
object Window {
  
  inline def apply($: ChocolateChipStatic, chocolatechipjs: ChocolateChipStatic, jsonp: js.Any): Window = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], chocolatechipjs = chocolatechipjs.asInstanceOf[js.Any], jsonp = jsonp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def set$(value: ChocolateChipStatic): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setChocolatechipjs(value: ChocolateChipStatic): Self = StObject.set(x, "chocolatechipjs", value.asInstanceOf[js.Any])
    
    inline def setJsonp(value: js.Any): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
  }
}

package typings
package backboneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `Anon_` extends js.Object {
  @JSName("$")
  var $_Original: jqueryLib.JQueryStatic = js.native
  var Collection: Anon_ClassProperties = js.native
  val Events: backboneLib.backboneMod.BackboneNs.Events = js.native
  /**
    * Helper to avoid code repetition in type declarations.
    * Backbone.Events cannot be extended, hence a separate abstract
    * class with a different name. Both classes and interfaces can
    * extend from this helper class to reuse the signatures.
    *
    * For class type declarations that already extend another base
    * class, and for actual class definitions, please see the
    * Events_* interfaces above.
    */
  var EventsMixin: org.scalablytyped.runtime.Instantiable0[backboneLib.backboneMod.BackboneNs.EventsMixin] = js.native
  var History: Anon_Started = js.native
  var Model: Anon_Attributes = js.native
  var ModelBase: org.scalablytyped.runtime.Instantiable0[backboneLib.backboneMod.BackboneNs.ModelBase] = js.native
  var Router: Anon_ClassPropertiesExtend = js.native
  var View: Anon_ClassPropertiesExtendOptions = js.native
  var emulateHTTP: scala.Boolean = js.native
  var emulateJSON: scala.Boolean = js.native
  var history: backboneLib.backboneMod.BackboneNs.History = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param element A DOM element to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Set the background color of the page to black.
  ```javascript
  $( document.body ).css( "background", "black" );
  ```
    */
  // NOTE: `HTMLSelectElement` is both an Element and an Array-Like Object but jQuery treats it as an Element.
  @JSName("$")
  def $(element: stdLib.HTMLSelectElement): jqueryLib.JQuery[stdLib.HTMLSelectElement] = js.native
  // HACK: This is the factory function returned when importing jQuery without a DOM. Declaring it separately breaks using the type parameter on JQueryStatic.
  // HACK: The discriminator parameter handles the edge case of passing a Window object to JQueryStatic. It doesn't actually exist on the factory function.
  @JSName("$")
  def $(window: stdLib.Window, discriminator: scala.Boolean): jqueryLib.JQueryStatic = js.native
  /**
    * Returns an empty jQuery set.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.4
    */
  // tslint:disable-next-line:no-unnecessary-generics
  @JSName("$")
  def $[TElement](): jqueryLib.JQuery[TElement] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    * @param callback The function to execute when the DOM is ready.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Execute the function when the DOM is ready to be used.
  ```javascript
  $(function() {
    // Document is ready
  });
  ```
    * @example ​ ````Use both the shortcut for $(document).ready() and the argument to write failsafe jQuery code using the $ alias, without relying on the global alias.
  ```javascript
  jQuery(function( $ ) {
    // Your code using failsafe $ alias here...
  });
  ```
    */
  // tslint:disable-next-line:no-unnecessary-generics unified-signatures
  @JSName("$")
  def $[TElement](callback: js.ThisFunction1[/* this */ stdLib.Document, /* $ */ this.type, scala.Unit]): jqueryLib.JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param element_elementArray _&#x40;param_ `element_elementArray`
    * <br>
    * * `element` — A DOM element to wrap in a jQuery object. <br>
    * * `elementArray` — An array containing a set of DOM elements to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Set the background color of the page to black.
  ```javascript
  $( document.body ).css( "background", "black" );
  ```
    * @example ​ ````Hide all the input elements within a form.
  ```javascript
  $( myForm.elements ).hide();
  ```
    */
  @JSName("$")
  def $[T /* <: stdLib.Element */](element_elementArray: T): jqueryLib.JQuery[T] = js.native
  @JSName("$")
  def $[T /* <: stdLib.Element */](element_elementArray: stdLib.ArrayLike[T]): jqueryLib.JQuery[T] = js.native
  @JSName("$")
  def $[TElement /* <: stdLib.HTMLElement */](html: jqueryLib.JQueryNs.htmlString, ownerDocument_attributes: jqueryLib.JQueryNs.PlainObject[_]): jqueryLib.JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param selection An existing jQuery object to clone.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  @JSName("$")
  def $[T](selection: jqueryLib.JQuery[T]): jqueryLib.JQuery[T] = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    * @param selector A string containing a selector expression
    * @param context A DOM Element, Document, or jQuery to use as context
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Find all p elements that are children of a div element and apply a border to them.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>jQuery demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <p>one</p>
  <div><p>two</p></div>
  <p>three</p>
  ​
  <script>
  $( "div > p" ).css( "border", "1px solid gray" );
  </script>
  </body>
  </html>
  ```
    * @example ​ ````Find all inputs of type radio within the first form in the document.
  ```javascript
  $( "input:radio", document.forms[ 0 ] );
  ```
    * @example ​ ````Find all div elements within an XML document from an Ajax response.
  ```javascript
  $( "div", xml.responseXML );
  ```
  ​
    */
  // tslint:disable-next-line:no-unnecessary-generics
  @JSName("$")
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector): jqueryLib.JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector, context: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector, context: stdLib.Document): jqueryLib.JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector, context: stdLib.Element): jqueryLib.JQuery[TElement] = js.native
  /**
    * Creates DOM elements on the fly from the provided string of raw HTML.
    * @param html _&#x40;param_ `html`
    * <br>
    * * `html (ownerDocument)` — A string of HTML to create on the fly. Note that this parses HTML, not XML. <br>
    * * `html (attributes)` — A string defining a single, standalone, HTML element (e.g. &lt;div/&gt; or &lt;div&gt;&lt;/div&gt;).
    * @param ownerDocument_attributes _&#x40;param_ `ownerDocument_attributes`
    * <br>
    * * `ownerDocument` — A document in which the new elements will be created. <br>
    * * `attributes` — An object of attributes, events, and methods to call on the newly-created element.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @since 1.4
    * @example ​ ````Create a div element (and all of its contents) dynamically and append it to the body element. Internally, an element is created and its innerHTML property set to the given markup.
  ```javascript
  $( "<div><p>Hello</p></div>" ).appendTo( "body" )
  ```
    * @example ​ ````Create some DOM elements.
  ```javascript
  $( "<div/>", {
    "class": "test",
    text: "Click me!",
    click: function() {
    $( this ).toggleClass( "test" );
    }
  })
    .appendTo( "body" );
  ```
    */
  // tslint:disable-next-line:no-unnecessary-generics
  @JSName("$")
  def $_TElementHTMLElement[TElement /* <: stdLib.HTMLElement */](html: jqueryLib.JQueryNs.htmlString): jqueryLib.JQuery[TElement] = js.native
  @JSName("$")
  def $_TElementHTMLElement[TElement /* <: stdLib.HTMLElement */](html: jqueryLib.JQueryNs.htmlString, ownerDocument_attributes: stdLib.Document): jqueryLib.JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param object A plain object to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  @JSName("$")
  def $_TPlainObject[T /* <: jqueryLib.JQueryNs.PlainObject[_] */](`object`: T): jqueryLib.JQuery[T] = js.native
  def ajax(): jqueryLib.JQueryXHR = js.native
  def ajax(options: jqueryLib.JQueryAjaxSettings): jqueryLib.JQueryXHR = js.native
  // Utility
  def noConflict(): /* import warning: ImportType.apply Failed type conversion: typeof Backbone */ js.Any = js.native
  def sync(
    method: java.lang.String,
    model: backboneLib.backboneMod.BackboneNs.Collection[backboneLib.backboneMod.BackboneNs.Model]
  ): js.Any = js.native
  def sync(
    method: java.lang.String,
    model: backboneLib.backboneMod.BackboneNs.Collection[backboneLib.backboneMod.BackboneNs.Model],
    options: jqueryLib.JQueryAjaxSettings
  ): js.Any = js.native
  // SYNC
  def sync(method: java.lang.String, model: backboneLib.backboneMod.BackboneNs.Model): js.Any = js.native
  def sync(
    method: java.lang.String,
    model: backboneLib.backboneMod.BackboneNs.Model,
    options: jqueryLib.JQueryAjaxSettings
  ): js.Any = js.native
}


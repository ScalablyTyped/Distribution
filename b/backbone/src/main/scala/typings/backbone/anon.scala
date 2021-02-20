package typings.backbone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.backbone.mod.Collection
import typings.backbone.mod.CombinedModelConstructorOptions
import typings.backbone.mod.History_
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.RouterOptions
import typings.backbone.mod.ViewOptions
import typings.jquery.JQuery
import typings.jquery.JQuery.PlainObject
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.htmlString
import typings.jquery.JQueryAjaxSettings
import typings.jquery.JQueryStatic
import typings.jquery.JQueryXHR
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofCollection extends StObject {
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    /* static member */
    def extend(properties: js.Any): js.Any = js.native
    def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
  }
  
  @js.native
  trait TypeofHistory extends StObject {
    
    /* static member */
    var started: Boolean = js.native
  }
  object TypeofHistory {
    
    @scala.inline
    def apply(started: Boolean): TypeofHistory = {
      val __obj = js.Dynamic.literal(started = started.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofHistory]
    }
    
    @scala.inline
    implicit class TypeofHistoryMutableBuilder[Self <: TypeofHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofModel extends StObject {
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    /* static member */
    def extend(properties: js.Any): js.Any = js.native
    def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
  }
  
  @js.native
  trait TypeofRouter extends StObject {
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    /* static member */
    def extend(properties: js.Any): js.Any = js.native
    def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
  }
  
  @js.native
  trait TypeofView extends StObject {
    
    /**
      * Do not use, prefer TypeScript's extend functionality.
      **/
    /* static member */
    def extend(properties: js.Any): js.Any = js.native
    def extend(properties: js.Any, classProperties: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Typeofbackbone extends StObject {
    
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
    def $(element: HTMLSelectElement): JQuery[HTMLSelectElement] = js.native
    // HACK: This is the factory function returned when importing jQuery without a DOM. Declaring it separately breaks using the type parameter on JQueryStatic.
    // HACK: The discriminator parameter handles the edge case of passing a Window object to JQueryStatic. It doesn't actually exist on the factory function.
    @JSName("$")
    def $(window: Window, discriminator: Boolean): JQueryStatic = js.native
    /**
      * Returns an empty jQuery set.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.4
      */
    // tslint:disable-next-line:no-unnecessary-generics
    @JSName("$")
    def $[TElement](): JQuery[TElement] = js.native
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
    def $[TElement](callback: js.ThisFunction1[/* this */ Document, /* $ */ this.type, Unit]): JQuery[TElement] = js.native
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
    def $[T /* <: Element */](element_elementArray: T): JQuery[T] = js.native
    @JSName("$")
    def $[T /* <: Element */](element_elementArray: ArrayLike[T]): JQuery[T] = js.native
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
    def $[TElement /* <: HTMLElement */](html: htmlString): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: PlainObject[_]): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: Document): JQuery[TElement] = js.native
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param selection An existing jQuery object to clone.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      */
    @JSName("$")
    def $[T](selection: JQuery[T]): JQuery[T] = js.native
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: JQuery[HTMLElement]): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: Selector): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: Element): JQuery[TElement] = js.native
    @JSName("$")
    var $_Original: JQueryStatic = js.native
    /**
      * Accepts a string containing a CSS selector which is then used to match a set of elements.
      * @param selector A string containing a selector expression
      * @param context A DOM Element, Document, Selector or jQuery to use as context
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
    def $_TElement_Element[TElement /* <: Element */](selector: Selector): JQuery[TElement] = js.native
    @JSName("$")
    def $_TElement_Element[TElement /* <: Element */](selector: Selector, context: Document): JQuery[TElement] = js.native
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param object A plain object to wrap in a jQuery object.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      */
    @JSName("$")
    def $_T_PlainObjectWildcard[T /* <: PlainObject[_] */](`object`: T): JQuery[T] = js.native
    
    var Collection: (Instantiable2[
        /* models */ js.UndefOr[
          js.Array[
            (/* import warning: RewrittenClass.unapply cls was tparam TModel */ js.Any) | js.Object
          ]
        ], 
        /* options */ js.UndefOr[js.Any], 
        typings.backbone.mod.Collection[Model[js.Any, ModelSetOptions, js.Object]]
      ]) with TypeofCollection = js.native
    
    val Events: typings.backbone.mod.Events = js.native
    
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
    var EventsMixin: Instantiable0[typings.backbone.mod.EventsMixin] = js.native
    
    var History: Instantiable0[History_] with TypeofHistory = js.native
    
    /**
      * E - Extensions to the model constructor options. You can accept additional constructor options
      * by listing them in the E parameter.
      */
    var Model: (Instantiable2[
        /* attributes */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
        /* options */ js.UndefOr[
          CombinedModelConstructorOptions[
            /* import warning: RewrittenClass.unapply cls was tparam E */ js.Any, 
            typings.backbone.mod.Model[js.Any, ModelSetOptions, js.Object]
          ]
        ], 
        typings.backbone.mod.Model[js.Object, js.Object, js.Object]
      ]) with TypeofModel = js.native
    
    var ModelBase: Instantiable0[typings.backbone.mod.ModelBase] = js.native
    
    var Router: (Instantiable1[/* options */ js.UndefOr[RouterOptions], typings.backbone.mod.Router]) with TypeofRouter = js.native
    
    var View: (Instantiable1[
        /* options */ js.UndefOr[
          ViewOptions[/* import warning: RewrittenClass.unapply cls was tparam TModel */ js.Any]
        ], 
        typings.backbone.mod.View[Model[js.Any, ModelSetOptions, js.Object]]
      ]) with TypeofView = js.native
    
    def ajax(): JQueryXHR = js.native
    def ajax(options: JQueryAjaxSettings): JQueryXHR = js.native
    
    var emulateHTTP: Boolean = js.native
    
    var emulateJSON: Boolean = js.native
    
    var history: History_ = js.native
    
    // Utility
    def noConflict(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Backbone */ js.Any = js.native
    
    def sync(method: String, model: Collection[Model[_, ModelSetOptions, js.Object]]): js.Any = js.native
    def sync(
      method: String,
      model: Collection[Model[_, ModelSetOptions, js.Object]],
      options: JQueryAjaxSettings
    ): js.Any = js.native
    // SYNC
    def sync(method: String, model: Model[_, ModelSetOptions, js.Object]): js.Any = js.native
    def sync(method: String, model: Model[_, ModelSetOptions, js.Object], options: JQueryAjaxSettings): js.Any = js.native
  }
}

package typings.backboneMarionette.mod

import typings.std.DocumentFragment
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone.marionette", "TemplateCache")
@js.native
open class TemplateCache ()
  extends StObject
     with DomMixin {
  
  /* CompleteClass */
  var appendChildren: Any = js.native
  /**
    * Takes the DOM node el and appends the rendered children to the end of
    * the element's contents.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param children is jQuery.append argument: http://api.jquery.com/append/
    */
  @JSName("appendChildren")
  def appendChildren_MTemplateCache(el: Any, children: Any): Unit = js.native
  
  /* CompleteClass */
  var beforeEl: Any = js.native
  /**
    * Add sibling to the DOM immediately before the DOM node el. The
    * sibling will be at the same level as el.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param sibling is jQuery.before argument: http://api.jquery.com/before/
    */
  @JSName("beforeEl")
  def beforeEl_MTemplateCache(el: Any, sibling: Any): Unit = js.native
  
  /**
    * The default template compilation passes the results from loadTemplate to
    * the compileTemplate function, which returns an underscore.js compiled
    * template function. When overriding compileTemplate remember that it
    * must return a function which takes an object of parameters and values
    * and returns a formatted HTML string.
    */
  def compileTemplate(rawTemplate: Any): Any = js.native
  def compileTemplate(rawTemplate: Any, options: Any): Any = js.native
  
  /* CompleteClass */
  var createBuffer: Any = js.native
  /**
    * Returns a new HTML DOM node instance. The resulting node can be
    * passed into the other DOM functions.
    */
  @JSName("createBuffer")
  def createBuffer_MTemplateCache(): DocumentFragment = js.native
  
  /* CompleteClass */
  var detachContents: Any = js.native
  /**
    * Remove the inner contents of el from the DOM while leaving el itself
    * in the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachContents")
  def detachContents_MTemplateCache(el: Any): Unit = js.native
  
  /* CompleteClass */
  var detachEl: Any = js.native
  /**
    * Detach el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachEl")
  def detachEl_MTemplateCache(el: Any): Unit = js.native
  
  /* CompleteClass */
  var findEls: Any = js.native
  /**
    * Lookup the selector string within the DOM node for context. The
    * optional context argument will come in as a DOM Node reference to run
    * the selector search. If context hasn't been set, then findEls should
    * search the entire document for the selector.
    * @param selector is a jQuery argument: https://api.jquery.com/jQuery/
    * @param context is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("findEls")
  def findEls_MTemplateCache(selector: Any, context: Any): Unit = js.native
  
  /**
    * Initial method to load the template. (undocumented)
    */
  def load(): Any = js.native
  def load(options: Any): Any = js.native
  
  /**
    * The default template retrieval is to select the template contents from the
    * DOM using jQuery. If you wish to change the way this works, you can
    * override this method on the TemplateCache object.
    * Note that the options argument seems to be unused in the source.
    */
  def loadTemplate(templateId: String): Any = js.native
  def loadTemplate(templateId: String, options: Any): Any = js.native
  
  /* CompleteClass */
  var removeEl: Any = js.native
  /**
    * Remove el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("removeEl")
  def removeEl_MTemplateCache(el: Any): Unit = js.native
  
  /* CompleteClass */
  var replaceEl: Any = js.native
  /**
    * Remove oldEl from the DOM and put newEl in its place.
    */
  @JSName("replaceEl")
  def replaceEl_MTemplateCache(newEl: HTMLElement, oldEL: HTMLElement): Unit = js.native
  
  /* CompleteClass */
  var setInnerContent: Any = js.native
  /**
    * Replace the contents of el with the HTML string of html. Unlike other
    * DOM functions, this takes a literal string for its second argument.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param html is a jQuery.html argument: https://api.jquery.com/html/
    */
  @JSName("setInnerContent")
  def setInnerContent_MTemplateCache(el: Any, html: String): Unit = js.native
}
/* static members */
object TemplateCache {
  
  @JSImport("backbone.marionette", "TemplateCache")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * You can clear one or more, or all items from the cache using the clear
    * method. Clearing a template from the cache will force it to re-load
    * from the DOM the next time it is retrieved.
    * @param  the templateId used for loading / caching of the templates to clear. If none specified, all templates will be cleared from the cache.
    */
  inline def clear(templateId: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(templateId.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /**
    * To use the TemplateCache, call the get method on TemplateCache
    * directly. Internally, instances of the TemplateCache class will be
    * created and stored but you do not have to manually create these
    * instances yourself. get will return a compiled template function.
    */
  inline def get(templateId: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(templateId.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def get(templateId: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(templateId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}

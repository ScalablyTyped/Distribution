package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "TemplateCache")
@js.native
class TemplateCache () extends DomMixin {
  /* CompleteClass */
  override var appendChildren: js.Any = js.native
  /* CompleteClass */
  override var beforeEl: js.Any = js.native
  /* CompleteClass */
  override var createBuffer: js.Any = js.native
  /* CompleteClass */
  override var detachContents: js.Any = js.native
  /* CompleteClass */
  override var detachEl: js.Any = js.native
  /* CompleteClass */
  override var findEls: js.Any = js.native
  /* CompleteClass */
  override var removeEl: js.Any = js.native
  /* CompleteClass */
  override var replaceEl: js.Any = js.native
  /* CompleteClass */
  override var setInnerContent: js.Any = js.native
  /**
    * Takes the DOM node el and appends the rendered children to the end of
    * the element's contents.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param children is jQuery.append argument: http://api.jquery.com/append/
    */
  @JSName("appendChildren")
  def appendChildren_MTemplateCache(el: js.Any, children: js.Any): scala.Unit = js.native
  /**
    * Add sibling to the DOM immediately before the DOM node el. The
    * sibling will be at the same level as el.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param sibling is jQuery.before argument: http://api.jquery.com/before/
    */
  @JSName("beforeEl")
  def beforeEl_MTemplateCache(el: js.Any, sibling: js.Any): scala.Unit = js.native
  /**
    * The default template compilation passes the results from loadTemplate to
    * the compileTemplate function, which returns an underscore.js compiled
    * template function. When overriding compileTemplate remember that it
    * must return a function which takes an object of parameters and values
    * and returns a formatted HTML string.
    */
  def compileTemplate(rawTemplate: js.Any): js.Any = js.native
  def compileTemplate(rawTemplate: js.Any, options: js.Any): js.Any = js.native
  /**
    * Returns a new HTML DOM node instance. The resulting node can be
    * passed into the other DOM functions.
    */
  @JSName("createBuffer")
  def createBuffer_MTemplateCache(): stdLib.DocumentFragment = js.native
  /**
    * Remove the inner contents of el from the DOM while leaving el itself
    * in the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachContents")
  def detachContents_MTemplateCache(el: js.Any): scala.Unit = js.native
  /**
    * Detach el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("detachEl")
  def detachEl_MTemplateCache(el: js.Any): scala.Unit = js.native
  /**
    * Lookup the selector string within the DOM node for context. The
    * optional context argument will come in as a DOM Node reference to run
    * the selector search. If context hasn't been set, then findEls should
    * search the entire document for the selector.
    * @param selector is a jQuery argument: https://api.jquery.com/jQuery/
    * @param context is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("findEls")
  def findEls_MTemplateCache(selector: js.Any, context: js.Any): scala.Unit = js.native
  /**
    * Initial method to load the template. (undocumented)
    */
  def load(): js.Any = js.native
  def load(options: js.Any): js.Any = js.native
  /**
    * The default template retrieval is to select the template contents from the
    * DOM using jQuery. If you wish to change the way this works, you can
    * override this method on the TemplateCache object.
    * Note that the options argument seems to be unused in the source.
    */
  def loadTemplate(templateId: java.lang.String): js.Any = js.native
  def loadTemplate(templateId: java.lang.String, options: js.Any): js.Any = js.native
  /**
    * Remove el from the DOM.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    */
  @JSName("removeEl")
  def removeEl_MTemplateCache(el: js.Any): scala.Unit = js.native
  /**
    * Remove oldEl from the DOM and put newEl in its place.
    */
  @JSName("replaceEl")
  def replaceEl_MTemplateCache(newEl: stdLib.HTMLElement, oldEL: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Replace the contents of el with the HTML string of html. Unlike other
    * DOM functions, this takes a literal string for its second argument.
    * @param el is a jQuery argument: https://api.jquery.com/jQuery/
    * @param html is a jQuery.html argument: https://api.jquery.com/html/
    */
  @JSName("setInnerContent")
  def setInnerContent_MTemplateCache(el: js.Any, html: java.lang.String): scala.Unit = js.native
}

@JSImport("backbone.marionette", "TemplateCache")
@js.native
object TemplateCache extends js.Object {
  /**
    * You can clear one or more, or all items from the cache using the clear
    * method. Clearing a template from the cache will force it to re-load
    * from the DOM the next time it is retrieved.
    * @param  the templateId used for loading / caching of the templates to clear. If none specified, all templates will be cleared from the cache.
    */
  def clear(templateId: java.lang.String*): scala.Unit = js.native
  /**
    * To use the TemplateCache, call the get method on TemplateCache
    * directly. Internally, instances of the TemplateCache class will be
    * created and stored but you do not have to manually create these
    * instances yourself. get will return a compiled template function.
    */
  def get(templateId: java.lang.String): js.Any = js.native
  def get(templateId: java.lang.String, options: js.Any): js.Any = js.native
}


package typings.cssSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[Node, ElementNode /* <: Node */] extends js.Object {
  
  /**
    * The adapter to use when interacting with the backing DOM structure. By
    * default it uses the `domutils` module.
    */
  var adapter: js.UndefOr[Adapter[Node, ElementNode]] = js.native
  
  /**
    * Allow css-select to cache results for some selectors, sometimes greatly
    * improving querying performance. Disable this if your document can
    * change in between queries with the same compiled selector.
    * Defaults to `true`.
    */
  var cacheResults: js.UndefOr[Boolean] = js.native
  
  /**
    * The context of the current query. Used to limit the scope of searches.
    * Can be matched directly using the `:scope` pseudo-selector.
    */
  var context: js.UndefOr[ElementNode | js.Array[ElementNode]] = js.native
  
  /**
    * The last function in the stack, will be called with the last element
    * that's looked at.
    */
  var rootFunc: js.UndefOr[js.Function1[/* element */ ElementNode, Boolean]] = js.native
  
  /**
    * Limits the module to only use CSS3 selectors. Default: false.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * When enabled, tag names will be case-sensitive. Default: false.
    */
  var xmlMode: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[Node, ElementNode /* <: Node */](): Options[Node, ElementNode] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Node, ElementNode]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], Node, ElementNode /* <: Node */] (val x: Self with (Options[Node, ElementNode])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdapter(value: Adapter[Node, ElementNode]): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setCacheResults(value: Boolean): Self = this.set("cacheResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheResults: Self = this.set("cacheResults", js.undefined)
    
    @scala.inline
    def setContextVarargs(value: ElementNode*): Self = this.set("context", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: ElementNode | js.Array[ElementNode]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setRootFunc(value: /* element */ ElementNode => Boolean): Self = this.set("rootFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRootFunc: Self = this.set("rootFunc", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setXmlMode(value: Boolean): Self = this.set("xmlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlMode: Self = this.set("xmlMode", js.undefined)
  }
}

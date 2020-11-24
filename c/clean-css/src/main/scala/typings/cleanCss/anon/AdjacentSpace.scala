package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjacentSpace extends js.Object {
  
  /**
    * Controls extra space before `nav` element; defaults to `false`
    */
  var adjacentSpace: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls removal of IE7 selector hacks, e.g. `*+html...`; defaults to `true`
    */
  var ie7Hack: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls maximum number of selectors in a single rule (since 4.1.0); defaults to `8191`
    */
  var mergeLimit: Double = js.native
  
  /**
    * Controls a whitelist of mergeable pseudo classes; defaults to `[':active', ...]`
    */
  var mergeablePseudoClasses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Controls a whitelist of mergeable pseudo elements; defaults to `['::after', ...]`
    */
  var mergeablePseudoElements: js.Array[String] = js.native
  
  /**
    * Controls merging of rules with multiple pseudo classes / elements (since 4.1.0); defaults to `true`
    */
  var multiplePseudoMerging: Boolean = js.native
}
object AdjacentSpace {
  
  @scala.inline
  def apply(mergeLimit: Double, mergeablePseudoElements: js.Array[String], multiplePseudoMerging: Boolean): AdjacentSpace = {
    val __obj = js.Dynamic.literal(mergeLimit = mergeLimit.asInstanceOf[js.Any], mergeablePseudoElements = mergeablePseudoElements.asInstanceOf[js.Any], multiplePseudoMerging = multiplePseudoMerging.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjacentSpace]
  }
  
  @scala.inline
  implicit class AdjacentSpaceOps[Self <: AdjacentSpace] (val x: Self) extends AnyVal {
    
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
    def setMergeLimit(value: Double): Self = this.set("mergeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeablePseudoElementsVarargs(value: String*): Self = this.set("mergeablePseudoElements", js.Array(value :_*))
    
    @scala.inline
    def setMergeablePseudoElements(value: js.Array[String]): Self = this.set("mergeablePseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplePseudoMerging(value: Boolean): Self = this.set("multiplePseudoMerging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjacentSpace(value: Boolean): Self = this.set("adjacentSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjacentSpace: Self = this.set("adjacentSpace", js.undefined)
    
    @scala.inline
    def setIe7Hack(value: Boolean): Self = this.set("ie7Hack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIe7Hack: Self = this.set("ie7Hack", js.undefined)
    
    @scala.inline
    def setMergeablePseudoClassesVarargs(value: String*): Self = this.set("mergeablePseudoClasses", js.Array(value :_*))
    
    @scala.inline
    def setMergeablePseudoClasses(value: js.Array[String]): Self = this.set("mergeablePseudoClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeablePseudoClasses: Self = this.set("mergeablePseudoClasses", js.undefined)
  }
}

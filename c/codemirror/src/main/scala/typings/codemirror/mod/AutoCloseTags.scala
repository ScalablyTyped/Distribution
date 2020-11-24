package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCloseTags extends js.Object {
  
  /**
    * An array of tag names that should not be autoclosed. (default is empty tags for HTML, none for XML)
    */
  var dontCloseTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of XML tag names that should be autoclosed with '/>'. (default is none)
    */
  var emptyTags: js.Array[String] = js.native
  
  /**
    * An array of tag names that should, when opened, cause a
    * blank line to be added inside the tag, and the blank line and
    * closing line to be indented. (default is block tags for HTML, none for XML)
    */
  var indentTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether to autoclose when the '/' of a closing tag is typed. (default true)
    */
  var whenClosing: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to autoclose the tag when the final '>' of an opening tag is typed. (default true)
    */
  var whenOpening: js.UndefOr[Boolean] = js.native
}
object AutoCloseTags {
  
  @scala.inline
  def apply(emptyTags: js.Array[String]): AutoCloseTags = {
    val __obj = js.Dynamic.literal(emptyTags = emptyTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCloseTags]
  }
  
  @scala.inline
  implicit class AutoCloseTagsOps[Self <: AutoCloseTags] (val x: Self) extends AnyVal {
    
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
    def setEmptyTagsVarargs(value: String*): Self = this.set("emptyTags", js.Array(value :_*))
    
    @scala.inline
    def setEmptyTags(value: js.Array[String]): Self = this.set("emptyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontCloseTagsVarargs(value: String*): Self = this.set("dontCloseTags", js.Array(value :_*))
    
    @scala.inline
    def setDontCloseTags(value: js.Array[String]): Self = this.set("dontCloseTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontCloseTags: Self = this.set("dontCloseTags", js.undefined)
    
    @scala.inline
    def setIndentTagsVarargs(value: String*): Self = this.set("indentTags", js.Array(value :_*))
    
    @scala.inline
    def setIndentTags(value: js.Array[String]): Self = this.set("indentTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentTags: Self = this.set("indentTags", js.undefined)
    
    @scala.inline
    def setWhenClosing(value: Boolean): Self = this.set("whenClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenClosing: Self = this.set("whenClosing", js.undefined)
    
    @scala.inline
    def setWhenOpening(value: Boolean): Self = this.set("whenOpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenOpening: Self = this.set("whenOpening", js.undefined)
  }
}

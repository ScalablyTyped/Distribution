package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCloseTags extends StObject {
  
  /**
    * An array of tag names that should not be autoclosed. (default is empty tags for HTML, none for XML)
    */
  var dontCloseTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of XML tag names that should be autoclosed with '/>'. (default is none)
    */
  var emptyTags: js.Array[String]
  
  /**
    * An array of tag names that should, when opened, cause a
    * blank line to be added inside the tag, and the blank line and
    * closing line to be indented. (default is block tags for HTML, none for XML)
    */
  var indentTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to autoclose when the '/' of a closing tag is typed. (default true)
    */
  var whenClosing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to autoclose the tag when the final '>' of an opening tag is typed. (default true)
    */
  var whenOpening: js.UndefOr[Boolean] = js.undefined
}
object AutoCloseTags {
  
  @scala.inline
  def apply(emptyTags: js.Array[String]): AutoCloseTags = {
    val __obj = js.Dynamic.literal(emptyTags = emptyTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCloseTags]
  }
  
  @scala.inline
  implicit class AutoCloseTagsMutableBuilder[Self <: AutoCloseTags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDontCloseTags(value: js.Array[String]): Self = StObject.set(x, "dontCloseTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontCloseTagsUndefined: Self = StObject.set(x, "dontCloseTags", js.undefined)
    
    @scala.inline
    def setDontCloseTagsVarargs(value: String*): Self = StObject.set(x, "dontCloseTags", js.Array(value :_*))
    
    @scala.inline
    def setEmptyTags(value: js.Array[String]): Self = StObject.set(x, "emptyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTagsVarargs(value: String*): Self = StObject.set(x, "emptyTags", js.Array(value :_*))
    
    @scala.inline
    def setIndentTags(value: js.Array[String]): Self = StObject.set(x, "indentTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentTagsUndefined: Self = StObject.set(x, "indentTags", js.undefined)
    
    @scala.inline
    def setIndentTagsVarargs(value: String*): Self = StObject.set(x, "indentTags", js.Array(value :_*))
    
    @scala.inline
    def setWhenClosing(value: Boolean): Self = StObject.set(x, "whenClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenClosingUndefined: Self = StObject.set(x, "whenClosing", js.undefined)
    
    @scala.inline
    def setWhenOpening(value: Boolean): Self = StObject.set(x, "whenOpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenOpeningUndefined: Self = StObject.set(x, "whenOpening", js.undefined)
  }
}

package typings.codemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkDecorationSpec
  extends StObject
     with /**
  Other properties are allowed.
  */
/* other */ StringDictionary[Any] {
  
  /**
    Add attributes to the DOM elements that hold the text in the
    marked range.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    Shorthand for `{attributes: {class: value}}`.
    */
  var `class`: js.UndefOr[String] = js.undefined
  
  /**
    Whether the mark covers its start and end position or not. This
    influences whether content inserted at those positions becomes
    part of the mark. Defaults to false.
    */
  var inclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    Whether the end should be inclusive.
    */
  var inclusiveEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    Specify whether the start position of the marked range should be
    inclusive. Overrides `inclusive`, when both are present.
    */
  var inclusiveStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    Add a wrapping element around the text in the marked range. Note
    that there will not necessarily be a single element covering the
    entire range—other decorations with lower precedence might split
    this one if they partially overlap it, and line breaks always
    end decoration elements.
    */
  var tagName: js.UndefOr[String] = js.undefined
}
object MarkDecorationSpec {
  
  inline def apply(): MarkDecorationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkDecorationSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkDecorationSpec] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    inline def setInclusiveEnd(value: Boolean): Self = StObject.set(x, "inclusiveEnd", value.asInstanceOf[js.Any])
    
    inline def setInclusiveEndUndefined: Self = StObject.set(x, "inclusiveEnd", js.undefined)
    
    inline def setInclusiveStart(value: Boolean): Self = StObject.set(x, "inclusiveStart", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartUndefined: Self = StObject.set(x, "inclusiveStart", js.undefined)
    
    inline def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}

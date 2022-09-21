package typings.codemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineDecorationSpec
  extends StObject
     with /**
  Other properties are allowed.
  */
/* other */ StringDictionary[Any] {
  
  /**
    DOM attributes to add to the element wrapping the line.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    Shorthand for `{attributes: {class: value}}`.
    */
  var `class`: js.UndefOr[String] = js.undefined
}
object LineDecorationSpec {
  
  inline def apply(): LineDecorationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDecorationSpec]
  }
  
  extension [Self <: LineDecorationSpec](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
  }
}

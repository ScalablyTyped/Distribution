package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.UndefOr[
    js.Array[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element['toJSON'] */ js.Any
      ]
    ]
  ] = js.undefined
  
  var name: String
}
object Children {
  
  inline def apply(name: String): Children = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(
      value: js.Array[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element['toJSON'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(
      value: (ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.Element['toJSON'] */ js.Any
        ])*
    ): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

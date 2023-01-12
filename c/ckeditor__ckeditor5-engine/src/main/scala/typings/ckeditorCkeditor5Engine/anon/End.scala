package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/position.default['toJSON'] */ js.Any
  ]
  
  var start: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/position.default['toJSON'] */ js.Any
  ]
}
object End {
  
  inline def apply(
    end: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/position.default['toJSON'] */ js.Any
    ],
    start: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/position.default['toJSON'] */ js.Any
    ]
  ): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    inline def setEnd(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/position.default['toJSON'] */ js.Any
        ]
    ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/position.default['toJSON'] */ js.Any
        ]
    ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelPositionMod.PositionStickiness
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: js.Array[Double]
  
  var root: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default['toJSON'] */ js.Any
  ]
  
  var stickiness: PositionStickiness
}
object Path {
  
  inline def apply(
    path: js.Array[Double],
    root: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default['toJSON'] */ js.Any
    ],
    stickiness: PositionStickiness
  ): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stickiness = stickiness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRoot(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default['toJSON'] */ js.Any
        ]
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setStickiness(value: PositionStickiness): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
  }
}

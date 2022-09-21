package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSpan extends StObject {
  
  /**
    * If DocumentSpan.textSpan is the span for name of the declaration,
    * then this is the span for relevant declaration
    */
  var contextSpan: js.UndefOr[TextSpan] = js.undefined
  
  var fileName: java.lang.String
  
  var originalContextSpan: js.UndefOr[TextSpan] = js.undefined
  
  var originalFileName: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * If the span represents a location that was remapped (e.g. via a .d.ts.map file),
    * then the original filename and span will be specified here
    */
  var originalTextSpan: js.UndefOr[TextSpan] = js.undefined
  
  var textSpan: TextSpan
}
object DocumentSpan {
  
  inline def apply(fileName: java.lang.String, textSpan: TextSpan): DocumentSpan = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSpan]
  }
  
  extension [Self <: DocumentSpan](x: Self) {
    
    inline def setContextSpan(value: TextSpan): Self = StObject.set(x, "contextSpan", value.asInstanceOf[js.Any])
    
    inline def setContextSpanUndefined: Self = StObject.set(x, "contextSpan", js.undefined)
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setOriginalContextSpan(value: TextSpan): Self = StObject.set(x, "originalContextSpan", value.asInstanceOf[js.Any])
    
    inline def setOriginalContextSpanUndefined: Self = StObject.set(x, "originalContextSpan", js.undefined)
    
    inline def setOriginalFileName(value: java.lang.String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
    
    inline def setOriginalFileNameUndefined: Self = StObject.set(x, "originalFileName", js.undefined)
    
    inline def setOriginalTextSpan(value: TextSpan): Self = StObject.set(x, "originalTextSpan", value.asInstanceOf[js.Any])
    
    inline def setOriginalTextSpanUndefined: Self = StObject.set(x, "originalTextSpan", js.undefined)
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}

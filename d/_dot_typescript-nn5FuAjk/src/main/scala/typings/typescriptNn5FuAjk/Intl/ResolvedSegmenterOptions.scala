package typings.typescriptNn5FuAjk.Intl

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.grapheme
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.sentence
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedSegmenterOptions extends StObject {
  
  var granularity: grapheme | word | sentence
  
  var locale: String
}
object ResolvedSegmenterOptions {
  
  inline def apply(granularity: grapheme | word | sentence, locale: String): ResolvedSegmenterOptions = {
    val __obj = js.Dynamic.literal(granularity = granularity.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedSegmenterOptions]
  }
  
  extension [Self <: ResolvedSegmenterOptions](x: Self) {
    
    inline def setGranularity(value: grapheme | word | sentence): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}

package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapSource extends StObject {
  
  var fileName: java.lang.String
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
  
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.undefined
  
  var text: java.lang.String
}
object SourceMapSource {
  
  inline def apply(
    fileName: java.lang.String,
    getLineAndCharacterOfPosition: Double => LineAndCharacter,
    text: java.lang.String
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSource]
  }
  
  extension [Self <: SourceMapSource](x: Self) {
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = StObject.set(x, "getLineAndCharacterOfPosition", js.Any.fromFunction1(value))
    
    inline def setSkipTrivia(value: /* pos */ Double => Double): Self = StObject.set(x, "skipTrivia", js.Any.fromFunction1(value))
    
    inline def setSkipTriviaUndefined: Self = StObject.set(x, "skipTrivia", js.undefined)
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

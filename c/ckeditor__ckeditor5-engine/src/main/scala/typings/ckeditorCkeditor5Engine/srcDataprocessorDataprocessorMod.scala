package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marked
import typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
import typings.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDataprocessorDataprocessorMod {
  
  trait DataProcessor extends StObject {
    
    def registerRawContentMatcher(pattern: MatcherPattern): Unit
    
    def toData(fragment: default): String
    
    def toView(data: String): default | typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null
    
    def useFillerType(`type`: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked): Unit
  }
  object DataProcessor {
    
    inline def apply(
      registerRawContentMatcher: MatcherPattern => Unit,
      toData: default => String,
      toView: String => default | typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null,
      useFillerType: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked => Unit
    ): DataProcessor = {
      val __obj = js.Dynamic.literal(registerRawContentMatcher = js.Any.fromFunction1(registerRawContentMatcher), toData = js.Any.fromFunction1(toData), toView = js.Any.fromFunction1(toView), useFillerType = js.Any.fromFunction1(useFillerType))
      __obj.asInstanceOf[DataProcessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataProcessor] (val x: Self) extends AnyVal {
      
      inline def setRegisterRawContentMatcher(value: MatcherPattern => Unit): Self = StObject.set(x, "registerRawContentMatcher", js.Any.fromFunction1(value))
      
      inline def setToData(value: default => String): Self = StObject.set(x, "toData", js.Any.fromFunction1(value))
      
      inline def setToView(value: String => default | typings.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null): Self = StObject.set(x, "toView", js.Any.fromFunction1(value))
      
      inline def setUseFillerType(value: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked => Unit): Self = StObject.set(x, "useFillerType", js.Any.fromFunction1(value))
    }
  }
}

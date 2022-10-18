package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConversionConversionhelpersMod {
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-engine/src/conversion/conversionhelpers", JSImport.Default)
  @js.native
  open class default[T /* <: typings.ckeditorCkeditor5Engine.srcConversionDowncasthelpersMod.default | typings.ckeditorCkeditor5Engine.srcConversionUpcasthelpersMod.default */] protected ()
    extends StObject
       with ConversionHelpers[T] {
    def this(dispatchers: /* import warning: importer.ImportType#apply Failed type conversion: T extends @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcasthelpers.default ? std.Array<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.default<{}>> : std.Array<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.default> */ js.Any) = this()
    
    /* CompleteClass */
    override def add(
      conversionHelper: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcasthelpers.default ? @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.default<{}> : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.default */ /* dispatcher */ js.Any, 
          Unit
        ]
    ): this.type = js.native
  }
  
  trait ConversionHelpers[T /* <: typings.ckeditorCkeditor5Engine.srcConversionDowncasthelpersMod.default | typings.ckeditorCkeditor5Engine.srcConversionUpcasthelpersMod.default */] extends StObject {
    
    def add(
      conversionHelper: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcasthelpers.default ? @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.default<{}> : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.default */ /* dispatcher */ js.Any, 
          Unit
        ]
    ): this.type
  }
  object ConversionHelpers {
    
    inline def apply[T /* <: typings.ckeditorCkeditor5Engine.srcConversionDowncasthelpersMod.default | typings.ckeditorCkeditor5Engine.srcConversionUpcasthelpersMod.default */](
      add: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcasthelpers.default ? @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.default<{}> : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.default */ /* dispatcher */ js.Any, 
          Unit
        ] => ConversionHelpers[T]
    ): ConversionHelpers[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
      __obj.asInstanceOf[ConversionHelpers[T]]
    }
    
    extension [Self <: ConversionHelpers[?], T /* <: typings.ckeditorCkeditor5Engine.srcConversionDowncasthelpersMod.default | typings.ckeditorCkeditor5Engine.srcConversionUpcasthelpersMod.default */](x: Self & ConversionHelpers[T]) {
      
      inline def setAdd(
        value: js.Function1[
              /* import warning: importer.ImportType#apply Failed type conversion: T extends @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcasthelpers.default ? @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/downcastdispatcher.default<{}> : @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/conversion/upcastdispatcher.default */ /* dispatcher */ js.Any, 
              Unit
            ] => ConversionHelpers[T]
      ): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    }
  }
}

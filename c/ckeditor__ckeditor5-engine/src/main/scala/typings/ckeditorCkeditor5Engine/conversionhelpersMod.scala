package typings.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionhelpersMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/conversionhelpers", JSImport.Default)
  @js.native
  abstract class default[T /* <: typings.ckeditorCkeditor5Engine.downcasthelpersMod.default | typings.ckeditorCkeditor5Engine.upcasthelpersMod.default */] protected ()
    extends StObject
       with ConversionHelpers[T] {
    def this(dispatchers: js.Array[
            typings.ckeditorCkeditor5Engine.upcastdispatcherMod.default | typings.ckeditorCkeditor5Engine.downcastdispatcherMod.default[js.Object]
          ]) = this()
    
    /* CompleteClass */
    override def add(
      conversionHelper: js.Function1[
          /* dispatcher */ typings.ckeditorCkeditor5Engine.upcastdispatcherMod.default | typings.ckeditorCkeditor5Engine.downcastdispatcherMod.default[js.Object], 
          Unit
        ]
    ): this.type = js.native
  }
  
  trait ConversionHelpers[T /* <: typings.ckeditorCkeditor5Engine.downcasthelpersMod.default | typings.ckeditorCkeditor5Engine.upcasthelpersMod.default */] extends StObject {
    
    def add(
      conversionHelper: js.Function1[
          /* dispatcher */ typings.ckeditorCkeditor5Engine.upcastdispatcherMod.default | typings.ckeditorCkeditor5Engine.downcastdispatcherMod.default[js.Object], 
          Unit
        ]
    ): this.type
  }
  object ConversionHelpers {
    
    inline def apply[T /* <: typings.ckeditorCkeditor5Engine.downcasthelpersMod.default | typings.ckeditorCkeditor5Engine.upcasthelpersMod.default */](
      add: js.Function1[
          /* dispatcher */ typings.ckeditorCkeditor5Engine.upcastdispatcherMod.default | typings.ckeditorCkeditor5Engine.downcastdispatcherMod.default[js.Object], 
          Unit
        ] => ConversionHelpers[T]
    ): ConversionHelpers[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
      __obj.asInstanceOf[ConversionHelpers[T]]
    }
    
    extension [Self <: ConversionHelpers[?], T /* <: typings.ckeditorCkeditor5Engine.downcasthelpersMod.default | typings.ckeditorCkeditor5Engine.upcasthelpersMod.default */](x: Self & ConversionHelpers[T]) {
      
      inline def setAdd(
        value: js.Function1[
              /* dispatcher */ typings.ckeditorCkeditor5Engine.upcastdispatcherMod.default | typings.ckeditorCkeditor5Engine.downcastdispatcherMod.default[js.Object], 
              Unit
            ] => ConversionHelpers[T]
      ): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    }
  }
}

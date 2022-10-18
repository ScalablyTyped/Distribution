package typings.danmarshallJscadTypings

import typings.danmarshallJscadTypings.typesCsgMod.CSG
import typings.danmarshallJscadTypings.typesIoMod.io.Options
import typings.danmarshallJscadTypings.typesIoMod.io.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStlSerializerMod {
  
  @js.native
  trait StlSerializer extends StObject {
    
    def serialize(CSGObject: CSG): String | js.Array[js.typedarray.ArrayBuffer] = js.native
    def serialize(CSGObject: CSG, options: StlSerializerOptions): String | js.Array[js.typedarray.ArrayBuffer] = js.native
  }
  
  trait StlSerializerOptions
    extends StObject
       with Options {
    
    var binary: js.UndefOr[Boolean] = js.undefined
  }
  object StlSerializerOptions {
    
    inline def apply(statusCallback: Status => Unit): StlSerializerOptions = {
      val __obj = js.Dynamic.literal(statusCallback = js.Any.fromFunction1(statusCallback))
      __obj.asInstanceOf[StlSerializerOptions]
    }
    
    extension [Self <: StlSerializerOptions](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    }
  }
}

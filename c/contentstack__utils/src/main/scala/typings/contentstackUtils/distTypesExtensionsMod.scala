package typings.contentstackUtils

import typings.contentstackUtils.distTypesModelsMetadataModelMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesExtensionsMod {
  
  object global {
    
    trait String extends StObject {
      
      def forEachEmbeddedItem(callbackfn: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit]): Unit
    }
    object String {
      
      inline def apply(
        forEachEmbeddedItem: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit] => Unit
      ): String = {
        val __obj = js.Dynamic.literal(forEachEmbeddedItem = js.Any.fromFunction1(forEachEmbeddedItem))
        __obj.asInstanceOf[String]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: String] (val x: Self) extends AnyVal {
        
        inline def setForEachEmbeddedItem(value: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit] => Unit): Self = StObject.set(x, "forEachEmbeddedItem", js.Any.fromFunction1(value))
      }
    }
  }
}

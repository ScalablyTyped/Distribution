package typings.deoxxaContentType

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContentType {
  
  trait MediaType extends StObject {
    
    var params: Any
    
    var q: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object MediaType {
    
    inline def apply(params: Any, `type`: String): MediaType = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    extension [Self <: MediaType](x: Self) {
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaTypeStatic
    extends StObject
       with Instantiable1[/* s */ String, MediaType]
       with Instantiable2[/* s */ String, /* p */ Any, MediaType] {
    
    def mediaCmp(a: MediaType, b: MediaType): Double = js.native
    
    def parseMedia(`type`: String): MediaType = js.native
    
    def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType]): String = js.native
    def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType], options: SelectOptions): String = js.native
    
    def splitContentTypes(str: String): js.Array[String] = js.native
    
    def splitQuotedString(str: String): js.Array[String] = js.native
    def splitQuotedString(str: String, delimiter: String): js.Array[String] = js.native
    def splitQuotedString(str: String, delimiter: String, quote: String): js.Array[String] = js.native
    def splitQuotedString(str: String, delimiter: Unit, quote: String): js.Array[String] = js.native
  }
  
  trait SelectOptions extends StObject {
    
    var sortAccepted: js.UndefOr[Boolean] = js.undefined
    
    var sortAvailable: js.UndefOr[Boolean] = js.undefined
  }
  object SelectOptions {
    
    inline def apply(): SelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectOptions]
    }
    
    extension [Self <: SelectOptions](x: Self) {
      
      inline def setSortAccepted(value: Boolean): Self = StObject.set(x, "sortAccepted", value.asInstanceOf[js.Any])
      
      inline def setSortAcceptedUndefined: Self = StObject.set(x, "sortAccepted", js.undefined)
      
      inline def setSortAvailable(value: Boolean): Self = StObject.set(x, "sortAvailable", value.asInstanceOf[js.Any])
      
      inline def setSortAvailableUndefined: Self = StObject.set(x, "sortAvailable", js.undefined)
    }
  }
}

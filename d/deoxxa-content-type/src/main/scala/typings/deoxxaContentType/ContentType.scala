package typings.deoxxaContentType

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContentType {
  
  @js.native
  trait MediaType extends StObject {
    
    var params: js.Any = js.native
    
    var q: js.UndefOr[Double] = js.native
    
    var `type`: String = js.native
  }
  object MediaType {
    
    @scala.inline
    def apply(params: js.Any, `type`: String): MediaType = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit class MediaTypeMutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaTypeStatic
    extends Instantiable1[/* s */ String, MediaType]
       with Instantiable2[/* s */ String, /* p */ js.Any, MediaType] {
    
    def mediaCmp(a: MediaType, b: MediaType): Double = js.native
    
    def parseMedia(`type`: String): MediaType = js.native
    
    def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType]): String = js.native
    def select(availableTypes: js.Array[MediaType], acceptedTypes: js.Array[MediaType], options: SelectOptions): String = js.native
    
    def splitContentTypes(str: String): js.Array[String] = js.native
    
    def splitQuotedString(str: String): js.Array[String] = js.native
    def splitQuotedString(str: String, delimiter: js.UndefOr[scala.Nothing], quote: String): js.Array[String] = js.native
    def splitQuotedString(str: String, delimiter: String): js.Array[String] = js.native
    def splitQuotedString(str: String, delimiter: String, quote: String): js.Array[String] = js.native
  }
  
  @js.native
  trait SelectOptions extends StObject {
    
    var sortAccepted: js.UndefOr[Boolean] = js.native
    
    var sortAvailable: js.UndefOr[Boolean] = js.native
  }
  object SelectOptions {
    
    @scala.inline
    def apply(): SelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectOptions]
    }
    
    @scala.inline
    implicit class SelectOptionsMutableBuilder[Self <: SelectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSortAccepted(value: Boolean): Self = StObject.set(x, "sortAccepted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAcceptedUndefined: Self = StObject.set(x, "sortAccepted", js.undefined)
      
      @scala.inline
      def setSortAvailable(value: Boolean): Self = StObject.set(x, "sortAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAvailableUndefined: Self = StObject.set(x, "sortAvailable", js.undefined)
    }
  }
}

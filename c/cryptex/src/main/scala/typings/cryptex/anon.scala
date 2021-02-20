package typings.cryptex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DataKey extends StObject {
    
    var dataKey: js.UndefOr[String] = js.native
    
    var region: js.UndefOr[String] = js.native
  }
  object DataKey {
    
    @scala.inline
    def apply(): DataKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataKey]
    }
    
    @scala.inline
    implicit class DataKeyMutableBuilder[Self <: DataKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}

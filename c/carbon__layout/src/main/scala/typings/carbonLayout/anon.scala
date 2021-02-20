package typings.carbonLayout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Columns extends StObject {
    
    var columns: Double = js.native
    
    var margin: String = js.native
    
    var width: String = js.native
  }
  object Columns {
    
    @scala.inline
    def apply(columns: Double, margin: String, width: String): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    @scala.inline
    implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

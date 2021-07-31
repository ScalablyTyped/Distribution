package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightNumber extends StObject {
  
  /**
    * Change the height of the subchart.
    */
  var height: Double
}
object HeightNumber {
  
  @scala.inline
  def apply(height: Double): HeightNumber = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightNumber]
  }
  
  @scala.inline
  implicit class HeightNumberMutableBuilder[Self <: HeightNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}

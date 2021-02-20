package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Class extends StObject {
  
  /** Class to apply to the line. */
  var `class`: js.UndefOr[String] = js.native
  
  var value_x1: js.UndefOr[Double] = js.native
  
  var value_x2: js.UndefOr[Double] = js.native
  
  var value_y1: js.UndefOr[Double] = js.native
  
  var value_y2: js.UndefOr[Double] = js.native
}
object Class {
  
  @scala.inline
  def apply(): Class = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setValue_x1(value: Double): Self = StObject.set(x, "value_x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_x1Undefined: Self = StObject.set(x, "value_x1", js.undefined)
    
    @scala.inline
    def setValue_x2(value: Double): Self = StObject.set(x, "value_x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_x2Undefined: Self = StObject.set(x, "value_x2", js.undefined)
    
    @scala.inline
    def setValue_y1(value: Double): Self = StObject.set(x, "value_y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_y1Undefined: Self = StObject.set(x, "value_y1", js.undefined)
    
    @scala.inline
    def setValue_y2(value: Double): Self = StObject.set(x, "value_y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_y2Undefined: Self = StObject.set(x, "value_y2", js.undefined)
  }
}

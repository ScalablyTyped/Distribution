package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassValue extends StObject {
  
  /** If provided, will remove all gridlines with this class. */
  var `class`: js.UndefOr[String] = js.native
  
  /** If provided, will remove all gridlines at this value. */
  var value: js.UndefOr[Double | String] = js.native
}
object ClassValue {
  
  @scala.inline
  def apply(): ClassValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassValue]
  }
  
  @scala.inline
  implicit class ClassValueMutableBuilder[Self <: ClassValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

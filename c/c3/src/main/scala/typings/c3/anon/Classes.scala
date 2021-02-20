package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classes extends StObject {
  
  /** If provided, removes the regions that have all of the specified classes. Otherwise removes all regions. */
  var classes: js.UndefOr[js.Array[String]] = js.native
  
  /** Transition duration for fade out. */
  var duration: js.UndefOr[Double] = js.native
}
object Classes {
  
  @scala.inline
  def apply(): Classes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Classes]
  }
  
  @scala.inline
  implicit class ClassesMutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}

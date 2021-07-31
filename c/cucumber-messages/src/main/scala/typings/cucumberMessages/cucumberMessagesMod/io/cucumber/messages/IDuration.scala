package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Duration. */
trait IDuration extends StObject {
  
  /** Duration nanos */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  
  /** Duration seconds */
  var seconds: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.undefined
}
object IDuration {
  
  @scala.inline
  def apply(): IDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDuration]
  }
  
  @scala.inline
  implicit class IDurationMutableBuilder[Self <: IDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}

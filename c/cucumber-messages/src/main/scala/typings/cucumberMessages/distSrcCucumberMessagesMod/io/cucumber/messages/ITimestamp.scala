package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Timestamp. */
trait ITimestamp extends StObject {
  
  /** Timestamp nanos */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  
  /** Timestamp seconds */
  var seconds: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
  ] = js.undefined
}
object ITimestamp {
  
  inline def apply(): ITimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimestamp]
  }
  
  extension [Self <: ITimestamp](x: Self) {
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
    ): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}

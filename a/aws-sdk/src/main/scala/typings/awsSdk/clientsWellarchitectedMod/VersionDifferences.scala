package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionDifferences extends StObject {
  
  /**
    * The differences between the base and latest versions of the lens.
    */
  var PillarDifferences: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarDifferences] = js.undefined
}
object VersionDifferences {
  
  inline def apply(): VersionDifferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionDifferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VersionDifferences] (val x: Self) extends AnyVal {
    
    inline def setPillarDifferences(value: PillarDifferences): Self = StObject.set(x, "PillarDifferences", value.asInstanceOf[js.Any])
    
    inline def setPillarDifferencesUndefined: Self = StObject.set(x, "PillarDifferences", js.undefined)
    
    inline def setPillarDifferencesVarargs(value: PillarDifference*): Self = StObject.set(x, "PillarDifferences", js.Array(value*))
  }
}

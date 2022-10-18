package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.energyMod.EnergyConcession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concessions
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array may be empty if no concessions exist
    */
  var concessions: js.Array[EnergyConcession]
}
object Concessions {
  
  inline def apply(concessions: js.Array[EnergyConcession]): Concessions = {
    val __obj = js.Dynamic.literal(concessions = concessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concessions]
  }
  
  extension [Self <: Concessions](x: Self) {
    
    inline def setConcessions(value: js.Array[EnergyConcession]): Self = StObject.set(x, "concessions", value.asInstanceOf[js.Any])
    
    inline def setConcessionsVarargs(value: EnergyConcession*): Self = StObject.set(x, "concessions", js.Array(value*))
  }
}

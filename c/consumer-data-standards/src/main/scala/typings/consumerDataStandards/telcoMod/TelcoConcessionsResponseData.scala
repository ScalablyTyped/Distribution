package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AppliedTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoConcessionsResponseData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array may be empty if no concessions exist
    */
  var concessions: js.Array[AppliedTo]
}
object TelcoConcessionsResponseData {
  
  inline def apply(concessions: js.Array[AppliedTo]): TelcoConcessionsResponseData = {
    val __obj = js.Dynamic.literal(concessions = concessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoConcessionsResponseData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoConcessionsResponseData] (val x: Self) extends AnyVal {
    
    inline def setConcessions(value: js.Array[AppliedTo]): Self = StObject.set(x, "concessions", value.asInstanceOf[js.Any])
    
    inline def setConcessionsVarargs(value: AppliedTo*): Self = StObject.set(x, "concessions", js.Array(value*))
  }
}

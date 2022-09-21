package typings.regjsparser8A6ZFEHp.mod

import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexReference
  extends StObject
     with Base[reference] {
  
  var matchIndex: Double
  
  var name: Unit
}
object IndexReference {
  
  inline def apply(matchIndex: Double, name: Unit, range: js.Tuple2[Double, Double], raw: String): IndexReference = {
    val __obj = js.Dynamic.literal(matchIndex = matchIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reference")
    __obj.asInstanceOf[IndexReference]
  }
  
  extension [Self <: IndexReference](x: Self) {
    
    inline def setMatchIndex(value: Double): Self = StObject.set(x, "matchIndex", value.asInstanceOf[js.Any])
    
    inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

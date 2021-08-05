package typings.chance.Chance

import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstNameOptions extends StObject {
  
  var gender: male | female
  
  var nationality: FirstNameNationalities
}
object FirstNameOptions {
  
  inline def apply(gender: male | female, nationality: FirstNameNationalities): FirstNameOptions = {
    val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], nationality = nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstNameOptions]
  }
  
  extension [Self <: FirstNameOptions](x: Self) {
    
    inline def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setNationality(value: FirstNameNationalities): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
  }
}

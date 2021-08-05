package typings.chance.anon

import typings.chance.chanceStrings.all
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.PrefixOptions> */
trait PartialPrefixOptions extends StObject {
  
  var full: js.UndefOr[Boolean] = js.undefined
  
  var gender: js.UndefOr[male | female | all] = js.undefined
}
object PartialPrefixOptions {
  
  inline def apply(): PartialPrefixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPrefixOptions]
  }
  
  extension [Self <: PartialPrefixOptions](x: Self) {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setGender(value: male | female | all): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
  }
}

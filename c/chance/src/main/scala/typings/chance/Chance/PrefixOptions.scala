package typings.chance.Chance

import typings.chance.chanceStrings.all
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  gender :'male' | 'female' | 'all'} & chance.Chance.SuffixOptions */
@js.native
trait PrefixOptions extends StObject {
  
  var full: Boolean = js.native
  
  var gender: male | female | all = js.native
}
object PrefixOptions {
  
  @scala.inline
  def apply(full: Boolean, gender: male | female | all): PrefixOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixOptions]
  }
  
  @scala.inline
  implicit class PrefixOptionsMutableBuilder[Self <: PrefixOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender(value: male | female | all): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
  }
}

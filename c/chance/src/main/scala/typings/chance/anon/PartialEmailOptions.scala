package typings.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.EmailOptions> */
trait PartialEmailOptions extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
}
object PartialEmailOptions {
  
  @scala.inline
  def apply(): PartialEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEmailOptions]
  }
  
  @scala.inline
  implicit class PartialEmailOptionsMutableBuilder[Self <: PartialEmailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}

package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageChains extends StObject {
  
  def and(`type`: String): Assertion
  def and(`type`: String, message: String): Assertion
  @JSName("and")
  var and_Original: Assertion
  
  def at(`type`: String): Assertion
  def at(`type`: String, message: String): Assertion
  @JSName("at")
  var at_Original: Assertion
  
  def be(`type`: String): Assertion
  def be(`type`: String, message: String): Assertion
  @JSName("be")
  var be_Original: Assertion
  
  def been(`type`: String): Assertion
  def been(`type`: String, message: String): Assertion
  @JSName("been")
  var been_Original: Assertion
  
  def but(`type`: String): Assertion
  def but(`type`: String, message: String): Assertion
  @JSName("but")
  var but_Original: Assertion
  
  def does(`type`: String): Assertion
  def does(`type`: String, message: String): Assertion
  @JSName("does")
  var does_Original: Assertion
  
  def has(`type`: String): Assertion
  def has(`type`: String, message: String): Assertion
  @JSName("has")
  var has_Original: Assertion
  
  def have(`type`: String): Assertion
  def have(`type`: String, message: String): Assertion
  @JSName("have")
  var have_Original: Assertion
  
  def is(`type`: String): Assertion
  def is(`type`: String, message: String): Assertion
  @JSName("is")
  var is_Original: Assertion
  
  def of(`type`: String): Assertion
  def of(`type`: String, message: String): Assertion
  @JSName("of")
  var of_Original: Assertion
  
  def same(`type`: String): Assertion
  def same(`type`: String, message: String): Assertion
  @JSName("same")
  var same_Original: Assertion
  
  def that(`type`: String): Assertion
  def that(`type`: String, message: String): Assertion
  @JSName("that")
  var that_Original: Assertion
  
  def to(`type`: String): Assertion
  def to(`type`: String, message: String): Assertion
  @JSName("to")
  var to_Original: Assertion
  
  def which(`type`: String): Assertion
  def which(`type`: String, message: String): Assertion
  @JSName("which")
  var which_Original: Assertion
  
  def `with`(`type`: String): Assertion
  def `with`(`type`: String, message: String): Assertion
  @JSName("with")
  var with_Original: Assertion
}
object LanguageChains {
  
  inline def apply(
    and: Assertion,
    at: Assertion,
    be: Assertion,
    been: Assertion,
    but: Assertion,
    does: Assertion,
    has: Assertion,
    have: Assertion,
    is: Assertion,
    of: Assertion,
    same: Assertion,
    that: Assertion,
    to: Assertion,
    which: Assertion,
    `with`: Assertion
  ): LanguageChains = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], but = but.asInstanceOf[js.Any], does = does.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageChains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageChains] (val x: Self) extends AnyVal {
    
    inline def setAnd(value: Assertion): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAt(value: Assertion): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setBe(value: Assertion): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
    
    inline def setBeen(value: Assertion): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
    
    inline def setBut(value: Assertion): Self = StObject.set(x, "but", value.asInstanceOf[js.Any])
    
    inline def setDoes(value: Assertion): Self = StObject.set(x, "does", value.asInstanceOf[js.Any])
    
    inline def setHas(value: Assertion): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    inline def setHave(value: Assertion): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
    
    inline def setIs(value: Assertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setOf(value: Assertion): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setSame(value: Assertion): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    
    inline def setThat(value: Assertion): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Assertion): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setWhich(value: Assertion): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    inline def setWith(value: Assertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
  }
}

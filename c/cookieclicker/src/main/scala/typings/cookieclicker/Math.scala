package typings.cookieclicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Math extends StObject {
  
  /**
    * Changes `Math.random` to output numbers based on the seed
    */
  def seedrandom(seed: String): Unit
}
object Math {
  
  @scala.inline
  def apply(seedrandom: String => Unit): Math = {
    val __obj = js.Dynamic.literal(seedrandom = js.Any.fromFunction1(seedrandom))
    __obj.asInstanceOf[Math]
  }
  
  @scala.inline
  implicit class MathMutableBuilder[Self <: Math] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeedrandom(value: String => Unit): Self = StObject.set(x, "seedrandom", js.Any.fromFunction1(value))
  }
}

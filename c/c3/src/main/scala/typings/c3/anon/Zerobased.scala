package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zerobased extends StObject {
  
  /**
    * Set if min or max value will be 0 on area chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.undefined
}
object Zerobased {
  
  inline def apply(): Zerobased = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zerobased]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Zerobased] (val x: Self) extends AnyVal {
    
    inline def setZerobased(value: Boolean): Self = StObject.set(x, "zerobased", value.asInstanceOf[js.Any])
    
    inline def setZerobasedUndefined: Self = StObject.set(x, "zerobased", js.undefined)
  }
}

package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zerobased extends StObject {
  
  /**
    * Set if min or max value will be 0 on area chart.
    */
  var zerobased: js.UndefOr[Boolean] = js.native
}
object Zerobased {
  
  @scala.inline
  def apply(): Zerobased = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zerobased]
  }
  
  @scala.inline
  implicit class ZerobasedMutableBuilder[Self <: Zerobased] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZerobased(value: Boolean): Self = StObject.set(x, "zerobased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZerobasedUndefined: Self = StObject.set(x, "zerobased", js.undefined)
  }
}

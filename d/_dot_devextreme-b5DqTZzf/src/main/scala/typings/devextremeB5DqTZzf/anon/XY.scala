package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.fit
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.flip
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.flipfit
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XY extends StObject {
  
  /**
    * Specifies how to resolve horizontal collisions.
    */
  var x: js.UndefOr[fit | flip | flipfit | none] = js.undefined
  
  /**
    * Specifies how to resolve vertical collisions.
    */
  var y: js.UndefOr[fit | flip | flipfit | none] = js.undefined
}
object XY {
  
  inline def apply(): XY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XY]
  }
  
  extension [Self <: XY](x: Self) {
    
    inline def setX(value: fit | flip | flipfit | none): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: fit | flip | flipfit | none): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.horizontal
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.layered
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.off
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.tree
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  /**
    * Specifies the diagram layout orientation.
    */
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  /**
    * Specifies an auto-layout algorithm that is used to automatically arrange shapes.
    */
  var `type`: js.UndefOr[off | tree | layered] = js.undefined
}
object Orientation {
  
  inline def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  extension [Self <: Orientation](x: Self) {
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setType(value: off | tree | layered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

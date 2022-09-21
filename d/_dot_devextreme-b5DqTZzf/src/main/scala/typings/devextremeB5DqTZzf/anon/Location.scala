package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.centerBottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.centerTop
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.full
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.leftBottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.leftCenter
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.leftTop
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rightBottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rightCenter
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rightTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * Specifies a location for the image in the background of a range selector.
    */
  var location: js.UndefOr[
    center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
  ] = js.undefined
  
  /**
    * Specifies the image&apos;s URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setLocation(
      value: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
    ): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

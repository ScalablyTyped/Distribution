package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerFactory extends StObject {
  
  def create(): MediaPlayerClass
}
object MediaPlayerFactory {
  
  inline def apply(create: () => MediaPlayerClass): MediaPlayerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[MediaPlayerFactory]
  }
  
  extension [Self <: MediaPlayerFactory](x: Self) {
    
    inline def setCreate(value: () => MediaPlayerClass): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}

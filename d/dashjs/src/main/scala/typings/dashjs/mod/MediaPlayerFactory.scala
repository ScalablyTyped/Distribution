package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerFactory extends StObject {
  
  def create(): MediaPlayerClass
}
object MediaPlayerFactory {
  
  @scala.inline
  def apply(create: () => MediaPlayerClass): MediaPlayerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[MediaPlayerFactory]
  }
  
  @scala.inline
  implicit class MediaPlayerFactoryMutableBuilder[Self <: MediaPlayerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: () => MediaPlayerClass): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}

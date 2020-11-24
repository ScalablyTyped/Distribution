package typings.dashjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerFactory extends js.Object {
  
  def create(): MediaPlayerClass = js.native
}
object MediaPlayerFactory {
  
  @scala.inline
  def apply(create: () => MediaPlayerClass): MediaPlayerFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[MediaPlayerFactory]
  }
  
  @scala.inline
  implicit class MediaPlayerFactoryOps[Self <: MediaPlayerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: () => MediaPlayerClass): Self = this.set("create", js.Any.fromFunction0(value))
  }
}

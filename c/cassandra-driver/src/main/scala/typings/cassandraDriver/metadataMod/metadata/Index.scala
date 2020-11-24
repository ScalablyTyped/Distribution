package typings.cassandraDriver.metadataMod.metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends js.Object {
  
  def isCompositesKind(): Boolean = js.native
  
  def isCustomKind(): Boolean = js.native
  
  def isKeysKind(): Boolean = js.native
  
  var kind: IndexKind = js.native
  
  var name: String = js.native
  
  var options: js.Object = js.native
  
  var target: String = js.native
}
object Index {
  
  @scala.inline
  def apply(
    isCompositesKind: () => Boolean,
    isCustomKind: () => Boolean,
    isKeysKind: () => Boolean,
    kind: IndexKind,
    name: String,
    options: js.Object,
    target: String
  ): Index = {
    val __obj = js.Dynamic.literal(isCompositesKind = js.Any.fromFunction0(isCompositesKind), isCustomKind = js.Any.fromFunction0(isCustomKind), isKeysKind = js.Any.fromFunction0(isKeysKind), kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
    
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
    def setIsCompositesKind(value: () => Boolean): Self = this.set("isCompositesKind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCustomKind(value: () => Boolean): Self = this.set("isCustomKind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsKeysKind(value: () => Boolean): Self = this.set("isKeysKind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKind(value: IndexKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}

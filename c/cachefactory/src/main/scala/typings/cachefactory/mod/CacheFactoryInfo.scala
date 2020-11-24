package typings.cachefactory.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheFactoryInfo extends CacheOptions {
  
  var caches: StringDictionary[CacheInfo] = js.native
  
  var size: Double = js.native
}
object CacheFactoryInfo {
  
  @scala.inline
  def apply(caches: StringDictionary[CacheInfo], size: Double): CacheFactoryInfo = {
    val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheFactoryInfo]
  }
  
  @scala.inline
  implicit class CacheFactoryInfoOps[Self <: CacheFactoryInfo] (val x: Self) extends AnyVal {
    
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
    def setCaches(value: StringDictionary[CacheInfo]): Self = this.set("caches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}

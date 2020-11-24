package typings.cosmiconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsBase extends js.Object {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.native
  
  var packageProp: js.UndefOr[String | js.Array[String]] = js.native
  
  var searchPlaces: js.UndefOr[js.Array[String]] = js.native
  
  var stopDir: js.UndefOr[String] = js.native
}
object OptionsBase {
  
  @scala.inline
  def apply(): OptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBase]
  }
  
  @scala.inline
  implicit class OptionsBaseOps[Self <: OptionsBase] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setIgnoreEmptySearchPlaces(value: Boolean): Self = this.set("ignoreEmptySearchPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmptySearchPlaces: Self = this.set("ignoreEmptySearchPlaces", js.undefined)
    
    @scala.inline
    def setPackagePropVarargs(value: String*): Self = this.set("packageProp", js.Array(value :_*))
    
    @scala.inline
    def setPackageProp(value: String | js.Array[String]): Self = this.set("packageProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageProp: Self = this.set("packageProp", js.undefined)
    
    @scala.inline
    def setSearchPlacesVarargs(value: String*): Self = this.set("searchPlaces", js.Array(value :_*))
    
    @scala.inline
    def setSearchPlaces(value: js.Array[String]): Self = this.set("searchPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPlaces: Self = this.set("searchPlaces", js.undefined)
    
    @scala.inline
    def setStopDir(value: String): Self = this.set("stopDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopDir: Self = this.set("stopDir", js.undefined)
  }
}

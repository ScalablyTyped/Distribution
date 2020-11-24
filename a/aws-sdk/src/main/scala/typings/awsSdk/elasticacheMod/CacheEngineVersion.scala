package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheEngineVersion extends js.Object {
  
  /**
    * The description of the cache engine.
    */
  var CacheEngineDescription: js.UndefOr[String] = js.native
  
  /**
    * The description of the cache engine version.
    */
  var CacheEngineVersionDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache parameter group family associated with this cache engine. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x | 
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache engine.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The version number of the cache engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
}
object CacheEngineVersion {
  
  @scala.inline
  def apply(): CacheEngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheEngineVersion]
  }
  
  @scala.inline
  implicit class CacheEngineVersionOps[Self <: CacheEngineVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheEngineDescription(value: String): Self = this.set("CacheEngineDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheEngineDescription: Self = this.set("CacheEngineDescription", js.undefined)
    
    @scala.inline
    def setCacheEngineVersionDescription(value: String): Self = this.set("CacheEngineVersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheEngineVersionDescription: Self = this.set("CacheEngineVersionDescription", js.undefined)
    
    @scala.inline
    def setCacheParameterGroupFamily(value: String): Self = this.set("CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheParameterGroupFamily: Self = this.set("CacheParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
  }
}

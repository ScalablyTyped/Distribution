package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alwaysupdate extends StObject {
  
  /**
    * If the key is specified and its value is true, it allows the app to
    * be always updated regardless of whether the underlying platform is
    * compliant or not. If the value is false or the key is not specified,
    * the required platform version is respected and the app update is
    * deferred until the underlying platform becomes compliant.
    */
  var always_update: js.UndefOr[Boolean] = js.native
  
  var required_platform_version: js.UndefOr[String] = js.native
}
object Alwaysupdate {
  
  @scala.inline
  def apply(): Alwaysupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alwaysupdate]
  }
  
  @scala.inline
  implicit class AlwaysupdateMutableBuilder[Self <: Alwaysupdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlways_update(value: Boolean): Self = StObject.set(x, "always_update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlways_updateUndefined: Self = StObject.set(x, "always_update", js.undefined)
    
    @scala.inline
    def setRequired_platform_version(value: String): Self = StObject.set(x, "required_platform_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_platform_versionUndefined: Self = StObject.set(x, "required_platform_version", js.undefined)
  }
}

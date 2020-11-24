package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3D` extends js.Object {
  
  /**
    * The '3D' requirement denotes GPU hardware acceleration.
    *
    * The 'webgl' requirement refers to the WebGL API.
    * For more information on Chrome 3D graphics support,
    * see the help article on WebGL and 3D graphics.
    * You can list the 3D-related features your app requires,
    * as demonstrated in the following example:
    * @example
    * 'requirements': {
    *   '3D': {
    *     'features': ['webgl']
    *   }
    * }
    */
  var `3D`: js.UndefOr[Features] = js.native
  
  /**
    * The 'plugins' requirement indicates if an app requires NPAPI to run.
    *
    * This requirement is enabled by default when the manifest includes the 'plugins' field.
    * For apps that still work when plugins aren't available,
    * you can disable this requirement by setting NPAPI to false.
    * You can also enable this requirement manually,
    * by setting NPAPI to true as shown in this example:
    * @example
    * 'requirements': {
    *   'plugins': {
    *     'npapi': true
    *   }
    * }
    */
  var plugins: js.UndefOr[Npapi] = js.native
}
object `3D` {
  
  @scala.inline
  def apply(): `3D` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3D`]
  }
  
  @scala.inline
  implicit class `3DOps`[Self <: `3D`] (val x: Self) extends AnyVal {
    
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
    def set3D(value: Features): Self = this.set("3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete3D: Self = this.set("3D", js.undefined)
    
    @scala.inline
    def setPlugins(value: Npapi): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}
